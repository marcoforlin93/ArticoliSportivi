package objects;

/**
 * Classe che rappresenta una segreteria amministrativa. Una volta instanziata
 * non è possibile modificarla. Il campo username deve essere univoco nelle
 * istanze della classe.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class AdministrativeSecretary implements User {

    private final String username;
    private final String password;

    /**
     * Costruttore della classe.
     *
     * @param username, username
     * @param password, password
     */
    public AdministrativeSecretary(String username, String password) {
        this.username = username;
        this.password = password;
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
     * Implementazione del metodo equals.
     *
     * @param other, oggetto da confrontare
     * @return true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof AdministrativeSecretary
                && username.equals(((AdministrativeSecretary) other).username);
    }

    /**
     * Implementazione del metodo hashCode.
     *
     * @return valore hash code
     */
    @Override
    public int hashCode() {
        return username.hashCode();
    }

    /**
     * Implementazione del metodo toString.
     *
     * @return stringa rappresentante l'oggetto
     */
    @Override
    public String toString() {
        return "Username: " + username
                + "\nPassword: " + password;
    }
}
