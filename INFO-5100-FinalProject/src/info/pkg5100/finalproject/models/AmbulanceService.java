package info.pkg5100.finalproject.models;

public class AmbulanceService {
    String ambulanceServiceName;

    public AmbulanceService(String ambulanceServiceName) {
        this.ambulanceServiceName = ambulanceServiceName;
    }

    public String getAmbulanceServiceName() {
        return ambulanceServiceName;
    }

    public void setAmbulanceServiceName(String ambulanceServiceName) {
        this.ambulanceServiceName = ambulanceServiceName;
    }
}
