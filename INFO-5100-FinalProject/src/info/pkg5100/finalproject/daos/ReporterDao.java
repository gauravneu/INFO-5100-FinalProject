package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.IncidentCase;
import info.pkg5100.finalproject.models.Reporter;

import java.sql.SQLException;
import java.util.List;

public interface ReporterDao {
    public int add(Reporter reporter)
            throws SQLException;
    public void deleteByPhone(String phone)
            throws SQLException;
    public Reporter getReporterByPhone(String phone)
            throws SQLException;
    public List<Reporter> getReporters()
            throws SQLException;
    public void update(Reporter reporter)
            throws SQLException;
}
