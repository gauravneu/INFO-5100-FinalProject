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
                = "insert into incidentcase(id, status, investigationdetails, orgid, orgtype, investigationpoliceid, reporterphone, photourl, location"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from incidentcase where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public IncidentCase getIncidentCaseById(int id) throws SQLException {
        String query
                = "select * from incidentcase where id= ?";
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
        }

        if (check == true) {
            return incidentCase;
        }
        else
            return null;
    }

    @Override
    public List<IncidentCase> getIncidentCases() throws SQLException {
        String query = "select * from incidentcase";
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
            ls.add(incidentCase);
        }
        return ls;
    }

    @Override
    public void update(IncidentCase incidentCase) throws SQLException {
        String query
                = "update incidentcase set status= ?, investigationdetails= ?, orgid= ?, orgtype= ?, investigationpoliceid= ?, reporterid= ?, photourl= ?, location= ?"
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
        ps.setInt(9, incidentCase.getId());
        ps.executeUpdate();
    }
}
