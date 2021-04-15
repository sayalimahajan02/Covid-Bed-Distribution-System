/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Authorization;

import Business.Driver.AmbulanceDriver;
import java.util.ArrayList;

/**
 *
 * @author sayalimahajan
 */
public class DriverAuthorizationDirectory {
    ArrayList<DriverAuthorizationAdmin> driverAuthorizationDirectory;

    public DriverAuthorizationDirectory() {
    driverAuthorizationDirectory=new ArrayList<DriverAuthorizationAdmin>();
    }

    public ArrayList<DriverAuthorizationAdmin> getDriverAuthorizationDirectory() {
        return driverAuthorizationDirectory;
    }

    public void setDriverAuthorizationDirectory(ArrayList<DriverAuthorizationAdmin> driverAuthorizationDirectory) {
        this.driverAuthorizationDirectory = driverAuthorizationDirectory;
    }
    
    private void add(DriverAuthorizationAdmin newadmin){
        this.driverAuthorizationDirectory.add(newadmin);
    }
    
    public int generateId(){
        return this.driverAuthorizationDirectory.size()+1;
    }
    
       public DriverAuthorizationAdmin getUserByUserName(String uname)
    {
        DriverAuthorizationAdmin selectedAdmin=new DriverAuthorizationAdmin();
        for(DriverAuthorizationAdmin ad : this.driverAuthorizationDirectory){
            if(ad.getUserName().equalsIgnoreCase(uname)){
                selectedAdmin=ad;
                break;
            }
        }
        return selectedAdmin;
    }
    
}
