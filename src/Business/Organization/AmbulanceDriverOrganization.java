/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AmbulanceDriverRole;
import Business.Role.PrivateDriverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sayalimahajan
 */
public class AmbulanceDriverOrganization extends Organization{
    public AmbulanceDriverOrganization() {
        super(Organization.Type.AmbulanceDriver.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AmbulanceDriverRole());
        return roles;
    }
}
