/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.UserDaoImplementation;
import info.pkg5100.finalproject.models.Organization;
import info.pkg5100.finalproject.models.User;
import info.pkg5100.finalproject.utils.SendEmailUtility;
import info.pkg5100.finalproject.utils.SimpleTools;
import info.pkg5100.finalproject.utils.Validator;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author hazel
 */
public class OrganizationDetailsMngt extends javax.swing.JPanel {

	/**
	 * Creates new form OrganizationDetailsMngt
	 */
    JPanel mainWorkJPanel;
    Organization currentOrganization;
    UserDaoImplementation userDaoImplementation;
    Validator util;
    SendEmailUtility sendEmailUtility;
    
	public OrganizationDetailsMngt() {
		initComponents();
	}

    public OrganizationDetailsMngt(JPanel mainWorkJPanel,Organization currentOrganization) throws SQLException {
        initComponents();
        this.mainWorkJPanel = mainWorkJPanel;
        this.currentOrganization = currentOrganization;
        this.userDaoImplementation = new UserDaoImplementation();
        this.util=new Validator();
        this.sendEmailUtility=new SendEmailUtility();
        lblOrgIdPlaceHolder.setText(Integer.toString(this.currentOrganization.getId()));
        lblOrgNamePlaceHolder.setText(this.currentOrganization.getName());
        lblOrgLocationPlaceHolder.setText(this.currentOrganization.getLocation());
        lblOrgTypePlaceHolder.setText(this.currentOrganization.getType());

        populateUserTable(this.userDaoImplementation.getUsersByOrgIdAndRole(this.currentOrganization.getId(), "orgadmin"));
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
        tblOrgAdminList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtOrgAdminName = new javax.swing.JTextField();
        txtOrgAdminAge = new javax.swing.JTextField();
        txtOrgAdminPhone = new javax.swing.JTextField();
        txtOrgAdminUsername = new javax.swing.JTextField();
        lblOrgIdPlaceHolder = new javax.swing.JLabel();
        lblOrgNamePlaceHolder = new javax.swing.JLabel();
        lblOrgLocationPlaceHolder = new javax.swing.JLabel();
        lblOrgTypePlaceHolder = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAddOrgAdim = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtAdminEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tblOrgAdminList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "phone", "username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrgAdminList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Type:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Location:");

        jLabel7.setText("Name");

        jLabel8.setText("Age");

        jLabel9.setText("Phone");

        jLabel10.setText("Username");

        lblOrgIdPlaceHolder.setText("org_id_placeholder");

        lblOrgNamePlaceHolder.setText("org_name_placeholder");

        lblOrgLocationPlaceHolder.setText("org_location_placeholder");

        lblOrgTypePlaceHolder.setText("org_type_placeholder");

