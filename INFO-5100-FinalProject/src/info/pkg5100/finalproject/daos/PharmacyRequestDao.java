package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.LabRequest;
import info.pkg5100.finalproject.models.PharmacyRequest;

import java.sql.SQLException;
import java.util.List;

public interface PharmacyRequestDao {
    public int add(PharmacyRequest pharmacyRequest)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public PharmacyRequest getPharmacyRequestById(int id)
            throws SQLException;
    public List<PharmacyRequest> getPharmacyRequests()
            throws SQLException;
    public List<PharmacyRequest> getPharmacyRequestsByPatientId(int patientId)
            throws SQLException;
    public List<PharmacyRequest> getPharmacyRequestsByPharmacyId(int PharmacyId)
            throws SQLException;
    public void update(PharmacyRequest pharmacyRequest)
            throws SQLException;
}
