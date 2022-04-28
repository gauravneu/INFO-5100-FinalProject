package info.pkg5100.finalproject.models;

public class PharmacyRequest {
    int id;
    int patientId;
    String pharmacyRequest;
    String status;
    String pharmacyResponse;
    int pharmacyId;
    String network;
    int employeeid;

    public PharmacyRequest(int id, int patientId, String pharmacyRequest, String status, int pharmacyId, String network, int employeeid,String pharmacyResponse) {
        this.id = id;
        this.patientId = patientId;
        this.pharmacyRequest = pharmacyRequest;
        this.status = status;
        this.pharmacyId = pharmacyId;
        this.network = network;
        this.employeeid = employeeid;
        this.pharmacyResponse = pharmacyResponse;
    }

    public PharmacyRequest() {
        this.id = -1;
        this.patientId = -1;
        this.pharmacyRequest = "";
        this.status = "";
        this.pharmacyId = -1;
        this.network = "";
        this.employeeid = -1;
        this.pharmacyResponse = "";
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

    public String getPharmacyRequest() {
        return pharmacyRequest;
    }

    public void setPharmacyRequest(String pharmacyRequest) {
        this.pharmacyRequest = pharmacyRequest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getPharmacyResponse() {
        return pharmacyResponse;
    }

    public void setPharmacyResponse(String pharmacyResponse) {
        this.pharmacyResponse = pharmacyResponse;
    }

    
    
    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
