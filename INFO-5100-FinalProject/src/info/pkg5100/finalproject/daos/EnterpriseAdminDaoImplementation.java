package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.EnterpriseAdmin;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnterpriseAdminDaoImplementation implements EnterpriseAdminDao {

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(EnterpriseAdmin enterpriseAdmin) throws SQLException {
        String query
                = "insert into enterpriseadmin(id, username, "
                + "password, enterpriseid) VALUES (?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, enterpriseAdmin.getId());
        ps.setString(2, enterpriseAdmin.getUsername());
        ps.setString(3, enterpriseAdmin.getPassword());
        ps.setInt(4, enterpriseAdmin.getEnterpriseId());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from enterpriseadmin where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public EnterpriseAdmin getEnterpriseAdminById(int id) throws SQLException {
        String query
                = "select * from enterpriseadmin where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        EnterpriseAdmin enterpriseAdmin = new EnterpriseAdmin();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            enterpriseAdmin.setId(rs.getInt("id"));
            enterpriseAdmin.setUsername(rs.getString("username"));
            enterpriseAdmin.setPassword(rs.getString("password"));
            enterpriseAdmin.setEnterpriseId(rs.getInt("enterpriseid"));
        }

        if (check == true) {
            return enterpriseAdmin;
        }
        else
            return null;
    }

    @Override
    public List<EnterpriseAdmin> getEnterpriseAdmins() throws SQLException {
        String query = "select * from enterpriseadmin";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<EnterpriseAdmin> ls = new ArrayList();

        while (rs.next()) {
            EnterpriseAdmin enterpriseAdmin = new EnterpriseAdmin();
            enterpriseAdmin.setId(rs.getInt("id"));
            enterpriseAdmin.setUsername(rs.getString("username"));
            enterpriseAdmin.setPassword(rs.getString("password"));
            enterpriseAdmin.setEnterpriseId(rs.getInt("enterpriseid"));
            ls.add(enterpriseAdmin);
        }
        return ls;
    }

    @Override
    public void update(EnterpriseAdmin enterpriseAdmin) throws SQLException {
        String query
                = "update enterpriseadmin set username=?, "
                + " password= ?, enterpriseid=? where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, enterpriseAdmin.getUsername());
        ps.setString(2, enterpriseAdmin.getPassword());
        ps.setInt(3, enterpriseAdmin.getEnterpriseId());
        ps.setInt(3, enterpriseAdmin.getId());
        ps.executeUpdate();
    }
}
