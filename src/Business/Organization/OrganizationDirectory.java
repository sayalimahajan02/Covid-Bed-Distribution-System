/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.HospitalAdmin.getValue())) {
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PatientCareStaff.getValue())) {
            organization = new PatientCareStaffOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGOAdmin.getValue())) {
            organization = new NGOOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CampAdmin.getValue())) {
            organization = new CampAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AmbulanceDriver.getValue())) {
            organization = new AmbulanceDriverOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PrivateDriver.getValue())) {
            organization = new PrivateDriverOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PatientAuthorization.getValue())) {
            organization = new PatientAuthorizationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DriverAuthorization.getValue())) {
            organization = new DriverAuthorizationOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
