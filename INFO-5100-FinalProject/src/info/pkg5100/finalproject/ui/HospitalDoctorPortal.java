/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.PatientDaoImplementation;
import info.pkg5100.finalproject.models.IncidentCase;
import info.pkg5100.finalproject.models.Organization;
import info.pkg5100.finalproject.models.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

/**
 *
 * @author ankit
 */
public class HospitalDoctorPortal extends javax.swing.JPanel {

	/**
	 * Creates new form HospitalDoctorPortal
	 */

    JPanel mainWorkJPanel;
    User currentUser;
    Organization currentOrganization;

    PatientDaoImplementation patientDaoImplementation;

	public HospitalDoctorPortal() {
		initComponents();
	}

    public HospitalDoctorPortal(JPanel mainWorkJPanel, User currentUser, Organization currentOrganization) {
        initComponents();

        this.mainWorkJPanel = mainWorkJPanel;
        this.currentUser = currentUser;
        this.currentOrganization = currentOrganization;

        this.patientDaoImplementation = new PatientDaoImplementation();
    }

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatientRequest = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAcceptedPatient = new javax.swing.JTable();
        btnAcceptPatient = new javax.swing.JButton();
        btnViewAcceptedPatient = new javax.swing.JButton();

        jLabel1.setText("Available patients");

        tblPatientRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "name", "issue", "status"
            }
        ));
        jScrollPane2.setViewportView(tblPatientRequest);

        jLabel2.setText("Accepted patients");

        tblAcceptedPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "name", "issue", "status"
            }
        ));
        jScrollPane3.setViewportView(tblAcceptedPatient);

        btnAcceptPatient.setText("Accept patient");
        btnAcceptPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptPatientActionPerformed(evt);
            }
        });

        btnViewAcceptedPatient.setText("View");
        btnViewAcceptedPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAcceptedPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnAcceptPatient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnViewAcceptedPatient)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAcceptPatient)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnViewAcceptedPatient)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcceptPatientActionPerformed

    private void btnViewAcceptedPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAcceptedPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewAcceptedPatientActionPerformed

    void populateAcceptedPatientsTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblAcceptedPatient.getModel();
        model.setRowCount(0);

        for(IncidentCase incidentCase : this.incidenteCaseDaoImplementation.getIncidentCasesByOrgIdAndOrgTypeAndStatusAndLocation(this.currentOrganization.getId(),
                this.currentOrganization.getType(),
                "hospital-accepted",
                currentOrganization.getLocation())) {
            Object[] row = new Object[4];
            row[0] = incidentCase;
            row[1] = incidentCase.getDescription();
            row[2] = incidentCase.getLocation();
            row[3] = incidentCase.getStatus();

            model.addRow(row);
        }
    }

    void populateAvailablePatientsTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblPatientRequest.getModel();
        model.setRowCount(0);

        for(IncidentCase incidentCase : this.incidenteCaseDaoImplementation.getIncidentCasesByStatusAndLocation("hospital-requested", currentOrganization.getLocation())) {
            Object[] row = new Object[4];
            row[0] = incidentCase;
            row[1] = incidentCase.getDescription();
            row[2] = incidentCase.getLocation();
            row[3] = incidentCase.getStatus();

            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptPatient;
    private javax.swing.JButton btnViewAcceptedPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAcceptedPatient;
    private javax.swing.JTable tblPatientRequest;
    // End of variables declaration//GEN-END:variables
}
