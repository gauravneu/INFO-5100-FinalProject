/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.models;

import java.util.Date;

/**
 *
 * @author gaurav
 */
public class VitalSigns {

    private int id;
    private int patientId;
    private int bloodPressure;
    private int glucoseLevel;
    private int bodyTemp;
    private int respirationRate;
    private int oxygenSaturation;
    private String painLevel;
    Date date;

    public VitalSigns(int id, int patientId, int bloodPressure, int glucoseLevel, int bodyTemp,  int respirationRate, int oxygenSaturation, String painLevel, Date date) {
        this.id = id;
        this.patientId = patientId;
        this.bloodPressure = bloodPressure;
        this.glucoseLevel = glucoseLevel;
        this.bodyTemp = bodyTemp;
        this.respirationRate = respirationRate;
        this.oxygenSaturation = oxygenSaturation;
        this.painLevel = painLevel;
        this.date = date;
    }

    public VitalSigns() {
        this.id = -1;
        this.patientId = -1;
        this.bloodPressure = -1;
        this.glucoseLevel = -1;
        this.bodyTemp = -1;
        this.respirationRate = -1;
        this.oxygenSaturation = -1;
        this.painLevel = "";
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getGlucoseLevel() {
        return glucoseLevel;
    }

    public void setGlucoseLevel(int glucoseLevel) {
        this.glucoseLevel = glucoseLevel;
    }

    public int getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(int bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(int oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }


    public String getPainLevel() {
        return painLevel;
    }

    public void setPainLevel(String painLevel) {
        this.painLevel = painLevel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }

}
