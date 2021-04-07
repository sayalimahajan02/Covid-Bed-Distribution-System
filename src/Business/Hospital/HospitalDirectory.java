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
public class HospitalDirectory {
  
    private ArrayList<Hospital> HospitalDirectory;
    
    public HospitalDirectory() {
        
        HospitalDirectory = new ArrayList();
  
}

    public ArrayList<Hospital> getHospitalDirectory() {
        return HospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
    }
    
    public Hospital addHospital(String name, String email, String phonenumber, String address, String username, int beds){
        Hospital hospital = new Hospital(name, email, phonenumber, address, username, beds);
        HospitalDirectory.add(hospital);
        return hospital;
    }
    
    public void removeHospital(Hospital hospital){
        HospitalDirectory.remove(hospital);
    }
    
    public Hospital getHospitalByName(String name){ 
        for(Hospital hospital: HospitalDirectory){
            if(hospital.getName().equalsIgnoreCase(name)){
                return hospital;
            }
        }
        return null;
    }
    
}
