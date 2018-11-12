package gui;

import javax.swing.JPanel;

/**
 * @author Marco Forlin, Matteo faveri
 */
public interface GUI {
    
    // Colora di bianco i bordi delle label del pannello passato
    public void whiteLabels(JPanel panel);
    
    // Refresh del pannello
    public void refreshPanel(JPanel panel);
    
    // Visualizza solo il pannello passato
    public void closeAllExcept(JPanel p);
}
