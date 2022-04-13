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
	String patientId;
	String name;
	String age;
	String phoneNumber;
	String patientIssue;
	String patientStatus;
	ArrayList<LabTest> labTestArrayList;

	public Patient(String patientId, String name, String age, String phoneNumber) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.patientIssue = "";
		this.patientStatus = "";
		this.labTestArrayList = new ArrayList<>();
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
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

	public ArrayList<LabTest> getLabTestArrayList() {
		return labTestArrayList;
	}

	public void setLabTestArrayList(ArrayList<LabTest> labTestArrayList) {
		this.labTestArrayList = labTestArrayList;
	}

	@Override
	public String toString() {
		return this.patientId;
	}
}
