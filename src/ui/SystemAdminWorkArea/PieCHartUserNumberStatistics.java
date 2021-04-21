/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author sayalimahajan
 */
public class PieCHartUserNumberStatistics extends javax.swing.JPanel {
JPanel userProcessContainer;
    EcoSystem system;
    JFreeChart pieChart;
    /**
     * Creates new form PieCHartUserNumberStatistics
     */
   

    PieCHartUserNumberStatistics(JPanel rightjPanel, EcoSystem ecosystem) {
       initComponents();
        initComponents();
        this.userProcessContainer = rightjPanel;
        this.system = ecosystem;
        populatePieChart();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pie Chart");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pie1.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addContainerGap(431, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populatePieChart() {
        pieChart = ChartFactory.createPieChart(
         "Number of Scenes Created across Networks",                     
         createDataResult(),          
         true, true, false);
        ChartPanel chartPanel = new ChartPanel( pieChart );   
        jPanel2.removeAll();
        jPanel2.add(chartPanel, BorderLayout.CENTER);
        jPanel2.validate();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private PieDataset createDataResult() {
        DefaultPieDataset resultList = new DefaultPieDataset();
        double Hospital = system.getHospitalDirectory().getHospitalDirectory().size();
        int PatientCareStaff = system.getPatientCareStaffDirectory().getPatientCareStaffDirectory().size();
        int Patient = system.getPatientDirectory().getPatientDirectory().size();
        //int DriverAuthorizationMember = system.getDriverAuthorizationDirectory().getDriverAuthorizationDirectory().size();
       // int PatientAuthorizationMember = system.getPatientAuthorizationDirectory().getPatientAuthorizationDirectory().size();
//        int Camp = system.getCampAdminDirectory().getCampadminList().size();
//        int NGO = system.getnGODirectory().getNGOList().size();
//        int AmbulanceDriver = system.getAmbulanceDriverDirectory().getAmbulanceDriverDirectory().size();
//        int PrivateDriver = system.getPrivateDriverDirectory().getPrivateDriverDirectory().size();
        
        
     
        //set count in resultset
        
        resultList.setValue("Hospital", Hospital);
        resultList.setValue("PatientCare Staff", PatientCareStaff);
        resultList.setValue("Patient", Patient);
      //  resultList.setValue("Driver Authorization Member", DriverAuthorizationMember);
       // resultList.setValue("Patient Authorization Member", PatientAuthorizationMember);
//        resultList.setValue("Camps", Camp);
//        resultList.setValue("NGO", NGO);
//        resultList.setValue("Ambulance Driver", AmbulanceDriver);
//        resultList.setValue("Private Driver", PrivateDriver);

        
        
        return resultList;
    }
}
