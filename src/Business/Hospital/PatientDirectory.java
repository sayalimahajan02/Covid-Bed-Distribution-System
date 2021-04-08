/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class PatientDirectory {
  
    private ArrayList<Patient> PatientDirectory;
    
    public PatientDirectory() {
        
        PatientDirectory = new ArrayList<Patient>();
   
}

    public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }
    
    public Patient addPatient(Patient patient){
     
        PatientDirectory.add(patient);
        return patient;
    }
    
    public void removePatient(Patient patient){
        PatientDirectory.remove(patient);
    }
    
    public Patient getPatientByUsername(String name){ 
        for(Patient patient: PatientDirectory){
            if(patient.getUsername().equalsIgnoreCase(name)){
                return patient;
            }
        }
        return null;
    }
    
}
