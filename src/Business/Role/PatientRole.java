/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Hospital.Patient;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author Gayatri
 */
public class PatientRole extends Role{
    
    //Patient patient;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PatientWorkAreaJPanel( userProcessContainer, account, organization, enterprise, system, system.getPatientDirectory().getPatientByUsername(account.getUsername()), system.getHospitalDirectory().getHospitalByUsername(account.getUsername()));
    }
    
}
