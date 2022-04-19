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
	}
	public Patient(int id, String name, String age, String phoneNumber, String patientIssue, String patientStatus, int incidentCaseId, String labRequested, String pharmacyRequested, int hospitalId, int doctorId) {
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

	@Override
	public String toString() {
		return Integer.toString(this.id);
	}
}
