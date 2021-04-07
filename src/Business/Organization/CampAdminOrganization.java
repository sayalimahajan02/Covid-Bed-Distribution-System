/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CampAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aishwarya
 */
public class CampAdminOrganization extends Organization {

    public CampAdminOrganization() {
        super(Organization.Type.CampAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CampAdminRole());
        return roles;
    }

}
