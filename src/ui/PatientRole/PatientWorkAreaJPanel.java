/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Driver.AmbulanceDriver;
import Business.EcoSystem;
import Business.call.EmergencyCall;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Hospital.Patient;
import Business.Organization.Organization;
import Business.Status;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import java.io.File;
import static java.time.Clock.system;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    private Patient patient;
    private Hospital hospital;
    private EcoSystem system;
    private Organization organization;
    private Enterprise enterprise;
    private Status status;
    //DB4OUtil dB4OUtil;
    private JPanel userProcessorcontainer; 
    private UserAccount account;
    private String path = "null";
    
   private int count = 0;
    /**
     * Creates new form PatientWorkAreaJPanel
     */
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Patient patient, Hospital hospital) {
        initComponents();
        this.patient = patient;
        this.hospital = hospital;
        this.system = system;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userProcessorcontainer = userProcessContainer;
        this.account = account;
        //lblpatientstatus.setText(patient.getPatientstatus());
    }

    
    public ImageIcon reportsubmit(String imgpath)
    {
        ImageIcon MyImage = new ImageIcon(imgpath);
        Image reportimg = MyImage.getImage();
        Image newimg = reportimg.getScaledInstance(lblreport.getWidth(), lblreport.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Image = new ImageIcon(newimg);
        return Image;
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
        jLabel2 = new javax.swing.JLabel();
        btnfindbeds = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitaltable = new javax.swing.JTable();
        btnproceed = new javax.swing.JButton();
        btnemergency = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnupload = new javax.swing.JButton();
        lblreport = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblpatientstatus = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setText("Patient Work Area");
        add(jLabel1);
        jLabel1.setBounds(346, 28, 127, 30);

        jLabel2.setText("Upload report here:");
        add(jLabel2);
        jLabel2.setBounds(110, 180, 130, 23);

        btnfindbeds.setText("Find Beds");
        btnfindbeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindbedsActionPerformed(evt);
            }
        });
        add(btnfindbeds);
        btnfindbeds.setBounds(350, 290, 163, 29);

        hospitaltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Hospital Name", "Street", "Zipcode", "City", "Phone Number", "Email ID", "Bed Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(hospitaltable);

        add(jScrollPane1);
        jScrollPane1.setBounds(55, 342, 794, 200);

        btnproceed.setText("Proceed");
        btnproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproceedActionPerformed(evt);
            }
        });
        add(btnproceed);
        btnproceed.setBounds(360, 570, 153, 29);

        btnemergency.setText("Emergency");
        btnemergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemergencyActionPerformed(evt);
            }
        });
        add(btnemergency);
        btnemergency.setBounds(737, 32, 114, 29);

        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback);
        btnback.setBounds(67, 32, 93, 29);

        btnupload.setText("Upload Report");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });
        add(btnupload);
        btnupload.setBounds(660, 160, 105, 29);
        add(lblreport);
        lblreport.setBounds(320, 170, 178, 72);

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        add(btnsubmit);
        btnsubmit.setBounds(660, 210, 110, 29);

        jLabel3.setText("Patient Status:");
        add(jLabel3);
        jLabel3.setBounds(180, 100, 100, 30);
        add(lblpatientstatus);
        lblpatientstatus.setBounds(340, 104, 180, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void btnproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproceedActionPerformed
        // TODO add your handling code here:
        
        
        if (hospitaltable.getSelectedRow() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        status.Allocation.getValue();
        
        DefaultTableModel model = (DefaultTableModel) hospitaltable.getModel();
        int selectedRow = hospitaltable.getSelectedRow();
        
        Integer ID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        Hospital hospital = system.getHospitalDirectory().getHospitalByID(ID);
        Patient p = system.getPatientDirectory().getPatientByUsername(account.getUsername());
        this.patient = p;
        p.setHospital(hospital);
        
        hospital.setRequestcount(count++);
    }//GEN-LAST:event_btnproceedActionPerformed

    private void btnfindbedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindbedsActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnfindbedsActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
        // TODO add your handling code here:
        
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int resultimg= file.showSaveDialog(null);
        
        if(resultimg == JFileChooser.APPROVE_OPTION){
            File SelectedFile = file.getSelectedFile();
            path = SelectedFile.getAbsolutePath();
            lblreport.setIcon(reportsubmit(path));
//            patient.setPath(path);  
            
        }
        if(resultimg == JFileChooser.CANCEL_OPTION){
            System.out.println("NO FILE CHOSEN");
        }
    }//GEN-LAST:event_btnuploadActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
       //patient.setPatientstatus("Pending");
       status.Pending.getValue();
       Patient patient = system.getPatientDirectory().getPatientByUsername(account.getUsername());
       patient.setPath(path); 
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnemergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemergencyActionPerformed
        // TODO add your handling code here:

        EmergencyCall ecall=new EmergencyCall();
        Patient p= system.getPatientDirectory().getPatientByUsername(account.getUsername());
         String[] number=new String[2];
        if(p.getEmergencycontact().contains("-"))
        number=p.getEmergencycontact().split("-");
        if(p.getEmergencycontact().contains("."))
        number=p.getEmergencycontact().split(".");
        String emergencyNumber="+1"+number[0]+number[1]+number[2];
        //ecall.Calling("+18574984878");
        ecall.Calling(emergencyNumber);
    
    }//GEN-LAST:event_btnemergencyActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) hospitaltable.getModel();
        model.setRowCount(0);
        for (Hospital hospital : system.getHospitalDirectory().getHospitalDirectory()) {
          
                Object[] row = new Object[8];
                row[0] = hospital.getHospitalID();
                row[1] = hospital.getName();
                row[2] = hospital.getStreetaddress();
                row[3] = hospital.getZipcode();
                row[4] = hospital.getCity();
                row[5] = hospital.getPhonenumber();
                row[6] = hospital.getEmail();
                row[7] = hospital.getBedcount();
                model.addRow(row);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnemergency;
    private javax.swing.JButton btnfindbeds;
    private javax.swing.JButton btnproceed;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton btnupload;
    private javax.swing.JTable hospitaltable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblpatientstatus;
    private javax.swing.JLabel lblreport;
    // End of variables declaration//GEN-END:variables
}
