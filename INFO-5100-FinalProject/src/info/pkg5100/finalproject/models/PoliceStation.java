package info.pkg5100.finalproject.models;

import java.util.ArrayList;

public class PoliceStation {
    String policeStationName;
    String networkName;
    ArrayList<Police> policeArrayList;

    public PoliceStation(String policeStationName, String networkName) {
        this.policeStationName = policeStationName;
        this.networkName = networkName;
        this.policeArrayList = new ArrayList<>();
    }

    public String getPoliceStationName() {
        return policeStationName;
    }

    public void setPoliceStationName(String policeStationName) {
        this.policeStationName = policeStationName;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public ArrayList<Police> getPoliceArrayList() {
        return policeArrayList;
    }
}
