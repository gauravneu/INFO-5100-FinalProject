package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.VitalSigns;

import java.sql.SQLException;
import java.util.List;

public interface VitalSignsDao {
    public int add(VitalSigns vitalSigns)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public List<VitalSigns> getVitalSignsByPatientId(int patientId)
            throws SQLException;
    public VitalSigns getVitalSignsById(int id)
            throws SQLException;
    public void update(VitalSigns vitalSigns)
            throws SQLException;
}
