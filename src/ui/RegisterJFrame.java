/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import javax.swing.JFrame;

/**
 *
 * @author aishwarya
 */
public class RegisterJFrame extends javax.swing.JFrame {

    private static EcoSystem system;
    private static DB4OUtil dB4OUtil;
    private static JFrame mainJFrame;

    public RegisterJFrame(JFrame mainJFrame, EcoSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.mainJFrame = mainJFrame;
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        container = new javax.swing.JPanel();
        registerDetails = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        patientBtn = new javax.swing.JButton();
        hospitalBtn = new javax.swing.JButton();
        ambulanceBtn = new javax.swing.JButton();
        ngoBtn = new javax.swing.JButton();
        privateDriverBtn = new javax.swing.JButton();
        campBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(container);

        registerDetails.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Please Register");

        patientBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        patientBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukun\\OneDrive\\Documents\\Aishwarya NEU Docs\\AED FINAL PROJECT\\INFO5100_finalProject\\icons\\patient1.jpg")); // NOI18N
        patientBtn.setText("Patient");
        patientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBtnActionPerformed(evt);
            }
        });

        hospitalBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        hospitalBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukun\\OneDrive\\Documents\\Aishwarya NEU Docs\\AED FINAL PROJECT\\INFO5100_finalProject\\icons\\hospitalicon.png")); // NOI18N
        hospitalBtn.setText("Hospital Admin");
        hospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalBtnActionPerformed(evt);
            }
        });

        ambulanceBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ambulanceBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukun\\OneDrive\\Documents\\Aishwarya NEU Docs\\AED FINAL PROJECT\\INFO5100_finalProject\\icons\\ambulance3.png")); // NOI18N
        ambulanceBtn.setText("Ambulance Driver");
        ambulanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceBtnActionPerformed(evt);
            }
        });

        ngoBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ngoBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukun\\OneDrive\\Documents\\Aishwarya NEU Docs\\AED FINAL PROJECT\\INFO5100_finalProject\\icons\\ngo2icon.png")); // NOI18N
        ngoBtn.setText("NGO Admin");
        ngoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngoBtnActionPerformed(evt);
            }
        });

        privateDriverBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        privateDriverBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukun\\OneDrive\\Documents\\Aishwarya NEU Docs\\AED FINAL PROJECT\\INFO5100_finalProject\\icons\\privatedrivericon.png")); // NOI18N
        privateDriverBtn.setText("Private Driver");

        campBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        campBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukun\\OneDrive\\Documents\\Aishwarya NEU Docs\\AED FINAL PROJECT\\INFO5100_finalProject\\icons\\campsiteicon.png")); // NOI18N
        campBtn.setText("Camp Site Admin");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerDetailsLayout = new javax.swing.GroupLayout(registerDetails);
        registerDetails.setLayout(registerDetailsLayout);
        registerDetailsLayout.setHorizontalGroup(
            registerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerDetailsLayout.createSequentialGroup()
                .addGroup(registerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerDetailsLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(registerDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(registerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ngoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ambulanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(patientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitalBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerDetailsLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(privateDriverBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        registerDetailsLayout.setVerticalGroup(
            registerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerDetailsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(patientBtn)
                .addGap(29, 29, 29)
                .addComponent(hospitalBtn)
                .addGap(34, 34, 34)
                .addComponent(ambulanceBtn)
                .addGap(38, 38, 38)
                .addComponent(ngoBtn)
                .addGap(36, 36, 36)
                .addComponent(privateDriverBtn)
                .addGap(35, 35, 35)
                .addComponent(campBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(51, 51, 51))
        );

        jSplitPane1.setLeftComponent(registerDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalBtnActionPerformed

    private void ambulanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ambulanceBtnActionPerformed

    private void ngoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngoBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        mainJFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void patientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterJFrame(mainJFrame, system, dB4OUtil).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambulanceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton campBtn;
    private javax.swing.JPanel container;
    private javax.swing.JButton hospitalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton ngoBtn;
    private javax.swing.JButton patientBtn;
    private javax.swing.JButton privateDriverBtn;
    private javax.swing.JPanel registerDetails;
    // End of variables declaration//GEN-END:variables
}
