package info.pkg5100.finalproject.models;

import java.util.ArrayList;

public class PoliceOrganization {

    ArrayList<PoliceStation> policeStationArrayList;
    String networkName;

    public PoliceOrganization(ArrayList<PoliceStation> policeStationArrayList, String networkName) {
        this.policeStationArrayList = policeStationArrayList;
        this.networkName = networkName;
    }

    public ArrayList<PoliceStation> getPoliceStationArrayList() {
        return policeStationArrayList;
    }

    public void setPoliceStationArrayList(ArrayList<PoliceStation> policeStationArrayList) {
        this.policeStationArrayList = policeStationArrayList;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
}
