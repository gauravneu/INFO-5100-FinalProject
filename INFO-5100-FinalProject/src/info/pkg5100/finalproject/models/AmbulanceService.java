package info.pkg5100.finalproject.models;

import java.util.ArrayList;

public class AmbulanceService {
    String ambulanceServiceName;
    String networkName;
    ArrayList<IncidentCase> incidentCaseArrayList;

    public AmbulanceService(String ambulanceServiceName, String networkName) {
        this.ambulanceServiceName = ambulanceServiceName;
        this.networkName = networkName;
        this.incidentCaseArrayList = new ArrayList<>();
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

    public ArrayList<IncidentCase> getIncidentCaseArrayList() {
        return incidentCaseArrayList;
    }

    public void setIncidentCaseArrayList(ArrayList<IncidentCase> incidentCaseArrayList) {
        this.incidentCaseArrayList = incidentCaseArrayList;
    }
}
