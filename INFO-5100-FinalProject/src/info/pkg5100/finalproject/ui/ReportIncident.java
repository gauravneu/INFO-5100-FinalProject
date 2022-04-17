/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.IncidenteCaseDaoImplementation;
import info.pkg5100.finalproject.daos.ReporterDaoImplementation;
import info.pkg5100.finalproject.models.IncidentCase;
import info.pkg5100.finalproject.models.MainSystem;
import info.pkg5100.finalproject.models.PoliceOrganization;
import info.pkg5100.finalproject.models.Reporter;
import info.pkg5100.finalproject.utils.SimpleTools;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author hazel
 */
public class ReportIncident extends javax.swing.JPanel {

    /**
     * Creates new form ReportIncident
     */

    MainSystem mainSystem;
    ReporterDaoImplementation reporterDaoImplementation;
    IncidenteCaseDaoImplementation incidenteCaseDaoImplementation;

    public ReportIncident() {
        initComponents();
    }

    public ReportIncident(MainSystem mainSystem) {
        initComponents();
        this.reporterDaoImplementation = new ReporterDaoImplementation();
        this.incidenteCaseDaoImplementation = new IncidenteCaseDaoImplementation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JTextField();
        btnupload = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnReportIncident = new javax.swing.JButton();
        txtReporterName = new javax.swing.JTextField();
        txtReporterMobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbBoxNetworkName = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtIncidentDescription = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("REPORT ME");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Mobile");

        lblPhoto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPhoto.setText("Photo");

        txtPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhotoActionPerformed(evt);
            }
        });

        btnupload.setText("Upload");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });

        lblImage.setBackground(new java.awt.Color(255, 255, 255));

        btnReportIncident.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReportIncident.setText("Report");
        btnReportIncident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnReportIncidentActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        txtReporterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReporterNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Location");

        cmbBoxNetworkName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBoxNetworkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxNetworkNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Incident Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnReportIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIncidentDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtReporterName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReporterMobile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnupload))
                            .addComponent(cmbBoxNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtReporterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtReporterMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIncidentDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupload)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cmbBoxNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhotoActionPerformed

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
        JFileChooser choose=new JFileChooser();
        choose.showOpenDialog(null);
        File f=choose.getSelectedFile();
        lblImage.setIcon(new ImageIcon(f.toString()));
        txtPhoto.setText(f.getAbsolutePath());
    }//GEN-LAST:event_btnuploadActionPerformed

    private void btnReportIncidentActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnReportIncidentActionPerformed
        // TODO add your handling code here:

        String reportName = txtReporterName.getText();
        String reporterMobileNumber = txtReporterMobile.getText();
        String incidentDescription = txtIncidentDescription.getText();
        String location = cmbBoxNetworkName.getSelectedItem().toString();
        String photoURL = txtPhoto.getText();

        Reporter currentReporter = this.reporterDaoImplementation.getReporterByPhone(reporterMobileNumber);
        if(currentReporter == null) {
            currentReporter = new Reporter(reportName, reporterMobileNumber);
            this.reporterDaoImplementation.add(currentReporter);
        }

        int newId = SimpleTools.getUnusedId("incidentcases", 1000, 9999);
        IncidentCase incidentCase = new IncidentCase(newId,
                "new-case",
                "",
                -1,
                "",
                -1,
                currentReporter.getPhone(),
                "",
                location,
                incidentDescription
        );
        this.incidenteCaseDaoImplementation.add(incidentCase);

    }//GEN-LAST:event_btnReportIncidentActionPerformed

    private void txtReporterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReporterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReporterNameActionPerformed

    private void cmbBoxNetworkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxNetworkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBoxNetworkNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportIncident;
    private javax.swing.JButton btnupload;
    private javax.swing.JComboBox<String> cmbBoxNetworkName;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTextField txtIncidentDescription;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtReporterMobile;
    private javax.swing.JTextField txtReporterName;
    // End of variables declaration//GEN-END:variables
}
