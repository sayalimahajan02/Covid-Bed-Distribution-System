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
    
    public PatientCareStaff addPatientCareStaff(PatientCareStaff patientcarestaff){
     
        PatientCareStaffDirectory.add(patientcarestaff);
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
    
}
