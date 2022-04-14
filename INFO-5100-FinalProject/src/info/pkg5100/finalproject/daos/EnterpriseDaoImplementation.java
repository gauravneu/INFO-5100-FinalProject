package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnterpriseDaoImplementation implements EnterpriseInterface {
    static Connection con = DatabaseConnection.getConnection();
    @Override
    public int add(Enterprise enterprise) throws SQLException {
        String query
                = "insert into enterprises(id, name, "
                + "location) VALUES (?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, enterprise.getId());
        ps.setString(2, enterprise.getEnterpriseName());
        ps.setString(3, enterprise.getLocation());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public Enterprise getEnterpriseById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Enterprise> getEnterprises() throws SQLException {
        return null;
    }

    @Override
    public void update(Enterprise enterprise) throws SQLException {

    }
}
