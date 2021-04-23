/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import ui.AmbulanceDriverRole.AmbulanceDriverRegistrationJPanel;
import ui.CampAdminRole.CampAdminRegistrationJPanel;
import ui.DriverAuthorizationAdminRole.DriverAuthorizationRegistrationJPanel;
import ui.HospitalAdminRole.HospitalAdminRegistrationJPanel;
import ui.NGORole.NGORegistrationJPanel;
import ui.PatientAuthorizationAdminRole.PatientAuthorizationRegistrationJPanel;
import ui.PatientCareStaffRole.PatientCareStaffRegistrationJPanel;
import ui.PatientRole.PatientRegistrationJPanel;
import ui.PrivateDriverRole.PrivateDriverRegistrationJPanel;

/**
 *
 * @author aishwarya
 */
public class RegisterJPanel extends javax.swing.JPanel {

    private static EcoSystem system;
    private static DB4OUtil dB4OUtil;
    private static JPanel mainContainer;
    private static JPanel topPanel;

    public RegisterJPanel(JPanel mainContainer,JPanel topPanel,EcoSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.topPanel=topPanel;
        this.mainContainer = mainContainer;
        this.setSize(1680, 1050);
      topPanel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerDetails = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        patientBtn = new javax.swing.JButton();
        hospitalBtn = new javax.swing.JButton();
        ambulanceBtn = new javax.swing.JButton();
        patientCareStaffBtn = new javax.swing.JButton();
        privateDriverBtn = new javax.swing.JButton();
        campBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        ngoBtn = new javax.swing.JButton();
        driverAuthBtn = new javax.swing.JButton();
        patientAuthBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        registerDetails.setBackground(new java.awt.Color(255, 255, 255));
        registerDetails.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setText("Please Register");
        registerDetails.add(jLabel1);
        jLabel1.setBounds(264, 28, 200, 32);

        patientBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        patientBtn.setText("Patient");
        patientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBtnActionPerformed(evt);
            }
        });
        registerDetails.add(patientBtn);
        patientBtn.setBounds(21, 152, 221, 29);

        hospitalBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        hospitalBtn.setText("Hospital Admin");
        hospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalBtnActionPerformed(evt);
            }
        });
        registerDetails.add(hospitalBtn);
        hospitalBtn.setBounds(252, 152, 221, 29);

        ambulanceBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ambulanceBtn.setText("Ambulance Driver");
        ambulanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceBtnActionPerformed(evt);
            }
        });
        registerDetails.add(ambulanceBtn);
        ambulanceBtn.setBounds(133, 357, 221, 29);

        patientCareStaffBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        patientCareStaffBtn.setText("Patient Care Staff");
        patientCareStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCareStaffBtnActionPerformed(evt);
            }
        });
        registerDetails.add(patientCareStaffBtn);
        patientCareStaffBtn.setBounds(483, 151, 221, 29);

        privateDriverBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        privateDriverBtn.setText("Private Driver");
        privateDriverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateDriverBtnActionPerformed(evt);
            }
        });
        registerDetails.add(privateDriverBtn);
        privateDriverBtn.setBounds(372, 357, 221, 29);

        campBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        campBtn.setText("Camp Site Admin");
        campBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campBtnActionPerformed(evt);
            }
        });
        registerDetails.add(campBtn);
        campBtn.setBounds(372, 248, 221, 29);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        registerDetails.add(backBtn);
        backBtn.setBounds(321, 591, 102, 29);

        ngoBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ngoBtn.setText("NGO Admin");
        ngoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngoBtnActionPerformed(evt);
            }
        });
        registerDetails.add(ngoBtn);
        ngoBtn.setBounds(133, 247, 221, 29);

        driverAuthBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        driverAuthBtn.setText("Driver Authorization Admin");
        driverAuthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverAuthBtnActionPerformed(evt);
            }
        });
        registerDetails.add(driverAuthBtn);
        driverAuthBtn.setBounds(59, 475, 265, 29);

        patientAuthBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        patientAuthBtn.setText("Patient Authorization Admin");
        patientAuthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientAuthBtnActionPerformed(evt);
            }
        });
        registerDetails.add(patientAuthBtn);
        patientAuthBtn.setBounds(372, 475, 275, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Hospital");
        registerDetails.add(jLabel2);
        jLabel2.setBounds(330, 101, 73, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Voluntary");
        registerDetails.add(jLabel3);
        jLabel3.setBounds(323, 207, 88, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Transportation");
        registerDetails.add(jLabel4);
        jLabel4.setBounds(300, 317, 134, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Authorization");
        registerDetails.add(jLabel5);
        jLabel5.setBounds(307, 427, 122, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBtnActionPerformed
        // TODO add your handling code here:
        PatientRegistrationJPanel panel = new PatientRegistrationJPanel(mainContainer,topPanel ,system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);

    }//GEN-LAST:event_patientBtnActionPerformed

    private void hospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalBtnActionPerformed
        // TODO add your handling code here:
        HospitalAdminRegistrationJPanel panel = new HospitalAdminRegistrationJPanel(mainContainer,topPanel, system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);
  
    }//GEN-LAST:event_hospitalBtnActionPerformed

    private void ambulanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceBtnActionPerformed
        // TODO add your handling code here:
        AmbulanceDriverRegistrationJPanel panel = new AmbulanceDriverRegistrationJPanel(mainContainer,topPanel, system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);

    }//GEN-LAST:event_ambulanceBtnActionPerformed

    private void patientCareStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCareStaffBtnActionPerformed
        // TODO add your handling code here:
        PatientCareStaffRegistrationJPanel panel = new PatientCareStaffRegistrationJPanel(mainContainer,topPanel, system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);
    }//GEN-LAST:event_patientCareStaffBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        //mainJFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void ngoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngoBtnActionPerformed
        // TODO add your handling code here:
         NGORegistrationJPanel panel = new NGORegistrationJPanel(mainContainer,topPanel, system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);

    }//GEN-LAST:event_ngoBtnActionPerformed

    private void driverAuthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverAuthBtnActionPerformed
        // TODO add your handling code here:
         DriverAuthorizationRegistrationJPanel panel = new DriverAuthorizationRegistrationJPanel(mainContainer,topPanel, system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);
  
    }//GEN-LAST:event_driverAuthBtnActionPerformed

    private void patientAuthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientAuthBtnActionPerformed
        // TODO add your handling code here:
       PatientAuthorizationRegistrationJPanel panel = new PatientAuthorizationRegistrationJPanel(mainContainer,topPanel, system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);

    }//GEN-LAST:event_patientAuthBtnActionPerformed

    private void campBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campBtnActionPerformed
        // TODO add your handling code here:
         CampAdminRegistrationJPanel panel = new CampAdminRegistrationJPanel(mainContainer,topPanel, system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);

    }//GEN-LAST:event_campBtnActionPerformed

    private void privateDriverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateDriverBtnActionPerformed
        // TODO add your handling code here:
         PrivateDriverRegistrationJPanel panel = new PrivateDriverRegistrationJPanel(mainContainer,topPanel, system, dB4OUtil);
        mainContainer.add("workArea", panel);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        mainContainer.setVisible(true);
        topPanel.setVisible(false);
    }//GEN-LAST:event_privateDriverBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambulanceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton campBtn;
    private javax.swing.JButton driverAuthBtn;
    private javax.swing.JButton hospitalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton ngoBtn;
    private javax.swing.JButton patientAuthBtn;
    private javax.swing.JButton patientBtn;
    private javax.swing.JButton patientCareStaffBtn;
    private javax.swing.JButton privateDriverBtn;
    private javax.swing.JPanel registerDetails;
    // End of variables declaration//GEN-END:variables
}
