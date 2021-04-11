/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voluntary;

import Business.Hospital.Patient;
import java.util.ArrayList;

/**
 *
 * @author aishwarya
 */
public class CampAdmin {

    private String name;
    private String adminName;
    private String userName;
    private String street;
    private String city;
    private String zipCode;
    private String emailId;
    private String phoneNumber;
    private int capacity;
    private ArrayList<Patient> patientlist;

    public CampAdmin() {
        this.patientlist = new ArrayList<Patient>();
    }

    public CampAdmin(String name, String adminName, String userName, String street, String city, String zipCode, String emailId, String phoneNumber, int bedCount) {
        this.name = name;
        this.adminName = adminName;
        this.userName = userName;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.capacity = bedCount;
        this.patientlist = new ArrayList<Patient>();
    }

    public void assignPatientABed(Patient patient) {
        patientlist.add(patient);
    }

    public void releasePatient(Patient patient) {
        patientlist.remove(patient);
    }

    public boolean isBedAvailable() {
        if (capacity <= patientlist.size()) {
            return false;
        } else {
            return true;
        }
    }

    public int getAvailableBedCount() {
        return capacity - patientlist.size();
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }

}
