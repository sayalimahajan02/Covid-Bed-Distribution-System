/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CampAdminRole;

import Business.Driver.PrivateDriver;
import Business.EcoSystem;
import Business.Hospital.Patient;
import Business.Hospital.PatientCareStaff;
import Business.Status;
import Business.UserAccount.UserAccount;
import Business.Voluntary.CampAdmin;
import Business.Voluntary.HospitalNgoRequests;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import ui.NGORole.NGORegistrationJPanel;

/**
 *
 * @author aishwarya
 */
public class CampAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private CampAdmin ca;
    private Patient patient;

    /**
     * Creates new form CampAdminJPanel
     */
    public CampAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, CampAdmin ca) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.ca = ca;
        this.setSize(1680, 1050);
        populateRequestTable();
        populatePatientData();
        populateDrivers();
        populatePatientCareStaff();
        bedsAvailableText.setText("" + ca.getAvailableBedCount());
        patientReqTxt.setText("" + system.getPatientDirectory().getPatientsRequestsByCamp(ca));
    }

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) ngoReqTable.getModel();
        model.setRowCount(0);
        requestStatusComboBox.addItem(Status.Approved.getValue());
        for (HospitalNgoRequests requests : system.getnGODirectory().getHospitalNgoDirectory().getHospitalRequests()) {
            if (requests.getCampAdmin().equals(ca)) {
                Object[] row = new Object[7];
                row[0] = requests.getId();
                row[1] = requests.getHospital().getName();
                row[2] = requests.getNgo().getName();
                row[3] = requests.getRequiredBeds();
                row[4] = requests.getStatus().getValue();
                row[5] = requests.getHospital().getStreetaddress() + ", " + requests.getHospital().getCity() + ", " + requests.getHospital().getZipcode();
                row[6] = requests.getRequestTime();
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

        requestStatusComboBox = new javax.swing.JComboBox<>();
        patientComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngoReqTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        acceptReqBtn = new javax.swing.JButton();
        campLabel = new javax.swing.JLabel();
        approvePatientBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        privateDriverTable = new javax.swing.JTable();
        campLabel1 = new javax.swing.JLabel();
        assignPvtDriverBtn = new javax.swing.JButton();
        btncheckall = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bedsAvailableText = new javax.swing.JTextField();
        patientReqTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientCareSTaffTable = new javax.swing.JTable();
        assignStaffBtn = new javax.swing.JButton();

        requestStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        patientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ngoReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Hospital Name", "NGO Name", "Required Bed Count", "Request Status", "Location", "Request Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ngoReqTable);
        if (ngoReqTable.getColumnModel().getColumnCount() > 0) {
            ngoReqTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(requestStatusComboBox));
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Camp Admin Work Area");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("NGO Requests");

        acceptReqBtn.setText("Accept Request");
        acceptReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptReqBtnActionPerformed(evt);
            }
        });

        campLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        campLabel.setText("Patient Data ");

        approvePatientBtn.setText("Approve Patient");
        approvePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvePatientBtnActionPerformed(evt);
            }
        });

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Phone Number", "Address", "Email ID", "Patient Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(patientComboBox));
        }

        privateDriverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Driver ID", "Driver Name", "Vehicle Number", "Contact Number", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(privateDriverTable);

        campLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        campLabel1.setText("Private Driver List");

        assignPvtDriverBtn.setText("Assign Private Driver");
        assignPvtDriverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignPvtDriverBtnActionPerformed(evt);
            }
        });

        btncheckall.setText("Check Accepted Patients");
        btncheckall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckallActionPerformed(evt);
            }
        });

        jLabel4.setText("Beds Available:");

        jLabel6.setText("Patient Requests:");

        bedsAvailableText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedsAvailableTextActionPerformed(evt);
            }
        });

        patientReqTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientReqTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Patient Care Staff Data");

        patientCareSTaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Staff ID", "Staff Name", "Phone Number", "Email ID", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patientCareSTaffTable);

        assignStaffBtn.setText("Assign Staff");
        assignStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignStaffBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(497, 497, 497)
                .addComponent(assignStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(480, 480, 480)
                                .addComponent(acceptReqBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(441, 441, 441)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btncheckall)
                                .addGap(531, 531, 531)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bedsAvailableText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patientReqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(491, 491, 491)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(491, 491, 491)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campLabel1)
                                    .addComponent(approvePatientBtn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(409, 409, 409)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(501, 501, 501)
                                .addComponent(campLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignPvtDriverBtn)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(bedsAvailableText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(patientReqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addComponent(btncheckall)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acceptReqBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(approvePatientBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignPvtDriverBtn)
                .addGap(2, 2, 2)
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignStaffBtn)
                .addGap(219, 219, 219))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acceptReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptReqBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ngoReqTable.getModel();
        int selectedRowInd = ngoReqTable.getSelectedRow();
        String requestStatus = model.getValueAt(selectedRowInd, 4).toString();
        if (requestStatus.equals("Approved")) {
            Integer requestId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
            HospitalNgoRequests requests = system.getnGODirectory().getHospitalNgoDirectory().findRequestByID(requestId);
            requests.setStatus(Status.Approved);
            ngoReqTable.setValueAt(requestStatus, selectedRowInd, 3);
        }
        JOptionPane.showMessageDialog(null, "Accepted NGO request!");
    }//GEN-LAST:event_acceptReqBtnActionPerformed

    private void populatePatientData() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        patientComboBox.addItem(Status.Approved.getValue());
        for (Patient p : system.getPatientDirectory().getPatientDirectory()) {
            if (p.getCampadmin().equals(ca) && p.getStatus().equals(Status.Allocation)) {
                Object[] row = new Object[6];
                row[0] = p.getPatientID();
                row[1] = p.getFirstname() + " " + p.getLastname();
                row[2] = p.getPhonenumber();
                row[3] = p.getStreetaddress() + ", " + p.getCity() + ", " + p.getZipcode();
                row[4] = p.getEmail();
                row[5] = p.getPatientstatus();
                model.addRow(row);
            }
        }

    }

    private void approvePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvePatientBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        int selectedRowInd = patientTable.getSelectedRow();
        Integer patientId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
        Patient p = system.getPatientDirectory().getPatientByID(patientId);
        p.setStatus(Status.Allocated);
        patientTable.setValueAt(Status.Allocated.getValue(), selectedRowInd, 5);
        this.patient = p;
        ca.assignPatientABed(p);
        JOptionPane.showMessageDialog(null, "Approved Patient!");
    }//GEN-LAST:event_approvePatientBtnActionPerformed

    private void populateDrivers() {
        DefaultTableModel model = (DefaultTableModel) privateDriverTable.getModel();
        model.setRowCount(0);
        for (PrivateDriver p : system.getPrivateDriverDirectory().getPrivateDriverDirectory()) {
            if (p.isIsAuthorized()) {
                Object[] row = new Object[6];
                row[0] = p.getId();
                row[1] = p.getDriverFirstName() + " " + p.getDriverLastName();
                row[2] = p.getPrivateVehicleNumber();
                row[3] = p.getPhoneNumber();
                row[4] = p.isIsAvailable();
                model.addRow(row);
            }
        }
    }

    private void populatePatientCareStaff() {
        DefaultTableModel model = (DefaultTableModel) patientCareSTaffTable.getModel();
        model.setRowCount(0);
        for (PatientCareStaff p : system.getPatientCareStaffDirectory().getPatientCareStaffDirectory()) {
            if (p.getAvailability()) {
                Object[] row = new Object[6];
                row[0] = p.getPatientcarestaffID();
                row[1] = p.getFirstname() + " " + p.getLastname();
                row[2] = p.getPhonenumber();
                row[3] = p.getEmail();
                row[4] = p.getAvailability();
                model.addRow(row);
            }
        }
    }

    private void assignPvtDriverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignPvtDriverBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) privateDriverTable.getModel();
        int selectedRowInd = privateDriverTable.getSelectedRow();
        Integer pvtDrivId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
        PrivateDriver pd = system.getPrivateDriverDirectory().getUserById(pvtDrivId);
        this.patient.setPrivatedriver(pd);
        pd.setIsAvailable(false);
        privateDriverTable.setValueAt(false, selectedRowInd, 4);
        JOptionPane.showMessageDialog(null, "Private Driver Assigned to the Patient!");
    }//GEN-LAST:event_assignPvtDriverBtnActionPerformed

    private void btncheckallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckallActionPerformed
        // TODO add your handling code here:
        CheckAllCampPatientStatusJPanel j = new CheckAllCampPatientStatusJPanel(userProcessContainer, account, system, ca);
        userProcessContainer.add("checkAllCampPatientStatusJPanel", j);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btncheckallActionPerformed

    private void assignStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignStaffBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) patientCareSTaffTable.getModel();
        int selectedRowInd = patientCareSTaffTable.getSelectedRow();
        Integer staffId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
        PatientCareStaff ps = system.getPatientCareStaffDirectory().getPatientByID(staffId);
        this.patient.setPatientcarestaff(ps);
        ps.setAvailability(false);
        patientCareSTaffTable.setValueAt(false, selectedRowInd, 4);
        JOptionPane.showMessageDialog(null, "Patient Care Staff assigned to the Patient!");
    }//GEN-LAST:event_assignStaffBtnActionPerformed

    private void bedsAvailableTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedsAvailableTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bedsAvailableTextActionPerformed

    private void patientReqTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientReqTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientReqTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptReqBtn;
    private javax.swing.JButton approvePatientBtn;
    private javax.swing.JButton assignPvtDriverBtn;
    private javax.swing.JButton assignStaffBtn;
    private javax.swing.JTextField bedsAvailableText;
    private javax.swing.JButton btncheckall;
    private javax.swing.JLabel campLabel;
    private javax.swing.JLabel campLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable ngoReqTable;
    private javax.swing.JTable patientCareSTaffTable;
    private javax.swing.JComboBox<String> patientComboBox;
    private javax.swing.JTextField patientReqTxt;
    private javax.swing.JTable patientTable;
    private javax.swing.JTable privateDriverTable;
    private javax.swing.JComboBox<String> requestStatusComboBox;
    // End of variables declaration//GEN-END:variables
}
