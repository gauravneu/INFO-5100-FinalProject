/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.EnterpriseDaoImplementation;
import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.models.MainSystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ankit
 */
public class EnterpriseMngt extends javax.swing.JPanel {

	/**
	 * Creates new form NewJPanel
	 */

    MainSystem mainSystem;
    JPanel mainWorkJPanel;
    EnterpriseDaoImplementation enterpriseDaoImplementation;
	public EnterpriseMngt() {
		initComponents();
	}

    public EnterpriseMngt(MainSystem mainSystem, JPanel mainWorkJPanel) throws SQLException {
        initComponents();
        this.mainSystem = mainSystem;
        this.mainWorkJPanel = mainWorkJPanel;
        this.enterpriseDaoImplementation = new EnterpriseDaoImplementation();


        populateEnterpriseTable(this.enterpriseDaoImplementation.getEnterprises());
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
        txtEnterpriseName = new javax.swing.JTextField();
        txtEnterpriseLocation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCreateEnterprise = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterpriseList = new javax.swing.JTable();
        btnEnterpriseView = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEnterpriseId = new javax.swing.JTextField();

        jLabel1.setText("Enterprise name");

        jLabel2.setText("location");

        txtEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseNameActionPerformed(evt);
            }
        });

        txtEnterpriseLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseLocationActionPerformed(evt);
            }
        });

        jLabel3.setText("Add enterprise");

        btnCreateEnterprise.setText("Create enterprise");
        btnCreateEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnCreateEnterpriseActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        tblEnterpriseList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "name", "location"
            }
        ));
        jScrollPane1.setViewportView(tblEnterpriseList);

        btnEnterpriseView.setText("view");
        btnEnterpriseView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnEnterpriseViewActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel4.setText("Enterprise id");

        txtEnterpriseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnterpriseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnCreateEnterprise)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEnterpriseId)
                        .addGap(138, 138, 138)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnterpriseView)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEnterpriseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEnterpriseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnCreateEnterprise))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(btnEnterpriseView)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseNameActionPerformed

    private void txtEnterpriseLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseLocationActionPerformed

    private void btnCreateEnterpriseActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnCreateEnterpriseActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = new Enterprise(Integer.parseInt(txtEnterpriseId.getText()), txtEnterpriseName.getText(), txtEnterpriseLocation.getText());
        this.enterpriseDaoImplementation.add(enterprise);

        populateEnterpriseTable(this.enterpriseDaoImplementation.getEnterprises());

    }//GEN-LAST:event_btnCreateEnterpriseActionPerformed

    private void txtEnterpriseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseIdActionPerformed

    private void btnEnterpriseViewActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnEnterpriseViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEnterpriseList.getSelectedRow();
        if(selectedRowIndex < 0 ) {
            JOptionPane.showMessageDialog(this, "Please select a Enterprise record to View");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblEnterpriseList.getModel();
        Enterprise selectedEnterprise = (Enterprise) model.getValueAt(selectedRowIndex, 0);

        EnterpriseDetailsMngt enterpriseDetailsMngt = new EnterpriseDetailsMngt(mainWorkJPanel, selectedEnterprise);
        mainWorkJPanel.add("EnterpriseDetailsMngt",enterpriseDetailsMngt);
        CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
        layout.next(mainWorkJPanel);
    }//GEN-LAST:event_btnEnterpriseViewActionPerformed

    public void populateEnterpriseTable(List<Enterprise> enterpriseList) {
        DefaultTableModel model = (DefaultTableModel) tblEnterpriseList.getModel();
        model.setRowCount(0);
        for (Enterprise enterprise : enterpriseList) {
            Object[] row = new Object[3];
            row[0] = enterprise;
            row[1] = enterprise.getEnterpriseName();
            row[2] = enterprise.getLocation();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEnterprise;
    private javax.swing.JButton btnEnterpriseView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEnterpriseList;
    private javax.swing.JTextField txtEnterpriseId;
    private javax.swing.JTextField txtEnterpriseLocation;
    private javax.swing.JTextField txtEnterpriseName;
    // End of variables declaration//GEN-END:variables
}
