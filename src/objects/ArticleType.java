package objects;

/**
 * Classe che rappresenta il tipo di articolo. Il campo name deve essere univoco
 * nelle istanze della classe.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class ArticleType {

    private final String name;
    private String description;
    private Sport sport;
    private String[] materials;

    /**
     * Costruttore della classe.
     *
     * @param name, nome
     * @param description, descrizione
     * @param sport, categoria di sport
     * @param materials, array con i materiali che compongono il tipo di
     * articolo
     */
    public ArticleType(String name, String description, Sport sport, String... materials) {
        this.name = name;
        this.description = description;
        this.sport = sport;
        this.materials = materials;
    }

    /**
     * Consente l'accesso al campo name.
     *
     * @return stringa contenente il nome
     */
    public final String getName() {
        return name;
    }

    /**
     * Consente l'accesso al campo description.
     *
     * @return stringa contenente la descrizione
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Consente l'accesso al campo sport.
     *
     * @return enumerabile contenente la categoria di sport
     */
    public final Sport getSport() {
        return sport;
    }

    /**
     * Consente l'accesso al campo materials.
     *
     * @return array con i materiali che compongono il tipo di articolo
     */
    public final String[] getMaterials() {
        return materials;
    }

    /**
     * Consente di riscrivere il campo description.
     *
     * @param description, nuova descrizione
     */
    public final void setDescription(String description) {
        this.description = description;
    }

    /**
     * Consente di riscrivere il campo sport.
     *
     * @param sport, nuova categoria di sport
     */
    public final void setSport(Sport sport) {
        this.sport = sport;
    }

    /**
     * Consente di riscrivere il campo materials.
     *
     * @param materials, nuovo array con i materiali che compongono il tipo di
     * articolo
     */
    public final void setMaterials(String... materials) {
        this.materials = materials;
    }

    /**
     * Implementazione del metodo equals.
     *
     * @param other, oggetto da confrontare
     * @return true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof ArticleType
                && name.equals(((ArticleType) other).name);
    }

    /**
     * Implementazione del metodo hashCode.
     *
     * @return valore hash code
     */
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    /**
     * Implementazione del metodo toString.
     *
     * @return stringa rappresentante l'oggetto
     */
    @Override
    public String toString() {
        String materialsToString = "";
        for (int i = 0; i < materials.length; i++) {
            materialsToString += "\n" + (i + 1) + ") " + materials[i];
        }

        return "Nome: " + name
                + "\nDescrizione: " + description
                + "\nCategoria: " + sport
                + "\nMateriali:" + materialsToString;
    }
}
