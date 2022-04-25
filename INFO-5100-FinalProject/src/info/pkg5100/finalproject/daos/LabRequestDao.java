package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.models.LabRequest;

import java.sql.SQLException;
import java.util.List;

public interface LabRequestDao {
    public int add(LabRequest labRequest)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public LabRequest getLabRequestById(int id)
            throws SQLException;
    public List<LabRequest> getLabRequests()
            throws SQLException;
    public List<LabRequest> getLabRequestsByPatientId(int patientId)
            throws SQLException;
    public void update(LabRequest labRequest)
            throws SQLException;

}
