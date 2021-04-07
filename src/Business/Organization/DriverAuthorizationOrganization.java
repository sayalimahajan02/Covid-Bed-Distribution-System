/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DriverAuthorizationAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Gayatri
 */
public class DriverAuthorizationOrganization extends Organization{

    public DriverAuthorizationOrganization() {
        super(Organization.Type.DriverAuthorization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DriverAuthorizationAdminRole());
        return roles;
    }
     
    
}
