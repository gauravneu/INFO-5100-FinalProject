/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.OrganizationDaoImplementation;
import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.models.Organization;
import info.pkg5100.finalproject.utils.SimpleTools;
import info.pkg5100.finalproject.utils.Validator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ankit
 */
public class EnterpriseDetailsMngt extends javax.swing.JPanel {

	/**
	 * Creates new form EnterpriseDetailsMngt
	 */

    JPanel mainWorkJPanel;
    Enterprise currentEnterprise;
    OrganizationDaoImplementation organizationDaoImplementation;
    Validator util;

	public EnterpriseDetailsMngt() {
		initComponents();
	}

    public EnterpriseDetailsMngt(JPanel mainWorkJPanel, Enterprise currentEnterprise) throws SQLException {
        initComponents();
        this.mainWorkJPanel = mainWorkJPanel;
        this.currentEnterprise = currentEnterprise;
        this.organizationDaoImplementation = new OrganizationDaoImplementation();
        this.util=new Validator();
        lblEnterpriseName.setText(currentEnterprise.getType());
        lblEnterpriseId.setText(Integer.toString(currentEnterprise.getId()));
        lblEnterpriseLocation.setText(currentEnterprise.getLocation());

        cmbOrganizationType.removeAllItems();	
        populateOrganizationComboBox();	
        populateOrganizationTable();
    }

    public void populateOrganizationTable() {	
        try {	
            	
            DefaultTableModel model = (DefaultTableModel) tblOrganizationList.getModel();	
            model.setRowCount(0);	
            	
            List<Organization> ol = this.organizationDaoImplementation.getOrganizationByEnterpriseTypeAndLocation(	
                    this.currentEnterprise.getType().trim(), this.currentEnterprise.getLocation().trim());	
            	
            for (Organization organization : ol) {	
                	
                System.out.println(organization.getEnterpriseType());	
                Object[] row = new Object[4];	
                row[0] = organization;	
                row[1] = organization.getName();	
                row[2] = organization.getLocation();	
                row[3] = organization.getType();	
                model.addRow(row);	
            }	
        } catch (SQLException ex) {	
            Logger.getLogger(IncidentManager.class.getName()).log(Level.SEVERE, null, ex);	
        }	
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
        lblEnterpriseId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEnterpriseName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEnterpriseLocation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizationList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnViewOrgDetails = new javax.swing.JButton();
        btnCreateOrg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblOrganizationType = new javax.swing.JLabel();
        cmbOrganizationType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Id:");

        lblEnterpriseId.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name:");

        lblEnterpriseName.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Location:");

        lblEnterpriseLocation.setText("jLabel2");

        tblOrganizationList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Location", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganizationList);

        jLabel4.setText("Organization Name");

        jLabel6.setBackground(new java.awt.Color(31, 75, 124));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Organization Management");
        jLabel6.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Available Organization");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Add Organization");

        btnViewOrgDetails.setBackground(new java.awt.Color(31, 75, 124));
        btnViewOrgDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrgDetails.setText("View");
        btnViewOrgDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrgDetailsActionPerformed(evt);
            }
        });

        btnCreateOrg.setBackground(new java.awt.Color(31, 75, 124));
        btnCreateOrg.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateOrg.setText("Add Organization");
        btnCreateOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrgActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Enterprise Information");

        btnBack.setBackground(new java.awt.Color(31, 75, 124));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganizationType.setText("Organization Type:");

        cmbOrganizationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblEnterpriseId, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(lblEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblEnterpriseLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel2))))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(btnViewOrgDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOrgName, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(cmbOrganizationType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnCreateOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel5, lblEnterpriseId, lblEnterpriseLocation, lblEnterpriseName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblEnterpriseId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblEnterpriseName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblEnterpriseLocation))))
                .addGap(18, 18, 18)
                .addComponent(btnViewOrgDetails)
                .addGap(67, 67, 67)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganizationType)
                    .addComponent(cmbOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateOrg)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrgDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrgDetailsActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRowIndex = tblOrganizationList.getSelectedRow();
            if(selectedRowIndex < 0 ) {
                JOptionPane.showMessageDialog(this, "Please select an organization record to View.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) tblOrganizationList.getModel();
            Organization selectedOrganization = (Organization) model.getValueAt(selectedRowIndex, 0);
            
            OrganizationDetailsMngt organizationDetailsMngt = new OrganizationDetailsMngt(mainWorkJPanel,selectedOrganization);
            mainWorkJPanel.add("OrganizationDetailsMngt",organizationDetailsMngt);
            CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
            layout.next(mainWorkJPanel);
        } catch (SQLException ex) {
            Logger.getLogger(EnterpriseDetailsMngt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewOrgDetailsActionPerformed

    private void btnCreateOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrgActionPerformed
        try {	
            String message = "";	
            if (!util.isNotNullAndEmpty(txtOrgName.getText().trim())) {	
                message = "Please enter a valid Organization Name";	
            }else{
                 List<Organization> ol = this.organizationDaoImplementation.getOrganizationByEnterpriseTypeAndLocation(	
                    this.currentEnterprise.getType().trim(), this.currentEnterprise.getLocation().trim());	
            	
            for (Organization organization : ol) {	
                if(organization.getType().equals(cmbOrganizationType.getSelectedItem().toString())){	
                    message="Organization already Exist in selected Enterprise";	
                }	
            }
            }	
            if (!"".equals(message)) {	
                JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);	
                return;	
            }	
            	
           
            int newId = SimpleTools.getUnusedId("organizations", 1000, 9999);
            Organization organization = new Organization(newId,
                    txtOrgName.getText(),
                    this.currentEnterprise.getLocation(),
                    this.cmbOrganizationType.getSelectedItem().toString(),	
                    this.currentEnterprise.getType()
                    
            );
            
            this.organizationDaoImplementation.add(organization);
            
            populateOrganizationTable();
            JOptionPane.showMessageDialog(this, "Organization Added Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(EnterpriseDetailsMngt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateOrgActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainWorkJPanel.remove(this);
        CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
        layout.previous(mainWorkJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    
    void populateOrganizationComboBox() {	
        if (this.currentEnterprise.getType().equals("Police")) {	
            cmbOrganizationType.addItem("Investigation Police");	
            cmbOrganizationType.addItem("Incidence Management Police");	
        }	
        if (this.currentEnterprise.getType().equals("Transport")) {	
            cmbOrganizationType.addItem("Ambulance");	
        }	
        if (this.currentEnterprise.getType().equals("Hospital")) {	
            cmbOrganizationType.addItem("Doctor");	
            cmbOrganizationType.addItem("Lab Technician");	
            cmbOrganizationType.addItem("Pharmacist");	
        }	
        if (this.currentEnterprise.getType().equals("Allocation")) {	
            cmbOrganizationType.addItem("Housing");	
            cmbOrganizationType.addItem("Detention");	
        }	
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateOrg;
    private javax.swing.JButton btnViewOrgDetails;
    private javax.swing.JComboBox<String> cmbOrganizationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterpriseId;
    private javax.swing.JLabel lblEnterpriseLocation;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JTable tblOrganizationList;
    private javax.swing.JTextField txtOrgName;
    // End of variables declaration//GEN-END:variables
}
