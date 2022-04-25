package info.pkg5100.finalproject.models;

public class PharmacyRequest {
    int id;
    int patientId;
    String pharmacyRequest;
    String status;
    int pharmacyId;

    public PharmacyRequest(int id, int patientId, String pharmacyRequest, String status, int pharmacyId) {
        this.id = id;
        this.patientId = patientId;
        this.pharmacyRequest = pharmacyRequest;
        this.status = status;
        this.pharmacyId = pharmacyId;
    }

    public PharmacyRequest() {
        this.id = -1;
        this.patientId = -1;
        this.pharmacyRequest = "";
        this.status = "";
        this.pharmacyId = -1;
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

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
