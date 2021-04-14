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
public class HospitalNgoDirectory {

    private ArrayList<HospitalNgoRequests> hospitalRequests;

    public ArrayList<HospitalNgoRequests> getHospitalRequests() {
        return hospitalRequests;
    }

    public HospitalNgoDirectory() {
        this.hospitalRequests = new ArrayList<HospitalNgoRequests>();
    }

    public void setHospitalRequests(ArrayList<HospitalNgoRequests> hospitalRequests) {
        this.hospitalRequests = hospitalRequests;
    }

    public HospitalNgoRequests addHospitalRequests(HospitalNgoRequests requests) {
        requests.setId(generateID());
        this.hospitalRequests.add(requests);
        return requests;
    }

    public void removeHospitalRequests(HospitalNgoRequests requests) {
        hospitalRequests.remove(requests);
    }

    public int generateID() {
        return hospitalRequests.size() + 1;
    }

    public HospitalNgoRequests findRequestByID(int id) {
        for (HospitalNgoRequests req : hospitalRequests) {
            if (req.getId() == id) {
                return req;
            }
        }
        return null;
    }

    public HospitalNgoRequests getHospitalRequestByNGO(NGO ngo) {
        for (HospitalNgoRequests req : hospitalRequests) {
            if (req.getNgo() == ngo) {
                return req;
            }
        }
        return null;
    }

}
