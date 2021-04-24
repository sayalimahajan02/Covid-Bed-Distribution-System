/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Authorization.PatientAuthorizationAdmin;
import Business.Driver.AmbulanceDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PatientAuthorizationAdminRole.PatientAuthorizationAdminWorkAreaJPanel;

/**
 *
 * @author Gayatri
 */
public class PatientAuthorizationAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PatientAuthorizationAdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business,(PatientAuthorizationAdmin)business.getPatientAuthorizationDirectory().getUserByUserName(account.getUsername()));
    }
    
}