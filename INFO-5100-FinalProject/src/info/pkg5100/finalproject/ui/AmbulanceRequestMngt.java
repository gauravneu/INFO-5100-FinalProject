/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.IncidenteCaseDaoImplementation;
import info.pkg5100.finalproject.daos.OrganizationDaoImplementation;
import info.pkg5100.finalproject.models.IncidentCase;
import info.pkg5100.finalproject.models.Organization;
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
public class AmbulanceRequestMngt extends javax.swing.JPanel {

	/**
	 * Creates new form AmbulanceRequestMngt
	 */

    JPanel mainWorkJPanel;
    User ambulanceEmployee;
    Organization currentOrganization;

    IncidenteCaseDaoImplementation incidenteCaseDaoImplementation;
    OrganizationDaoImplementation organizationDaoImplementation;

    public AmbulanceRequestMngt() {
		initComponents();
	}

    public AmbulanceRequestMngt(JPanel mainWorkJPanel, User ambulanceEmployee, Organization currentOrganization) throws SQLException {
        initComponents();

        this.mainWorkJPanel = mainWorkJPanel;
        this.ambulanceEmployee = ambulanceEmployee;
        this.currentOrganization = currentOrganization;

        this.incidenteCaseDaoImplementation = new IncidenteCaseDaoImplementation();
        this.organizationDaoImplementation = new OrganizationDaoImplementation();
        populateCurrentLoggednUser(ambulanceEmployee);
        populatePendingRequestsTable();
        populateAcceptedRequestsTable();
        System.out.println(this.ambulanceEmployee.getId());
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
        tblActiveAmbulanceRequests = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPendingAmbulanceRequests = new javax.swing.JTable();
        btnAcceptRequest = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEmpName = new javax.swing.JLabel();
        lblEmpRole = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        btnSendRequestToHospitals = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblActiveAmbulanceRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "description", "location", "case status", "Ambulance task status"
            }
        ));
        jScrollPane1.setViewportView(tblActiveAmbulanceRequests);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Notification/Alerts of requests:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Accepted/Active requests:");

        tblPendingAmbulanceRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Description", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPendingAmbulanceRequests);

        btnAcceptRequest.setBackground(new java.awt.Color(31, 75, 124));
        btnAcceptRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceptRequest.setText("Accept");
        btnAcceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptRequestActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Role");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Id:");

        lblEmpName.setText("emp_name_placeholder");

        lblEmpRole.setText("emp_role_placeholder");

        lblEmpId.setText("emp_id_placeholder");

        btnSendRequestToHospitals.setBackground(new java.awt.Color(31, 75, 124));
        btnSendRequestToHospitals.setForeground(new java.awt.Color(255, 255, 255));
        btnSendRequestToHospitals.setText("Notify Nearby Hospitals");
        btnSendRequestToHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestToHospitalsActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(31, 75, 124));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ambulance Request Management");
        jLabel12.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Current Logged in User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(39, 39, 39)
                                                .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(39, 39, 39)
                                                        .addComponent(lblEmpRole, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnAcceptRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(btnSendRequestToHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, lblEmpId, lblEmpName, lblEmpRole});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblEmpId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblEmpName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpRole)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addComponent(btnAcceptRequest)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSendRequestToHospitals)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptRequestActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRowIndex = tblPendingAmbulanceRequests.getSelectedRow();
            if(selectedRowIndex < 0 ) {
                JOptionPane.showMessageDialog(this, "Please select an incident.");
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) tblPendingAmbulanceRequests.getModel();
            IncidentCase incidentCase = (IncidentCase) model.getValueAt(selectedRowIndex, 0);
            
            incidentCase.setOrgId(this.currentOrganization.getId());
            incidentCase.setOrgType(this.currentOrganization.getType());
            incidentCase.setStatus("ambulance-accepted");
            incidentCase.setCurrentcasehandlinguserid(this.ambulanceEmployee.getId());
            
            this.incidenteCaseDaoImplementation.update(incidentCase);
            populateAcceptedRequestsTable();
            populatePendingRequestsTable();
        } catch (SQLException ex) {
            Logger.getLogger(AmbulanceRequestMngt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAcceptRequestActionPerformed

    private void btnSendRequestToHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestToHospitalsActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRowIndex = tblActiveAmbulanceRequests.getSelectedRow();
            if(selectedRowIndex < 0 ) {
                JOptionPane.showMessageDialog(this, "Please select an incident.");
                return;
            }
            
                      
            
            DefaultTableModel model = (DefaultTableModel) tblActiveAmbulanceRequests.getModel();
            IncidentCase incidentCase = (IncidentCase) model.getValueAt(selectedRowIndex, 0);
            
             if ((incidentCase.getStatus().equals("hospital-requested"))) {
                JOptionPane.showMessageDialog(this, "Case is already Sent To Hospitals");
                return;
            }
            
            incidentCase.setAmbulancetaskcompleted("true");
            incidentCase.setStatus("hospital-requested");
            
            this.incidenteCaseDaoImplementation.update(incidentCase);
            
            JOptionPane.showMessageDialog(this, "Request for hospital acceptance sent to all near by Hospitals!!");
            populateAcceptedRequestsTable();
        } catch (SQLException ex) {
            Logger.getLogger(AmbulanceRequestMngt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSendRequestToHospitalsActionPerformed

    void populatePendingRequestsTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblPendingAmbulanceRequests.getModel();
        model.setRowCount(0);

        for(IncidentCase incidentCase : this.incidenteCaseDaoImplementation.getIncidentCasesByStatusAndLocation("ambulance-requested", currentOrganization.getLocation())) {
            Object[] row = new Object[4];
            row[0] = incidentCase;
            row[1] = incidentCase.getDescription();
            row[2] = incidentCase.getLocation();
            row[3] = incidentCase.getStatus();

            model.addRow(row);
        }
    }

    void populateAcceptedRequestsTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblActiveAmbulanceRequests.getModel();
        model.setRowCount(0);

        for(IncidentCase incidentCase : this.incidenteCaseDaoImplementation.getIncidentCasesByOrgIdAndOrgTypeAndStatusAndLocationAndCurrentCaseHandlingUserId(this.currentOrganization.getId(),
                this.ambulanceEmployee.getId(),
                this.currentOrganization.getType(),
                "ambulance-accepted",
                currentOrganization.getLocation())) {
            Object[] row = new Object[5];
            row[0] = incidentCase;
            row[1] = incidentCase.getDescription();
            row[2] = incidentCase.getLocation();
            row[3] = incidentCase.getStatus();
            if("false".equals(incidentCase.getAmbulancetaskcompleted())) {
                row[4] = "In-progress";
            } else {
                row[4] = "Task completed.";
            }


            model.addRow(row);
        }

        for(IncidentCase incidentCase : this.incidenteCaseDaoImplementation.getIncidentCasesByOrgIdAndOrgTypeAndStatusAndLocationAndCurrentCaseHandlingUserId(this.currentOrganization.getId(),
                this.ambulanceEmployee.getId(),
                this.currentOrganization.getType(),
                "hospital-accepted",
                currentOrganization.getLocation())) {

            Object[] row = new Object[5];
            row[0] = incidentCase;
            row[1] = incidentCase.getDescription();
            row[2] = incidentCase.getLocation();
            row[3] = incidentCase.getStatus();
            if(incidentCase.getAmbulancetaskcompleted().equals("false")) {
                row[4] = "In-progress";
            } else {
                row[4] = "Task completed.";
            }

            model.addRow(row);
        }

        for(IncidentCase incidentCase : this.incidenteCaseDaoImplementation.getIncidentCasesByOrgIdAndOrgTypeAndStatusAndLocationAndCurrentCaseHandlingUserId(this.currentOrganization.getId(),
                this.ambulanceEmployee.getId(),
                this.currentOrganization.getType(),
                "hospital-requested",
                currentOrganization.getLocation())) {

            Object[] row = new Object[5];
            row[0] = incidentCase;
            row[1] = incidentCase.getDescription();
            row[2] = incidentCase.getLocation();
            row[3] = incidentCase.getStatus();
            if(incidentCase.getAmbulancetaskcompleted().equals("false")) {
                row[4] = "In-progress";
            } else {
                row[4] = "Task completed.";
            }

            model.addRow(row);
        }

//        for(IncidentCase incidentCase : this.incidenteCaseDaoImplementation.getIncidentCasesByOrgIdAndOrgTypeAndStatusAndLocationAndCurrentCaseHandlingUserId(this.currentOrganization.getId(),
//                this.ambulanceEmployee.getId(),
//                this.currentOrganization.getType(),
//                "ambulance-done",
//                currentOrganization.getLocation())) {
//            Object[] row = new Object[4];
//            row[0] = incidentCase;
//            row[1] = incidentCase.getDescription();
//            row[2] = incidentCase.getLocation();
//            row[3] = incidentCase.getStatus();
//
//            model.addRow(row);
//        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptRequest;
    private javax.swing.JButton btnSendRequestToHospitals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblEmpName;
    private javax.swing.JLabel lblEmpRole;
    private javax.swing.JTable tblActiveAmbulanceRequests;
    private javax.swing.JTable tblPendingAmbulanceRequests;
    // End of variables declaration//GEN-END:variables

    private void populateCurrentLoggednUser(User ambulanceEmployee) {
        lblEmpId.setText(String.valueOf(ambulanceEmployee.getId()));
        lblEmpName.setText(ambulanceEmployee.getName());
        lblEmpRole.setText(ambulanceEmployee.getRole());
    }
}
