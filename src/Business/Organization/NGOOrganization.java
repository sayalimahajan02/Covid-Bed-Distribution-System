/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NGORole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aishwarya
 */
public class NGOOrganization extends Organization {

    public NGOOrganization() {
        super(Organization.Type.NGOAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGORole());
        return roles;
    }
   
}
