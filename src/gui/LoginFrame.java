package gui;

import objects.*;

/**
 * Classe che rappresenta il login del sistema.
 *
 * @author Forlin Marco & Favari Matteo
 */
public class LoginFrame extends javax.swing.JFrame {

    private final Warehouse warehouse;

    /**
     * Costruttore della classe.
     *
     * @param warehouse, magazzino
     */
    public LoginFrame(Warehouse warehouse) {
        this.warehouse = warehouse;
        initComponents();
        this.setResizable(false);
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

        jPanelLogin = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elaborato Alfa 2.0");
        setBounds(new java.awt.Rectangle(700, 200, 0, 0));

        jPanelLogin.setBackground(new java.awt.Color(93, 93, 93));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogin.setText("LOGIN");
        jButtonLogin.setBorder(null);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 40));
        jPanelLogin.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 150, 26));
        jPanelLogin.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 150, 26));

        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.WHITE), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelLogin.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 190, 80));

        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.WHITE), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelLogin.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Azione click jButtonLogin. Verifica che lo username esista e la password
     * sia corretta, quindi apre il frame corrispondente alla categoria
     * dell'utente.
     *
     * @param evt, evento click
     */
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        final String username = jTextFieldUsername.getText();
        final String password = new String(jPasswordField.getPassword());

        // metto i campi bianchi:
        jLabelUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.WHITE), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        jLabelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.WHITE), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));

        // controllo che l'utente esista:
        if (!warehouse.getUsers().containsKey(username)) {
            javax.swing.JOptionPane.showMessageDialog(null, "L'utente non esiste!");
            jLabelUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));

            // controllo che la password sia corretta:
        } else if (!warehouse.getUsers().get(username).getPassword().equals(password)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Password errata!");
            jLabelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255)));
        } else {

            /* Apertura del pannello magazzino, negozio
             * o segreteria amministrativa in base al tipo di utente:
             */
            if (warehouse.getUsers().get(username) instanceof AdministrativeSecretary) {
                new SecretaryPanel(warehouse).setVisible(true);
                this.dispose();
            }

            if (warehouse.getUsers().get(username) instanceof Shop) {
                new ShopPanel(warehouse).setVisible(true);
                this.dispose();
            }

            if (warehouse.getUsers().get(username) instanceof WarehouseWorker) {
                new WarehouseWorkerFrame(warehouse).setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

//    public static void main(String[] args) {
//        Warehouse warehouse = new Warehouse();
//
//        // ----- CREAZIONE E STAMPA OGGETTI -----
////        Address address = new Address("Via", "Pradelle", 8, "B", 37142);
////        System.out.println(address + "\n");
////        
////        User administrativeSecretary = new AdministrativeSecretary("prova", "1224");
////        System.out.println(administrativeSecretary + "\n");
////        
////        ArticleType articleType = new ArticleType("maglia", "sono una maglia", Sport.CALCIO, "cotone", "legno");
////        System.out.println(articleType + "\n");
////        
////        MyDate date = new MyDate(2018, 1, 1);
////        System.out.println(date + "\n");
////        
////        PositionInWarehouse positionInWarehouse = new PositionInWarehouse(15, 46, 3);
////        System.out.println(positionInWarehouse + "\n");
////        
////        ProductionDate productionDate = new ProductionDate(1, 2, 14);
////        System.out.println(productionDate + "\n");
////        
////        Shop shop = new Shop(1666, "negozio1", address, City.ASTI);
////        System.out.println(shop + "\n");
////        
////        User shopAsUser = new ShopAsUser("negozio1", "1234", shop.getFiscalCode());
////        System.out.println(shopAsUser + "\n");
////        
////        ArticleInWarehouse articleInWarehouse = new ArticleInWarehouse(articleType, 13.2, productionDate, positionInWarehouse, 15);
////        System.out.println(articleInWarehouse + "\n");
////
////        User warehouseWorker = new WarehouseWorker("magazziniere", "1234");
////        System.out.println(warehouseWorker + "\n");
//        new LoginFrame(warehouse).setVisible(true);
//        new SecretaryPanel(warehouse).setVisible(true);
//        new ShopPanel(warehouse).setVisible(true);
//        new WarehouseWorkerFrame(warehouse).setVisible(true);
////        
////            loginPanel.addWindowListener(new WindowAdapter() {
////            @Override
////            public void windowClosing(WindowEvent e)
////            {
////                System.out.println("prova");
////                
////        
////        int i = 13;
////        
////        System.out.println(String.format("%10s", 13).replace(" ", "0"));
////        loginPanel.setDefaultCloseOperation(EXIT_ON_CLOSE);
////            }
////        });
////        
//
//    }
}
