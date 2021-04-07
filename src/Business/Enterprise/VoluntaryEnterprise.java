/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CampAdminRole;
import Business.Role.NGORole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aishwarya
 */
public class VoluntaryEnterprise extends Enterprise {

    public VoluntaryEnterprise(String name) {
        super(name, EnterpriseType.Voluntary);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGORole());
        roles.add(new CampAdminRole());
        return roles;
    }

}
