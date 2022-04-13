package info.pkg5100.finalproject.models;

import java.util.ArrayList;

public class TransportationOrganization {
    ArrayList<AmbulanceService> ambulanceServiceArrayList;
    String networkName;

    public TransportationOrganization(String networkName) {
        this.ambulanceServiceArrayList = new ArrayList<>();
        this.networkName = networkName;
    }

    public ArrayList<AmbulanceService> getAmbulanceServiceArrayList() {
        return ambulanceServiceArrayList;
    }

    public void setAmbulanceServiceArrayList(ArrayList<AmbulanceService> ambulanceServiceArrayList) {
        this.ambulanceServiceArrayList = ambulanceServiceArrayList;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
}
