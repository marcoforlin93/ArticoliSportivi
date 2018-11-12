package gui;

import java.awt.Color;
import java.util.Set;
import javax.swing.*;
import objects.*;

/**
 * Classe che rappresenta l'interfaccia del magazziniere.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class WarehouseWorkerFrame extends javax.swing.JFrame {

    private final Warehouse warehouse;
    private Warehouse.Entry entry;
    private Warehouse.Exit exit;
    private Warehouse.Order order;

    /**
     * Costruttore della classe.
     *
     * @param warehouse, magazzino
     */
    public WarehouseWorkerFrame(Warehouse warehouse) {
        this.warehouse = warehouse;
        initComponents();
        this.setResizable(false);
        closeAllExcept(jPanelMenu);
    }

    /**
     * Implementazione del metodo setResizable. Modificato a final.
     *
     * @param resizable, true se resizable false altrimenti
     */
    @Override
    public final void setResizable(boolean resizable) {
        super.setResizable(resizable);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanelMenu = new javax.swing.JPanel();
        jButtonEntry = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonMove = new javax.swing.JButton();
        jPanelEntry = new javax.swing.JPanel();
        jLabelEntryNumber = new javax.swing.JLabel();
        jComboBoxEntryArticleCategory = new javax.swing.JComboBox<>();
        jTextFieldEntryQuantity = new javax.swing.JTextField();
        jTextFieldEntryDay = new javax.swing.JTextField();
        jTextFieldEntryMonth = new javax.swing.JTextField();
        jTextFieldEntryYear = new javax.swing.JTextField();
        jButtonEntrySave = new javax.swing.JButton();
        jComboBoxEntryArticleType = new javax.swing.JComboBox<>();
        jTextFieldEntryPrice = new javax.swing.JTextField();
        jTextFieldEntryLevel = new javax.swing.JTextField();
        jButtonEntryBack = new javax.swing.JButton();
        jTextFieldEntryShelfNumber = new javax.swing.JTextField();
        jLabelEntryArticleCategory = new javax.swing.JLabel();
        jLabelEntryArticleType = new javax.swing.JLabel();
        jLabelEntryQuantity = new javax.swing.JLabel();
        jLabelEntryPrice = new javax.swing.JLabel();
        jLabelEntryProductionDate = new javax.swing.JLabel();
        jLabelEntryDay = new javax.swing.JLabel();
        jLabelEntryMonth = new javax.swing.JLabel();
        jLabelEntryYear = new javax.swing.JLabel();
        jLabelEntryWarehousePosition = new javax.swing.JLabel();
        jTextFieldEntryRow = new javax.swing.JTextField();
        jLabelEntryLevel = new javax.swing.JLabel();
        jLabelEntryRow = new javax.swing.JLabel();
        jLabelEntryShelfNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelMove = new javax.swing.JPanel();
        jButtonBackMoveArticle = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldMoveArticleLevel = new javax.swing.JTextField();
        jComboBoxMoveArticleCategoryArticle = new javax.swing.JComboBox<>();
        jTextFieldMoveArticleQuantity = new javax.swing.JTextField();
        jComboBoxMoveArticleTypeArticle = new javax.swing.JComboBox<>();
        jComboBoxMoveArticleCost = new javax.swing.JComboBox<>();
        jComboBoxMoveArticleThisPosition = new javax.swing.JComboBox<>();
        jTextFieldMoveArticleShelfNumber = new javax.swing.JTextField();
        jTextFieldMoveArticleRow = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelMoveArticleShelfNumber = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabelMoveArticleQuantity = new javax.swing.JLabel();
        jLabelMoveArticleRow = new javax.swing.JLabel();
        jLabelMoveArticleLevel = new javax.swing.JLabel();
        jPanelExit = new javax.swing.JPanel();
        labelExitRow = new java.awt.Label();
        labelExitShelfNumber = new java.awt.Label();
        labelExitPrice1 = new java.awt.Label();
        labelExitArticleCategory = new java.awt.Label();
        labelExitLevel = new java.awt.Label();
        labelExitDay = new java.awt.Label();
        labelExitMonth = new java.awt.Label();
        labelExitYear = new java.awt.Label();
        labelExitPrice = new java.awt.Label();
        labelExitQuantity = new java.awt.Label();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldForwarderName = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonBackExitArticle = new javax.swing.JButton();
        jLabelExitShopDestinationName = new javax.swing.JLabel();
        jComboBoxShopDestinationName = new javax.swing.JComboBox<>();
        jLabelExitOrderNumber = new javax.swing.JLabel();
        jComboBoxOrderNumber = new javax.swing.JComboBox<>();
        jLabelExitForwarderName = new javax.swing.JLabel();
        jLabelExitWarehousePosition1 = new javax.swing.JLabel();
        jLabelExitLevel = new javax.swing.JLabel();
        jLabelExitRow = new javax.swing.JLabel();
        jLabelExitShelfNumber = new javax.swing.JLabel();
        labelExitSlash = new java.awt.Label();
        labelExitSlash1 = new java.awt.Label();
        jLabelExitProductionDate = new javax.swing.JLabel();
        jLabelExitQuantity = new javax.swing.JLabel();
        jLabelExitPrice = new javax.swing.JLabel();
        jLabelExitArticleCategory = new javax.swing.JLabel();
        labelExitArticleType = new java.awt.Label();
        jLabelExitArticleType = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionale Magazzino");
        setBounds(new java.awt.Rectangle(700, 200, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 600));

        jPanelMenu.setBackground(new java.awt.Color(93, 93, 93));
        jPanelMenu.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEntry.setText("ENTRATA ARTICOLI");
        jButtonEntry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntryActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 200, 80));

        jButtonExit.setText("USCITA ARTICOLI");
        jButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExit.setMaximumSize(new java.awt.Dimension(115, 29));
        jButtonExit.setMinimumSize(new java.awt.Dimension(115, 29));
        jButtonExit.setPreferredSize(new java.awt.Dimension(115, 29));
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 200, 80));

        jButtonMove.setText("SPOSTA ARTICOLI");
        jButtonMove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMove.setMaximumSize(new java.awt.Dimension(115, 29));
        jButtonMove.setMinimumSize(new java.awt.Dimension(115, 29));
        jButtonMove.setPreferredSize(new java.awt.Dimension(115, 29));
        jButtonMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoveActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 200, 80));

        jPanelEntry.setBackground(new java.awt.Color(93, 93, 93));
        jPanelEntry.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelEntry.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanelEntry.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanelEntry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEntryNumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanelEntry.add(jLabelEntryNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 412, 30));

        jComboBoxEntryArticleCategory.setModel(new DefaultComboBoxModel<>(objects.Sport.values()));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextFieldEntryDay, org.jdesktop.beansbinding.ObjectProperty.create(), jComboBoxEntryArticleCategory, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBoxEntryArticleCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEntryArticleCategoryActionPerformed(evt);
            }
        });
        jPanelEntry.add(jComboBoxEntryArticleCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, -1));

        jTextFieldEntryQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntryQuantityActionPerformed(evt);
            }
        });
        jPanelEntry.add(jTextFieldEntryQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 40, 30));

        jTextFieldEntryDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntryDayActionPerformed(evt);
            }
        });
        jPanelEntry.add(jTextFieldEntryDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 40, 30));
        jPanelEntry.add(jTextFieldEntryMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 40, 30));
        jPanelEntry.add(jTextFieldEntryYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 82, 30));

        jButtonEntrySave.setText("SALVA");
        jButtonEntrySave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrySaveActionPerformed(evt);
            }
        });
        jPanelEntry.add(jButtonEntrySave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 130, 40));

        jComboBoxEntryArticleType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEntryArticleTypeActionPerformed(evt);
            }
        });
        jPanelEntry.add(jComboBoxEntryArticleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 520, -1));

        jTextFieldEntryPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntryPriceActionPerformed(evt);
            }
        });
        jPanelEntry.add(jTextFieldEntryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 40, 30));
        jPanelEntry.add(jTextFieldEntryLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 40, 30));

        jButtonEntryBack.setText("INDIETRO");
        jButtonEntryBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntryBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntryBackActionPerformed(evt);
            }
        });
        jPanelEntry.add(jButtonEntryBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, 40));

        jTextFieldEntryShelfNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntryShelfNumberActionPerformed(evt);
            }
        });
        jPanelEntry.add(jTextFieldEntryShelfNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 40, 30));

        jLabelEntryArticleCategory.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryArticleCategory.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Categoria Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryArticleCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 80));

        jLabelEntryArticleType.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryArticleType.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Tipo di articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryArticleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 560, 80));

        jLabelEntryQuantity.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 80, 80));

        jLabelEntryPrice.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 80, 80));

        jLabelEntryProductionDate.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryProductionDate.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Data di produzione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryProductionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 340, 130));

        jLabelEntryDay.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryDay.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Giorno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 80, 80));

        jLabelEntryMonth.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryMonth.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Mese", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 80, 80));

        jLabelEntryYear.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryYear.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Anno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 120, 80));

        jLabelEntryWarehousePosition.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryWarehousePosition.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Posizione in magazzino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryWarehousePosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 300, 130));

        jTextFieldEntryRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntryRowActionPerformed(evt);
            }
        });
        jPanelEntry.add(jTextFieldEntryRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 40, 30));

        jLabelEntryLevel.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 80, 80));

        jLabelEntryRow.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 80, 80));

        jLabelEntryShelfNumber.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEntryShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelEntry.add(jLabelEntryShelfNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 80, 80));

        jLabel1.setText("jLabel1");
        jPanelEntry.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jPanelMove.setBackground(new java.awt.Color(93, 93, 93));
        jPanelMove.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelMove.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanelMove.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanelMove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBackMoveArticle.setText("INDIETRO");
        jButtonBackMoveArticle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBackMoveArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackMoveArticleActionPerformed(evt);
            }
        });
        jPanelMove.add(jButtonBackMoveArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, 40));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("NUOVA POSIZIONE");
        jPanelMove.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 254, 254));
        jLabel15.setText("SPOSTA ARTICOLI");
        jPanelMove.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 20));

        jTextFieldMoveArticleLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMoveArticleLevelActionPerformed(evt);
            }
        });
        jPanelMove.add(jTextFieldMoveArticleLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 40, 30));

        jComboBoxMoveArticleCategoryArticle.setModel(new DefaultComboBoxModel<>(objects.Sport.values()));
        jComboBoxMoveArticleCategoryArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMoveArticleCategoryArticleActionPerformed(evt);
            }
        });
        jPanelMove.add(jComboBoxMoveArticleCategoryArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, -1));

        jTextFieldMoveArticleQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMoveArticleQuantityActionPerformed(evt);
            }
        });
        jPanelMove.add(jTextFieldMoveArticleQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 40, 30));

        jComboBoxMoveArticleTypeArticle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COTOLETTA COL TONNO" }));
        jComboBoxMoveArticleTypeArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMoveArticleTypeArticleActionPerformed(evt);
            }
        });
        jPanelMove.add(jComboBoxMoveArticleTypeArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 500, -1));

        jComboBoxMoveArticleCost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelMove.add(jComboBoxMoveArticleCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 120, -1));

        jComboBoxMoveArticleThisPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelMove.add(jComboBoxMoveArticleThisPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 500, -1));

        jTextFieldMoveArticleShelfNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMoveArticleShelfNumberActionPerformed(evt);
            }
        });
        jPanelMove.add(jTextFieldMoveArticleShelfNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 40, 30));

        jTextFieldMoveArticleRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMoveArticleRowActionPerformed(evt);
            }
        });
        jPanelMove.add(jTextFieldMoveArticleRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 40, 30));

        jButton1.setText("SALVA");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelMove.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 120, 40));

        jLabelMoveArticleShelfNumber.setForeground(new java.awt.Color(254, 254, 254));
        jLabelMoveArticleShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelMove.add(jLabelMoveArticleShelfNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 80, 80));

        jLabel32.setForeground(new java.awt.Color(254, 254, 254));
        jLabel32.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelMove.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 160, 80));

        jLabel33.setForeground(new java.awt.Color(254, 254, 254));
        jLabel33.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Categoria Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelMove.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 80));

        jLabel34.setForeground(new java.awt.Color(254, 254, 254));
        jLabel34.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Tipo di articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelMove.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 540, 80));

        jLabel35.setForeground(new java.awt.Color(254, 254, 254));
        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Posizione attuale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelMove.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 540, 80));

        jLabelMoveArticleQuantity.setForeground(new java.awt.Color(254, 254, 254));
        jLabelMoveArticleQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelMove.add(jLabelMoveArticleQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 80, 80));

        jLabelMoveArticleRow.setForeground(new java.awt.Color(254, 254, 254));
        jLabelMoveArticleRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelMove.add(jLabelMoveArticleRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, 80));

        jLabelMoveArticleLevel.setForeground(new java.awt.Color(254, 254, 254));
        jLabelMoveArticleLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelMove.add(jLabelMoveArticleLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 80, 80));

        jPanelExit.setBackground(new java.awt.Color(93, 93, 93));
        jPanelExit.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelExit.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanelExit.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelExitRow.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitRow.setForeground(new java.awt.Color(254, 254, 254));
        labelExitRow.setText("23");
        jPanelExit.add(labelExitRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 30, 30));

        labelExitShelfNumber.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitShelfNumber.setForeground(new java.awt.Color(254, 254, 254));
        labelExitShelfNumber.setText("23");
        jPanelExit.add(labelExitShelfNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 30, 30));

        labelExitPrice1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitPrice1.setForeground(new java.awt.Color(254, 254, 254));
        labelExitPrice1.setText("Pagina 1 di 1");
        jPanelExit.add(labelExitPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 30));

        labelExitArticleCategory.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitArticleCategory.setForeground(new java.awt.Color(254, 254, 254));
        labelExitArticleCategory.setText("PALLAVOLO");
        jPanelExit.add(labelExitArticleCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 30));

        labelExitLevel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitLevel.setForeground(new java.awt.Color(254, 254, 254));
        labelExitLevel.setText("23");
        jPanelExit.add(labelExitLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 30, 30));

        labelExitDay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitDay.setForeground(new java.awt.Color(254, 254, 254));
        labelExitDay.setText("23");
        jPanelExit.add(labelExitDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 30, 30));

        labelExitMonth.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitMonth.setForeground(new java.awt.Color(254, 254, 254));
        labelExitMonth.setText("23");
        jPanelExit.add(labelExitMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 30, 30));

        labelExitYear.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitYear.setForeground(new java.awt.Color(254, 254, 254));
        labelExitYear.setText("2018");
        jPanelExit.add(labelExitYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 50, 30));

        labelExitPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitPrice.setForeground(new java.awt.Color(254, 254, 254));
        labelExitPrice.setText("23");
        jPanelExit.add(labelExitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 30, 30));

        labelExitQuantity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitQuantity.setForeground(new java.awt.Color(254, 254, 254));
        labelExitQuantity.setText("23");
        jPanelExit.add(labelExitQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 30, 30));

        jLabel6.setBackground(new java.awt.Color(254, 254, 254));
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Uscita articoli n.        in data");
        jPanelExit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextFieldForwarderName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForwarderNameActionPerformed(evt);
            }
        });
        jPanelExit.add(jTextFieldForwarderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 240, 30));

        jButtonSave.setText("SALVA");
        jButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSave.setMaximumSize(new java.awt.Dimension(80, 40));
        jButtonSave.setMinimumSize(new java.awt.Dimension(80, 40));
        jButtonSave.setPreferredSize(new java.awt.Dimension(80, 40));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanelExit.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 130, 40));

        jButtonBackExitArticle.setText("INDIETRO");
        jButtonBackExitArticle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBackExitArticle.setPreferredSize(new java.awt.Dimension(80, 40));
        jButtonBackExitArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackExitArticleActionPerformed(evt);
            }
        });
        jPanelExit.add(jButtonBackExitArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, 40));

        jLabelExitShopDestinationName.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitShopDestinationName.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Negozio di destinazione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitShopDestinationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 560, 80));

        jComboBoxShopDestinationName.setModel(new DefaultComboBoxModel<>(objects.Sport.values()));
        jComboBoxShopDestinationName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxShopDestinationNameActionPerformed(evt);
            }
        });
        jPanelExit.add(jComboBoxShopDestinationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 520, 30));

        jLabelExitOrderNumber.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitOrderNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Numero ordine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 80));

        jComboBoxOrderNumber.setModel(new DefaultComboBoxModel<>(objects.Sport.values()));
        jComboBoxOrderNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrderNumberActionPerformed(evt);
            }
        });
        jPanelExit.add(jComboBoxOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 220, 30));

        jLabelExitForwarderName.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitForwarderName.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Nome spedizioniere", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitForwarderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 280, 80));

        jLabelExitWarehousePosition1.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitWarehousePosition1.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Posizione in magazzino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitWarehousePosition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 280, 110));

        jLabelExitLevel.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 80, 60));

        jLabelExitRow.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 80, 60));

        jLabelExitShelfNumber.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitShelfNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 80, 60));

        labelExitSlash.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitSlash.setForeground(new java.awt.Color(254, 254, 254));
        labelExitSlash.setText("/");
        jPanelExit.add(labelExitSlash, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 10, 30));

        labelExitSlash1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitSlash1.setForeground(new java.awt.Color(254, 254, 254));
        labelExitSlash1.setText("/");
        jPanelExit.add(labelExitSlash1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 10, 30));

        jLabelExitProductionDate.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitProductionDate.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Data di produzione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitProductionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 160, 60));

        jLabelExitQuantity.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 80, 60));

        jLabelExitPrice.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 70, 60));

        jLabelExitArticleCategory.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitArticleCategory.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Categoria Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitArticleCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 60));

        labelExitArticleType.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelExitArticleType.setForeground(new java.awt.Color(254, 254, 254));
        labelExitArticleType.setText("PALLA POCO TONDA");
        jPanelExit.add(labelExitArticleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, 30));

        jLabelExitArticleType.setForeground(new java.awt.Color(254, 254, 254));
        jLabelExitArticleType.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Tipo di articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelExit.add(jLabelExitArticleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 330, 60));
        jPanelExit.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMove, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMove, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEntryDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntryDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntryDayActionPerformed

    /**
     * Azione slezione elemento da jComboBoxEntryArticleCategory. Rimuove tutti
     * i tipi di articolo da jComboBoxEntryArticleType e ci mette i tipi di
     * articolo della categoria di sport scelta.
     *
     * @param evt, evento selezione
     */
    private void jComboBoxEntryArticleCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEntryArticleCategoryActionPerformed
        jComboBoxEntryArticleType.removeAllItems();

        Set<String> articleTypes = warehouse.getArticleTypes(Sport.valueOf(jComboBoxEntryArticleCategory.getSelectedItem().toString()));
        articleTypes.forEach((String myString) -> {
            jComboBoxEntryArticleType.addItem(myString);
        });
    }//GEN-LAST:event_jComboBoxEntryArticleCategoryActionPerformed

    /**
     * Azione click jButtonEntry. Apre il pannello delle entrate in magazzino e
     * crea una nuova entrata.
     *
     * @param evt, evento click
     */
    private void jButtonEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntryActionPerformed
        entry = warehouse.createEntry();
        closeAllExcept(jPanelEntry);
        jLabelEntryNumber.setText("Entrata n°: " + entry.getCodeToString());
    }//GEN-LAST:event_jButtonEntryActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed

        //Rende visibile il pannello uscita articoli
        closeAllExcept(jPanelExit);
    }//GEN-LAST:event_jButtonExitActionPerformed

    /**
     * Azione clik jButtonEntrySave. Salva l'articolo inserito.
     *
     * @param evt, evento click
     */
    private void jButtonEntrySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrySaveActionPerformed
        saveEntryArticle();
    }//GEN-LAST:event_jButtonEntrySaveActionPerformed

    private void jComboBoxEntryArticleTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEntryArticleTypeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxEntryArticleTypeActionPerformed

    private void jTextFieldEntryQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntryQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntryQuantityActionPerformed

    private void jTextFieldEntryPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntryPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntryPriceActionPerformed

    private void jTextFieldForwarderNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForwarderNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForwarderNameActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        saveInformationExit();

        //FARE CONTROLLO INFORMAZIONI

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonBackExitArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackExitArticleActionPerformed
        WhiteLabels(jPanelExit);
        refreshPanel(jPanelExit);

        // pulsante indietro: torna alla schermata principale del magazzino
        closeAllExcept(jPanelMenu);
    }//GEN-LAST:event_jButtonBackExitArticleActionPerformed

    /**
     * Azione click jButtonEntryBack. Torna al pannello menu senza salvare.
     *
     * @param evt, evento clik
     */
    private void jButtonEntryBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntryBackActionPerformed
        closeAllExcept(jPanelMenu);
        refreshPanel(jPanelEntry);
        entry = null;
    }//GEN-LAST:event_jButtonEntryBackActionPerformed

    private void jButtonMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoveActionPerformed

        //Rende visibile il pannello sposta articoli
        closeAllExcept(jPanelMove);
    }//GEN-LAST:event_jButtonMoveActionPerformed

    private void jButtonBackMoveArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackMoveArticleActionPerformed
        WhiteLabels(jPanelMove);
        refreshPanel(jPanelMove);
        //apre il pannello menu
        closeAllExcept(jPanelMenu);
    }//GEN-LAST:event_jButtonBackMoveArticleActionPerformed

    private void jTextFieldMoveArticleLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMoveArticleLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMoveArticleLevelActionPerformed

    private void jTextFieldEntryShelfNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntryShelfNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntryShelfNumberActionPerformed

    private void jComboBoxMoveArticleCategoryArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMoveArticleCategoryArticleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMoveArticleCategoryArticleActionPerformed

    private void jTextFieldMoveArticleQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMoveArticleQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMoveArticleQuantityActionPerformed

    private void jComboBoxMoveArticleTypeArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMoveArticleTypeArticleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMoveArticleTypeArticleActionPerformed

    private void jTextFieldMoveArticleShelfNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMoveArticleShelfNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMoveArticleShelfNumberActionPerformed

    private void jTextFieldMoveArticleRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMoveArticleRowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMoveArticleRowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //quando viene premuto il pulsante salva, salva la posizione di dove spostare gli articoli e la quantità
        saveInformationMove();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldEntryRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntryRowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntryRowActionPerformed

    private void jComboBoxShopDestinationNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxShopDestinationNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxShopDestinationNameActionPerformed

    private void jComboBoxOrderNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrderNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOrderNumberActionPerformed

    /**
     * Salva l'articolo presente nel pannello entrata. Effettua gli opportuni
     * controlli.
     */
    private void saveEntryArticle() {
        String categoryArticle;
        String typeArticle;
        int quantityAsInt = 0;
        int rowAsInt = 0;
        int shelfNumberAsInt = 0;
        int levelAsInt = 0;
        int priceAsInt = 0;
        int dayAsInt = 0, monthAsInt = 0, yearAsInt = 0;
        boolean save = true;

        WhiteLabels(jPanelEntry);

        // Salvataggio della categoria dell'articolo
        categoryArticle = jComboBoxEntryArticleCategory.getSelectedItem().toString();
        System.out.println("Categoria articolo: " + categoryArticle);

        // Salvataggio del tipo di articolo
        try {
           typeArticle = jComboBoxEntryArticleType.getSelectedItem().toString();
            System.out.println("Tipo di articolo: " + typeArticle);
        } catch (java.lang.NullPointerException e){
            save = false;
            jLabelEntryArticleType.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Tipo di articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));

        }

            // Salvataggio della quantità di articoli      
            String quantity = jTextFieldEntryQuantity.getText();
            System.out.println("quantità: " + quantity);

            // Controllo che le info inserite della quantità siano dei numeri e maggiori di zero
            try {
                quantityAsInt = Integer.parseInt(quantity);
                if (quantityAsInt < 1) {
                    save = false;
                    jLabelEntryQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
                }
            } catch (NumberFormatException e) {
                System.err.println("Caught IOException: " + e.getMessage());
                save = false;
                jLabelEntryQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            }

            // Salvataggio della fila
            String row = jTextFieldEntryRow.getText();
            System.out.print("posizione: " + row);

            // Controllo che le info inserite della fila siano dei numeri e comprese tra 1 e 50
            try {
                rowAsInt = Integer.parseInt(row);
                if (rowAsInt < 1 && rowAsInt > 50) {
                    save = false;
                    jLabelEntryRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
                }

            } catch (NumberFormatException e) {
                System.err.println("Caught IOException: " + e.getMessage());
                save = false;
                jLabelEntryRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            }

            // Salvataggio dello scaffale
            String shelfNumber = jTextFieldEntryShelfNumber.getText();
            System.out.println(" " + shelfNumber);

            // Controllo che le info inserite dello scaffale siano dei numeri e comprese tra 1 e 50
            try {
                shelfNumberAsInt = Integer.parseInt(shelfNumber);
                if (shelfNumberAsInt < 0 && shelfNumberAsInt > 50) {
                    save = false;
                    jLabelEntryShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
                }

            } catch (NumberFormatException e) {
                System.err.println("Caught IOException: " + e.getMessage());
                save = false;
                jLabelEntryShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            }

            // Salvataggio del ripiano
            String level = jTextFieldEntryLevel.getText();
            System.out.println(" " + level);

            // Controllo che le info inserite del ripiano siano dei numeri e comprese tra 1 e 50
            try {
                levelAsInt = Integer.parseInt(level);
                if (levelAsInt < 0 && levelAsInt > 50) {
                    save = false;
                    jLabelEntryLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
                }

            } catch (NumberFormatException e) {
                System.err.println("Caught IOException: " + e.getMessage());
                save = false;
                jLabelEntryLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            }

            // Salvataggio del prezzo
            String price = jTextFieldEntryPrice.getText();
            System.out.println("Prezzo: " + price);

            try {
                priceAsInt = Integer.parseInt(price);
                if (priceAsInt < 1) {
                    save = false;
                    jLabelEntryPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
                }

            } catch (NumberFormatException e) {
                System.err.println("Caught IOException: " + e.getMessage());
                jLabelEntryPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
                save = false;
            }

            // Salvataggio del giorno
            String day = jTextFieldEntryDay.getText();
            System.out.print("giorno: " + day);

            // Salvataggio del mese
            String month = jTextFieldEntryMonth.getText();
            System.out.print(" " + month);

            // Salvataggio dell'anno
            String year = jTextFieldEntryYear.getText();
            System.out.println(" " + year);

            // Controllo che giorno mese e anno siano dei numeri e controllo della veridicità della data
            try {
                dayAsInt = Integer.parseInt(day);
                monthAsInt = Integer.parseInt(month);
                yearAsInt = Integer.parseInt(year);
                new MyDate(yearAsInt, monthAsInt, dayAsInt);
                new ProductionDate(yearAsInt, monthAsInt, dayAsInt);

            } catch (NumberFormatException e) {
                jLabelEntryProductionDate.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Data di produzione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
                save = false;

            } catch (IllegalArgumentException e) {
                jLabelEntryProductionDate.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Data di produzione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
                save = false;
            }

            // Salvataggio informazioni pulsanti della finestra di avviso
            if (save) {

                entry.addEnteredArticle(new ArticleInWarehouse(warehouse.getArticleType(Sport.valueOf(jComboBoxEntryArticleCategory.getSelectedItem().toString()), typeArticle), priceAsInt, new ProductionDate(yearAsInt, monthAsInt, dayAsInt), new PositionInWarehouse(rowAsInt, shelfNumberAsInt, levelAsInt), quantityAsInt));

                Object[] options = {"SI",
                    "NO",
                    "Aggiungi altri articoli"
                };

                /*
            * Finestra di avviso:
            * Vuoi Salvare?
            * 0 -> SI
            * 1 -> NO
            * 2 -> Aggiungi altri altricoli
                 */
                int n = JOptionPane.showOptionDialog(null, "Vuoi salvare?", "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                // n = 0 premuto pulsante SI
                if (n == 0) {
                    //entry.addEnteredArticle(new ArticleInWarehouse(articleType, ERROR, ProductionDate, positionInWarehouse, SOMEBITS));
                    JOptionPane.showMessageDialog(null, "Salvato!");
                    closeAllExcept(jPanelMenu);
                    refreshPanel(jPanelEntry);
                    WhiteLabels(jPanelEntry);
                    entry.saveEntry();

                    // n = 1 premuto pulsante NO
                } else if (n == 1) {
                    JOptionPane.showMessageDialog(null, "Operazione annullata");
                    closeAllExcept(jPanelMenu);
                    refreshPanel(jPanelEntry);
                    WhiteLabels(jPanelEntry);
                    entry = null;

                    // n = 2 premuto pulsante aggiungi articoli
                } else if (n == 2) {
                    refreshPanel(jPanelEntry);
                    WhiteLabels(jPanelEntry);
                }
            }

        }
        // Salvataggio delle info degli articoli in uscita
    public void saveInformationExit() {

        boolean save = true;

        WhiteLabels(jPanelExit);

        // Salvataggio del nome dello spedizioniere
        String forwarderName = jTextFieldForwarderName.getText();
        System.out.println("Nome spedizioniere: " + forwarderName);

        // Controllo che il label nome dello spedizioniere non sia vuoto
        if (forwarderName.equals("")) {
            save = false;
            jLabelExitForwarderName.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Nome spedizioniere", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        // Salvataggio del nome del negozio di destinaione
        String shopDestinationName = jComboBoxShopDestinationName.getSelectedItem().toString();
        System.out.println("Negozio di destinazione: " + shopDestinationName);

        // Controllo che Negozio di destinazione non sia vuoto
        if (shopDestinationName.equals("")) {
            save = false;
            jLabelExitShopDestinationName.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Negozio di destinazione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        // salvataggio del codice articolo
        String ArticleNumber = jComboBoxOrderNumber.getSelectedItem().toString();
        System.out.println("Numero dell'articolo: " + ArticleNumber);

        // Controllo che codice articolo non sia vuoto
        if (ArticleNumber.equals("")) {
            save = false;
            jLabelExitOrderNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Numero ordine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        // Salvataggio informazioni pulsanti della finestra di avviso
        if (save) {
            Object[] options = {"SI",
                "NO",
                "Aggiungi altri articoli"
            };

            /*
            * Finestra di avviso:
            * Vuoi Salvare?
            * 0 -> SI
            * 1 -> NO
            * 2 -> Aggiungi altri altricoli (salvataggio degli articoli e refresh della pagina)
             */
            int n = JOptionPane.showOptionDialog(null, "Vuoi salvare?", "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            // n = 0 premuto pulsante SI
            if (n == 0) {
                //entry.addEnteredArticle(new ArticleInWarehouse(articleType, ERROR, ProductionDate, positionInWarehouse, SOMEBITS));
                JOptionPane.showMessageDialog(null, "Salvato!");
                //entry.addEnteredArticle(new ArticleInWarehouse(articleType, ERROR, ProductionDate, positionInWarehouse, SOMEBITS));
                closeAllExcept(jPanelMenu);
                refreshPanel(jPanelExit);
                WhiteLabels(jPanelExit);

                // n = 1 premuto pulsante NO
            } else if (n == 1) {
                JOptionPane.showMessageDialog(null, "Operazione annullata");
                closeAllExcept(jPanelMenu);
                refreshPanel(jPanelExit);
                WhiteLabels(jPanelExit);

                // n 0 2 premuto pulsante aggiungi articoli
            } else if (n == 2) {
                //entry.addEnteredArticle(new ArticleInWarehouse(articleType, ERROR, ProductionDate, positionInWarehouse, SOMEBITS));
                refreshPanel(jPanelExit);
                WhiteLabels(jPanelExit);
            }
        }
    }

    // Salvataggio delle info degli articoli spostati
    public void saveInformationMove() {

        boolean save = true;

        // Imposto tutti i label bianchi
        WhiteLabels(jPanelMove);

        // Salvataggio della quantità di articoli da spostare
        String quantity = jTextFieldMoveArticleQuantity.getText();
        System.out.println("quantità: " + quantity);

        // Controllo che le info inserite della quantità siano dei numeri e meaggiori di zero
        try {
            int Nquantity = Integer.parseInt(quantity);
            if (Nquantity < 1) {
                save = false;
                jLabelMoveArticleQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            }
        } catch (NumberFormatException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            save = false;
            jLabelMoveArticleQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        // Salvataggio della fila
        String row = jTextFieldMoveArticleRow.getText();
        System.out.print("posizione: " + row);

        try {
            int nRow = Integer.parseInt(row);
            if (nRow < 1 && nRow > 50) {
                save = false;
                jLabelMoveArticleRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            }

        } catch (NumberFormatException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            save = false;
            jLabelMoveArticleRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        // Salvataggio dello scaffale
        String shelfNumber = jTextFieldMoveArticleShelfNumber.getText();
        System.out.println(" " + shelfNumber);

        try {
            int nShelfNumber = Integer.parseInt(shelfNumber);
            if (nShelfNumber < 0 && nShelfNumber > 50) {
                save = false;
                jLabelMoveArticleShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            }

        } catch (NumberFormatException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            save = false;
            jLabelMoveArticleShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        // Salvataggio del ripiano
        String level = jTextFieldMoveArticleLevel.getText();
        System.out.println(" " + level);

        try {
            int nLevel = Integer.parseInt(level);
            if (nLevel < 0 && nLevel > 50) {
                save = false;
                jLabelMoveArticleLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            }

        } catch (NumberFormatException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            save = false;
            jLabelMoveArticleLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        // Salvataggio informazioni pulsanti della finestra di avviso
        if (save) {

            Object[] options = {"SI",
                "NO",
                "Sposta altri articoli"
            };

            /*
            * Finestra di avviso:
            * Vuoi Salvare?
            * 0 -> SI
            * 1 -> NO
            * 2 -> Sposta altri altricoli (salvataggio degli articoli, refresh della pagina e labal di colore bianco)
             */
            int n = JOptionPane.showOptionDialog(null, "Vuoi salvare?", "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            // n = 0 premuto pulsante SI
            if (n == 0) {
                //entry.addEnteredArticle(new ArticleInWarehouse(articleType, ERROR, ProductionDate, positionInWarehouse, SOMEBITS));
                JOptionPane.showMessageDialog(null, "Salvato!");
                //entry.addEnteredArticle(new ArticleInWarehouse(articleType, ERROR, ProductionDate, positionInWarehouse, SOMEBITS));
                closeAllExcept(jPanelMenu);
                refreshPanel(jPanelMove);
                WhiteLabels(jPanelMove);

                // n = 1 premuto pulsante no
            } else if (n == 1) {
                JOptionPane.showMessageDialog(null, "Operazione annullata");
                closeAllExcept(jPanelMenu);
                refreshPanel(jPanelMove);
                WhiteLabels(jPanelMove);

                // n = 2 premuto pulsante Sposta articoli
            } else if (n == 2) {
                //entry.addEnteredArticle(new ArticleInWarehouse(articleType, ERROR, ProductionDate, positionInWarehouse, SOMEBITS));
                refreshPanel(jPanelMove);
                WhiteLabels(jPanelMove);
            }
        }
    }

    // Colora di bianco i bordi delle label del pannello passato
    public void WhiteLabels(JPanel panel) {

        if (panel == jPanelEntry) {
            jLabelEntryQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryProductionDate.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Data di produzione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryDay.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Giorno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryMonth.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Mese", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryYear.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Anno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Riga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        if (panel == jPanelExit) {
            jLabelExitForwarderName.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Nome spedizioniere", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        if (panel == jPanelMove) {
            jLabelMoveArticleQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Qantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelMoveArticleRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelMoveArticleShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelMoveArticleLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }
    }

    /**
     * Effettua il refresh del pannello passato. Mette tutti i bordi bianchi ed
     * elimina i dati dalle caselle di testo.
     *
     * @param jPanel, pannello di cui si vuole fare il refresh
     */
    private void refreshPanel(JPanel jPanel) {
        if (jPanel == jPanelEntry) {

            // caselle di testo:
            jTextFieldEntryQuantity.setText("");
            jTextFieldEntryPrice.setText("");
            jTextFieldEntryDay.setText("");
            jTextFieldEntryMonth.setText("");
            jTextFieldEntryYear.setText("");
            jTextFieldEntryShelfNumber.setText("");
            jTextFieldEntryRow.setText("");
            jTextFieldEntryLevel.setText("");

            // bordi:
            jLabelEntryQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryProductionDate.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Data di produzione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryDay.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Giorno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryMonth.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Mese", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryYear.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Anno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryWarehousePosition.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Posizione in magazzino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254)));
            jLabelEntryRow.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Riga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryShelfNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Scaffale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
            jLabelEntryLevel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Ripiano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        }

        // da qua in gui da sistemare
        if (jPanel == jPanelExit) {
            jTextFieldForwarderName.setText("");
        }

        if (jPanel == jPanelMove) {
            jTextFieldMoveArticleQuantity.setText("");
            jTextFieldMoveArticleRow.setText("");
            jTextFieldMoveArticleShelfNumber.setText("");
            jTextFieldMoveArticleLevel.setText("");
        }
    }

    /**
     * Rende invisibili tutti i pannelli per poi mettere come visibile il
     * pannello passato.
     *
     * @param jPanel, pannello da rendere visibile
     */
    private void closeAllExcept(JPanel jPanel) {
        jPanelMenu.setVisible(false);
        jPanelExit.setVisible(false);
        jPanelEntry.setVisible(false);
        jPanelMove.setVisible(false);
        jPanel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBackExitArticle;
    private javax.swing.JButton jButtonBackMoveArticle;
    private javax.swing.JButton jButtonEntry;
    private javax.swing.JButton jButtonEntryBack;
    private javax.swing.JButton jButtonEntrySave;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMove;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<objects.Sport> jComboBoxEntryArticleCategory;
    private javax.swing.JComboBox<String> jComboBoxEntryArticleType;
    private javax.swing.JComboBox<objects.Sport> jComboBoxMoveArticleCategoryArticle;
    private javax.swing.JComboBox<String> jComboBoxMoveArticleCost;
    private javax.swing.JComboBox<String> jComboBoxMoveArticleThisPosition;
    private javax.swing.JComboBox<String> jComboBoxMoveArticleTypeArticle;
    private javax.swing.JComboBox<objects.Sport> jComboBoxOrderNumber;
    private javax.swing.JComboBox<objects.Sport> jComboBoxShopDestinationName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelEntryArticleCategory;
    private javax.swing.JLabel jLabelEntryArticleType;
    private javax.swing.JLabel jLabelEntryDay;
    private javax.swing.JLabel jLabelEntryLevel;
    private javax.swing.JLabel jLabelEntryMonth;
    private javax.swing.JLabel jLabelEntryNumber;
    private javax.swing.JLabel jLabelEntryPrice;
    private javax.swing.JLabel jLabelEntryProductionDate;
    private javax.swing.JLabel jLabelEntryQuantity;
    private javax.swing.JLabel jLabelEntryRow;
    private javax.swing.JLabel jLabelEntryShelfNumber;
    private javax.swing.JLabel jLabelEntryWarehousePosition;
    private javax.swing.JLabel jLabelEntryYear;
    private javax.swing.JLabel jLabelExitArticleCategory;
    private javax.swing.JLabel jLabelExitArticleType;
    private javax.swing.JLabel jLabelExitForwarderName;
    private javax.swing.JLabel jLabelExitLevel;
    private javax.swing.JLabel jLabelExitOrderNumber;
    private javax.swing.JLabel jLabelExitPrice;
    private javax.swing.JLabel jLabelExitProductionDate;
    private javax.swing.JLabel jLabelExitQuantity;
    private javax.swing.JLabel jLabelExitRow;
    private javax.swing.JLabel jLabelExitShelfNumber;
    private javax.swing.JLabel jLabelExitShopDestinationName;
    private javax.swing.JLabel jLabelExitWarehousePosition1;
    private javax.swing.JLabel jLabelMoveArticleLevel;
    private javax.swing.JLabel jLabelMoveArticleQuantity;
    private javax.swing.JLabel jLabelMoveArticleRow;
    private javax.swing.JLabel jLabelMoveArticleShelfNumber;
    private javax.swing.JPanel jPanelEntry;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMove;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextFieldEntryDay;
    private javax.swing.JTextField jTextFieldEntryLevel;
    private javax.swing.JTextField jTextFieldEntryMonth;
    private javax.swing.JTextField jTextFieldEntryPrice;
    private javax.swing.JTextField jTextFieldEntryQuantity;
    private javax.swing.JTextField jTextFieldEntryRow;
    private javax.swing.JTextField jTextFieldEntryShelfNumber;
    private javax.swing.JTextField jTextFieldEntryYear;
    private javax.swing.JTextField jTextFieldForwarderName;
    private javax.swing.JTextField jTextFieldMoveArticleLevel;
    private javax.swing.JTextField jTextFieldMoveArticleQuantity;
    private javax.swing.JTextField jTextFieldMoveArticleRow;
    private javax.swing.JTextField jTextFieldMoveArticleShelfNumber;
    private java.awt.Label labelExitArticleCategory;
    private java.awt.Label labelExitArticleType;
    private java.awt.Label labelExitDay;
    private java.awt.Label labelExitLevel;
    private java.awt.Label labelExitMonth;
    private java.awt.Label labelExitPrice;
    private java.awt.Label labelExitPrice1;
    private java.awt.Label labelExitQuantity;
    private java.awt.Label labelExitRow;
    private java.awt.Label labelExitShelfNumber;
    private java.awt.Label labelExitSlash;
    private java.awt.Label labelExitSlash1;
    private java.awt.Label labelExitYear;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
