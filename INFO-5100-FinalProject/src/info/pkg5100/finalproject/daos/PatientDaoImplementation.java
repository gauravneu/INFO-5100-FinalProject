package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.EnterpriseAdmin;
import info.pkg5100.finalproject.models.Patient;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDaoImplementation implements PatientDao{
    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(Patient patient) throws SQLException {
        String query
                = "insert into patients(id, name, age, phone, issue, status, incidentcaseid, labrequested, pharmacyrequested, hospitalid)"
                + "VALUES (?, ?, ?, ?, ?,?,?,?,?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, patient.getId());
        ps.setString(2, patient.getName());
        ps.setString(3, patient.getAge());
        ps.setString(4, patient.getPhoneNumber());
        ps.setString(5, patient.getPatientIssue());
        ps.setString(6, patient.getPatientStatus());
        ps.setInt(7, patient.getIncidentCaseId());
        ps.setString(8, patient.getLabRequested());
        ps.setString(9, patient.getPharmacyRequested());

        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from patients where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Patient getPatientById(int id) throws SQLException {
        String query
                = "select * from patients where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        Patient patient = new Patient();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            patient.setId(rs.getInt("id"));
            patient.setName(rs.getString("name"));
            patient.setAge(rs.getString("age"));
            patient.setPhoneNumber(rs.getString("phone"));
            patient.setPatientIssue(rs.getString("issue"));
            patient.setPatientStatus(rs.getString("status"));
            patient.setIncidentCaseId(rs.getInt("incidentcaseid"));
            patient.setLabRequested(rs.getString("labrequested"));
            patient.setPharmacyRequested(rs.getString("pharmacyrequested"));
        }

        if (check == true) {
            return patient;
        }
        else
            return null;
    }

    @Override
    public List<Patient> getPatients() throws SQLException {
        String query = "select * from patients";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Patient> ls = new ArrayList();

        while (rs.next()) {
            Patient patient = new Patient();
            patient.setId(rs.getInt("id"));
            patient.setName(rs.getString("name"));
            patient.setAge(rs.getString("age"));
            patient.setPhoneNumber(rs.getString("phone"));
            patient.setPatientIssue(rs.getString("issue"));
            patient.setPatientStatus(rs.getString("status"));
            patient.setIncidentCaseId(rs.getInt("incidentcaseid"));
            patient.setLabRequested(rs.getString("labrequested"));
            patient.setPharmacyRequested(rs.getString("pharmacyrequested"));
            ls.add(patient);
        }
        return ls;
    }

    @Override
    public List<Patient> getPatientsByIncidentCaseId(int incidentCaseId) throws SQLException {
        String query = "select * from patients WHERE incidentcaseid=?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, incidentCaseId);
        ResultSet rs = ps.executeQuery();
        List<Patient> ls = new ArrayList();

        while (rs.next()) {
            Patient patient = new Patient();
            patient.setId(rs.getInt("id"));
            patient.setName(rs.getString("name"));
            patient.setAge(rs.getString("age"));
            patient.setPhoneNumber(rs.getString("phone"));
            patient.setPatientIssue(rs.getString("issue"));
            patient.setPatientStatus(rs.getString("status"));
            patient.setIncidentCaseId(rs.getInt("incidentcaseid"));
            patient.setLabRequested(rs.getString("labrequested"));
            patient.setPharmacyRequested(rs.getString("pharmacyrequested"));
            ls.add(patient);
        }
        return ls;
    }

    @Override
    public void update(Patient patient) throws SQLException {
        String query
                = "update patients set name=?, age=?, phone=?, issue=?, status=?, incidentcaseid=?, labrequested=? , pharmacyrequested=? "
                + " where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, patient.getName());
        ps.setString(2, patient.getAge());
        ps.setString(3, patient.getPhoneNumber());
        ps.setString(4, patient.getPatientIssue());
        ps.setString(5, patient.getPatientStatus());
        ps.setInt(6, patient.getIncidentCaseId());
        ps.setString(7, patient.getLabRequested());
        ps.setString(8, patient.getPharmacyRequested());
        ps.setInt(9, patient.getId());
        ps.executeUpdate();
    }
}
