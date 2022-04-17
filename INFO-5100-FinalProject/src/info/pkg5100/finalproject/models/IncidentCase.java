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
    }

    public IncidentCase(int id, String status, String investigationDetails, int orgId, String orgType, int investigationPoliceId, String reporterPhone, String photoUrl, String location) {
        this.id = id;
        this.status = status;
        this.investigationDetails = investigationDetails;
        this.orgId = orgId;
        this.orgType = orgType;
        this.investigationPoliceId = investigationPoliceId;
        this.reporterPhone = reporterPhone;
        this.photoUrl = photoUrl;
        this.location = location;
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
}
