package info.pkg5100.finalproject.models;

public class AmbulanceService {
    String ambulanceServiceName;
    String networkName;

    public AmbulanceService(String ambulanceServiceName, String networkName) {
        this.ambulanceServiceName = ambulanceServiceName;
        this.networkName = networkName;
    }

    public String getAmbulanceServiceName() {
        return ambulanceServiceName;
    }

    public void setAmbulanceServiceName(String ambulanceServiceName) {
        this.ambulanceServiceName = ambulanceServiceName;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
}
