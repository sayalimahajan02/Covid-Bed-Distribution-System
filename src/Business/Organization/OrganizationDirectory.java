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
            organization.setType(type);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PatientCareStaff.getValue())) {
            organization = new PatientCareStaffOrganization();
            organization.setType(type);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGOAdmin.getValue())) {
            organization = new NGOOrganization();
            organization.setType(type);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CampAdmin.getValue())) {
            organization = new CampAdminOrganization();
            organization.setType(type);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AmbulanceDriver.getValue())) {
            organization = new AmbulanceDriverOrganization();
            organization.setType(type);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PrivateDriver.getValue())) {
            organization = new PrivateDriverOrganization();
            organization.setType(type);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PatientAuthorization.getValue())) {
            organization = new PatientAuthorizationOrganization();
            organization.setType(type);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DriverAuthorization.getValue())) {
            organization = new DriverAuthorizationOrganization();
            organization.setType(type);
            organizationList.add(organization);
        }
        return organization;
    }
}
