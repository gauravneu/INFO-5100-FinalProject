/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.IncidenteCaseDaoImplementation;
import info.pkg5100.finalproject.daos.OrganizationDaoImplementation;
import info.pkg5100.finalproject.daos.PatientDaoImplementation;
import info.pkg5100.finalproject.daos.UserDaoImplementation;
import info.pkg5100.finalproject.models.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hazel
 */
public class IncidentManager extends javax.swing.JPanel {

    /**
     * Creates new form IncidentManager
     */
    JPanel mainWorkJPanel;
    User incidentHandlingPolice;
    Organization currentOrganization;

    IncidenteCaseDaoImplementation incidenteCaseDaoImplementation;
    OrganizationDaoImplementation organizationDaoImplementation;
    UserDaoImplementation userDaoImplementation;
    PatientDaoImplementation patientDaoImplementation;

    public IncidentManager() { 
        initComponents();
    }

    public IncidentManager(JPanel mainWorkJPanel, User incidentHandlingPolice, Organization currentOrganization) throws SQLException {
        initComponents();

        this.mainWorkJPanel = mainWorkJPanel;
        this.incidentHandlingPolice = incidentHandlingPolice;
        this.currentOrganization = currentOrganization;
        this.incidenteCaseDaoImplementation = new IncidenteCaseDaoImplementation();
        this.organizationDaoImplementation = new OrganizationDaoImplementation();
        this.userDaoImplementation = new UserDaoImplementation();
        this.patientDaoImplementation = new PatientDaoImplementation();
        populateCurrentLoggedInUser(incidentHandlingPolice);
        populateIncidentsTable();

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
        tblReportedIncidents = new javax.swing.JTable();
        btnAssignSelf = new javax.swing.JButton();
        btnDetailedView = new javax.swing.JButton();
        btnSendAmbulanceRequest = new javax.swing.JButton();
        lblReportIncident1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCurrentLoggedInIncidentPolice = new javax.swing.JLabel();
        lblCurrentLoggedInIncidentPoliceRole = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblReportedIncidents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Incident Id", "Reporter Mobile", "Location", "Description", "Assigned Investigation officer", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReportedIncidents);

        btnAssignSelf.setBackground(new java.awt.Color(31, 75, 124));
        btnAssignSelf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssignSelf.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignSelf.setText("Assign Case");
        btnAssignSelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignSelfActionPerformed(evt);
            }
        });

        btnDetailedView.setBackground(new java.awt.Color(31, 75, 124));
        btnDetailedView.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDetailedView.setForeground(new java.awt.Color(255, 255, 255));
        btnDetailedView.setText("View");
        btnDetailedView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailedViewActionPerformed(evt);
            }
        });

        btnSendAmbulanceRequest.setBackground(new java.awt.Color(31, 75, 124));
        btnSendAmbulanceRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendAmbulanceRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnSendAmbulanceRequest.setText("Notify Nearby Ambulance Service");
        btnSendAmbulanceRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendAmbulanceRequestActionPerformed(evt);
            }
        });

        lblReportIncident1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReportIncident1.setText("Current Logged in User");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Police name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Role:");

        lblCurrentLoggedInIncidentPolice.setText("police_name_placeolder");

        lblCurrentLoggedInIncidentPoliceRole.setText("police_role_placeolder");

        jLabel12.setBackground(new java.awt.Color(31, 75, 124));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reported Incidents");
        jLabel12.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Reported Incidents");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrentLoggedInIncidentPoliceRole, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentLoggedInIncidentPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 608, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(lblReportIncident1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnDetailedView, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnSendAmbulanceRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnAssignSelf, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblReportIncident1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCurrentLoggedInIncidentPolice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCurrentLoggedInIncidentPoliceRole))
                .addGap(75, 75, 75)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetailedView, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendAmbulanceRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssignSelf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(245, 245, 245))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignSelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignSelfActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int selectedRowIndex = tblReportedIncidents.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select an incident.");
                return;
            }
            
            
            

            DefaultTableModel model = (DefaultTableModel) tblReportedIncidents.getModel();
            IncidentCase incidentCase = (IncidentCase) model.getValueAt(selectedRowIndex, 0);
            
             if (!(incidentCase.getIncidentpolice() == -1)) {
                JOptionPane.showMessageDialog(this, "Case is already Assigned");
                return;
            }
            incidentCase.setOrgId(this.currentOrganization.getId());
            incidentCase.setOrgType(this.currentOrganization.getName());
            incidentCase.setCurrentcasehandlinguserid(incidentHandlingPolice.getId());
            incidentCase.setIncidentpolice(incidentHandlingPolice.getId());
            incidentCase.setStatus("incident-manager-checking");
            this.incidenteCaseDaoImplementation.update(incidentCase);
            populateIncidentsTable();

            JOptionPane.showMessageDialog(this, "Case Self Assigned!!");
             populateIncidentsTable();
        } catch (SQLException ex) {
            Logger.getLogger(IncidentManager.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAssignSelfActionPerformed

    private void btnDetailedViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailedViewActionPerformed

        try {
            // TODO add your handling code here:
            int selectedRowIndex = tblReportedIncidents.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select an incident.");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblReportedIncidents.getModel();
            IncidentCase incidentCase = (IncidentCase) model.getValueAt(selectedRowIndex, 0);

            if (!(incidentCase.getIncidentpolice() == this.incidentHandlingPolice.getId())) {
                JOptionPane.showMessageDialog(this, "Assign the case to see futher details");
                return;
            }
            IncidentDetailsMngt incidentDetailsMngt = new IncidentDetailsMngt(this.mainWorkJPanel, incidentCase);
            mainWorkJPanel.add("IncidentDetailsMngt", incidentDetailsMngt);
            CardLayout layout = (CardLayout) mainWorkJPanel.getLayout();
            layout.next(mainWorkJPanel);
        } catch (SQLException ex) {
            Logger.getLogger(IncidentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDetailedViewActionPerformed

    private void btnSendAmbulanceRequestActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnSendAmbulanceRequestActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRowIndex = tblReportedIncidents.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select an incident.");
                return;
            }
            
            

            DefaultTableModel model = (DefaultTableModel) tblReportedIncidents.getModel();
            IncidentCase incidentCase = (IncidentCase) model.getValueAt(selectedRowIndex, 0);
            
            if (!(incidentCase.getIncidentpolice() == this.incidentHandlingPolice.getId())) {
                JOptionPane.showMessageDialog(this, "Assign the case to see futher details");
                return;
            }

            List<Patient> pl = this.patientDaoImplementation.getPatientsByIncidentCaseId(incidentCase.getId());
            if(pl.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Add Patient Details!!");
                return;
            }
            
            
            
            
            incidentCase.setStatus("ambulance-requested");
            this.incidenteCaseDaoImplementation.update(incidentCase);
            populateIncidentsTable();

            JOptionPane.showMessageDialog(this, "Request for ambulance sent to all near by ambulance services!!");
        } catch (SQLException ex) {
            Logger.getLogger(IncidentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSendAmbulanceRequestActionPerformed

    void populateIncidentsTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblReportedIncidents.getModel();
        model.setRowCount(0);
        String location = this.currentOrganization.getLocation();
        for (IncidentCase incidentCase : this.incidenteCaseDaoImplementation.getIncidentCasesByLocation(location)) {
            if ((incidentCase.getCurrentcasehandlinguserid() == -1)
                    || (incidentCase.getCurrentcasehandlinguserid() == this.incidentHandlingPolice.getId())) {

                Object[] row = new Object[6];
                row[0] = incidentCase;
                row[1] = incidentCase.getReporterPhone();
                row[2] = incidentCase.getLocation();
                row[3] = incidentCase.getDescription();
                if (incidentCase.getIncidentpolice()== -1) {
                    row[4] = "";
                } else {
                    row[4] = incidentCase.getIncidentpolice();
                }
                row[5] = incidentCase.getStatus();

                model.addRow(row);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignSelf;
    private javax.swing.JButton btnDetailedView;
    private javax.swing.JButton btnSendAmbulanceRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurrentLoggedInIncidentPolice;
    private javax.swing.JLabel lblCurrentLoggedInIncidentPoliceRole;
    private javax.swing.JLabel lblReportIncident1;
    private javax.swing.JTable tblReportedIncidents;
    // End of variables declaration//GEN-END:variables

    private void populateCurrentLoggedInUser(User incidentHandlingPolice) {
        lblCurrentLoggedInIncidentPolice.setText(incidentHandlingPolice.getName());
        lblCurrentLoggedInIncidentPoliceRole.setText(incidentHandlingPolice.getRole());
    }
}
