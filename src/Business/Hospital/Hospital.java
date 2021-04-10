/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yash
 */
public class Hospital {
   
    
    private String name;
    private String phonenumber;
    private String address;
    private String email;
    private String username;
    private int bedcount;
    private List<Patient> Patient;

 
    public Hospital(){
        this.Patient = new ArrayList<Patient>();
    }

    public Patient addPatient(Patient patient){
      
        Patient.add(patient);
        return patient;
    }
    
    public void removePatient(Patient patient){
        Patient.remove(patient);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getBedcount() {
        return bedcount;
    }

    public void setBedcount(int bedcount) {
        this.bedcount = bedcount;
    }

    public List<Patient> getPatient() {
        return Patient;
    }

    public void setPatient(List<Patient> Patient) {
        this.Patient = Patient;
    }
    
}
