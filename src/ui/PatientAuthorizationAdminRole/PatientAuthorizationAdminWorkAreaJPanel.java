/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientAuthorizationAdminRole;

import Business.Authorization.PatientAuthorizationAdmin;
import ui.DriverAuthorizationAdminRole.*;
import Business.DB4OUtil.DB4OUtil;
import Business.Driver.PrivateDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Patient;
import Business.Organization.Organization;
import Business.Status;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class PatientAuthorizationAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientAuthorizationAdminWorkAreaJPanel
     */
         private static EcoSystem system;
    private static DB4OUtil dB4OUtil;
    private static JPanel userProcessorcontainer;
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private Status status;
    private PatientAuthorizationAdmin patientAdminLogin;

    public PatientAuthorizationAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,PatientAuthorizationAdmin patientAdminLogin) {
        initComponents();
         this.system = business;
        this.dB4OUtil = dB4OUtil;
        this.userProcessorcontainer = userProcessContainer;
    this.userProcessContainer=userProcessContainer;
    this.account=account;
    this.organization=organization;
    this.enterprise=enterprise;
    this.business=business;
    this.patientAdminLogin=patientAdminLogin;
    this.setSize(1680, 1050);
    populatePatientDetails();
    }
   
public void populatePatientDetails(){
   
    
    
     DefaultTableModel model = (DefaultTableModel) pendingPatientjTable.getModel();
        model.setRowCount(0);

        for(Patient patient : system.getPatientDirectory().getPatientDirectory()){
            if(patient.getPatientstatus().equalsIgnoreCase(status.Pending.getValue())){
                Object[] row=new Object[5];
                row[0]=patient.getPatientID();
                row[1]=patient.getLastname()+", "+patient.getFirstname();
                row[2]=patient.getEmail();
                row[3]=patient.getPhonenumber();
                row[4]=patient.getPatientstatus();
                model.addRow(row);
            }
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

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingPatientjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ConfirmButton1 = new javax.swing.JLabel();
        viewDlButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("PATIENT PENDING REQUESTS");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 62, -1, 23));

        pendingPatientjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ptient Id", "Patient Name", "Email", "number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pendingPatientjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 121, 583, 149));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Click here to see COVID Report of selected Driver :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        ConfirmButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ConfirmButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmButton1.setText("Confirm");
        ConfirmButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConfirmButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfirmButton1MousePressed(evt);
            }
        });
        add(ConfirmButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 446, 116, 24));

        viewDlButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewDlButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewDlButton.setText("View Report Here");
        viewDlButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewDlButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewDlButtonMousePressed(evt);
            }
        });
        add(viewDlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 120, 26));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical-mask (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 220, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void viewDlButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDlButtonMousePressed
        // TODO add your handling code here:
        
         int selectedRowIndex = pendingPatientjTable.getSelectedRow();
        if (pendingPatientjTable.getSelectedRowCount() == 1) {
        
            try {
                
                Patient patientsel=system.getPatientDirectory().getPatientByID((int)pendingPatientjTable.getValueAt(selectedRowIndex, 0));
                ImageIcon MyImage = new ImageIcon(patientsel.getPath());
                 Image licimg = MyImage.getImage();
                Image newimg = licimg.getScaledInstance(170,120, Image.SCALE_SMOOTH);
                ImageIcon Image = new ImageIcon(newimg);
               
                JOptionPane.showMessageDialog(null,"", "Driving License Image", + JOptionPane.INFORMATION_MESSAGE,   Image);
            } catch (Exception ex) {
                Logger.getLogger(PatientAuthorizationAdminWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select one row to see Driving licanse");
            return;
        }
    }//GEN-LAST:event_viewDlButtonMousePressed

    private void ConfirmButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButton1MousePressed
        // TODO add your handling code here:
        
         int selectedRowIndex = pendingPatientjTable.getSelectedRow();
        if (pendingPatientjTable.getSelectedRowCount() == 1) {
        
              Patient selectedPatient=system.getPatientDirectory().getPatientByID((int)pendingPatientjTable.getValueAt(selectedRowIndex, 0));
             selectedPatient.setPatientstatus(status.Approved.getValue());
             JOptionPane.showMessageDialog(null, "Driver has been Authorized successfully");
             populatePatientDetails();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select one row to confirm");
            return;
        }
    }//GEN-LAST:event_ConfirmButton1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pendingPatientjTable;
    private javax.swing.JLabel viewDlButton;
    // End of variables declaration//GEN-END:variables
}
