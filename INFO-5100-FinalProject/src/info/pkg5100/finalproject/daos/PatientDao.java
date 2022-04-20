package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Patient;

import java.sql.SQLException;
import java.util.List;

public interface PatientDao {
    public int add(Patient patient)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public Patient getPatientById(int id)
            throws SQLException;
    public List<Patient> getPatients()
            throws SQLException;
    public List<Patient> getPatientsByIncidentCaseId(int incidentCaseId)
            throws SQLException;
    public List<Patient> getPatientsByHospitalId(int hospitalId)
            throws SQLException;
    public List<Patient> getPatientsByHospitalIdAndDoctorId(int hospitalId, int doctorId)
            throws SQLException;
    public void update(Patient patient)
            throws SQLException;
}