        jLabel6.setBackground(new java.awt.Color(31, 75, 124));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Organization Admin User Management");
        jLabel6.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Admin Users");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Add Users");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Organization Information");

        btnAddOrgAdim.setBackground(new java.awt.Color(31, 75, 124));
        btnAddOrgAdim.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrgAdim.setText("Add User");
        btnAddOrgAdim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrgAdimActionPerformed(evt);
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

        jLabel13.setText("EmailId");

        txtAdminEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                    .addComponent(txtOrgAdminPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtOrgAdminUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOrgAdminName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOrgAdminAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAdminEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrgTypePlaceHolder)
                                    .addComponent(lblOrgIdPlaceHolder)
                                    .addComponent(lblOrgNamePlaceHolder)
                                    .addComponent(lblOrgLocationPlaceHolder)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(133, 133, 133)))
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnAddOrgAdim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel7, jLabel8, jLabel9, txtOrgAdminAge, txtOrgAdminName, txtOrgAdminPhone, txtOrgAdminUsername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, lblOrgIdPlaceHolder, lblOrgLocationPlaceHolder, lblOrgNamePlaceHolder, lblOrgTypePlaceHolder});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addGap(2, 2, 2)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lblOrgNamePlaceHolder)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrgIdPlaceHolder)
                                .addGap(32, 32, 32)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblOrgLocationPlaceHolder))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblOrgTypePlaceHolder))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOrgAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtOrgAdminAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtOrgAdminPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtOrgAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtAdminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddOrgAdim)
                .addGap(42, 42, 42))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel7, jLabel8, jLabel9, txtOrgAdminAge, txtOrgAdminName, txtOrgAdminPhone, txtOrgAdminUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrgAdimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrgAdimActionPerformed
        try {
            // TODO add your handling code here:
            String message="";
            if(!(util.isNotNullAndEmpty(txtOrgAdminName.getText()) && util.isAlphabetic(txtOrgAdminName.getText())))
                message = "Please enter a valid name";
            else if(!(util.isNotNullAndEmpty(txtOrgAdminAge.getText()) && util.isNumeric(txtOrgAdminAge.getText())))
                message = "Please enter valid age";
            else if(!(util.isNotNullAndEmpty(txtOrgAdminPhone.getText()) && util.isNumeric(txtOrgAdminPhone.getText()) && txtOrgAdminPhone.getText().length()==10 ))
                message = "Please enter valid phone";
            else if(!(util.isNotNullAndEmpty(txtOrgAdminUsername.getText()) && util.isAlphanumeric(txtOrgAdminUsername.getText())))
                message = "Please enter an alphanumeric username";
            else if(!(util.isNotNullAndEmpty(txtAdminEmail.getText()) && util.isValidEmail(txtAdminEmail.getText())))
                message="Please enter valid email";
            if(!"".equals(message)){
                JOptionPane.showMessageDialog(this, message,"Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            for(User user :this.userDaoImplementation.getUsers()){
            
                if(user.getUsername().equalsIgnoreCase(txtOrgAdminUsername.getText())){
                JOptionPane.showMessageDialog(this, "UserName is already taken","Error", JOptionPane.ERROR_MESSAGE);
                return;
                }
            }
            
            
            
            int newId = SimpleTools.getUnusedId("users", 1000, 9999);
            User user = new User(newId,
                    txtOrgAdminUsername.getText(),
                    "123@Test",
                    txtOrgAdminName.getText(),
                    txtOrgAdminAge.getText(),
                    txtOrgAdminPhone.getText(),
                    "orgadmin",
                    this.currentOrganization.getId(),
            -1);
            
            this.userDaoImplementation.add(user);
            user.setEmail(txtAdminEmail.getText());
            populateUserTable(this.userDaoImplementation.getUsersByOrgIdAndRole(this.currentOrganization.getId(), "orgadmin"));
            sendEmailUtility.sendMail(user);
            JOptionPane.showMessageDialog(this, "User Added Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationDetailsMngt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAddOrgAdimActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainWorkJPanel.remove(this);
        CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
        layout.previous(mainWorkJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAdminEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminEmailActionPerformed

    public void populateUserTable(List<User> userList) {
        DefaultTableModel model = (DefaultTableModel) tblOrgAdminList.getModel();
        model.setRowCount(0);
        for (User user : userList) {
            Object[] row = new Object[4];
            row[0] = user;
            row[1] = user.getName();
            row[2] = user.getPhone();
            row[3] = user.getUsername();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrgAdim;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrgIdPlaceHolder;
    private javax.swing.JLabel lblOrgLocationPlaceHolder;
    private javax.swing.JLabel lblOrgNamePlaceHolder;
    private javax.swing.JLabel lblOrgTypePlaceHolder;
    private javax.swing.JTable tblOrgAdminList;
    private javax.swing.JTextField txtAdminEmail;
    private javax.swing.JTextField txtOrgAdminAge;
    private javax.swing.JTextField txtOrgAdminName;
    private javax.swing.JTextField txtOrgAdminPhone;
    private javax.swing.JTextField txtOrgAdminUsername;
    // End of variables declaration//GEN-END:variables
}
