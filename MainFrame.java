/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author thesmashburn
 * @author kcehlers
 */
public class MainFrame extends javax.swing.JFrame {
    // User generated variables -> add product
    public String addProductName;
    public int addProductId;
    public double addProductPrice;
    public String addProductVendor;
    public double addProductTax;
    public String addProductWeight;
    
    
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        addAProductWarning.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        homeContainer = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        homeHeader = new javax.swing.JLabel();
        addContainer = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        productNameField = new javax.swing.JTextField();
        productIdField = new javax.swing.JTextField();
        productPriceField = new javax.swing.JTextField();
        productVendorField = new javax.swing.JTextField();
        productTaxField = new javax.swing.JTextField();
        productWeightField = new javax.swing.JTextField();
        addAProductWarning = new javax.swing.JLabel();
        updateContainer = new javax.swing.JPanel();
        submitButtonUpd = new javax.swing.JButton();
        backButtonUpd = new javax.swing.JButton();
        checkoutContainer = new javax.swing.JPanel();
        submitButtonCheck = new javax.swing.JButton();
        backButtonCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        addButton.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        addButton.setText("Add Product");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        checkoutButton.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        checkoutButton.setText("Checkout");

        updateButton.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        updateButton.setText("Update Product");

        homeHeader.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        homeHeader.setText("Welcome to MarketPlace!");

