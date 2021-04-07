/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

import Business.Voluntary.CampAdmin;

/**
 *
 * @author sayalimahajan
 */
public class PrivateDriver {
    
    private String driverFirstName;
    private String driverLastName;
    private CampAdmin associatedCampAdmin;
    private int age;
    private String phoneNumber;
    private String privateVehicleNumber;
    private boolean isAuthorized;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getDriverFirstName() {
        return driverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public CampAdmin getAssociatedCampAdmin() {
        return associatedCampAdmin;
    }

    public void setAssociatedCampAdmin(CampAdmin associatedCampAdmin) {
        this.associatedCampAdmin = associatedCampAdmin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPrivateVehicleNumber() {
        return privateVehicleNumber;
    }

    public void setPrivateVehicleNumber(String privateVehicleNumber) {
        this.privateVehicleNumber = privateVehicleNumber;
    }

    public boolean isIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }
    
    
}
