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
                = "insert into pharmacy(id, patientid, pharmacyrequest, status, pharmacyid )"
                + " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, pharmacyRequest.getId());
        ps.setInt(2, pharmacyRequest.getPatientId());
        ps.setString(3, pharmacyRequest.getPharmacyRequest());
        ps.setString(4, pharmacyRequest.getStatus());
        ps.setInt(5, pharmacyRequest.getPharmacyId());
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
            pharmacyRequest.setPatientId(rs.getInt("pharmacyid"));
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
            pharmacyRequest.setPatientId(rs.getInt("pharmacyid"));
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
            pharmacyRequest.setPatientId(rs.getInt("pharmacyid"));
            ls.add(pharmacyRequest);
        }
        return ls;
    }

    @Override
    public List<PharmacyRequest> getPharmacyRequestsByPharmacyId(int PharmacyId) throws SQLException {
        String query = "select * from pharmacy where pharmacyid= ?";
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
            pharmacyRequest.setPatientId(rs.getInt("pharmacyid"));
            ls.add(pharmacyRequest);
        }
        return ls;
    }

    @Override
    public void update(PharmacyRequest pharmacyRequest) throws SQLException {
        String query
                = "update pharmacy set patientid=? , pharmacyrequest= ?, status=? , pharmacyid=? "
                + "where id = ? ";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, pharmacyRequest.getPatientId());
        ps.setString(2, pharmacyRequest.getPharmacyRequest());
        ps.setString(3, pharmacyRequest.getStatus());
        ps.setInt(4, pharmacyRequest.getPharmacyId());
        ps.setInt(5, pharmacyRequest.getId());
        ps.executeUpdate();
    }
}
