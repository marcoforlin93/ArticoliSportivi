package objects;

import java.util.Date;

/**
 * Rappresenta una data di produzione. Deve essere precedente o uguale alla data
 * attuale.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class ProductionDate extends MyDate {

    /**
     * Costruttore della classe.
     *
     * @param day, giorno
     * @param month, mese
     * @param year, anno
     */
    public ProductionDate(int year, int month, int day) {
        super(year, month, day);

        // salvo la data corrente:
        final Date currentDate = new Date();

        // controllo che la data inserita non sia futura:
        if ((new MyDate(year, month, day)
                .compareTo(new MyDate(currentDate))) > 0) {
            throw new IllegalArgumentException("La data di produzione deve essere oggi o precedente");
        }
    }
}
