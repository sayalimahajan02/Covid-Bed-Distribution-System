/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author aishwarya
 */
public enum Status {
    New("New"),
    Pending("Pending"),
    Approved("Approved"),
    Allocation("Allocation"),
    Allocated("Allocated"),
    InProgress("InProgress"),
    PatientPickup("Patient Pickup"),
    PatientDrop("Patient Drop"),
    AssignToMe("Assign To Me"),
    Completed("Completed");

    private final String value;

    private Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
