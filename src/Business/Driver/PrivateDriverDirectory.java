/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

import java.util.ArrayList;

/**
 *
 * @author sayalimahajan
 */
public class PrivateDriverDirectory {
    ArrayList<PrivateDriver> privateDriverDirectory;

    public PrivateDriverDirectory(){
        this.privateDriverDirectory= new ArrayList<PrivateDriver>();
    }

    public ArrayList<PrivateDriver> getPrivateDriverDirectory() {
        return privateDriverDirectory;
    }

    public void setPrivateDriverDirectory(ArrayList<PrivateDriver> privateDriverDirectory) {
        this.privateDriverDirectory = privateDriverDirectory;
    }
    
    public void add(PrivateDriver privateDriver){
        privateDriverDirectory.add(privateDriver);
    }
    
    public PrivateDriver getUserByFullName(String fullName)
    {
        PrivateDriver selectedDriver=new PrivateDriver();
        for(PrivateDriver pd : this.privateDriverDirectory){
            if((pd.getDriverLastName()+", "+pd.getDriverFirstName()).equalsIgnoreCase(fullName)){
                selectedDriver=pd;
                break;
            }
        }
        return selectedDriver;
    }
    
}
