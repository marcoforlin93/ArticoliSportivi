package objects;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Classe che rappresenta un magazzino.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class Warehouse {

    // contiene gli utenti del sistema:
    private final Map<String, User> users;

    // contiene i negozi del sistema:
    private final Map<Long, Shop> shops;

    // contiene i tipi di articolo raggruppati per categoria di sport:
    private final Map<Sport, Map<String, ArticleType>> articleTypes;

    // contiene gli articoli presenti in magazzino raggruppati per sport:
    private final Map<Sport, Map<Long, ArticleInWarehouse>> articlesInWarehouse;

    // contiene gli ingressi in magazzino:
    private final Map<Integer, Entry> entries;

    // contiene gli ordini dei negozi da evadere:
    private final Map<Integer, Order> notExitOrders;

    // contiene gli ordini dei negozi già evasi:
    private final Map<Integer, Order> exitOrders;

    // contiene le uscite dal magazzino:
    private final Map<Integer, Exit> exits;

    /**
     * Costruttore della classe.
     */
    public Warehouse() {

        // utenti:
        users = new HashMap<>();

        users.put("Marco", new WarehouseWorker("Marco", "1234"));
        users.put("Matteo", new AdministrativeSecretary("Matteo", "1234"));
        users.put("Luca", new WarehouseWorker("Luca", "1234"));
        users.put("Negozio1", new ShopAsUser("Negozio1", "1234", 1));
        users.put("Negozio2", new ShopAsUser("Negozio2", "1234", 2));

        // negozi:
        shops = new HashMap<>();

        shops.put(new Long(1), new Shop(1, "Negozio1", new Address("via", "prova1", 1, "A", 37142), City.LECCO));
        shops.put(new Long(2), new Shop(2, "Negozio2", new Address("piazza", "prova2", 14, "", 12345), City.MACERATA));

        // tipi di articolo:
        articleTypes = new HashMap<>();

        articleTypes.put(Sport.BASEBALL, new HashMap<>());
        articleTypes.put(Sport.CALCIO, new HashMap<>());
        articleTypes.put(Sport.CICLISMO, new HashMap<>());
        articleTypes.put(Sport.MOTOCICLISMO, new HashMap<>());
        articleTypes.put(Sport.PALLANUOTO, new HashMap<>());
        articleTypes.put(Sport.PALLAVOLO, new HashMap<>());
        articleTypes.put(Sport.PESCA, new HashMap<>());
        articleTypes.put(Sport.SCI, new HashMap<>());
        articleTypes.put(Sport.TENNIS, new HashMap<>());
        articleTypes.put(Sport.ALTRO, new HashMap<>());

        articleTypes.get(Sport.BASEBALL).put("mazza da baseball", new ArticleType("mazza da baseball", "mazza da baseball ottima per fare fuoricampo", Sport.BASEBALL, "ferro", "legno"));
        articleTypes.get(Sport.BASEBALL).put("mazza da baseball in lattice", new ArticleType("mazza da baseball in lattice", "mazza da baseball scadente", Sport.BASEBALL, "lattice"));
        articleTypes.get(Sport.CALCIO).put("maglia bianca", new ArticleType("maglia bianca", "maglia bianca ottima per le grigliate con il sugo", Sport.CALCIO, "100% amianto grezzo"));
        articleTypes.get(Sport.CALCIO).put("palla", new ArticleType("palla", "palla leggera per bambini", Sport.CALCIO, "plastica"));

        // articoli nel magazzino:
        articlesInWarehouse = new HashMap<>();

        articlesInWarehouse.put(Sport.BASEBALL, new HashMap<>());
        articlesInWarehouse.put(Sport.CALCIO, new HashMap<>());
        articlesInWarehouse.put(Sport.CICLISMO, new HashMap<>());
        articlesInWarehouse.put(Sport.MOTOCICLISMO, new HashMap<>());
        articlesInWarehouse.put(Sport.PALLANUOTO, new HashMap<>());
        articlesInWarehouse.put(Sport.PALLAVOLO, new HashMap<>());
        articlesInWarehouse.put(Sport.PESCA, new HashMap<>());
        articlesInWarehouse.put(Sport.SCI, new HashMap<>());
        articlesInWarehouse.put(Sport.TENNIS, new HashMap<>());
        articlesInWarehouse.put(Sport.ALTRO, new HashMap<>());

        articlesInWarehouse.get(Sport.BASEBALL).put(new Long(1), new ArticleInWarehouse(articleTypes.get(Sport.BASEBALL).get("mazza da baseball"), 12.5, new ProductionDate(1900, 4, 1), new PositionInWarehouse(1, 2, 3), 49));
        articlesInWarehouse.get(Sport.BASEBALL).put(new Long(2), new ArticleInWarehouse(articleTypes.get(Sport.BASEBALL).get("mazza da baseball"), 12.5, new ProductionDate(1900, 3, 2), new PositionInWarehouse(1, 2, 3), 10));
        articlesInWarehouse.get(Sport.BASEBALL).put(new Long(3), new ArticleInWarehouse(articleTypes.get(Sport.BASEBALL).get("mazza da baseball in lattice"), 15.0, new ProductionDate(1900, 4, 1), new PositionInWarehouse(1, 2, 3), 10));
        articlesInWarehouse.get(Sport.BASEBALL).put(new Long(4), new ArticleInWarehouse(articleTypes.get(Sport.BASEBALL).get("mazza da baseball in lattice"), 18.8, new ProductionDate(1900, 4, 1), new PositionInWarehouse(1, 2, 3), 30));
        articlesInWarehouse.get(Sport.CALCIO).put(new Long(5), new ArticleInWarehouse(articleTypes.get(Sport.CALCIO).get("maglia bianca"), 100.0, new ProductionDate(1900, 8, 5), new PositionInWarehouse(1, 2, 3), 60));
        articlesInWarehouse.get(Sport.CALCIO).put(new Long(6), new ArticleInWarehouse(articleTypes.get(Sport.CALCIO).get("maglia bianca"), 200.0, new ProductionDate(1900, 4, 1), new PositionInWarehouse(1, 2, 3), 50));

        // entrate:
        entries = new HashMap<>();

        // ordini dei negozi da evadere:
        notExitOrders = new HashMap<>();

        // ordini dei negozi già evasi:
        exitOrders = new HashMap<>();

        // uscite dal magazzino:
        exits = new HashMap<>();
    }

    /**
     * Consente l'accesso al campo users.
     *
     * @return utenti del sistema
     */
    public Map<String, User> getUsers() {
        return users;
    }

    /**
     * Consente l'accesso al campo shops.
     *
     * @return negozi del sistema
     */
    public Map<Long, Shop> getShops() {
        return shops;
    }

    /**
     * Consente l'accesso al campo articleTypes.
     *
     * @return tipi di articoli del sistema
     */
    public Map<Sport, Map<String, ArticleType>> getArticleTypes() {
        return articleTypes;
    }

    /**
     * Consente l'accesso al campo articlesInWarehouse.
     *
     * @return articoli in magazzino del sistema
     */
    public Map<Sport, Map<Long, ArticleInWarehouse>> getArticlesInWarehouse() {
        return articlesInWarehouse;
    }

    /**
     * Consente l'accesso al campo entries.
     *
     * @return entrate del sistema
     */
    public Map<Integer, Entry> getEntries() {
        return entries;
    }

    /**
     * Consente l'accesso al campo notExitOrders.
     *
     * @return ordini non evasi del sistema
     */
    public Map<Integer, Order> getNotExitOrders() {
        return notExitOrders;
    }

    /**
     * Consente l'accesso al campo exitOrders.
     *
     * @return ordini evasi del sistema
     */
    public Map<Integer, Order> getExitOrders() {
        return exitOrders;
    }

    /**
     * Consente l'accesso al campo exit.
     *
     * @return uscite del sistema
     */
    public Map<Integer, Exit> getExits() {
        return exits;
    }

    /**
     * Data una categoria di sport ritorna un insieme con tutti i tipi di
     * articolo di quella categoria.
     *
     * @param sport, categoria di sport
     * @return insieme contenente i tipi di articolo
     */
    public Set<String> getArticleTypes(Sport sport) {
        final Set<String> requiredArticleTypes = new HashSet<>();

        /* metto nell'insieme tutti i tipi di articolo presenti in magazzino 
         * alla categoria indicata:
         */
        articlesInWarehouse.get(sport).keySet().forEach((myCode) -> {
            requiredArticleTypes.add(articlesInWarehouse.get(sport).get(myCode)
                    .getArticleType().getName());
        });

        return requiredArticleTypes;
    }

    /**
     * Dato il nome di un tipo di articolo ritorna il tipo di articolo
     * corrispondente.
     *
     * @param sport, categoria del tipo di articolo
     * @param nameArticleType, nome del tipo di articolo
     * @return tipo di articolo
     */
    public ArticleType getArticleType(Sport sport, String nameArticleType) {
        return articleTypes.get(sport).get(nameArticleType);
    }

    /**
     * Crea e ritorna una nuova istanza della classe interna Entry.
     *
     * @return entrata in magazzino
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Crea e ritorna una nuova istanza della classe interna Order.
     *
     * @param shop, negozio che effettua l'ordine
     * @return ordine al magazzino
     */
    public Order createOrder(Shop shop) {
        return new Order(shop);
    }

    /**
     * Crea e ritorna una nuova istanza della classe interna Exit.
     *
     * @return uscita dal magazzino
     */
    public Exit createExit() {
        return new Exit();
    }

    /**
     * Classe interna che rappresenta un ingresso in magazzino. Il campo code
     * deve essere univoco nelle istanze della classe.
     *
     * @author Forlin Marco & Favari Matteo
     */
    public class Entry {

        private final MyDate date;
        private final int code; // solo le ultime 10 cifre

        // contiene gli articoli presenti nell'ingresso:
        private final Map<Sport, Map<Long, ArticleInWarehouse>> enteredArticles;

        /**
         * Costruttore della classe.
         */
        public Entry() {

            // data corrente:
            this.date = new MyDate(new Date(System.currentTimeMillis()));
            this.code = entries.size();

            enteredArticles = new HashMap<>();
        }

        /**
         * Consente l'accesso al campo date;
         *
         * @return data
         */
        public MyDate getDate() {
            return date;
        }

        /**
         * Consente l'accesso al campo code.
         *
         * @return codice univoco
         */
        public int getCode() {
            return code;
        }

        /**
         * Ritorna il codice come stringa da 10 caratteri,
         *
         * @return stringa contenente il codice
         */
        public String getCodeToString() {
            return String.format("%10s", code).replace(" ", "0");
        }

        /**
         * Consente l'accesso al campo enteredArticles.
         *
         * @return articoli entrati
         */
        public Map<Sport, Map<Long, ArticleInWarehouse>> getEnteredArticles() {
            return enteredArticles;
        }

        /**
         * Inserisce l'articolo passato nella mappa degli articoli entrati in
         * magazzino.
         *
         * @param articleInWarehouse, articolo da inserire
         * @throws IllegalArgumentException se l'articolo è gia nella mappa
         * degli ingressi
         */
        public void addEnteredArticle(ArticleInWarehouse articleInWarehouse) {
            Sport sport = articleInWarehouse.getArticleType().getSport();
            long articleInWarehouseCode = articleInWarehouse.getCode();

            // se non è già stato fatto, aggiungo la categoria di sport
            enteredArticles.putIfAbsent(sport, new HashMap<>());

            // verifico se l'articolo è già presente:
            if (enteredArticles.get(sport).containsKey(articleInWarehouseCode)) {
                throw new IllegalArgumentException("Questo articolo è già stato inserito");
            }

            enteredArticles.get(sport)
                    .putIfAbsent(articleInWarehouseCode, articleInWarehouse);
        }

        /**
         * Aggiunge al magazzino gli articoli inseriti e salva l'entrata nella
         * mappa della calsse esterna.
         *
         * @throws Warehouse.NothingToSaveException se non ci sono articoli da
         * salvare
         */
        public void saveEntry() {
            if (enteredArticles.isEmpty()) {
                throw new Warehouse.NothingToSaveException();
            }

            // scorro gli sport:
            enteredArticles.keySet().forEach((Sport mySport) -> {

                // scorro gli articoli:
                enteredArticles.get(mySport).keySet().forEach((Long myCode) -> {

                    // se l'articolo è presente sommo le quantità:
                    if (articlesInWarehouse.get(mySport).containsKey(myCode)) {
                        articlesInWarehouse.get(mySport).get(myCode)
                                .addQuantity(enteredArticles.get(mySport)
                                        .get(myCode).getQuantity());
                    }

                    // altrimenti lo aggiungo
                    articlesInWarehouse.get(mySport)
                            .put(myCode, enteredArticles.get(mySport).get(myCode));
                });
            });

            entries.put(code, this);
        }

        /**
         * Implementazione del metodo equals.
         *
         * @param other, oggetto da confrontare
         * @return true se uguali false altrimenti
         */
        @Override
        public boolean equals(Object other) {
            return other instanceof Entry
                    && code == ((Entry) other).code;
        }

        /**
         * Implementazione del metodo hashcode.
         *
         * @return valore hash code
         */
        @Override
        public int hashCode() {
            return code;
        }
    }

    /**
     * Classe che rappresenta un ordine. Il campo code deve essere univoco nelle
     * istanze della classe. Il campo exit rappresenta l'uscita del magazzino
     * riferita a quest'ordine, vale -1 finché l'ordine non viene evaso.
     *
     * @author Forlin Marco & Favari Matteo
     */
    public class Order {

        private final Shop shop;
        private final MyDate date;
        private final int code; // solo le ultime 10 cifre
        private double price = 0.0;
        private int exit = -1;

        // contiene gli articoli ordinati:
        Map<Sport, Map<Long, ArticleInWarehouse>> orderedArticles;

        /**
         * Costruttore della classe.
         *
         * @param shop, negozio che effettua l'ordine
         */
        public Order(Shop shop) {
            this.shop = shop;

            // data corrente:
            this.date = new MyDate(new Date(System.currentTimeMillis()));
            this.code = notExitOrders.size() + exitOrders.size();
        }

        /**
         * Consente l'accesso al campo shop.
         *
         * @return negozio
         */
        public Shop getShop() {
            return shop;
        }

        /**
         * Consente l'accesso al campo date.
         *
         * @return data
         */
        public MyDate getDate() {
            return date;
        }

        /**
         * Consente l'accesso al campo code.
         *
         * @return codice univoco
         */
        public int getCode() {
            return code;
        }

        /**
         * Consente l'accesso al campo price.
         *
         * @return prezzo totale dell'ordine
         */
        public double getPrice() {
            return price;
        }

        /**
         * Consente l'accesso al campo exit.
         *
         * @return uscita dal magazzino relativa a quest'ordine
         */
        public int getExit() {
            return exit;
        }

        /**
         * Consente l'accesso al campo orderedArticles.
         *
         * @return articoli ordinati
         */
        public Map<Sport, Map<Long, ArticleInWarehouse>> getOrderedArticles() {
            return orderedArticles;
        }

        /**
         * Consente di riscrivere il campo exit.
         *
         * @param exit, nuova uscita dal magazzino
         */
        public void setExit(int exit) {
            this.exit = exit;
        }

        /**
         * Inserisce l'articolo e la quantità nella mappa degli ordini.
         *
         * @param sport, categoria
         * @param code, codice articolo
         * @param quantity,
         * @throws IllegalArgumentException se la quantità ordinata è maggiore
         * della quantità presente in magazzino
         * @throws IllegalArgumentException se l'articolo è già presente nella
         * mappa degli ordini
         */
        public void addOrderedArticle(Sport sport, long code, int quantity) {
            orderedArticles.putIfAbsent(sport, new HashMap<>());

            // verifico che la quantità richiesta sia presente in magazzino:
            if (articlesInWarehouse.get(sport).get(code).getQuantity() < quantity) {
                throw new IllegalArgumentException("La quantità inserita è maggiore di quella in magazzino");
            }

            // verifico che l'articolo non sia già stato inserito:
            if (orderedArticles.get(sport).containsKey(code)) {
                throw new IllegalArgumentException("Questo articolo è già stato inserito");
            }

            /* salvo l'articolo ordinato copiando quello presente nel magazzino,
             * nel campo quantità salvo la quantità ordinata
             */
            ArticleInWarehouse OrderedArticleInWarehouse = articlesInWarehouse.get(sport).get(code);
            OrderedArticleInWarehouse.setQuantity(quantity);
            orderedArticles.get(sport).put(code, OrderedArticleInWarehouse);

            // aggiorno il prezzo:
            price += (OrderedArticleInWarehouse.getPrice() * quantity);
        }

        /**
         * Salva l'ordine appena effettuato negli ordini ancora da evadere.
         *
         * @throws Warehouse.NothingToSaveException se non ci sono articoli da
         * salvare
         */
        public void saveOrder() {
            if (orderedArticles.isEmpty()) {
                throw new Warehouse.NothingToSaveException();
            }

            notExitOrders.put(code, this);
        }

        /**
         * Implementazione del metodo equals.
         *
         * @param other, oggetto da confrontare
         * @return true se uguali false altrimenti
         */
        @Override
        public boolean equals(Object other) {
            return other instanceof Order
                    && code == ((Order) other).code;
        }

        /**
         * Implementazione del metodo hashCode.
         *
         * @return valore hash code
         */
        @Override
        public int hashCode() {
            return code;
        }
    }

    /**
     * Classe che rappresente un uscita. Il campo code deve essere univoco nelle
     * istanze della classe.
     *
     * @author Forlin Marco & Favari Matteo
     */
    public class Exit {

        private final MyDate date;
        private final int code; // solo le ultime 10 cifre

        /**
         * Costruttore della classe.
         */
        public Exit() {

            // data corrente:
            this.date = new MyDate(new Date(System.currentTimeMillis()));
            this.code = exits.size();
        }

        /**
         * Consente l'accesso al campo date.
         *
         * @return data
         */
        public MyDate getDate() {
            return date;
        }

        /**
         * Consente l'accesso al campo code.
         *
         * @return codice univoco
         */
        public int getCode() {
            return code;
        }

        /**
         * Salva l'uscita andando a salvare il codice dell'uscita nell'ordine a
         * cui si riferisce.
         *
         * @param orderCode, codice dell'ordine a cui si riferisce l'uscita
         */
        public void saveExit(int orderCode) {

            // salvo il codice dell'uscita nell'ordine:
            notExitOrders.get(orderCode).setExit(code);

            // salvo l'uscita:
            exits.put(code, this);
        }

        /**
         * Implementazione del metodo equals.
         *
         * @param other, oggetto da confrontare
         * @return true se uguali false altrimenti
         */
        @Override
        public boolean equals(Object other) {
            return other instanceof Exit
                    && code == ((Exit) other).code;
        }

        /**
         * Implementazione del metodo hashCode.
         *
         * @return valore hash code
         */
        @Override
        public int hashCode() {
            return code;
        }
    }

    /**
     * Classe che rappresenta l'eccezione in cui si prova a salvare qualcosa che
     * non esiste.
     *
     * @author Forlin Marco & Favari Matteo
     */
    public class NothingToSaveException extends RuntimeException {

        /**
         * Costruttore della classe.
         */
        public NothingToSaveException() {
            super("Nessun elemento da salvare");
        }
    }

    // METODI MARCO DA SPOSTARE AL CENTRO:
    /**
     * Inserisce un nuovo tipo di articolo
     *
     * @param name, nome articolo
     * @param description, descrizione articolo
     * @param sport, categoria
     * @param materials, tipi di materiale utilizzati
     */
    public void addArticleType(String name, String description, Sport sport, String... materials) {
        articleTypes.get(sport).put(name, new ArticleType(name, description, Sport.valueOf(sport.toString()), materials));
    }

    /**
     * Data una categoria di sport ritorna un insieme con tutti i tipi di
     * articolo di quella categoria.
     *
     * @param sport, categoria di sport
     * @return Set<String>, insieme contenente i tipi di articolo
     */
    public Set<String> getAllArticleTypes(Sport sport) {
        final Set<String> requiredArticleTypes = new HashSet<>();

        // metto nell'insieme tutti i tipi di articolo presenti in magazzino alla categoria indicata:
        articleTypes.get(sport).keySet().forEach((myCode) -> {
            requiredArticleTypes.add(articleTypes.get(sport).get(myCode).getName());
        });

        return requiredArticleTypes;
    }

    
    
    /**
     * Data una categoria di sport e un tipo di articolo ritorna un insieme con
     * la descrizione di quell'articolo, il nome e il costo presenti nel
     * magazzino
     *
     * @param sport, categoria di sport
     * @param articleType, tipo di articolo
     * @return Set<String>, insieme contenente i tipi di articolo
     */
    public Set<String> getArticleTypesInformation(Sport sport, String articleType) {

        final Set<String> requiredArticleTypeInformations = new HashSet<>();

        // metto nell'insieme tutti i tipi di articolo presenti in magazzino alla categoria indicata:
        articlesInWarehouse.get(sport).keySet().forEach((Long myCode) -> {
            if (articlesInWarehouse.get(sport).get(myCode).getArticleType().getName().equals(articleType)) {
                requiredArticleTypeInformations.add("Prezzo: " + articlesInWarehouse.get(sport).get(myCode).getPrice()
                        + "Data di Produzione: " + articlesInWarehouse.get(sport).get(myCode).getProductionDate()
                        + "Quantità: " + articlesInWarehouse.get(sport).get(myCode).getQuantity());
            }
        });
        return requiredArticleTypeInformations;
    }
}
