/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import userinterface.SystemAdminWorkArea.*;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author liluyi
 */
public class ViewMenu extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    MenuItem item;
    String oldDishName;
    Restaurant res;
    /**
     * Creates new form ViewCustomerScreen
     */
    public ViewMenu(JPanel rightPanel,EcoSystem system,String resName,MenuItem item) {
        initComponents();
        this.userProcessContainer=rightPanel;
        this.ecosystem=system;
        this.oldDishName=item.getDishName();
        this.item=item;
        this.fill();
        this.res=this.ecosystem.getRestaurantDirectory().searchRestaurantByName(resName);
        if(this.res==null)
            JOptionPane.showMessageDialog(null, "System error occurred! Please log out!");
        this.btnConfirm.setVisible(false);
    }

    public void fill()
    {
        this.txtDishname.setText(this.item.getDishName());
        this.txtPrice.setText(Double.toString(this.item.getPrice()));
        this.txtDishname.setEnabled(false);
        this.txtPrice.setEnabled(false);
       /* Customer cust=agency.getCustomerDir().getCustomers().get(index);
        Date birthDate=cust.getDateOfBirth();
        Date expDate=cust.getPassportExpirationDate();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        String birth=formatter.format(birthDate);
        String exp=formatter.format(expDate);
        this.txtDateOfBirth.setText(birth);
        this.txtPassportExp.setText(exp);
        this.txtFirstName.setText(cust.getFirstName());
        this.txtLastName.setText(cust.getLastName());
        this.txtNationality.setText(cust.getNationality());
        this.txtPassportNum.setText(cust.getPassportNum());
        this.txtDateOfBirth.setEnabled(false);
        this.txtFirstName.setEnabled(false);
        this.txtLastName.setEnabled(false);
        this.txtNationality.setEnabled(false);
        this.txtPassportExp.setEnabled(false);
        this.txtPassportNum.setEnabled(false);
        this.btnConfirm.setVisible(false);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        txtDishname = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.setActionCommand("Update");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel1.setText("Dish name");

        jLabel2.setText("Price");

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("View Menu Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDishname, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDishname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addGap(184, 184, 184))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        this.txtDishname.setEnabled(true);
        this.txtPrice.setEnabled(true);
        this.btnConfirm.setVisible(true);
        this.btnUpdate.setVisible(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String dishname=this.txtDishname.getText();
        String priceStr=this.txtPrice.getText();
        
        try {
            Double.parseDouble(priceStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, priceStr + " is not a valid number.");
        }
        double price=Double.parseDouble(priceStr);
        if(this.res.updateMenu(oldDishName,dishname, price))
        {
            JOptionPane.showMessageDialog(null, "Menu updated successfully!");
            this.txtDishname.setEnabled(false);
            this.txtPrice.setEnabled(false);
            this.btnUpdate.setVisible(true);
            this.btnConfirm.setVisible(false);
        }
        
       
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        layout.show(userProcessContainer, "ManageMenu");
        Component[] comps=this.userProcessContainer.getComponents();
        for(Component comp:comps)
        {
            if(comp instanceof ManageMenu)
            {
                ManageMenu manage=(ManageMenu)comp;
                manage.populate();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDishname;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}