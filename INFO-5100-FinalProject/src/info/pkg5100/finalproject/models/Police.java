package info.pkg5100.finalproject.models;

import java.util.ArrayList;

public class Police {
    String name;
    String role;
    PoliceStation policeStation;
    ArrayList<IncidentCase> incidentCaseArrayList;

    public Police(String name, String role, PoliceStation policeStation, ArrayList<IncidentCase> incidentCaseArrayList) {
        this.name = name;
        this.role = role;
        this.policeStation = policeStation;
        this.incidentCaseArrayList = incidentCaseArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public PoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public ArrayList<IncidentCase> getIncidentCaseArrayList() {
        return incidentCaseArrayList;
    }
}
