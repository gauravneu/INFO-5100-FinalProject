package info.pkg5100.finalproject.models;

public class LabRequest {

    int id;
    int patientId;
    String requestStatus;
    String testName;
    String testResult;
    int labId;
    String network;
    int employeeid;

    public LabRequest(int id, int patientId, String requestStatus, String testName, String testResult, int labId, String network, int employeeid) {
        this.id = id;
        this.patientId = patientId;
        this.requestStatus = requestStatus;
        this.testName = testName;
        this.testResult = testResult;
        this.labId = labId;
        this.network = network;
        this.employeeid = employeeid;
    }

    public LabRequest() {
        this.id = -1;
        this.patientId = -1;
        this.requestStatus = "";
        this.testName = "";
        this.testResult = "";
        this.labId = -1;
        this.network = "";
        this.employeeid = -1;
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

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
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

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
