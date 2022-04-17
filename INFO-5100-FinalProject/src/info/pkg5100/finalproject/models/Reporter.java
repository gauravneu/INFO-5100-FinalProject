package info.pkg5100.finalproject.models;

public class Reporter {
    String reporterName;
    String phone;

    public Reporter() {
        this.reporterName = "";
        this.phone = "";
    }

    public Reporter(String reporterName, String phone) {
        this.reporterName = reporterName;
        this.phone = phone;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
