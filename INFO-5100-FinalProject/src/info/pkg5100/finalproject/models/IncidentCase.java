 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.models;

import java.util.ArrayList;

/**
 *
 * @author ankit
 */
public class IncidentCase {
    ArrayList<Patient> patientArrayList;
    String status;
    String investigationDetails;
    String hospitalName;
    Reporter reporter;
    String incidentDescription;
    String policeStationNetworkName;
    InvestigationPolice investigationPolice;
    String photoURL;


    public IncidentCase(ArrayList<Patient> patientArrayList, String status, String investigationDetails, String hospitalName, Reporter reporter, String incidentDescription, String policeStationNetworkName, InvestigationPolice investigationPolice, String photoURL) {
        this.patientArrayList = patientArrayList;
        this.status = status;
        this.investigationDetails = investigationDetails;
        this.hospitalName = hospitalName;
        this.reporter = reporter;
        this.incidentDescription = incidentDescription;
        this.policeStationNetworkName = policeStationNetworkName;
        this.investigationPolice = investigationPolice;
        this.photoURL = photoURL;
    }


    public ArrayList<Patient> getPatientArrayList() {
        return patientArrayList;
    }

    public void setPatientArrayList(ArrayList<Patient> patientArrayList) {
        this.patientArrayList = patientArrayList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInvestigationDetails() {
        return investigationDetails;
    }

    public void setInvestigationDetails(String investigationDetails) {
        this.investigationDetails = investigationDetails;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public String getPoliceStationNetworkName() {
        return policeStationNetworkName;
    }

    public void setPoliceStationNetworkName(String policeStationNetworkName) {
        this.policeStationNetworkName = policeStationNetworkName;
    }

    public InvestigationPolice getInvestigationPolice() {
        return investigationPolice;
    }

    public void setInvestigationPolice(InvestigationPolice investigationPolice) {
        this.investigationPolice = investigationPolice;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    @Override
    public String toString() {
        return this.incidentDescription;
    }
}
