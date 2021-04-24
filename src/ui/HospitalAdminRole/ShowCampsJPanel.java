/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalAdminRole;

import Business.EcoSystem;
import Business.Hospital.Hospital;
import Business.Hospital.Patient;
import Business.Status;
import Business.UserAccount.UserAccount;
import Business.Voluntary.CampAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class ShowCampsJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private CampAdmin campadmin;
    private EcoSystem system;
    private Hospital hospital;

    /**
     * Creates new form ShowCampsJPanel
     */
    public ShowCampsJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Hospital hospital, CampAdmin campadmin ) {
        initComponents();
        populateTable();
        this.campadmin = campadmin;
        this.hospital = hospital;
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblshowcamps = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 244, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("CAMPS CREATED");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 181, 30));

        tblshowcamps.setModel(new javax.swing.table.DefaultTableModel(
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
                "Camp Name", "Address", "Admin Name", "Phone Number", "Capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblshowcamps);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 685, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital (5).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 260, 250));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel.png"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalAdminWorkAreaJPanel workareajpanel = (HospitalAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblshowcamps;
    // End of variables declaration//GEN-END:variables

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblshowcamps.getModel();
        model.setRowCount(0);
        
        for (CampAdmin campadmin : system.getCampAdminDirectory().getCampadminList()) {
            if(campadmin.getId() == hospital.getHospitalID()) {
          
                Object[] row = new Object[5];
                row[0] = campadmin.getName();
                row[1] = campadmin.getStreet() + campadmin.getCity() + campadmin.getZipCode();
                row[2] = campadmin.getAdminName();
                row[3] = campadmin.getCapacity();
              
                
                model.addRow(row);
            }
        }
    }
}
