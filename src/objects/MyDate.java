package objects;

import java.util.Date;

/**
 * Classe che rappresenta una data.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class MyDate implements Comparable<MyDate> {

    private final int year;
    private final int month;
    private final int day;
    private static final int[] DAYS_FOR_MONTH
            = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Costruttore della classe.
     *
     * @param year, anno
     * @param month, mese
     * @param day, giorno
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        // controllo sulla correttezza del mese:
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Mese non valido");
        }

        // controllo sulla correttezza del giorno:
        if (day < 1 || day > getDayForMonth(month, year)) {
            throw new IllegalArgumentException("Giorno non valido");
        }
    }

    /**
     * Costruttore della classe.
     *
     * @param date, oggetto di tipo java.util.Date
     */
    public MyDate(Date date) {
        this(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
    }

    /**
     * Verifica se un anno è bisestile.
     *
     * @param year, anno di cui si vuole verificare la bisestilità
     * @return true se bisestile false altrimenti
     */
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /**
     * Calcola quanti giorni ci sono in un mese. Considera gli anni bisestili.
     *
     * @param month, mese di cui si vogliono sapere i giorni
     * @param year, anno a cui appartiene il mese
     * @return giorni del mese
     */
    private int getDayForMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_FOR_MONTH[month - 1];
    }

    /**
     * Consente l'accesso al campo day.
     *
     * @return giorno della data
     */
    public final int getDay() {
        return day;
    }

    /**
     * Consente l'accesso al campo month.
     *
     * @return mese della data
     */
    public final int getMonth() {
        return month;
    }

    /**
     * Consente l'accesso al campo year.
     *
     * @return anno della data
     */
    public final int getYear() {
        return year;
    }

    /**
     * Implementazione del metodo equals.
     *
     * @param other, oggetto da confrontare
     * @return true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof MyDate
                && year == ((MyDate) other).year
                && month == ((MyDate) other).month
                && day == ((MyDate) other).day;
    }

    /**
     * Implementazione del metodo hashCode.
     *
     * @return valore hash code
     */
    @Override
    public int hashCode() {
        return year ^ month ^ day;
    }

    /**
     * Implementazione del metodo toString.
     *
     * @return stringa rappresentante l'oggetto
     */
    @Override
    public String toString() {
        return String.format("%2s/%2s/%s", day, month, year).replace(" ", "0");
    }

    /**
     * Implementazione del metodo compareTo.
     *
     * @param other, data da confrontare
     * @return numero minore di 0 se this viene prima other, uguale a 0 se
     * uguali, false altrimenti
     */
    @Override
    public int compareTo(MyDate other) {
        if (year != other.year) {
            return year - other.year;
        }

        if (month != other.month) {
            return month - other.month;
        }

        return day - other.day;
    }
}
