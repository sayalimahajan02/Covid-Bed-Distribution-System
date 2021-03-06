/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aishwarya
 */
public class ManageVoluntaryAdminOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageVoluntaryAdminOrganizationJPanel
     */
    public ManageVoluntaryAdminOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();
        organizationJComboBox.addItem(Organization.Type.NGOAdmin.getValue());
        organizationJComboBox.addItem(Organization.Type.CampAdmin.getValue());
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);
        for (Organization organization : directory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            model.addRow(row);
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

        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        addJButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 244, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 203, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Organization Type ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 480, 92));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE TRANSPORTATION ADMIN ORGANIZATION");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 520, 30));

        addJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addJButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addJButton.setText("Add Organization");
        addJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addJButtonMousePressed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 115, 24));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrative.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 260, 400));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin (12).png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 130, 130));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMousePressed
        // TODO add your handling code here:
        
        String type = (String) organizationJComboBox.getSelectedItem();
        if (Organization.Type.NGOAdmin.getValue().equals(type)) {
            directory.createOrganization(Organization.Type.NGOAdmin);
        } else if (Organization.Type.CampAdmin.getValue().equals(type)) {
            directory.createOrganization(Organization.Type.CampAdmin);
        }
        populateTable();
    }//GEN-LAST:event_addJButtonMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addJButton;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
