/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author Yash
 */
public class PatientCareStaff {
   
    
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;
    private String username;
    private String password;
    private int PatientcarestaffID;
    private Hospital hospital; 
    private boolean availability = true;


    
    public PatientCareStaff(Hospital hospital, Patient patient) {
       this.hospital = hospital;
      
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
    
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public int getPatientcarestaffID() {
        return PatientcarestaffID;
    }

    public void setPatientcarestaffID(int PatientcarestaffID) {
        this.PatientcarestaffID = PatientcarestaffID;
    }
}
    
    

