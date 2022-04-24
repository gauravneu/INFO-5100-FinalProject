 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.models;

 /**
 *
 * @author ankit
 */
public class IncidentCase {
    int id;
    String status;
    String investigationDetails;
    int orgId;
    String orgType;
    int investigationPoliceId;
    String reporterPhone;
    String photoUrl;
    String location;
    String description;
    int currentcasehandlinguserid;
    String hospitalCaseAccepted;
    int hospitalId;
    String ambulancetaskcompleted;

    public IncidentCase() {
        this.id = -1;
        this.status = "";
        this.investigationDetails = "";
        this.orgId = -1;
        this.orgType = "";
        this.investigationPoliceId = -1;
        this.reporterPhone = "";
        this.photoUrl = "";
        this.location = "";
        this.description = "";
        this.currentcasehandlinguserid = -1;
        this.hospitalCaseAccepted = "";
        this.hospitalId = -1;
        this.ambulancetaskcompleted = "";
    }

    public IncidentCase(int id, String status, String investigationDetails, int orgId, String orgType,
                        int investigationPoliceId, String reporterPhone, String photoUrl, String location,
                        String description, int currentcasehandlinguserid, String hospitalCaseAccepted, int hospitalId,
                        String ambulancetaskcompleted) {
        this.id = id;
        this.status = status;
        this.investigationDetails = investigationDetails;
        this.orgId = orgId;
        this.orgType = orgType;
        this.investigationPoliceId = investigationPoliceId;
        this.reporterPhone = reporterPhone;
        this.photoUrl = photoUrl;
        this.location = location;
        this.description = description;
        this.currentcasehandlinguserid = currentcasehandlinguserid;
        this.hospitalCaseAccepted = hospitalCaseAccepted;
        this.hospitalId = hospitalId;
        this.ambulancetaskcompleted = ambulancetaskcompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public int getInvestigationPoliceId() {
        return investigationPoliceId;
    }

    public void setInvestigationPoliceId(int investigationPoliceId) {
        this.investigationPoliceId = investigationPoliceId;
    }

    public String getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(String reporterPhone) {
        this.reporterPhone = reporterPhone;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }

     public int getCurrentcasehandlinguserid() {
         return currentcasehandlinguserid;
     }

     public void setCurrentcasehandlinguserid(int currentcasehandlinguserid) {
         this.currentcasehandlinguserid = currentcasehandlinguserid;
     }

     public String getHospitalCaseAccepted() {
         return hospitalCaseAccepted;
     }

     public void setHospitalCaseAccepted(String hospitalCaseAccepted) {
         this.hospitalCaseAccepted = hospitalCaseAccepted;
     }

     public int getHospitalId() {
         return hospitalId;
     }

     public void setHospitalId(int hospitalId) {
         this.hospitalId = hospitalId;
     }

     public String getAmbulancetaskcompleted() {
         return ambulancetaskcompleted;
     }

     public void setAmbulancetaskcompleted(String ambulancetaskcompleted) {
         this.ambulancetaskcompleted = ambulancetaskcompleted;
     }

     @Override
     public String toString() {
         return Integer.toString(this.id);
     }
 }
