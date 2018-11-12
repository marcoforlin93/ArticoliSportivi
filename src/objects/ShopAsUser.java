package objects;

/**
 * Classe che rappresenta il negozio come un utente del magazzino.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class ShopAsUser implements User {

    private final String username;
    private final String password;
    private final long fiscalCode;

    /**
     * Costruttore della classe.
     *
     * @param username, username
     * @param password, password
     * @param fiscalCode, codice fiscale del negozio
     */
    public ShopAsUser(String username, String password, long fiscalCode) {
        this.username = username;
        this.password = password;
        this.fiscalCode = fiscalCode;
    }

    /**
     * Consente l'accesso al campo username.
     *
     * @return username
     */
    @Override
    public String getUsername() {
        return username;
    }

    /**
     * Consente l'accesso al campo password.
     *
     * @return password
     */
    @Override
    public String getPassword() {
        return password;
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
     * Implementazione del metodo equals.
     *
     * @param other, oggetto da confrontare
     * @return true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof ShopAsUser
                && username.equals(((ShopAsUser) other).username);
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
        return "Username: " + username
                + "\nPassword: " + password
                + "\nCodice Fiscale: " + String.format("%11s", fiscalCode)
                        .replace(" ", "0");
    }
}
