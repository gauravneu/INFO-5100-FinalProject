/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.OrganizationDaoImplementation;
import info.pkg5100.finalproject.daos.UserDaoImplementation;
import info.pkg5100.finalproject.models.IncidentHandlingPolice;
import info.pkg5100.finalproject.models.MainSystem;
import info.pkg5100.finalproject.models.Organization;
import info.pkg5100.finalproject.models.User;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import javax.swing.plaf.SplitPaneUI;

/**
 *
 * @author hazel
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    MainSystem mainSystem;
    JPanel mainWorkJPanel;
    JSplitPane splitPaneUI;
    UserDaoImplementation userDaoImplementation;
    OrganizationDaoImplementation organizationDaoImplementation;

    public Login() {
        initComponents();
    }

    public Login(MainSystem mainSystem, JPanel mainWorkJPanel,JSplitPane splitPaneUI) {
        initComponents();

        this.mainSystem = mainSystem;
        this.mainWorkJPanel = mainWorkJPanel;
        this.splitPaneUI=splitPaneUI;
        this.userDaoImplementation = new UserDaoImplementation();
        this.organizationDaoImplementation =  new OrganizationDaoImplementation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("LOGIN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCreate.setText("Submit");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnCreateActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        // Test login implementation
        // Clicking login searches for the Bosotn
        // Here for testing purpose, there is only one investigation police officer in Boston police network. Sending
        // that police into incident management.
        if(txtUsername.getText().equals("sysadmin")) {
            NetworkMngt networkMngt = new NetworkMngt(mainWorkJPanel);
            splitPaneUI.setLeftComponent(new Logout());
            mainWorkJPanel.add("NetworkMngt", networkMngt);
            CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
            layout.next(mainWorkJPanel);
        } else {

            User user = this.userDaoImplementation.getUserByUsernameAndPassword(txtUsername.getText(), txtPassword.getText());


            if(user != null) {
                int orgid = user.getOrgid();
                Organization org = this.organizationDaoImplementation.getOrganizationById(orgid);
                splitPaneUI.setLeftComponent(new Logout());

                if(user.getRole().equals("orgadmin")) {
                    OrganizationEmployeeMngt organizationEmployeeMngt = new OrganizationEmployeeMngt(mainWorkJPanel, org);
                    mainWorkJPanel.add("OrganizationEmployeeMngt", organizationEmployeeMngt);
                    CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
                    layout.next(mainWorkJPanel);

                } else if(user.getRole().equals("incident-police")) {
                    IncidentManager incidentManager = new IncidentManager(mainWorkJPanel, user, org);
                    mainWorkJPanel.add("IncidentManager", incidentManager);
                    CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
                    layout.next(mainWorkJPanel);
                } else if(user.getRole().equals("ambulance-emp")) {
                    AmbulanceRequestMngt ambulanceRequestMngt = new AmbulanceRequestMngt(mainWorkJPanel, user, org);
                    mainWorkJPanel.add("AmbulanceRequestMngt", ambulanceRequestMngt);
                    CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
                    layout.next(mainWorkJPanel);
                } else if(user.getRole().equals("hospital-manager")) {
                    HospitalIncidentManager hospitalIncidentManager = new HospitalIncidentManager(mainWorkJPanel, user, org);
                    mainWorkJPanel.add("HospitalIncidentManager", hospitalIncidentManager);
                    CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
                    layout.next(mainWorkJPanel);
                } else if(user.getRole().equals("doctor")) {
                    HospitalDoctorPortal hospitalDoctorPortal = new HospitalDoctorPortal(mainWorkJPanel, user, org);
                    mainWorkJPanel.add("HospitalDoctorPortal", hospitalDoctorPortal);
                    CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
                    layout.next(mainWorkJPanel);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Username/password incorrect. Please try again!!");
            }
        }


//        if(txtUsername.equals("qwe")) {
//            IncidentHandlingPolice incidentHandlingPolice = (IncidentHandlingPolice) mainSystem.getMasterPoliceOrganizationList().get(0).getPoliceStationArrayList().get(0).getPoliceArrayList().get(0);
//
//            IncidentManager incidentManagerJPanel = new IncidentManager(mainSystem, mainWorkJPanel, incidentHandlingPolice);
//            mainWorkJPanel.add("IncidentManager",incidentManagerJPanel);
//            CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
//            layout.next(mainWorkJPanel);
//        } else if(txtUsername.getText().equals("sysadmin")){
//            // for testing purpose login to ambulance service
//            EnterpriseMngt enterpriseMngt = new EnterpriseMngt(mainSystem, mainWorkJPanel);
//            mainWorkJPanel.add("EnterpriseMngt", enterpriseMngt);
//            CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
//            layout.next(mainWorkJPanel);
//        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
