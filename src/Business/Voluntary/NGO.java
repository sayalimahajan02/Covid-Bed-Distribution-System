/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voluntary;

import java.util.ArrayList;

/**
 *
 * @author aishwarya
 */
public class NGO {

    private String name;
    private String adminName;
    private String userName;
    private String street;
    private String city;
    private String zipCode;
    private String emailId;
    private String phoneNumber;
    private int bedCount;
    private ArrayList<CampAdmin> campadminlist;

    public NGO() {
        this.campadminlist = new ArrayList<CampAdmin>();
    }

    public NGO(String name, String adminName, String userName, String street, String city, String zipCode, String emailId, String phoneNumber, int bedCount) {
        this.name = name;
        this.adminName = adminName;
        this.userName = userName;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.bedCount = bedCount;
        this.campadminlist = new ArrayList<CampAdmin>();
    }

    public void addCampAdmin(CampAdmin campAdmin) {
        campadminlist.add(campAdmin);
    }

    public void REMOVECampAdmin(CampAdmin campAdmin) {
        campadminlist.add(campAdmin);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public ArrayList<CampAdmin> getCampadminlist() {
        return campadminlist;
    }

    public void setCampadminlist(ArrayList<CampAdmin> campadminlist) {
        this.campadminlist = campadminlist;
    }

}
