package objects;

/**
 * Classe che rappresenta un articolo in magazzino. Il campo code deve essere
 * univoco nelle istanze della classe.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class ArticleInWarehouse {

    private ArticleType articleType;
    private final long code; // solo le ultime 13 cifre
    private double price;
    private ProductionDate productionDate;
    private PositionInWarehouse positionInWarehouse;
    private int quantity;
    private static long nextCode = 0; // indica il codice del prossimo articolo

    /**
     * Costruttore della classe.
     *
     * @param articleType, tipo di articolo
     * @param price, prezzo
     * @param productionDate, data di produzione
     * @param positionInWarehouse, posizione nel magazzino
     * @param quantity, quantità
     */
    public ArticleInWarehouse(ArticleType articleType, double price,
            ProductionDate productionDate,
            PositionInWarehouse positionInWarehouse, int quantity) {
        this.articleType = articleType;
        this.price = price;
        this.productionDate = productionDate;
        this.positionInWarehouse = positionInWarehouse;
        this.quantity = quantity;

        // assegno il codice e lo incremento per il prossimo articolo:
        code = nextCode++;
    }

    /**
     * Consente l'accesso al campo articleType.
     *
     * @return tipo di articolo
     */
    public final ArticleType getArticleType() {
        return articleType;
    }

    /**
     * Consente l'accesso al campo code.
     *
     * @return codice univoco
     */
    public final long getCode() {
        return code;
    }

    /**
     * Consente l'accesso al campo price.
     *
     * @return prezzo
     */
    public final double getPrice() {
        return price;
    }

    /**
     * Consente l'accesso al campo productionDate.
     *
     * @return data di produzione
     */
    public final ProductionDate getProductionDate() {
        return productionDate;
    }

    /**
     * Consente l'accesso al campo positionInWarehouse.
     *
     * @return posizione nel magazzino
     */
    public final PositionInWarehouse getPositionInWarehouse() {
        return positionInWarehouse;
    }

    /**
     * Consente l'accesso al campo quantity.
     *
     * @return quantità
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Consente di riscrivere il campo articleType.
     *
     * @param articleType, nuovo tipo di articolo
     */
    public final void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }

    /**
     * Consente di riscrivere il campo price.
     *
     * @param price, nuovo prezzo
     */
    public final void setPrice(double price) {
        this.price = price;
    }

    /**
     * Consente di riscrivere il campo productionDate.
     *
     * @param ProductionDate, nuova data di produzione
     */
    public final void setProductionDate(ProductionDate ProductionDate) {
        this.productionDate = ProductionDate;
    }

    /**
     * Consente di riscrivere il campo positionInWarehouse.
     *
     * @param positionInWarehouse, nuova posizione in magazzino
     */
    public final void setPositionInWarehouse(PositionInWarehouse positionInWarehouse) {
        this.positionInWarehouse = positionInWarehouse;
    }

    /**
     * Consente di riscrivere il campo quantity.
     *
     * @param quantity, nuova quantità
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Consente di riscrivere il campo quantity incrementandolo del valore
     * indicato.
     *
     * @param quantity
     */
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    /**
     * Implementazione del metodo equals.
     *
     * @param other, oggetto da confrontare
     * @return true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof ArticleInWarehouse
                && code == (((ArticleInWarehouse) other).code);
    }

    /**
     * Implementazione del metodo hashCode.
     *
     * @return valore hash code
     */
    @Override
    public int hashCode() {
        return Long.hashCode(code);
    }

    /**
     * Implementazione del metodo toString.
     *
     * @return stringa rappresentante l'oggetto
     */
    @Override
    public String toString() {
        return "Tipo di articolo:\n" + articleType
                + "\n\nCodice univoco: " + String.format("%13s", code)
                        .replace(" ", "0")
                + "\nPrezzo: € " + price
                + "\nData di produzione: " + productionDate
                + "\nPosizione:\n" + positionInWarehouse
                + "\n\nQuantità: " + quantity;
    }
}
