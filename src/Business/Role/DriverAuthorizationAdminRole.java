/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Authorization.DriverAuthorizationAdmin;
import Business.Driver.AmbulanceDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DriverAuthorizationAdminRole.DriverAuthorizationAdminWorkAreaJPanel;

/**
 *
 * @author Gayatri
 */
public class DriverAuthorizationAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DriverAuthorizationAdminWorkAreaJPanel(userProcessContainer,account,organization,enterprise,business,(DriverAuthorizationAdmin)business.getDriverAuthorizationDirectory().getUserByUserName(account.getUsername()));
    }
    
}