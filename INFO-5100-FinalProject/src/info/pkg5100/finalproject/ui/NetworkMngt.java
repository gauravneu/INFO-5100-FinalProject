/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.NetworkDaoImplementation;
import info.pkg5100.finalproject.models.Network;
import info.pkg5100.finalproject.utils.SimpleTools;
import info.pkg5100.finalproject.utils.Validator;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hazel
 */
public class NetworkMngt extends javax.swing.JPanel {

    /**
     * Creates new form NetworkMngt
     */
    JPanel mainWorkJPanel;
    NetworkDaoImplementation networkDaoImplementation;
    Validator util;

    public NetworkMngt() {
        initComponents();
        this.networkDaoImplementation = new NetworkDaoImplementation();
        this.util = new Validator();
    }

    public NetworkMngt(JPanel mainWorkJPanel) {
        initComponents();
        this.networkDaoImplementation = new NetworkDaoImplementation();
        this.mainWorkJPanel = mainWorkJPanel;
        this.util = new Validator();
        try {
            populateNetworksTable(this.networkDaoImplementation.getNetworks());
        } catch (SQLException ex) {
            Logger.getLogger(NetworkMngt.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetworkList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnCreateEnterprise = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNetworkName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCreateNetwork = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblNetworkList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNetworkList.setFocusable(false);
        tblNetworkList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNetworkList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNetworkList.setShowGrid(true);
        jScrollPane1.setViewportView(tblNetworkList);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Available Network");

        btnCreateEnterprise.setBackground(new java.awt.Color(31, 75, 124));
        btnCreateEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateEnterprise.setText("View");
        btnCreateEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEnterpriseActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(31, 75, 124));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Network Management");
        jLabel5.setOpaque(true);

        txtNetworkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetworkNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Add Nework");

        jLabel2.setText("Network Name");

        btnCreateNetwork.setBackground(new java.awt.Color(31, 75, 124));
        btnCreateNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateNetwork.setText("Add Network");
        btnCreateNetwork.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreateNetwork.setIconTextGap(2);
        btnCreateNetwork.setMaximumSize(new java.awt.Dimension(117, 23));
        btnCreateNetwork.setMinimumSize(new java.awt.Dimension(117, 23));
        btnCreateNetwork.setPreferredSize(new java.awt.Dimension(117, 23));
        btnCreateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNetworkActionPerformed(evt);
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
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(69, 69, 69)
                                .addComponent(txtNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnCreateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnCreateEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreateEnterprise)
                .addGap(67, 67, 67)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEnterpriseActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRowIndex = tblNetworkList.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a Network record to View", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblNetworkList.getModel();
            Network selectedNetwork = (Network) model.getValueAt(selectedRowIndex, 0);

            EnterpriseMngt enterpriseMngt = new EnterpriseMngt(mainWorkJPanel, selectedNetwork);
            mainWorkJPanel.add("EnterpriseMngt", enterpriseMngt);
            CardLayout layout = (CardLayout) mainWorkJPanel.getLayout();
            layout.next(mainWorkJPanel);
        } catch (SQLException ex) {
            Logger.getLogger(NetworkMngt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateEnterpriseActionPerformed

    private void txtNetworkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetworkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetworkNameActionPerformed

    private void btnCreateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNetworkActionPerformed
        // TODO add your handling code here:

        //Check if network is already in DB and insert only if it is new Network. equalsIgnoreCase
        try {
            String message = "";
            int newId = -1;
            
            if (!(util.isNotNullAndEmpty(txtNetworkName.getText().trim()) && util.isAlphabetic(txtNetworkName.getText().trim()))) {
                message = "Please enter a valid Network Name.";
            }else{
                List<Network> nl = this.networkDaoImplementation.getNetworks();
                if (!nl.isEmpty()) {
                    for (Network network : nl) {
                        String net=network.getNetworkName().trim().toLowerCase();
                        if (net.equals(txtNetworkName.getText().trim().toLowerCase())) {
                            message = "Network already exist";
                        }
                    }
                }
            }

            if (!"".equals(message)) {
                JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            List<Network> nl = this.networkDaoImplementation.getNetworks();
            if (!nl.isEmpty()) {
                for (Network network : nl) {
                    if (network.getNetworkName().trim().equalsIgnoreCase(txtNetworkName.getText().trim())) {
                        JOptionPane.showMessageDialog(this, "Network already exist!");
                        return;
                    }
                }

            }

            // TODO add your handling code here:
            newId = SimpleTools.getUnusedId("networks", 1000, 9999);
            Network network = new Network(newId, txtNetworkName.getText());
            this.networkDaoImplementation.add(network);
            populateNetworksTable(this.networkDaoImplementation.getNetworks());
            JOptionPane.showMessageDialog(this, "Network Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            txtNetworkName.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(NetworkMngt.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateNetworkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainWorkJPanel.remove(this);
        CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
        layout.previous(mainWorkJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEnterprise;
    private javax.swing.JButton btnCreateNetwork;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNetworkList;
    private javax.swing.JTextField txtNetworkName;
    // End of variables declaration//GEN-END:variables

    private void populateNetworksTable(List<Network> networks) {
        DefaultTableModel model = (DefaultTableModel) tblNetworkList.getModel();
        model.setRowCount(0);
        for (Network network : networks) {
            Object[] row = new Object[4];
            row[0] = network;
            row[1] = network.getNetworkName();
            model.addRow(row);
        }
    }
}
