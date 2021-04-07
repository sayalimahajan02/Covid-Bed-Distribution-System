/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PatientCareStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Gayatri
 */
public class PatientCareStaffOrganization extends Organization{

    public PatientCareStaffOrganization() {
        super(Organization.Type.PatientCareStaff.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientCareStaffRole());
        return roles;
    }
    
}
