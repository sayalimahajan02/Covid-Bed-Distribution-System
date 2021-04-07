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
}
