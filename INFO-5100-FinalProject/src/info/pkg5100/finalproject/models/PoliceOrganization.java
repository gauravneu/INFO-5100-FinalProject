package info.pkg5100.finalproject.models;

import java.util.ArrayList;

public class PoliceOrganization {

    ArrayList<PoliceStation> policeStationArrayList;
    ArrayList<IncidentCase> incidentCaseArrayList;
    String networkName;

    public PoliceOrganization(String networkName) {
        this.policeStationArrayList = new ArrayList<>();
        this.incidentCaseArrayList = new ArrayList<>();
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

    public ArrayList<IncidentCase> getIncidentCaseArrayList() {
        return incidentCaseArrayList;
    }

    public void setIncidentCaseArrayList(ArrayList<IncidentCase> incidentCaseArrayList) {
        this.incidentCaseArrayList = incidentCaseArrayList;
    }
}
