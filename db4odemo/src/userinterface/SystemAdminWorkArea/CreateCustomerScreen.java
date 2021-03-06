/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 张睿哲
 */
public class CreateCustomerScreen extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    /**
     * Creates new form CreateCustomerScreen
     */
    public CreateCustomerScreen(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setText("Password");

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.setActionCommand("Update");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Create New Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnCreate))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreate)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        Component[] comps=this.userProcessContainer.getComponents();
        for(Component comp:comps)
        {
            if(comp instanceof ManageCustomer)
            {
                ManageCustomer manageP=(ManageCustomer)comp;
                manageP.populate();
            }
        }
        layout.show(this.userProcessContainer, "ManageCustomer");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String username=this.txtUsername.getText();
        String password=this.txtPassword.getText();
        if(this.ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(username))
        {
            Role role=new CustomerRole();
            this.ecosystem.getUserAccountDirectory().createUserAccount(username, password, null, role);
            JOptionPane.showMessageDialog(null, "Customer created successfully!");
        }
        else
            JOptionPane.showMessageDialog(null, "Customer already exist!");
        
        /* // TODO add your handling code here:
        // TODO add your handling code here:
        String firstName=this.txtFirstName.getText();
        String lastName=this.txtLastName.getText();
        String passportNum=this.txtPassportNum.getText();
        String nationality=this.txtNationality.getText();
        String birthDate=this.txtDateOfBirth.getText();
        String expDate=this.txtPassportExp.getText();
        Date dateOfBirth,passportExpDate;

        try
        {//检查出生日期和护照过期日期格式是否正确
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            dateOfBirth = formatter.parse(birthDate);
            passportExpDate = formatter.parse(expDate);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid date format!");
            return;
        }
        Customer cust=new Customer(firstName,lastName,dateOfBirth,passportNum,passportExpDate,nationality);
        if(!this.agency.getCustomerDir().addCustomer(cust))
            JOptionPane.showMessageDialog(null, "Customer already exist!");
        else
        {
            JOptionPane.showMessageDialog(null, "Customer created successfully!");
            this.txtDateOfBirth.setText("");
            this.txtFirstName.setText("");
            this.txtLastName.setText("");
            this.txtNationality.setText("");
            this.txtPassportExp.setText("");
            this.txtPassportNum.setText("");
        }
*/
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
