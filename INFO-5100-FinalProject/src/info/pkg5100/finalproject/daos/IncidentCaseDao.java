package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.models.IncidentCase;

import java.sql.SQLException;
import java.util.List;

public interface IncidentCaseDao {
    public int add(IncidentCase incidentCase)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public IncidentCase getIncidentCaseById(int id)
            throws SQLException;
    public List<IncidentCase> getIncidentCases()
            throws SQLException;
    public List<IncidentCase> getIncidentCasesByLocation(String location)
            throws SQLException;
    public void update(IncidentCase incidentCase)
            throws SQLException;
}
