package objects;

/**
 * Classe che rappresenta un indirizzo. Una volta instanziata non è possibile
 * modificarla.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class Address {

    private final String type;
    private final String name;
    private final int number;
    private final String letter;
    private final int cap;

    /**
     * Costruttore della classe.
     *
     * @param type, via piazza etc...
     * @param name, nome
     * @param number, numero del numero civico
     * @param letter, lettera del numero civico
     * @param cap, cap
     */
    public Address(String type, String name, int number, String letter,
            int cap) {
        this.type = type;
        this.name = name;
        this.number = number;
        this.letter = letter;
        this.cap = cap;
    }

    /**
     * Consente l'accesso al campo type.
     *
     * @return via piazza etc...
     */
    public String getType() {
        return type;
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
     * Consente l'accesso al campo number.
     *
     * @return numero del numero civico
     */
    public int getNumber() {
        return number;
    }

    /**
     * Consente l'accesso alla lettera del numero civico.
     *
     * @return lettera del numero civico
     */
    public String getLetter() {
        return letter;
    }

    /**
     * Consente l'accesso al campo cap.
     *
     * @return cap
     */
    public int getCap() {
        return cap;
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
                && type.equals(((Address) other).type)
                && name.equals(((Address) other).name)
                && number == ((Address) other).number
                && letter.equals(((Address) other).letter)
                && cap == ((Address) other).cap;
    }

    /**
     * Implementazione del metodo hashCode.
     *
     * @return valore hash code
     */
    @Override
    public int hashCode() {
        return type.hashCode()
                ^ name.hashCode()
                ^ number
                ^ letter.hashCode()
                ^ cap;
    }

    /**
     * Implementazione del metodo toString.
     *
     * @return stringa rappresentante l'oggetto
     */
    @Override
    public String toString() {
        return type + " " + name + " " + number + "/" + letter
                + "\nCAP: " + cap;
    }
}
