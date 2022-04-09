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
public class MainSystem {
    ArrayList<Patient> masterPatientList;
    ArrayList<IncidentCase> masterIncidentCaseList;
    ArrayList<Reporter> masterReporterList;
    ArrayList<Laboratory> masterLaboratoryList;
    ArrayList<Pharmacy> masterPharmacyList;
    ArrayList<PoliceStation> masterPoliceStationList;

    public MainSystem() {
        masterPatientList = new ArrayList<>();
        masterIncidentCaseList = new ArrayList<>();
        masterReporterList = new ArrayList<>();
        masterLaboratoryList = new ArrayList<>();
        masterPharmacyList = new ArrayList<>();
    }

    public ArrayList<Patient> getMasterPatientList() {
        return masterPatientList;
    }

    public ArrayList<IncidentCase> getMasterIncidentCaseList() {
        return masterIncidentCaseList;
    }

    public ArrayList<Reporter> getMasterReporterList() {
        return masterReporterList;
    }

    public ArrayList<Laboratory> getMasterLaboratoryList() {
        return masterLaboratoryList;
    }

    public ArrayList<Pharmacy> getMasterPharmacyList() {
        return masterPharmacyList;
    }

    public ArrayList<PoliceStation> getMasterPoliceStationList() {
        return masterPoliceStationList;
    }
}