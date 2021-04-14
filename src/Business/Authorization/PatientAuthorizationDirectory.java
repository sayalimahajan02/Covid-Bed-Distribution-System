/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Authorization;

import java.util.ArrayList;

/**
 *
 * @author sayalimahajan
 */
public class PatientAuthorizationDirectory {
    ArrayList<PatientAuthorizationAdmin> patientAuthorizationDirectory;
    public PatientAuthorizationDirectory() {
    patientAuthorizationDirectory=new ArrayList<PatientAuthorizationAdmin>();
    }

    public ArrayList<PatientAuthorizationAdmin> getPatientAuthorizationDirectory() {
        return patientAuthorizationDirectory;
    }

    public void setPatientAuthorizationDirectory(ArrayList<PatientAuthorizationAdmin> patientAuthorizationDirectory) {
        this.patientAuthorizationDirectory = patientAuthorizationDirectory;
    }
    
    private void add(PatientAuthorizationAdmin newadmin){
        this.patientAuthorizationDirectory.add(newadmin);
    }
    
    
    public int generateId(){
        return this.patientAuthorizationDirectory.size()+1;
    }
}
