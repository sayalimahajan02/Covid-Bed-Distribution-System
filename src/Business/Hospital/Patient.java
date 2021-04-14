/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Driver.AmbulanceDriver;
import Business.Driver.PrivateDriver;
import Business.Status;
import Business.Voluntary.CampAdmin;

/**
 *
 * @author Yash
 */
public class Patient {
   
    
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String streetaddress;
    private String city;
    private String zipcode;
    private String email;
    private String username;
    private String password;
    private String path;
    private Status status;
    private String patientstatus = status.New.getValue();
    private String emergencycontact;
    private int patientID;
    private Hospital hospital;
    private CampAdmin campadmin;
    private AmbulanceDriver ambulancedriver;
    private PatientCareStaff patientcarestaff;
    private PrivateDriver privatedriver;

    
    
    
    public Patient(Hospital hospital, CampAdmin campadmin, AmbulanceDriver ambulancedriver, PatientCareStaff patientcarestaff, PrivateDriver privatedriver) {
        this.hospital = hospital;
        this.campadmin = campadmin;
        this.ambulancedriver = ambulancedriver;
        this.patientcarestaff = patientcarestaff;
        this.privatedriver = privatedriver;
       
    }
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }
    
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public CampAdmin getCampadmin() {
        return campadmin;
    }

    public void setCampadmin(CampAdmin campadmin) {
        this.campadmin = campadmin;
    }

    public AmbulanceDriver getAmbulancedriver() {
        return ambulancedriver;
    }

    public void setAmbulancedriver(AmbulanceDriver ambulancedriver) {
        this.ambulancedriver = ambulancedriver;
    }

    public PatientCareStaff getPatientcarestaff() {
        return patientcarestaff;
    }

    public void setPatientcarestaff(PatientCareStaff patientcarestaff) {
        this.patientcarestaff = patientcarestaff;
    }
    
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    public String getPatientstatus() {
        return patientstatus;
    }

    public void setPatientstatus(String patientstatus) {
        this.patientstatus = patientstatus;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public PrivateDriver getPrivatedriver() {
        return privatedriver;
    }

    public void setPrivatedriver(PrivateDriver privatedriver) {
        this.privatedriver = privatedriver;
    }

    
}
    
    

