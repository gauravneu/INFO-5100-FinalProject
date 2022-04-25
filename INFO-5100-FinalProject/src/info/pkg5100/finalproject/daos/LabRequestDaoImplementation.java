package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.models.LabRequest;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LabRequestDaoImplementation implements LabRequestDao {

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(LabRequest labRequest) throws SQLException {
        String query
                = "insert into labrequests(id, patientid, status, testname, testresult, labid )"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, labRequest.getId());
        ps.setInt(2, labRequest.getPatientId());
        ps.setString(3, labRequest.getRequestStatus());
        ps.setString(4, labRequest.getTestName());
        ps.setString(5, labRequest.getTestResult());
        ps.setInt(6, labRequest.getLabId());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from labrequests where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public LabRequest getLabRequestById(int id) throws SQLException {
        String query
                = "select * from labrequests where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        LabRequest labRequest = new LabRequest();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            labRequest.setId(rs.getInt("id"));
            labRequest.setPatientId(rs.getInt("patientid"));
            labRequest.setRequestStatus(rs.getString("status"));
            labRequest.setTestName(rs.getString("testname"));
            labRequest.setTestResult(rs.getString("testresult"));
            labRequest.setLabId(rs.getInt("labid"));
        }

        if (check == true) {
            return labRequest;
        }
        else
            return null;
    }

    @Override
    public List<LabRequest> getLabRequests() throws SQLException {
        String query = "select * from labrequests";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<LabRequest> ls = new ArrayList();

        while (rs.next()) {
            LabRequest labRequest = new LabRequest();
            labRequest.setId(rs.getInt("id"));
            labRequest.setPatientId(rs.getInt("patientid"));
            labRequest.setRequestStatus(rs.getString("status"));
            labRequest.setTestName(rs.getString("testname"));
            labRequest.setTestResult(rs.getString("testresult"));
            labRequest.setLabId(rs.getInt("labid"));
            ls.add(labRequest);
        }
        return ls;
    }

    @Override
    public List<LabRequest> getLabRequestsByPatientId(int patientId) throws SQLException {
        String query = "select * from labrequests where patientid= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ResultSet rs = ps.executeQuery();
        List<LabRequest> ls = new ArrayList();

        while (rs.next()) {
            LabRequest labRequest = new LabRequest();
            labRequest.setId(rs.getInt("id"));
            labRequest.setPatientId(rs.getInt("patientid"));
            labRequest.setRequestStatus(rs.getString("status"));
            labRequest.setTestName(rs.getString("testname"));
            labRequest.setTestResult(rs.getString("testresult"));
            labRequest.setLabId(rs.getInt("labid"));
            ls.add(labRequest);
        }
        return ls;
    }

    @Override
    public List<LabRequest> getLabRequestsByStatus(String status) throws SQLException {
        String query = "select * from labrequests where status= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, status);
        ResultSet rs = ps.executeQuery();
        List<LabRequest> ls = new ArrayList();

        while (rs.next()) {
            LabRequest labRequest = new LabRequest();
            labRequest.setId(rs.getInt("id"));
            labRequest.setPatientId(rs.getInt("patientid"));
            labRequest.setRequestStatus(rs.getString("status"));
            labRequest.setTestName(rs.getString("testname"));
            labRequest.setTestResult(rs.getString("testresult"));
            labRequest.setLabId(rs.getInt("labid"));
            ls.add(labRequest);
        }
        return ls;
    }

    @Override
    public void update(LabRequest labRequest) throws SQLException {
        String query
                = "update enterprises set patientid=? , status= ?, testname=? , testresult=? , labid=? "
                + "where id = ? ";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, labRequest.getPatientId());
        ps.setString(2, labRequest.getRequestStatus());
        ps.setString(3, labRequest.getTestName());
        ps.setString(4, labRequest.getTestResult());
        ps.setInt(4, labRequest.getLabId());
        ps.setInt(4, labRequest.getId());
        ps.executeUpdate();
    }
}
