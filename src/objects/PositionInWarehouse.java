package objects;

/**
 * Classe che rappresente la posizione in un magazzino.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class PositionInWarehouse {

    private final int row; // da 1 a 50
    private final int shelfNumber; // da 1 a 50 
    private final int level; // da 1 a 10

    /**
     * Costruttore della classe.
     *
     * @param row, fila
     * @param shelfNumber, numero scaffale
     * @param level, ripiano
     */
    public PositionInWarehouse(int row, int shelfNumber, int level) {
        this.row = row;
        this.shelfNumber = shelfNumber;
        this.level = level;
    }

    /**
     * Consente l'accesso al campo row.
     *
     * @return fila
     */
    public int getRow() {
        return row;
    }

    /**
     * Consente l'accesso al campo shelfNumber.
     *
     * @return numero scaffale
     */
    public int getShelfNumber() {
        return shelfNumber;
    }

    /**
     * Consente l'accesso al campo level.
     *
     * @return ripiano
     */
    public int getLevel() {
        return level;
    }

    /**
     * Implementazione del metodo equals.
     *
     * @param other, oggetto da confrontare
     * @return true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof PositionInWarehouse
                && row == ((PositionInWarehouse) other).row
                && shelfNumber == ((PositionInWarehouse) other).shelfNumber
                && level == ((PositionInWarehouse) other).level;
    }

    /**
     * Implementazione del metodo hashCode.
     *
     * @return valore hash code
     */
    @Override
    public int hashCode() {
        return row ^ shelfNumber ^ level;
    }

    /**
     * Implementazione del metodo toString.
     *
     * @return stringa rappresentante l'oggetto
     */
    @Override
    public String toString() {
        return "Fila: " + row
                + "\nNumero scaffale: " + shelfNumber
                + "\nRipiano: " + level;
    }
}
