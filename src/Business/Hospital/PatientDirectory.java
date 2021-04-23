/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Voluntary.CampAdmin;
import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class PatientDirectory {

    private ArrayList<Patient> PatientDirectory;

    public PatientDirectory() {

        PatientDirectory = new ArrayList<Patient>();

    }

    public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }

    public int generateID() {
        return PatientDirectory.size() + 1;
    }

    public Patient addPatient(Patient patient) {

        patient.setPatientID(generateID());
        this.PatientDirectory.add(patient);
        return patient;
    }

    public void removePatient(Patient patient) {
        PatientDirectory.remove(patient);
    }

    public Patient getPatientByUsername(String name) {
        for (Patient patient : PatientDirectory) {
            if (patient.getUsername().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }

    public Patient getPatientByID(int patientID) {
        for (Patient patient : PatientDirectory) {
            if (patient.getPatientID() == patientID) {
                return patient;
            }

        }
        return null;
    }

    public int getPatientsRequestsByCamp(CampAdmin ca) {
        int count = 0;
        for (Patient p : PatientDirectory) {
            if (p.getCampadmin() != null && p.getPatientstatus() == "Allocation") {
                if (p.getCampadmin().equals(ca)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getPatientsRequestsByHospital(Hospital h) {
        int count = 0;
        for (Patient p : PatientDirectory) {
            if (p.getHospital() != null && p.getPatientstatus() == "Allocation") {
                if (p.getHospital().equals(h)) {
                    count++;
                }
            }
        }
        return count;
    }

}
