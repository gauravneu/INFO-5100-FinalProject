package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.models.Organization;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrganizationDaoImplementation implements OrganizationDao {

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(Organization organization) throws SQLException {
        String query
                = "insert into organizations(id, name, "
                + "location, type, enterprisetype) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, organization.getId());
        ps.setString(2, organization.getName());
        ps.setString(3, organization.getLocation());
        ps.setString(4, organization.getType());
        ps.setString(5, organization.getEnterpriseType());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from organizations where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Organization getOrganizationById(int id) throws SQLException {
        String query
                = "select * from organizations where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        Organization organization = new Organization();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            organization.setId(rs.getInt("id"));
            organization.setName(rs.getString("name"));
            organization.setLocation(rs.getString("location"));
            organization.setType(rs.getString("type"));
            organization.setEnterpriseType(rs.getString("enterprisetype"));
        }

        if (check == true) {
            return organization;
        }
        else
            return null;
    }

    @Override
    public List<Organization> getOrganizationByType(String type) throws SQLException {
        String query
                = "select * from organizations where type= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, type);
        ResultSet rs = ps.executeQuery();
        List<Organization> ls = new ArrayList();

        while (rs.next()) {
            Organization organization = new Organization();
            organization.setId(rs.getInt("id"));
            organization.setName(rs.getString("name"));
            organization.setLocation(rs.getString("location"));
            organization.setType(rs.getString("type"));
            organization.setEnterpriseType(rs.getString("enterprisetype"));
            ls.add(organization);
        }
        return ls;
    }

    @Override
    public List<Organization> getOrganizationByEnterpriseTypeAndLocation(String enterpriseType, String location) throws SQLException {
        String query
                = "select * from organizations where enterprisetype= ? AND location = ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, enterpriseType);
        ps.setString(2, location);
        ResultSet rs = ps.executeQuery();
        List<Organization> ls = new ArrayList();

        while (rs.next()) {
            Organization organization = new Organization();
            organization.setId(rs.getInt("id"));
            organization.setName(rs.getString("name"));
            organization.setLocation(rs.getString("location"));
            organization.setType(rs.getString("type"));
            organization.setEnterpriseType(rs.getString("enterprisetype"));
            ls.add(organization);
        }
        return ls;
    }

    @Override
    public List<Organization> getOrganizationByLocation(String location) throws SQLException {
        String query
                = "select * from organizations where location = ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, location);
        ResultSet rs = ps.executeQuery();
        List<Organization> ls = new ArrayList();

        while (rs.next()) {
            Organization organization = new Organization();
            organization.setId(rs.getInt("id"));
            organization.setName(rs.getString("name"));
            organization.setLocation(rs.getString("location"));
            organization.setType(rs.getString("type"));
            organization.setEnterpriseType(rs.getString("enterprisetype"));
            ls.add(organization);
        }
        return ls;
    }

    @Override
    public List<Organization> getOrganizations() throws SQLException {
        String query = "select * from organizations";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Organization> ls = new ArrayList();

        while (rs.next()) {
            Organization organization = new Organization();
            organization.setId(rs.getInt("id"));
            organization.setName(rs.getString("name"));
            organization.setLocation(rs.getString("location"));
            organization.setType(rs.getString("type"));
            organization.setEnterpriseType(rs.getString("enterprisetype"));
            ls.add(organization);
        }
        return ls;
    }

    @Override
    public void update(Organization organization) throws SQLException {
        String query
                = "update organizations set name=?, "
                + " location= ?, type = ?, enterpriseid = ? where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, organization.getName());
        ps.setString(2, organization.getLocation());
        ps.setString(3, organization.getType());
        ps.setString(4, organization.getEnterpriseType());
        ps.setInt(4, organization.getId());
        ps.executeUpdate();
    }
}
