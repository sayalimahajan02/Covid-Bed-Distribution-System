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
    
}
