/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.models;

import java.util.ArrayList;

/**
 *
 * @author ankita
 */
public class Patient {

    int id;
    String name;
    String age;
    String phoneNumber;
    String patientIssue;
    String patientStatus;
    int incidentCaseId;
    String labRequested;
    String pharmacyRequested;
    int hospitalId;
    int doctorId;
    String location;
    String isConvicted;
    int housingPeriod;
    int detentionPeriod;
    int investigationpoliceid;
    int housingid;
    int detentionid;

    public Patient() {
        this.id = -1;
        this.name = "";
        this.age = "";
        this.phoneNumber = "";
        this.patientIssue = "";
        this.patientStatus = "";
        this.incidentCaseId = -1;
        this.labRequested = "";
        this.pharmacyRequested = "";
        this.hospitalId = -1;
        this.doctorId = -1;
        this.location = "";
        this.isConvicted = "";
        this.housingPeriod = -1;
        this.detentionPeriod = -1;
        this.investigationpoliceid = -1;
        this.housingid = -1;
        this.detentionid = -1;
    }

    public Patient(int id, String name, String age, String phoneNumber,
            String patientIssue, String patientStatus, int incidentCaseId,
            String labRequested, String pharmacyRequested, int hospitalId,
            int doctorId, String location, String isConvicted, int housingPeriod,
            int detentionPeriod, int investigationpoliceid, int housingid, int detentionid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.patientIssue = patientIssue;
        this.patientStatus = patientStatus;
        this.incidentCaseId = incidentCaseId;
        this.labRequested = labRequested;
        this.pharmacyRequested = pharmacyRequested;
        this.hospitalId = hospitalId;
        this.doctorId = doctorId;
        this.location = location;
        this.isConvicted = isConvicted;
        this.housingPeriod = housingPeriod;
        this.detentionPeriod = detentionPeriod;
        this.investigationpoliceid = investigationpoliceid;
        this.housingid = housingid;
        this.detentionid = detentionid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPatientIssue() {
        return patientIssue;
    }

    public void setPatientIssue(String patientIssue) {
        this.patientIssue = patientIssue;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public int getIncidentCaseId() {
        return incidentCaseId;
    }

    public void setIncidentCaseId(int incidentCaseId) {
        this.incidentCaseId = incidentCaseId;
    }

    public String getLabRequested() {
        return labRequested;
    }

    public void setLabRequested(String labRequested) {
        this.labRequested = labRequested;
    }

    public String getPharmacyRequested() {
        return pharmacyRequested;
    }

    public void setPharmacyRequested(String pharmacyRequested) {
        this.pharmacyRequested = pharmacyRequested;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsConvicted() {
        return isConvicted;
    }

    public void setIsConvicted(String isConvicted) {
        this.isConvicted = isConvicted;
    }

    public int getHousingPeriod() {
        return housingPeriod;
    }

    public void setHousingPeriod(int housingPeriod) {
        this.housingPeriod = housingPeriod;
    }

    public int getDetentionPeriod() {
        return detentionPeriod;
    }

    public void setDetentionPeriod(int detentionPeriod) {
        this.detentionPeriod = detentionPeriod;
    }

    public int getInvestigationpoliceid() {
        return investigationpoliceid;
    }

    public void setInvestigationpoliceid(int investigationpoliceid) {
        this.investigationpoliceid = investigationpoliceid;
    }

    public int getHousingid() {
        return housingid;
    }

    public void setHousingid(int housingid) {
        this.housingid = housingid;
    }

    public int getDetentionid() {
        return detentionid;
    }

    public void setDetentionid(int detentionid) {
        this.detentionid = detentionid;
    }
    
    

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
