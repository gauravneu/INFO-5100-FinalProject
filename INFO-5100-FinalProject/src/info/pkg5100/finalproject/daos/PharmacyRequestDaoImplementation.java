package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.LabRequest;
import info.pkg5100.finalproject.models.PharmacyRequest;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PharmacyRequestDaoImplementation implements PharmacyRequestDao {

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(PharmacyRequest pharmacyRequest) throws SQLException {
        String query
                = "insert into pharmacy(id, patientid, pharmacyrequest, status, pharmacyid ,network, employeeid, pharmacyresponse)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, pharmacyRequest.getId());
        ps.setInt(2, pharmacyRequest.getPatientId());
        ps.setString(3, pharmacyRequest.getPharmacyRequest());
        ps.setString(4, pharmacyRequest.getStatus());
        ps.setInt(5, pharmacyRequest.getPharmacyId());
        ps.setString(6, pharmacyRequest.getNetwork());
        ps.setInt(7, pharmacyRequest.getEmployeeid());
        ps.setString(8, pharmacyRequest.getPharmacyResponse());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from pharmacy where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public PharmacyRequest getPharmacyRequestById(int id) throws SQLException {
        String query
                = "select * from pharmacy where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        PharmacyRequest pharmacyRequest = new PharmacyRequest();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            pharmacyRequest.setId(rs.getInt("id"));
            pharmacyRequest.setPatientId(rs.getInt("patientid"));
            pharmacyRequest.setPharmacyRequest(rs.getString("pharmacyrequest"));
            pharmacyRequest.setStatus(rs.getString("status"));
            pharmacyRequest.setPharmacyId(rs.getInt("pharmacyid"));
            pharmacyRequest.setNetwork(rs.getString("network"));
            pharmacyRequest.setEmployeeid(rs.getInt("employeeid"));
            pharmacyRequest.setEmployeeid(rs.getInt("pharmacyresponse"));
        }

        if (check == true) {
            return pharmacyRequest;
        }
        else
            return null;
    }

    @Override
    public List<PharmacyRequest> getPharmacyRequests() throws SQLException {
        String query = "select * from pharmacy";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<PharmacyRequest> ls = new ArrayList();

        while (rs.next()) {
            PharmacyRequest pharmacyRequest = new PharmacyRequest();
            pharmacyRequest.setId(rs.getInt("id"));
            pharmacyRequest.setPatientId(rs.getInt("patientid"));
            pharmacyRequest.setPharmacyRequest(rs.getString("pharmacyrequest"));
            pharmacyRequest.setStatus(rs.getString("status"));
            pharmacyRequest.setPharmacyId(rs.getInt("pharmacyid"));
            pharmacyRequest.setNetwork(rs.getString("network"));
            pharmacyRequest.setEmployeeid(rs.getInt("employeeid"));
            pharmacyRequest.setEmployeeid(rs.getInt("pharmacyresponse"));
            ls.add(pharmacyRequest);
        }
        return ls;
    }

    @Override
    public List<PharmacyRequest> getPharmacyRequestsByPatientId(int patientId) throws SQLException {
        String query = "select * from pharmacy where patientid= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ResultSet rs = ps.executeQuery();
        List<PharmacyRequest> ls = new ArrayList();

        while (rs.next()) {
            PharmacyRequest pharmacyRequest = new PharmacyRequest();
            pharmacyRequest.setId(rs.getInt("id"));
            pharmacyRequest.setPatientId(rs.getInt("patientid"));
            pharmacyRequest.setPharmacyRequest(rs.getString("pharmacyrequest"));
            pharmacyRequest.setStatus(rs.getString("status"));
            pharmacyRequest.setPharmacyId(rs.getInt("pharmacyid"));
            pharmacyRequest.setNetwork(rs.getString("network"));
            pharmacyRequest.setEmployeeid(rs.getInt("employeeid"));
            pharmacyRequest.setEmployeeid(rs.getInt("pharmacyresponse"));
            ls.add(pharmacyRequest);
        }
        return ls;
    }

    @Override
    public List<PharmacyRequest> getPharmacyRequestsByPharmacyId(int PharmacyId) throws SQLException {
        String query = "select * from pharmacy where employeeid= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, PharmacyId);
        ResultSet rs = ps.executeQuery();
        List<PharmacyRequest> ls = new ArrayList();

        while (rs.next()) {
            PharmacyRequest pharmacyRequest = new PharmacyRequest();
            pharmacyRequest.setId(rs.getInt("id"));
            pharmacyRequest.setPatientId(rs.getInt("patientid"));
            pharmacyRequest.setPharmacyRequest(rs.getString("pharmacyrequest"));
            pharmacyRequest.setStatus(rs.getString("status"));
            pharmacyRequest.setPharmacyId(rs.getInt("pharmacyid"));
            pharmacyRequest.setNetwork(rs.getString("network"));
            pharmacyRequest.setEmployeeid(rs.getInt("employeeid"));
            pharmacyRequest.setEmployeeid(rs.getInt("pharmacyresponse"));
            ls.add(pharmacyRequest);
        }
        return ls;
    }

    @Override
    public void update(PharmacyRequest pharmacyRequest) throws SQLException {
        String query
                = "update pharmacy set patientid=? , pharmacyrequest= ?, status=? , pharmacyid=?, network=?, employeeid=?, pharmacyresponse=?"
                + "where id = ? ";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, pharmacyRequest.getPatientId());
        ps.setString(2, pharmacyRequest.getPharmacyRequest());
        ps.setString(3, pharmacyRequest.getStatus());
        ps.setInt(4, pharmacyRequest.getPharmacyId());
        ps.setString(5, pharmacyRequest.getNetwork());
        ps.setInt(6, pharmacyRequest.getEmployeeid());
        ps.setString(7,pharmacyRequest.getPharmacyResponse());
        ps.setInt(8, pharmacyRequest.getId());
        ps.executeUpdate();
    }

    @Override
    public List<PharmacyRequest> getPharmacyRequestsByStatus(String status) throws SQLException {
       String query = "select * from pharmacy where status= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, status);
        ResultSet rs = ps.executeQuery();
        List<PharmacyRequest> ls = new ArrayList();

        while (rs.next()) {
            PharmacyRequest pharmacyRequest = new PharmacyRequest();
            pharmacyRequest.setId(rs.getInt("id"));
            pharmacyRequest.setPatientId(rs.getInt("patientid"));
            pharmacyRequest.setPharmacyRequest(rs.getString("pharmacyrequest"));
            pharmacyRequest.setStatus(rs.getString("status"));
            pharmacyRequest.setPharmacyId(rs.getInt("pharmacyid"));
            pharmacyRequest.setNetwork(rs.getString("network"));
            pharmacyRequest.setEmployeeid(rs.getInt("employeeid"));
            pharmacyRequest.setEmployeeid(rs.getInt("pharmacyresponse"));
            ls.add(pharmacyRequest);
        }
        return ls;
    }
}
