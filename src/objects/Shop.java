package objects;

/**
 * Classe che rappresenta un negozio. Il campo fiscalCode deve essere univoco
 * nelle istanze della classe.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class Shop {

    private final long fiscalCode; // solo le ultime 11 cifre
    private String name;
    private Address address;
    private City city;

    /**
     * Costruttore della classe.
     *
     * @param fiscalCode, codice fiscale
     * @param name, nome
     * @param address, indirizzo
     * @param city, città
     */
    public Shop(long fiscalCode, String name, Address address, City city) {
        this.fiscalCode = fiscalCode;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    /**
     * Consente l'accesso al campo fiscalCode.
     *
     * @return codice fiscale
     */
    public long getFiscalCode() {
        return fiscalCode;
    }

    /**
     * Consente l'accesso al campo name.
     *
     * @return nome
     */
    public String getName() {
        return name;
    }

    /**
     * Consente l'accesso al campo address.
     *
     * @return indirizzo
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Consente l'accesso al campo city.
     *
     * @return città
     */
    public City getCity() {
        return city;
    }

    /**
     * Consente di riscrivere il campo name.
     *
     * @param name, nuovo nome
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Consente di riscrivere il campo address.
     *
     * @param address, nuovo indirizzo
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Consente di riscrivere il campo city.
     *
     * @param city, nuova città
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * Implementazione del metodo equals.
     *
     * @param other, oggetto da confrontare
     * @return true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof Address
                && fiscalCode == ((Shop) other).fiscalCode;
    }

    /**
     * Implementazione del metodo hashCode.
     *
     * @return valore hash code
     */
    @Override
    public int hashCode() {
        return Long.hashCode(fiscalCode);
    }

    /**
     * Implementazione del metodo toString.
     *
     * @return stringa rappresentante l'oggetto
     */
    @Override
    public String toString() {
        return "Codice Fiscale: " + String.format("%11s", fiscalCode)
                        .replace(" ", "0")
                + "\nNome: " + name
                + "\nIndirizzo: " + address
                + "\nCittà: " + city;
    }
}
