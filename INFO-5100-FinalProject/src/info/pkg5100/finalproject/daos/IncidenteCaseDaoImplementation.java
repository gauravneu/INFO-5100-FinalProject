package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.IncidentCase;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IncidenteCaseDaoImplementation implements IncidentCaseDao{

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(IncidentCase incidentCase) throws SQLException {
        String query
                = "insert into incidentcases(id, status, investigationdetails, orgid, orgtype, investigationpoliceid, reporterphone, photourl, location, description, currentcasehandlinguserid, hospitalcaseaccepted, hospitalid)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, incidentCase.getId());
        ps.setString(2, incidentCase.getStatus());
        ps.setString(3, incidentCase.getInvestigationDetails());
        ps.setInt(4, incidentCase.getOrgId());
        ps.setString(5, incidentCase.getOrgType());
        ps.setInt(6, incidentCase.getInvestigationPoliceId());
        ps.setString(7, incidentCase.getReporterPhone());
        ps.setString(8, incidentCase.getPhotoUrl());
        ps.setString(9, incidentCase.getLocation());
        ps.setString(10, incidentCase.getDescription());
        ps.setInt(11, incidentCase.getCurrentcasehandlinguserid());
        ps.setString(12, incidentCase.getHospitalCaseAccepted());
        ps.setInt(13, incidentCase.getHospitalId());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from incidentcases where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public IncidentCase getIncidentCaseById(int id) throws SQLException {
        String query
                = "select * from incidentcases where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        IncidentCase incidentCase = new IncidentCase();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            incidentCase.setId(rs.getInt("id"));
            incidentCase.setStatus(rs.getString("status"));
            incidentCase.setInvestigationDetails(rs.getString("investigationdetails"));
            incidentCase.setOrgId(rs.getInt("orgid"));
            incidentCase.setOrgType(rs.getString("orgtype"));
            incidentCase.setInvestigationPoliceId(rs.getInt("investigationpoliceid"));
            incidentCase.setReporterPhone(rs.getString("reporterphone"));
            incidentCase.setPhotoUrl(rs.getString("photourl"));
            incidentCase.setLocation(rs.getString("location"));
            incidentCase.setDescription(rs.getString("description"));
            incidentCase.setCurrentcasehandlinguserid(rs.getInt("currentcasehandlinguserid"));
            incidentCase.setHospitalCaseAccepted(rs.getString("hospitalcaseaccepted"));
            incidentCase.setHospitalId(rs.getInt("hospitalid"));
        }

        if (check == true) {
            return incidentCase;
        }
        else
            return null;
    }

    @Override
    public List<IncidentCase> getIncidentCases() throws SQLException {
        String query = "select * from incidentcases";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<IncidentCase> ls = new ArrayList();

        while (rs.next()) {
            IncidentCase incidentCase = new IncidentCase();
            incidentCase.setId(rs.getInt("id"));
            incidentCase.setStatus(rs.getString("status"));
            incidentCase.setInvestigationDetails(rs.getString("investigationdetails"));
            incidentCase.setOrgId(rs.getInt("orgid"));
            incidentCase.setOrgType(rs.getString("orgtype"));
            incidentCase.setInvestigationPoliceId(rs.getInt("investigationpoliceid"));
            incidentCase.setReporterPhone(rs.getString("reporterphone"));
            incidentCase.setPhotoUrl(rs.getString("photourl"));
            incidentCase.setLocation(rs.getString("location"));
            incidentCase.setDescription(rs.getString("description"));
            incidentCase.setCurrentcasehandlinguserid(rs.getInt("currentcasehandlinguserid"));
            incidentCase.setHospitalCaseAccepted(rs.getString("hospitalcaseaccepted"));
            incidentCase.setHospitalId(rs.getInt("hospitalid"));
            ls.add(incidentCase);
        }
        return ls;
    }

    @Override
    public List<IncidentCase> getIncidentCasesByLocation(String location) throws SQLException {
        String query = "select * from incidentcases WHERE location = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, location);

        ResultSet rs = ps.executeQuery();
        List<IncidentCase> ls = new ArrayList();

        while (rs.next()) {
            IncidentCase incidentCase = new IncidentCase();
            incidentCase.setId(rs.getInt("id"));
            incidentCase.setStatus(rs.getString("status"));
            incidentCase.setInvestigationDetails(rs.getString("investigationdetails"));
            incidentCase.setOrgId(rs.getInt("orgid"));
            incidentCase.setOrgType(rs.getString("orgtype"));
            incidentCase.setInvestigationPoliceId(rs.getInt("investigationpoliceid"));
            incidentCase.setReporterPhone(rs.getString("reporterphone"));
            incidentCase.setPhotoUrl(rs.getString("photourl"));
            incidentCase.setLocation(rs.getString("location"));
            incidentCase.setDescription(rs.getString("description"));
            incidentCase.setCurrentcasehandlinguserid(rs.getInt("currentcasehandlinguserid"));
            incidentCase.setHospitalCaseAccepted(rs.getString("hospitalcaseaccepted"));
            incidentCase.setHospitalId(rs.getInt("hospitalid"));
            ls.add(incidentCase);
        }
        return ls;
    }

    @Override
    public List<IncidentCase> getIncidentCasesByStatusAndLocation(String status, String location) throws SQLException {
        String query = "select * from incidentcases WHERE status=? AND location = ?";

        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, status);
        ps.setString(2, location);

        ResultSet rs = ps.executeQuery();
        List<IncidentCase> ls = new ArrayList();

        while (rs.next()) {
            IncidentCase incidentCase = new IncidentCase();
            incidentCase.setId(rs.getInt("id"));
            incidentCase.setStatus(rs.getString("status"));
            incidentCase.setInvestigationDetails(rs.getString("investigationdetails"));
            incidentCase.setOrgId(rs.getInt("orgid"));
            incidentCase.setOrgType(rs.getString("orgtype"));
            incidentCase.setInvestigationPoliceId(rs.getInt("investigationpoliceid"));
            incidentCase.setReporterPhone(rs.getString("reporterphone"));
            incidentCase.setPhotoUrl(rs.getString("photourl"));
            incidentCase.setLocation(rs.getString("location"));
            incidentCase.setDescription(rs.getString("description"));
            incidentCase.setCurrentcasehandlinguserid(rs.getInt("currentcasehandlinguserid"));
            incidentCase.setHospitalCaseAccepted(rs.getString("hospitalcaseaccepted"));
            incidentCase.setHospitalId(rs.getInt("hospitalid"));
            ls.add(incidentCase);
        }
        return ls;
    }

    @Override
    public List<IncidentCase> getIncidentCasesByOrgIdAndOrgTypeAndStatusAndLocation(int orgId, String orgType, String status, String location) throws SQLException {
        String query = "select * from incidentcases WHERE orgid=? AND orgtype=? AND status=? AND location = ?";

        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, orgId);
        ps.setString(2, orgType);
        ps.setString(3, status);
        ps.setString(4, location);

        ResultSet rs = ps.executeQuery();
        List<IncidentCase> ls = new ArrayList();

        while (rs.next()) {
            IncidentCase incidentCase = new IncidentCase();
            incidentCase.setId(rs.getInt("id"));
            incidentCase.setStatus(rs.getString("status"));
            incidentCase.setInvestigationDetails(rs.getString("investigationdetails"));
            incidentCase.setOrgId(rs.getInt("orgid"));
            incidentCase.setOrgType(rs.getString("orgtype"));
            incidentCase.setInvestigationPoliceId(rs.getInt("investigationpoliceid"));
            incidentCase.setReporterPhone(rs.getString("reporterphone"));
            incidentCase.setPhotoUrl(rs.getString("photourl"));
            incidentCase.setLocation(rs.getString("location"));
            incidentCase.setDescription(rs.getString("description"));
            incidentCase.setCurrentcasehandlinguserid(rs.getInt("currentcasehandlinguserid"));
            incidentCase.setHospitalCaseAccepted(rs.getString("hospitalcaseaccepted"));
            incidentCase.setHospitalId(rs.getInt("hospitalid"));
            ls.add(incidentCase);
        }
        return ls;
    }

    @Override
    public List<IncidentCase> getIncidentCasesByOrgIdAndOrgTypeAndStatusAndLocationAndCurrentCaseHandlingUserId(int orgId, int currentcasehandlinguserid, String orgType, String status, String location) throws SQLException {
        String query = "select * from incidentcases WHERE orgid=? AND orgtype=? AND status=? AND location = ? AND currentcasehandlinguserid=?";

        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, orgId);
        ps.setString(2, orgType);
        ps.setString(3, status);
        ps.setString(4, location);
        ps.setInt(5, currentcasehandlinguserid);

        ResultSet rs = ps.executeQuery();
        List<IncidentCase> ls = new ArrayList();

        while (rs.next()) {
            IncidentCase incidentCase = new IncidentCase();
            incidentCase.setId(rs.getInt("id"));
            incidentCase.setStatus(rs.getString("status"));
            incidentCase.setInvestigationDetails(rs.getString("investigationdetails"));
            incidentCase.setOrgId(rs.getInt("orgid"));
            incidentCase.setOrgType(rs.getString("orgtype"));
            incidentCase.setInvestigationPoliceId(rs.getInt("investigationpoliceid"));
            incidentCase.setReporterPhone(rs.getString("reporterphone"));
            incidentCase.setPhotoUrl(rs.getString("photourl"));
            incidentCase.setLocation(rs.getString("location"));
            incidentCase.setDescription(rs.getString("description"));
            incidentCase.setCurrentcasehandlinguserid(rs.getInt("currentcasehandlinguserid"));
            incidentCase.setHospitalCaseAccepted(rs.getString("hospitalcaseaccepted"));
            incidentCase.setHospitalId(rs.getInt("hospitalid"));
            ls.add(incidentCase);
        }
        return ls;
    }

    @Override
    public void update(IncidentCase incidentCase) throws SQLException {
        String query
                = "update incidentcases set status= ?, investigationdetails= ?, orgid= ?, orgtype= ?, investigationpoliceid= ?, reporterphone= ?, photourl= ?, location= ?, description= ?, currentcasehandlinguserid =?, hospitalcaseaccepted=?, hospitalid=? "
                + "where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, incidentCase.getStatus());
        ps.setString(2, incidentCase.getInvestigationDetails());
        ps.setInt(3, incidentCase.getOrgId());
        ps.setString(4, incidentCase.getOrgType());
        ps.setInt(5, incidentCase.getInvestigationPoliceId());
        ps.setString(6, incidentCase.getReporterPhone());
        ps.setString(7, incidentCase.getPhotoUrl());
        ps.setString(8, incidentCase.getLocation());
        ps.setString(9, incidentCase.getDescription());
        ps.setInt(10, incidentCase.getCurrentcasehandlinguserid());
        ps.setString(11, incidentCase.getHospitalCaseAccepted());
        ps.setInt(12, incidentCase.getHospitalId());
        ps.setInt(13, incidentCase.getId());
        ps.executeUpdate();
    }
}
