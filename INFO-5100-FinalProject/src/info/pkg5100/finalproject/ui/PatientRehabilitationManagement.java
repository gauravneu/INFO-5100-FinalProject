/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.PatientDaoImplementation;
import info.pkg5100.finalproject.models.IncidentCase;
import info.pkg5100.finalproject.models.Organization;
import info.pkg5100.finalproject.models.Patient;
import info.pkg5100.finalproject.models.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ankit
 */
public class PatientRehabilitationManagement extends javax.swing.JPanel {

	/**
	 * Creates new form HospitalDoctorPortal
	 */

    JPanel mainWorkJPanel;
    User currentUser;
    Organization currentOrganization;

    PatientDaoImplementation patientDaoImplementation;

	public PatientRehabilitationManagement() {
		initComponents();
	}

    public PatientRehabilitationManagement(JPanel mainWorkJPanel, User currentUser, Organization currentOrganization) throws SQLException {
        initComponents();

        this.mainWorkJPanel = mainWorkJPanel;
        this.currentUser = currentUser;
        this.currentOrganization = currentOrganization;

        this.patientDaoImplementation = new PatientDaoImplementation();
        populateAvailablePatientsTable();
        populateAcceptedPatientsTable();
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
        btnViewAcceptedPatient = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAcceptRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Available patients");

        tblPatientRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "issue", "status"
            }
        ));
        jScrollPane2.setViewportView(tblPatientRequest);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Accepted patients");

        tblAcceptedPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "issue", "status"
            }
        ));
        jScrollPane3.setViewportView(tblAcceptedPatient);

        btnViewAcceptedPatient.setBackground(new java.awt.Color(31, 75, 124));
        btnViewAcceptedPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAcceptedPatient.setText("View");
        btnViewAcceptedPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAcceptedPatientActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(31, 75, 124));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hospital Doctor Portal");
        jLabel6.setOpaque(true);

        btnAcceptRequest.setBackground(new java.awt.Color(31, 75, 124));
        btnAcceptRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceptRequest.setText("Accept Patient");
        btnAcceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btnAcceptRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(373, 373, 373)
                            .addComponent(btnViewAcceptedPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcceptRequest)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewAcceptedPatient)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAcceptedPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAcceptedPatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatientRequest.getSelectedRow();
        if(selectedRowIndex < 0 ) {
            JOptionPane.showMessageDialog(this, "Please select a patient.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblPatientRequest.getModel();
        Patient patient = (Patient) model.getValueAt(selectedRowIndex, 0);




    }//GEN-LAST:event_btnViewAcceptedPatientActionPerformed

    private void btnAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptRequestActionPerformed

        
 try {                                                 
            // TODO add your handling code here:
            int selectedRowIndex = tblPatientRequest.getSelectedRow();
            if(selectedRowIndex < 0 ) {
                JOptionPane.showMessageDialog(this, "Please select a patient.");
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) tblPatientRequest.getModel();
            Patient patient = (Patient) model.getValueAt(selectedRowIndex, 0);
            
            patient.setDoctorId(this.currentUser.getId());
            
            try {
                this.patientDaoImplementation.update(patient);
            } catch (SQLException ex) {
                Logger.getLogger(PatientRehabilitationManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
            populateAvailablePatientsTable();
            populateAcceptedPatientsTable();
            
        } catch (SQLException ex) {
            Logger.getLogger(PatientRehabilitationManagement.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }//GEN-LAST:event_btnAcceptRequestActionPerformed


  void populateAcceptedPatientsTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblAcceptedPatient.getModel();
        model.setRowCount(0);

        for(Patient patient : this.patientDaoImplementation.getPatientsByHospitalIdAndDoctorId(this.currentOrganization.getId(), this.currentUser.getId())) {
            Object[] row = new Object[4];
            row[0] = patient;
            row[1] = patient.getName();
            row[2] = patient.getPatientIssue();
            row[3] = patient.getPatientStatus();

            model.addRow(row);
        }
    }

    void populateAvailablePatientsTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblPatientRequest.getModel();
        model.setRowCount(0);

        for(Patient patient : this.patientDaoImplementation.getPatientsByHospitalId(this.currentOrganization.getId())) {
            // -1 means doctor is not assigned yet and is available for picking up by a doctor
            if(patient.getDoctorId() == -1) {
                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getName();
                row[2] = patient.getPatientIssue();
                row[3] = patient.getPatientStatus();

                model.addRow(row);
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptRequest;
    private javax.swing.JButton btnViewAcceptedPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAcceptedPatient;
    private javax.swing.JTable tblPatientRequest;
    // End of variables declaration//GEN-END:variables
}
