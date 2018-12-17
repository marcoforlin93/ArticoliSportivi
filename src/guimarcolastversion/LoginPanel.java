/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guimarcolastversion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import objects.*;

/**
 *
 * @author marco
 */
public class LoginPanel extends javax.swing.JFrame {
    private Warehouse warehouse;
    
    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
    }
    
    public LoginPanel(Warehouse warehouse) {
        this();
        this.warehouse = warehouse;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestionale V. Alfa 1.0.1");
        setBounds(new java.awt.Rectangle(700, 200, 0, 0));

        jPanelLogin.setBackground(new java.awt.Color(93, 93, 93));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setText("LOGIN");
        loginButton.setBorder(null);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanelLogin.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 40));
        jPanelLogin.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 150, 26));
        jPanelLogin.add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 150, 26));

        jLabelPassword.setForeground(new java.awt.Color(254, 254, 254));
        jLabelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelLogin.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 190, 80));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Nome Utente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 80));

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

    
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String userName = jTextFieldUser.getText();
        String password = jPasswordFieldPassword.getText();
        System.out.print(userName);
        
        // Controllo che l'utente e la password siano corrette
        if(!warehouse.getUsers().containsKey(userName))
            JOptionPane.showMessageDialog(null,"Utente errato!");                   
        
                else if(!warehouse.getUsers().get(userName).getPassword().equals(password)){
                    JOptionPane.showMessageDialog(null,"Password errata!");
                    jLabelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(254, 254, 254)));
                }
                     

                        else{
                    
                            // Apertura del pannello magazzino, negozio o segreteria in base al tipo di utente
                            if(warehouse.getUsers().get(userName) instanceof AdministrativeSecretary) {
                                new SecretaryPanel(warehouse).setVisible(true);
                                this.setVisible(false);
                            }

                            if(warehouse.getUsers().get(userName) instanceof Shop) {
                               new ShopPanel(warehouse).setVisible(false);
                               this.setVisible(false);
                            }

                            if(warehouse.getUsers().get(userName) instanceof WarehouseWorker) {
                                new WarehousePanel(warehouse).setVisible(true);
                                this.setVisible(false);
                            }
                        }   
    }//GEN-LAST:event_loginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables

    
//        int i = 34;
//        ProductionDate n = new ProductionDate(4514354, 3, 5);
//
//        System.out.println(new java.util.Date(System.currentTimeMillis()));
//        JFrame loginPanel = new LoginPanel(warehouse);
//        new SecretaryPanel(warehouse).setVisible(true);
//        new ShopPanel(warehouse).setVisible(true);
//        
        new WarehousePanel(warehouse).setVisible(true);
//        new SecretaryPanel(warehouse).setVisible(true);
//        new ShopPanel(warehouse).setVisible(true);
//        new SecretaryPanel(warehouse).setVisible(true);
        
//            loginPanel.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e)
//            {
//                System.out.println("prova");
//                
//        
//        int i = 13;
//        
//        System.out.println(String.format("%10s", 13).replace(" ", "0"));
//        loginPanel.setDefaultCloseOperation(EXIT_ON_CLOSE);
//            }
//        });
        
        
        
    }
}
