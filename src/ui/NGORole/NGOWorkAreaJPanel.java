/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGORole;

import Business.EcoSystem;
import Business.Status;
import Business.UserAccount.UserAccount;
import Business.Voluntary.CampAdmin;
import Business.Voluntary.HospitalNgoRequests;
import Business.Voluntary.NGO;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;

/**
 *
 * @author aishwarya
 */
public class NGOWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private NGO ngo;

    /**
     * Creates new form NGOJPanel
     */
    public NGOWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, NGO ngo) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.ngo = ngo;
//        campLabel.setVisible(false);
//        jScrollPane2.setVisible(false);
//        campListTable.setVisible(false);
//        assignCampBtn.setVisible(false);
        populateRequestTable();
        populateCampTable();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalReqTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campListTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        acceptReqBtn = new javax.swing.JButton();
        campLabel = new javax.swing.JLabel();
        assignCampBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        hospitalReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Hospital Name", "Required Bed Count", "Request Status", "Location", "Request Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(hospitalReqTable);
        if (hospitalReqTable.getColumnModel().getColumnCount() > 0) {
            hospitalReqTable.getColumnModel().getColumn(3).setCellEditor(null);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("NGO Work Area");

        campListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Camp ID", "Name", "Type", "Bed Capacity", "Admin Name", "Email Id", "Contact No", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(campListTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Hospital Requests");

        acceptReqBtn.setText("Accept Request");
        acceptReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptReqBtnActionPerformed(evt);
            }
        });

        campLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        campLabel.setText("Available Camps ");

        assignCampBtn.setText("Assign Camp");
        assignCampBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignCampBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assignCampBtn)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acceptReqBtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(campLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acceptReqBtn)
                .addGap(34, 34, 34)
                .addComponent(campLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignCampBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 978, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignCampBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignCampBtnActionPerformed
        // TODO add your handling code here:
        if (campListTable.getSelectedRow() != 1) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) campListTable.getModel();
        int selectedRowInd = campListTable.getSelectedRow();
        Integer campId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
        CampAdmin ca = system.getCampAdminDirectory().findCampByID(campId);
        HospitalNgoRequests requests = system.getnGODirectory().getHospitalNgoDirectory().getHospitalRequestByNGO(ngo);
        requests.setCampAdmin(ca);
        JOptionPane.showMessageDialog(null, "Camp Admin Assigned!");
    }//GEN-LAST:event_assignCampBtnActionPerformed

    private void acceptReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptReqBtnActionPerformed
        // TODO add your handling code here:
        if (hospitalReqTable.getRowCount()==0) {
            JOptionPane.showMessageDialog(null, "Sorry, There are no request as of now.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (hospitalReqTable.getSelectedRowCount()!=1) {
            JOptionPane.showMessageDialog(null, "Please select one row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(campListTable.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Sorry, There are no Camps available at this moment as of now.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
//        if (requestStatusComboBox.getSelectedItem() == null) {
//            JOptionPane.showMessageDialog(null, "Please update request status!", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        DefaultTableModel model = (DefaultTableModel) hospitalReqTable.getModel();
        for (int i = 0; i < hospitalReqTable.getRowCount(); i++) {
            String requestStatus = model.getValueAt(i, 3).toString();
            if (requestStatus.equals("In Progress")) {
                Integer requestId = Integer.parseInt(model.getValueAt(i, 0).toString());
                HospitalNgoRequests requests = system.getnGODirectory().getHospitalNgoDirectory().findRequestByID(requestId);
                requests.setNgo(ngo);
                requests.setStatus(Status.InProgress);
                hospitalReqTable.setValueAt(requestStatus, i, 3);
            }
        }
        JOptionPane.showMessageDialog(null, "Accepted Hospital request!");
        //populateCampTable();
    }//GEN-LAST:event_acceptReqBtnActionPerformed

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) hospitalReqTable.getModel();
        model.setRowCount(0);
        if(system.getnGODirectory().getHospitalNgoDirectory()!=null)
        {
           

        for (HospitalNgoRequests requests : system.getnGODirectory().getHospitalNgoDirectory().getHospitalRequests()) {
            Object[] row = new Object[6];
            row[0] = requests.getId();
            row[1] = requests.getHospital().getName();
            row[2] = requests.getRequiredBeds();
            row[3] = requests.getStatus().getValue();
            row[4] = requests.getHospital().getStreetaddress() + ", " + requests.getHospital().getCity() + ", " + requests.getHospital().getZipcode();
            row[5] = requests.getRequestTime();
            model.addRow(row);
        }
        }
    }

    public void populateCampTable() {
//        campLabel.setVisible(true);
//        campListTable.setVisible(true);
//        jScrollPane2.setVisible(true);
//        assignCampBtn.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) campListTable.getModel();
        model.setRowCount(0);
        if(system.getCampAdminDirectory().getCampadminList()!=null)
        for (CampAdmin ca : system.getCampAdminDirectory().getCampadminList()) {
            Object[] row = new Object[8];
            row[0] = ca.getId();
            row[1] = ca.getName();
            row[2] = ca.getType();
            row[3] = ca.getCapacity();
            row[4] = ca.getAdminName();
            row[5] = ca.getEmailId();
            row[6] = ca.getPhoneNumber();
            row[7] = ca.getStreet() + ", " + ca.getCity() + ", " + ca.getZipCode();
            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptReqBtn;
    private javax.swing.JButton assignCampBtn;
    private javax.swing.JLabel campLabel;
    private javax.swing.JTable campListTable;
    private javax.swing.JTable hospitalReqTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
