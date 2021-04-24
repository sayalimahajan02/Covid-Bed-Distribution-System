package Business.Driver;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sayalimahajan
 */
public class AmbulanceDriverDirectory {
    
    ArrayList<AmbulanceDriver> ambulanceDriverDirectory;

    public AmbulanceDriverDirectory() {
        this.ambulanceDriverDirectory = new ArrayList<AmbulanceDriver>();
    }

    public ArrayList<AmbulanceDriver> getAmbulanceDriverDirectory() {
        return ambulanceDriverDirectory;
    }

    public void setAmbulanceDriverDirectory(ArrayList<AmbulanceDriver> ambulanceDriverDirectory) {
        this.ambulanceDriverDirectory = ambulanceDriverDirectory;
    }
    
    public void add(AmbulanceDriver ambulanceDriver){
        ambulanceDriverDirectory.add(ambulanceDriver);
    }
    
    public int generateId(){
        return this.ambulanceDriverDirectory.size()+1;
    }
    
      public AmbulanceDriver getUserById(int id)
    {
        AmbulanceDriver selectedDriver=new AmbulanceDriver();
        for(AmbulanceDriver ad : this.ambulanceDriverDirectory){
            if(ad.getId()==id){
                selectedDriver=ad;
                break;
            }
        }
        return selectedDriver;
    }
      
        public AmbulanceDriver getUserByUserName(String uname)
    {
        AmbulanceDriver selectedDriver=new AmbulanceDriver();
        for(AmbulanceDriver ad : this.ambulanceDriverDirectory){
            if(ad.getUserName().equalsIgnoreCase(uname)){
                selectedDriver=ad;
                break;
            }
        }
        return selectedDriver;
    }
}
