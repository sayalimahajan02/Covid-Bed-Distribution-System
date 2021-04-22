/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalAdminRole;

import Business.EcoSystem;
import Business.Hospital.Hospital;
import Business.Hospital.Patient;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class CheckAllPatientStatusJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private Hospital hospital;
    private Patient patient;
    /**
     * Creates new form CheckAllPatientStatusJPanel
     */
    public CheckAllPatientStatusJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Hospital hospital, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.hospital = hospital;
        this.patient = patient;
        this.setSize(1680, 1050);
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblallpatient = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("VIEW ACCEPTED PATIENTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 27, 258, 29));

        tblallpatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient Phone Number", "Ambulance Number", "Driver Name", "Driver Phone Number", "Staff Name", "Staff Phone Number", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblallpatient);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 879, 192));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ambulance (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 290, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patient (4).png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 180, 150));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblallpatient;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblallpatient.getModel();
        model.setRowCount(0);
        for (Patient p : hospital.getPatientlist()) {
            Object[] row = new Object[7];
            row[0] = p.getFirstname() + " " + p.getLastname();
            row[1] = p.getPhonenumber();
            row[2] = p.getAmbulancedriver().getAmbulanceNumber();
            row[3] = p.getAmbulancedriver().getDriverFirstName() + " " + p.getAmbulancedriver().getDriverLastName();
            row[4] = p.getAmbulancedriver().getPhoneNumber();
            row[5] = p.getPatientcarestaff().getFirstname() + " " + p.getPatientcarestaff().getLastname();
            row[6] = p.getPatientcarestaff().getPhonenumber();
            row[7] = p.getStatus().getValue();
            model.addRow(row);
        }
    }
}
