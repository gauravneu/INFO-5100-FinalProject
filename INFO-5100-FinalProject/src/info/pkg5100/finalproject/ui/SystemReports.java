/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info.pkg5100.finalproject.ui;

import info.pkg5100.finalproject.daos.SystemReportDaoImplementation;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author hazel
 */
public class SystemReports extends javax.swing.JPanel {

    /**
     * Creates new form SystemReports
     */
    JPanel mainWorkJPanel;
    SystemReportDaoImplementation systemReportDaoImplementation;
    public SystemReports() {
        initComponents();
    }

    public SystemReports(JPanel mainWorkJPanel) {
        initComponents();
        this.mainWorkJPanel = mainWorkJPanel;
        this.systemReportDaoImplementation=new SystemReportDaoImplementation();
        populateLocationBasedIncidents();
        populateLocationSpecificOrganizationEmpCount();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        plotJPanel = new javax.swing.JPanel();
        pieplotJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(858, 565));

        jLabel5.setBackground(new java.awt.Color(31, 75, 124));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reports");
        jLabel5.setOpaque(true);

        btnBack.setBackground(new java.awt.Color(31, 75, 124));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        plotJPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        plotJPanel.setPreferredSize(new java.awt.Dimension(1000, 900));

        javax.swing.GroupLayout plotJPanelLayout = new javax.swing.GroupLayout(plotJPanel);
        plotJPanel.setLayout(plotJPanelLayout);
        plotJPanelLayout.setHorizontalGroup(
            plotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        plotJPanelLayout.setVerticalGroup(
            plotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        pieplotJPanel.setMaximumSize(new java.awt.Dimension(1000, 900));
        pieplotJPanel.setPreferredSize(new java.awt.Dimension(1000, 900));

        javax.swing.GroupLayout pieplotJPanelLayout = new javax.swing.GroupLayout(pieplotJPanel);
        pieplotJPanel.setLayout(pieplotJPanelLayout);
        pieplotJPanelLayout.setHorizontalGroup(
            pieplotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        pieplotJPanelLayout.setVerticalGroup(
            pieplotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBack)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pieplotJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(plotJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pieplotJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(plotJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(698, 698, 698))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainWorkJPanel.remove(this);
        CardLayout layout = (CardLayout)mainWorkJPanel.getLayout();
        layout.previous(mainWorkJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private  void populateLocationBasedIncidents(){
        try {
            HashMap<String,Integer> datamap=this.systemReportDaoImplementation.getReportIncidentCountWithLocation();
            DefaultPieDataset dataset = new DefaultPieDataset( );
            for(String ent:datamap.keySet()){
                dataset.setValue(ent, datamap.get(ent));
                pieChart(dataset,"Reported Incidents");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SystemReports.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void populateLocationSpecificOrganizationEmpCount(){
        try {
            Map<String,Map<String,Integer>> datamap=this.systemReportDaoImplementation.getEmpCountLocationSpecificOrganization();
            DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
            
            for(String loc:datamap.keySet()){
                for(String org:datamap.get(loc).keySet()){
                    dataset.addValue(datamap.get(loc).get(org),org,loc);
                    barGraph(dataset,"Organizations","Location","Employee Count");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SystemReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void pieChart(DefaultPieDataset dataset,String tHeader){
        JFreeChart chart = ChartFactory.createPieChart3D(
        tHeader, // Title
        dataset, // Dataset
        true, // Show Legend
        true, // Use tooltips
        false // Configure chart to generate URLs?
        );
        
        pieplotJPanel.removeAll();
        pieplotJPanel.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        pieplotJPanel.add(CP,BorderLayout.CENTER);
        pieplotJPanel.validate();
        pieplotJPanel.setBounds(10, 10, 200, 300);
        
        
    }
    
    private void barGraph(DefaultCategoryDataset dataset,String tHeader,String bHeader,String lHeader){

        JFreeChart chart = ChartFactory.createBarChart3D(
        tHeader, // Title
        bHeader, // x-axis Label
        lHeader, // y-axis Label
        dataset, // Dataset
        PlotOrientation.VERTICAL, // Plot Orientation
        true, // Show Legend
        true, // Use tooltips
        false // Configure chart to generate URLs?
     );
        plotJPanel.removeAll();
        plotJPanel.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        plotJPanel.add(CP,BorderLayout.CENTER);
        plotJPanel.validate();
        plotJPanel.setBounds(10, 10, 200, 300);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pieplotJPanel;
    private javax.swing.JPanel plotJPanel;
    // End of variables declaration//GEN-END:variables
}
