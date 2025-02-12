/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.UserDaoImplementation;
import info.pkg5100.finalproject.models.Organization;
import info.pkg5100.finalproject.models.User;
import info.pkg5100.finalproject.utils.SendEmailUtility;
import info.pkg5100.finalproject.utils.SimpleTools;
import info.pkg5100.finalproject.utils.Validator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ankit
 */
public class OrganizationDoctorEmployeeMngt extends javax.swing.JPanel {

    /**
     * Creates new form OrganizationEmployeeMngt
     */
    JPanel mainWorkJPanel;
    Organization currentOrganization;
    UserDaoImplementation userDaoImplementation;
    Validator util;
    SendEmailUtility sendEmailUtility;

    public OrganizationDoctorEmployeeMngt() {
        initComponents();
    }

    public OrganizationDoctorEmployeeMngt(JPanel mainWorkJPanel, Organization currentOrganization) throws SQLException {
        initComponents();
        this.mainWorkJPanel = mainWorkJPanel;
        this.currentOrganization = currentOrganization;
        this.userDaoImplementation = new UserDaoImplementation();
        this.util=new Validator();
        this.sendEmailUtility=new SendEmailUtility();
        
        cmbBoxRole.addItem("doctor");
        for (String roles : SimpleTools.getPossibleRoles(this.currentOrganization.getType())) {
            cmbBoxRole.addItem(roles);
        }
        populateEmployeeTable();
        populateComboBoxHospitalManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeList = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        txtEmployeeAge = new javax.swing.JTextField();
        txtEmployeePhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmployeeUsername = new javax.swing.JTextField();
        txtEmployeeEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbBoxRole = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnAddOrgAdim = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        cmbBoxHospitalManager = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        tblEmployeeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Phone", "Username"
            }
        ));
        jScrollPane1.setViewportView(tblEmployeeList);

        jLabel6.setText("Name");

        jLabel7.setText("Age");

        jLabel8.setText("Phone");

        jLabel9.setText("Username");

        jLabel10.setText("Email");

        txtEmployeeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeEmailActionPerformed(evt);
            }
        });

        jLabel11.setText("Role");

        jLabel12.setBackground(new java.awt.Color(31, 75, 124));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Hospitals Employee Management");
        jLabel12.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Employee List");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Add Hospital Employees");

        btnAddOrgAdim.setBackground(new java.awt.Color(31, 75, 124));
        btnAddOrgAdim.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrgAdim.setText("Add Employee");
        btnAddOrgAdim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrgAdimActionPerformed(evt);
            }
        });

        jLabel21.setText("Hospital Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel21))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbBoxHospitalManager, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeAge, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeEmail)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnAddOrgAdim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbBoxHospitalManager, cmbBoxRole, txtEmployeeAge, txtEmployeeEmail, txtEmployeeName, txtEmployeePhone, txtEmployeeUsername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel21, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmployeeAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmployeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmployeeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmployeeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cmbBoxHospitalManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddOrgAdim)
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbBoxRole, jLabel10, jLabel11, jLabel6, jLabel7, jLabel8, jLabel9, txtEmployeeAge, txtEmployeeEmail, txtEmployeeName, txtEmployeePhone, txtEmployeeUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrgAdimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrgAdimActionPerformed
        try {
            String message="";
            if(!(util.isNotNullAndEmpty(txtEmployeeName.getText()) && util.isAlphabetic(txtEmployeeName.getText())))
                message = "Please enter a valid name";
            else if(!(util.isNotNullAndEmpty(txtEmployeeAge.getText()) && util.isNumeric(txtEmployeeAge.getText())))
                message = "Please enter valid age";
            else if(!(util.isNotNullAndEmpty(txtEmployeePhone.getText()) && util.isNumeric(txtEmployeePhone.getText()) && txtEmployeePhone.getText().length()==10 ))
                message = "Please enter valid phone";
            else if(!(util.isNotNullAndEmpty(txtEmployeeUsername.getText()) && util.isAlphanumeric(txtEmployeeUsername.getText())))
                message = "Please enter an alphanumeric username";
            else if(!(util.isNotNullAndEmpty(txtEmployeeEmail.getText()) && util.isValidEmail(txtEmployeeEmail.getText())))
                message="Please enter valid email";
            if(!"".equals(message)){
                JOptionPane.showMessageDialog(this, message,"Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for (User user : this.userDaoImplementation.getUsers()) {
                if (user.getUsername().trim().equalsIgnoreCase(txtEmployeeUsername.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Username is already taken","Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            if (cmbBoxRole.getSelectedItem().toString().equalsIgnoreCase("doctor") && cmbBoxHospitalManager.getSelectedItem().toString().equals("Select")) {
                JOptionPane.showMessageDialog(this, "Select Hospital","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int newId = SimpleTools.getUnusedId("users", 1000, 9999);

            User newEmployee = new User(newId,
                    txtEmployeeUsername.getText(),
                    "123@Test",
                    txtEmployeeName.getText(),
                    txtEmployeeAge.getText(),
                    txtEmployeePhone.getText(),
                    cmbBoxRole.getSelectedItem().toString(),
                    this.currentOrganization.getId(),
                    cmbBoxRole.getSelectedItem().toString().equalsIgnoreCase("doctor")?
                            Integer.valueOf(cmbBoxHospitalManager.getSelectedItem().toString()):-1);

            newEmployee.setEmail(txtEmployeeEmail.getText());
            int res=this.sendEmailUtility.sendMail(newEmployee);
            if(res==1){
                this.userDaoImplementation.add(newEmployee);
                populateEmployeeTable();
                populateComboBoxHospitalManager();
                JOptionPane.showMessageDialog(this, "User Added Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
                clearField();
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationDoctorEmployeeMngt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAddOrgAdimActionPerformed

    private void txtEmployeeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeEmailActionPerformed

    public void populateEmployeeTable() {
        try {
            List<User> userList;
            userList = this.userDaoImplementation.getEmployeesByOrgId(this.currentOrganization.getId());

            DefaultTableModel model = (DefaultTableModel) tblEmployeeList.getModel();
            model.setRowCount(0);
            for (User user : userList) {
                Object[] row = new Object[4];
                row[0] = user;
                row[1] = user.getName();
                row[2] = user.getPhone();
                row[3] = user.getUsername();
                model.addRow(row);
                //test
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationDoctorEmployeeMngt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void populateComboBoxHospitalManager() {
        cmbBoxHospitalManager.removeAllItems();
        cmbBoxHospitalManager.addItem("Select");
        try {
            for (User hosManUser : this.userDaoImplementation.getUsersByOrgIdAndRole(currentOrganization.getId(), "hospital-manager")) {

                if (hosManUser.getHospitalid() == -1) {
                    cmbBoxHospitalManager.addItem(String.valueOf(hosManUser.getId()));
                }
            }
            populateEmployeeTable();
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationDoctorEmployeeMngt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrgAdim;
    private javax.swing.JComboBox<String> cmbBoxHospitalManager;
    private javax.swing.JComboBox<String> cmbBoxRole;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployeeList;
    private javax.swing.JTextField txtEmployeeAge;
    private javax.swing.JTextField txtEmployeeEmail;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtEmployeePhone;
    private javax.swing.JTextField txtEmployeeUsername;
    // End of variables declaration//GEN-END:variables

    private void clearField() {
            txtEmployeeUsername.setText(null);
            txtEmployeeName.setText(null);
            txtEmployeeAge.setText(null);
            txtEmployeePhone.setText(null);
            txtEmployeeEmail.setText(null);
            cmbBoxRole.setSelectedIndex(0);
            cmbBoxHospitalManager.setSelectedIndex(0);
    }
}