        javax.swing.GroupLayout homeContainerLayout = new javax.swing.GroupLayout(homeContainer);
        homeContainer.setLayout(homeContainerLayout);
        homeContainerLayout.setHorizontalGroup(
            homeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeContainerLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(homeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeContainerLayout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addComponent(homeHeader)
                        .addGap(109, 109, 109))
                    .addGroup(homeContainerLayout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(homeContainerLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        homeContainerLayout.setVerticalGroup(
            homeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeContainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(homeHeader)
                .addGap(88, 88, 88)
                .addGroup(homeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        mainPanel.add(homeContainer, "card3");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        title.setText("Add a Product");

        productNameField.setText("name");

        productIdField.setText("id");

        productPriceField.setText("price");

        productVendorField.setText("vendor");

        productTaxField.setText("tax");

        productWeightField.setText("weight");

        addAProductWarning.setForeground(new java.awt.Color(255, 0, 0));
        addAProductWarning.setText("* Re-evaluate your fields");

        javax.swing.GroupLayout addContainerLayout = new javax.swing.GroupLayout(addContainer);
        addContainer.setLayout(addContainerLayout);
        addContainerLayout.setHorizontalGroup(
            addContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addContainerLayout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(18, 18, 18)
                        .addComponent(backButton)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addContainerLayout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(343, 343, 343))))
            .addGroup(addContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productNameField)
                    .addComponent(productIdField)
                    .addComponent(productPriceField)
                    .addComponent(productVendorField, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(productTaxField)
                    .addComponent(productWeightField))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addContainerLayout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(addAProductWarning)
                .addGap(315, 315, 315))
        );
        addContainerLayout.setVerticalGroup(
            addContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(36, 36, 36)
                .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(productPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(productVendorField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(productTaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(productWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(addAProductWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(addContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(backButton))
                .addGap(20, 20, 20))
        );

        title.getAccessibleContext().setAccessibleName("title");
        productNameField.getAccessibleContext().setAccessibleName("productNameField");
        productIdField.getAccessibleContext().setAccessibleName("productIdField");
        productPriceField.getAccessibleContext().setAccessibleName("productPriceField");
        productVendorField.getAccessibleContext().setAccessibleName("productVendorField");
        productTaxField.getAccessibleContext().setAccessibleName("productTaxField");
        productWeightField.getAccessibleContext().setAccessibleName("productWeightField");

        mainPanel.add(addContainer, "card2");

        submitButtonUpd.setText("Submit");

        backButtonUpd.setText("Back");

        javax.swing.GroupLayout updateContainerLayout = new javax.swing.GroupLayout(updateContainer);
        updateContainer.setLayout(updateContainerLayout);
        updateContainerLayout.setHorizontalGroup(
            updateContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateContainerLayout.createSequentialGroup()
                .addContainerGap(623, Short.MAX_VALUE)
                .addComponent(submitButtonUpd)
                .addGap(18, 18, 18)
                .addComponent(backButtonUpd)
                .addGap(17, 17, 17))
        );
        updateContainerLayout.setVerticalGroup(
            updateContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateContainerLayout.createSequentialGroup()
                .addContainerGap(573, Short.MAX_VALUE)
                .addGroup(updateContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButtonUpd)
                    .addComponent(backButtonUpd))
                .addGap(20, 20, 20))
        );

        mainPanel.add(updateContainer, "card4");

        submitButtonCheck.setText("Submit");

        backButtonCheck.setText("Back");

        javax.swing.GroupLayout checkoutContainerLayout = new javax.swing.GroupLayout(checkoutContainer);
        checkoutContainer.setLayout(checkoutContainerLayout);
        checkoutContainerLayout.setHorizontalGroup(
            checkoutContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutContainerLayout.createSequentialGroup()
                .addContainerGap(623, Short.MAX_VALUE)
                .addComponent(submitButtonCheck)
                .addGap(18, 18, 18)
                .addComponent(backButtonCheck)
                .addGap(17, 17, 17))
        );
        checkoutContainerLayout.setVerticalGroup(
            checkoutContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutContainerLayout.createSequentialGroup()
                .addContainerGap(573, Short.MAX_VALUE)
                .addGroup(checkoutContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButtonCheck)
                    .addComponent(backButtonCheck))
                .addGap(20, 20, 20))
        );

        mainPanel.add(checkoutContainer, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 821, 644);
    }// </editor-fold>//GEN-END:initComponents
    
     /* THIS IS THE SECTION FOR EVENTS RELATED EVENTS*/
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card2");
    }//GEN-LAST:event_addButtonActionPerformed
    
     
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card3");
    }//GEN-LAST:event_backButtonActionPerformed

    // Submit button -> add product
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        if (verifyNewProduct(productNameField.getText(), productIdField.getText(), productPriceField.getText(), productVendorField.getText(), productTaxField.getText(), productWeightField.getText())) {
            // Send to database, display dialog, return to main screen
            /*System.out.println(addProductId);
            System.out.println(addProductPrice);
            System.out.println(addProductTax);
            System.out.println(addProductName);
            System.out.println(addProductVendor);
            System.out.println(addProductWeight);*/
            if (DataBaseManager.addProduct(addProductName, addProductId, addProductPrice, addProductVendor, addProductTax, Double.parseDouble(addProductWeight))) {
                System.out.println("SUCCESS");
                //JDialog successDialog = new JDialog();
                //successDialog.setTitle("Success");
                //successDialog.setSize(200, 200);
                
            }
            
            /*JDialog successDialog = new JDialog();
            successDialog.setTitle("Success");
            successDialog.setSize(200, 200);*/
        }
        else {
            // Display warning
            return;
        }
    }//GEN-LAST:event_submitButtonActionPerformed
    
    
     /* THIS IS THE SECTION FOR GENERAL METHODS */
    
    // Only need to check id, price, and tax
    public boolean verifyNewProduct(String nameIn, String idIn, String priceIn, String vendorIn, String taxIn, String weightIn) {
        try {
            addProductId = Integer.parseInt(idIn);
            addProductPrice = Double.parseDouble(priceIn);
            addProductTax = Double.parseDouble(taxIn);
        } catch (NumberFormatException e) {
            addAProductWarning.setVisible(true);
            return false;
        }
        if (nameIn == null || idIn == null || priceIn == null || vendorIn == null || taxIn == null || weightIn == null) {
            addAProductWarning.setVisible(true);
            return false;
        }
            addProductName = nameIn;
            addProductVendor = vendorIn;
            addProductWeight = weightIn;
        return true;
    }
    
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    public void clearInputs() {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addAProductWarning;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addContainer;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButtonCheck;
    private javax.swing.JButton backButtonUpd;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JPanel checkoutContainer;
    private javax.swing.JPanel homeContainer;
    private javax.swing.JLabel homeHeader;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField productIdField;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField productPriceField;
    private javax.swing.JTextField productTaxField;
    private javax.swing.JTextField productVendorField;
    private javax.swing.JTextField productWeightField;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton submitButtonCheck;
    private javax.swing.JButton submitButtonUpd;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updateContainer;
    // End of variables declaration//GEN-END:variables
}
