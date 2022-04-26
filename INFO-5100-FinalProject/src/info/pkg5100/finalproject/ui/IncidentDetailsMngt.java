/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.PatientDaoImplementation;
import info.pkg5100.finalproject.daos.ReporterDaoImplementation;
import info.pkg5100.finalproject.daos.UserDaoImplementation;
import info.pkg5100.finalproject.models.*;
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
 * @author hazel
 */
public class IncidentDetailsMngt extends javax.swing.JPanel {

    /**
     * Creates new form ImpactedPeopleMngt
     */

    JPanel mainWorkJPanel;
    IncidentCase currentIncidentCase;

    PatientDaoImplementation patientDaoImplementation;
    ReporterDaoImplementation reporterDaoImplementation;
    UserDaoImplementation userDaoImplementation;

    Reporter currentCaseReporter;
    User currentCaseInvestigationOfficer;
    Validator util;
    public IncidentDetailsMngt() {
        initComponents();
    }

    public IncidentDetailsMngt(JPanel mainWorkJPanel, IncidentCase incidentCase) throws SQLException {
        initComponents();

        this.mainWorkJPanel = mainWorkJPanel;
        this.currentIncidentCase = incidentCase;
        this.util=new Validator();
        this.patientDaoImplementation = new PatientDaoImplementation();
        this.reporterDaoImplementation = new ReporterDaoImplementation();
        this.userDaoImplementation = new UserDaoImplementation();

        this.currentCaseReporter = this.reporterDaoImplementation.getReporterByPhone(this.currentIncidentCase.getReporterPhone());
        
        if(this.currentIncidentCase.getInvestigationPoliceId() != -1) {
            this.currentCaseInvestigationOfficer = this.userDaoImplementation.getUserById(this.currentIncidentCase.getInvestigationPoliceId());
        }

        populateImpactedPatientTable(this.patientDaoImplementation.getPatientsByIncidentCaseId(this.currentIncidentCase.getId()));
        populateIncidentCaseDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblImpactedPatients = new javax.swing.JTable();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblIncidentId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblReporterName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblReporterMobile = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblAssigned = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnAddPatient = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(255, 255, 255));

        tblImpactedPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", " Name", " Age", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblImpactedPatients);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Phone number");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Age");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Incident ID");

        lblIncidentId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIncidentId.setText("Incident ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Reporter Name");

        lblReporterName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblReporterName.setText("Reporter Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Reporter Mobile");

        lblReporterMobile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblReporterMobile.setText("Reporter Mobile");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Description");

        lblDescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescription.setText("Description");

        lblLocation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLocation.setText("Location");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Location");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Image");

        lblAssigned.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAssigned.setText("Assigned");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Assigned");

        jLabel12.setBackground(new java.awt.Color(31, 75, 124));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Incident Report");
        jLabel12.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Impacted Patients");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Add Patients");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Incident Information");

        btnAddPatient.setBackground(new java.awt.Color(31, 75, 124));
        btnAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblReporterMobile)
                                            .addComponent(lblDescription)
                                            .addComponent(lblLocation)
                                            .addComponent(lblAssigned)
                                            .addComponent(lblIncidentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblReporterName)))
                                    .addComponent(jLabel8)
                                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(484, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, lblAssigned, lblDescription, lblIncidentId, lblLocation, lblReporterMobile, lblReporterName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel14)
                .addGap(5, 5, 5)
                .addComponent(jLabel13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIncidentId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReporterName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReporterMobile)
                                .addGap(14, 14, 14)
                                .addComponent(lblDescription)
                                .addGap(18, 18, 18)
                                .addComponent(lblLocation))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAssigned)
                            .addComponent(jLabel11))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddPatient))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, lblAssigned, lblDescription, lblIncidentId, lblLocation, lblReporterMobile, lblReporterName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        try {
            String message="";
            if(!(util.isNotNullAndEmpty(txtName.getText()) && util.isAlphabetic(txtName.getText())))
                message = "Please enter a valid name";
            else if(!(util.isNotNullAndEmpty(txtAge.getText()) && util.isNumeric(txtAge.getText())))
                message = "Please enter valid age";
            else if(!(util.isNotNullAndEmpty(txtPhoneNumber.getText()) && util.isNumeric(txtPhoneNumber.getText()) && txtPhoneNumber.getText().length()==10 ))
                message = "Please enter valid phone";
            if(!"".equals(message)){
                JOptionPane.showMessageDialog(this, message,"Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int newId = SimpleTools.getUnusedId("patients", 1000, 9999);
            
            Patient patient = new Patient(newId,
                    txtName.getText(),
                    txtAge.getText(),
                    txtPhoneNumber.getText(),
                    "",
                    "rescued",
                    this.currentIncidentCase.getId(),
                    "false",
                    "false",
                    -1,
                    -1,
                    this.currentIncidentCase.getLocation(),
                    "",
                    -1,
                    -1,
                    -1,
                    -1,
                    -1
            );
            
            this.patientDaoImplementation.add(patient);
            
            populateImpactedPatientTable(this.patientDaoImplementation.getPatientsByIncidentCaseId(this.currentIncidentCase.getId()));
        } catch (SQLException ex) {
            Logger.getLogger(IncidentDetailsMngt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAddPatientActionPerformed

    void populateIncidentCaseDetails() throws SQLException {
        lblIncidentId.setText(Integer.toString(this.currentIncidentCase.getId()));

        Reporter reporter = this.reporterDaoImplementation.getReporterByPhone(this.currentIncidentCase.getReporterPhone());
        lblReporterName.setText(this.currentCaseReporter.getReporterName());
        lblReporterMobile.setText(this.currentCaseReporter.getPhone());
        lblDescription.setText(this.currentIncidentCase.getDescription());
        lblLocation.setText(this.currentIncidentCase.getLocation());
        if(this.currentIncidentCase.getInvestigationPoliceId() == -1) {
            lblAssigned.setText("Not assigned");
        } else {
            lblAssigned.setText(this.currentCaseInvestigationOfficer.getName());
        }
    }

    void populateImpactedPatientTable(List<Patient> patientList) {
        DefaultTableModel model = (DefaultTableModel) tblImpactedPatients.getModel();
        model.setRowCount(0);

        for(Patient patient : patientList) {
                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getName();
                row[2] = patient.getAge();
                row[3] = patient.getPhoneNumber();

                model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssigned;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblIncidentId;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblReporterMobile;
    private javax.swing.JLabel lblReporterName;
    private javax.swing.JTable tblImpactedPatients;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
