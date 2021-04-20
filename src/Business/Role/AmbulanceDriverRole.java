/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Driver.AmbulanceDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmbulanceDriverOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AmbulanceDriverRole.AmbulanceDriverWorkAreaJPanel;

/**
 *
 * @author sayalimahajan
 */
public class AmbulanceDriverRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AmbulanceDriverWorkAreaJPanel(userProcessContainer, account,business, (AmbulanceDriverOrganization)organization, enterprise,(AmbulanceDriver)business.getAmbulanceDriverDirectory().getUserByUserName(account.getUsername()));
    }
    
    
}
