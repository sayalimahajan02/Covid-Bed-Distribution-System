/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voluntary;

import java.util.ArrayList;

/**
 *
 * @author aishwarya
 */
public class NGODirectory {

    private ArrayList<NGO> ngoList;

    public ArrayList<NGO> getNGOList() {
        return ngoList;
    }

    public NGODirectory() {
        ngoList = new ArrayList<NGO>();
    }

    public NGO addNGO(NGO ngo) {
        ngoList.add(ngo);
        return ngo;
    }

    public void removeNGO(NGO ngo) {
        ngoList.remove(ngo);
    }

    public NGO getNGOByName(String name) {
        for (NGO ngo : ngoList) {
            if (ngo.getName().equals(name)) {
                return ngo;
            }
        }
        return null;
    }

    public NGO getNGOByUserName(String uname) {
        for (NGO ngo : ngoList) {
            if (ngo.getUserName().equals(uname)) {
                return ngo;
            }
        }
        return null;
    }
}
