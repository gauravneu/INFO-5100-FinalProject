package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnterpriseDaoImplementation implements EnterpriseDao {
    static Connection con = DatabaseConnection.getConnection();
    @Override
    public int add(Enterprise enterprise) throws SQLException {
        String query
                = "insert into enterprises(id, name, "
                + "location, type) VALUES (?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, enterprise.getId());
        ps.setString(2, enterprise.getEnterpriseName());
        ps.setString(3, enterprise.getLocation());
        ps.setString(4, enterprise.getType());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from enterprises where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Enterprise getEnterpriseById(int id) throws SQLException {
        String query
                = "select * from enterprises where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        Enterprise enterprise = new Enterprise();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            enterprise.setId(rs.getInt("id"));
            enterprise.setEnterpriseName(rs.getString("name"));
            enterprise.setLocation(rs.getString("location"));
            enterprise.setType(rs.getString("type"));
        }

        if (check == true) {
            return enterprise;
        }
        else
            return null;
    }

    @Override
    public List<Enterprise> getEnterprises() throws SQLException {
        String query = "select * from enterprises";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Enterprise> ls = new ArrayList();

        while (rs.next()) {
            Enterprise enterprise = new Enterprise();
            enterprise.setId(rs.getInt("id"));
            enterprise.setEnterpriseName(rs.getString("name"));
            enterprise.setLocation(rs.getString("location"));
            enterprise.setType(rs.getString("type"));
            ls.add(enterprise);
        }
        return ls;
    }

    @Override
    public void update(Enterprise enterprise) throws SQLException {
        String query
                = "update enterprises set name=?, "
                + " location= ?, type=? where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, enterprise.getEnterpriseName());
        ps.setString(2, enterprise.getLocation());
        ps.setString(3, enterprise.getType());
        ps.setInt(4, enterprise.getId());
        ps.executeUpdate();
    }
}
