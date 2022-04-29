/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.LabRequestDaoImplementation;
import info.pkg5100.finalproject.daos.PatientDaoImplementation;
import info.pkg5100.finalproject.daos.PharmacyRequestDaoImplementation;
import info.pkg5100.finalproject.models.LabRequest;
import info.pkg5100.finalproject.models.Patient;
import info.pkg5100.finalproject.models.PharmacyRequest;
import info.pkg5100.finalproject.utils.SimpleTools;
import java.awt.CardLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ankit
 */
public class HospitalPatientPortal extends javax.swing.JPanel {

    /**
     * Creates new form HospitalPatientPortal
     */
    JPanel mainWorkJPanel;
    Patient currentPatient;
    PatientDaoImplementation patientDaoImplementation;
    LabRequestDaoImplementation labRequestDaoImplementationl;
    PharmacyRequestDaoImplementation pharmacyRequestDaoImplementation;

    public HospitalPatientPortal() {
        initComponents();
    }

    public HospitalPatientPortal(JPanel mainWorkJPanel, Patient currentPatient) {
        initComponents();

        this.mainWorkJPanel = mainWorkJPanel;
        this.currentPatient = currentPatient;

        this.patientDaoImplementation = new PatientDaoImplementation();
        this.labRequestDaoImplementationl = new LabRequestDaoImplementation();
        this.pharmacyRequestDaoImplementation = new PharmacyRequestDaoImplementation();
        populateLabRequestsTable();
        populatePharmacyRequestsTable();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        lblPatientPhone = new javax.swing.JLabel();
        lblPatientStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharmacyRequest = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLabRequest = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtLabRequest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPharmacyRequest = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCreateLabRequest = new javax.swing.JButton();
        btnCreatePrescription = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Patient name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Patient Status:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Patient age:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Patient phone:");

        lblPatientName.setText("patient_name_placeholder");

        lblPatientAge.setText("patient_age_placeholder");

        lblPatientPhone.setText("patient_phone_placeholder");

        lblPatientStatus.setText("patient_status_placeholder");

        tblPharmacyRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Prescription name", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblPharmacyRequest);

        tblLabRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Lab request", "Result", "Request status"
            }
        ));
        tblLabRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tblLabRequest);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Lab request name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Prescription :");

        jLabel7.setBackground(new java.awt.Color(31, 75, 124));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Patient Test & Prescription");
        jLabel7.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Patient Information");

        btnCreateLabRequest.setBackground(new java.awt.Color(31, 75, 124));
        btnCreateLabRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateLabRequest.setText("Create Lab Request");
        btnCreateLabRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLabRequestActionPerformed(evt);
            }
        });

        btnCreatePrescription.setBackground(new java.awt.Color(31, 75, 124));
        btnCreatePrescription.setForeground(new java.awt.Color(255, 255, 255));
        btnCreatePrescription.setText("Create Prescription");
        btnCreatePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePrescriptionActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(31, 75, 124));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLabRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateLabRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPharmacyRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreatePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPatientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPatientStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPatientName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPatientAge))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPatientPhone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPatientStatus))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLabRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPharmacyRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateLabRequest)
                    .addComponent(btnCreatePrescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(193, 193, 193))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateLabRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLabRequestActionPerformed
        try {
            int newId = SimpleTools.getUnusedId("labrequests", 1000, 9999);

            LabRequest labRequest = new LabRequest(newId, currentPatient.getId(), "test-requested", txtLabRequest.getText(), "", -1, currentPatient.getLocation(), -1);
            Patient patient = this.patientDaoImplementation.getPatientById(labRequest.getPatientId());
            patient.setLabRequested("true");
            this.patientDaoImplementation.update(patient);
            this.labRequestDaoImplementationl.add(labRequest);

            populateLabRequestsTable();
        } catch (SQLException ex) {
            Logger.getLogger(HospitalPatientPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateLabRequestActionPerformed

    private void btnCreatePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePrescriptionActionPerformed
        // TODO add your handling code here:
          try {
            int newId = SimpleTools.getUnusedId("pharmacy", 1000, 9999);

            PharmacyRequest pharmacyRequest = new PharmacyRequest(newId, currentPatient.getId(), txtPharmacyRequest.getText(), "drug-requested", -1, currentPatient.getLocation(), -1, "");
            Patient patient = this.patientDaoImplementation.getPatientById(pharmacyRequest.getPatientId());
            patient.setPharmacyRequested("true");
            this.patientDaoImplementation.update(patient);
            this.pharmacyRequestDaoImplementation.add(pharmacyRequest);

            populatePharmacyRequestsTable();
        } catch (SQLException ex) {
            Logger.getLogger(HospitalPatientPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreatePrescriptionActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainWorkJPanel.remove(this);
        CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
        layout.previous(mainWorkJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    void populateLabRequestsTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblLabRequest.getModel();
            model.setRowCount(0);

            for (LabRequest labRequest : this.labRequestDaoImplementationl.getLabRequestsByPatientId(currentPatient.getId())) {
                // -1 means doctor is not assigned yet and is available for picking up by a doctor

                Object[] row = new Object[4];
                row[0] = labRequest;
                row[1] = labRequest.getTestName();
                row[2] = labRequest.getTestResult();
                row[3] = labRequest.getRequestStatus();

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HospitalPatientPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void populatePharmacyRequestsTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblPharmacyRequest.getModel();
            model.setRowCount(0);

            for (PharmacyRequest pharmacyRequest : this.pharmacyRequestDaoImplementation.getPharmacyRequestsByPatientId(currentPatient.getId())) {
                // -1 means doctor is not assigned yet and is available for picking up by a doctor
                Object[] row = new Object[3];
                row[0] = pharmacyRequest;
                row[1] = pharmacyRequest.getPharmacyRequest();
                row[2] = pharmacyRequest.getStatus();

                model.addRow(row);

            }
        } catch (SQLException ex) {
            Logger.getLogger(HospitalPatientPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateLabRequest;
    private javax.swing.JButton btnCreatePrescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientStatus;
    private javax.swing.JTable tblLabRequest;
    private javax.swing.JTable tblPharmacyRequest;
    private javax.swing.JTextField txtLabRequest;
    private javax.swing.JTextField txtPharmacyRequest;
    // End of variables declaration//GEN-END:variables
}
