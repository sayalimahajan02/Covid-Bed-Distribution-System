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
public class PatientCareStaffDirectory {
  
    private ArrayList<PatientCareStaff> PatientCareStaffDirectory;
    
    public PatientCareStaffDirectory() {
        
        PatientCareStaffDirectory = new ArrayList<PatientCareStaff>();
   
}
    public ArrayList<PatientCareStaff> getPatientCareStaffDirectory() {
        return PatientCareStaffDirectory;
    }

    public void setPatientCareStaffDirectory(ArrayList<PatientCareStaff> PatientCareStaffDirectory) {
        this.PatientCareStaffDirectory = PatientCareStaffDirectory;
    }
    
    public int generateID() {
        return PatientCareStaffDirectory.size() + 1;
    }
    
    public PatientCareStaff addPatientCareStaff(PatientCareStaff patientcarestaff){
     
        patientcarestaff.setPatientcarestaffID(generateID());
        this.PatientCareStaffDirectory.add(patientcarestaff);
        return patientcarestaff;
    }
    
    public void removePatientCareStaff(PatientCareStaff patientcarestaff){
        PatientCareStaffDirectory.remove(patientcarestaff);
    }
    
    public PatientCareStaff getPatientCareStaffByUsername(String name){ 
        for(PatientCareStaff patientcarestaff: PatientCareStaffDirectory){
            if(patientcarestaff.getUsername().equalsIgnoreCase(name)){
                return patientcarestaff;
            }
        }
        return null;
    }
    
    public PatientCareStaff getPatientByID(int patientcarestaffID){ 
        for(PatientCareStaff patientcarestaff: PatientCareStaffDirectory){
            if (patientcarestaff.getPatientcarestaffID() == patientcarestaffID) {
                return patientcarestaff;
        }
        
    }
        return null;
 }
    
}
