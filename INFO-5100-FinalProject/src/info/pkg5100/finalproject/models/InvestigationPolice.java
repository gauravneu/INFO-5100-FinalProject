package info.pkg5100.finalproject.models;

import java.util.ArrayList;

public class InvestigationPolice extends Police {
    public InvestigationPolice(String name, String role, PoliceStation policeStation, ArrayList<IncidentCase> incidentCaseArrayList) {
        super(name, role, policeStation, incidentCaseArrayList);
    }

    // methods to handle criminal records
}
