/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voluntary;

import Business.Hospital.Hospital;
import Business.Status;
import java.sql.Timestamp;

/**
 *
 * @author aishwarya
 */
public class HospitalNgoRequests {

    private Hospital hospital;
    private NGO ngo;
    private Status status;
    private CampAdmin campAdmin;
    private Timestamp requestTime;
    private int requiredBeds;
    private int id;

    public HospitalNgoRequests(Hospital hospital, Status status, int requiredBeds) {
        this.hospital = hospital;
        this.status = status;
        this.requiredBeds = requiredBeds;
        this.requestTime = new Timestamp(System.currentTimeMillis());
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public NGO getNgo() {
        return ngo;
    }

    public void setNgo(NGO ngo) {
        this.ngo = ngo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public CampAdmin getCampAdmin() {
        return campAdmin;
    }

    public void setCampAdmin(CampAdmin campAdmin) {
        this.campAdmin = campAdmin;
    }

    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }

    public int getRequiredBeds() {
        return requiredBeds;
    }

    public void setRequiredBeds(int requiredBeds) {
        this.requiredBeds = requiredBeds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
