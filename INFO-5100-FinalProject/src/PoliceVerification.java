
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gaurav
 */
class PoliceVerification {
    private int personID;
    private int policeStationId;
    private boolean verificatStatus;
    private final List<String> previousCriminalRecord;

    public PoliceVerification(int personID, int policeStationId, boolean verificatStatus) {
        this.personID = personID;
        this.policeStationId = policeStationId;
        this.verificatStatus = verificatStatus;
        this.previousCriminalRecord =  new ArrayList<>();
    }
    public void addPreviousCriminalRecord(String recordDetails){
        previousCriminalRecord.add(recordDetails);
    }
    
}
