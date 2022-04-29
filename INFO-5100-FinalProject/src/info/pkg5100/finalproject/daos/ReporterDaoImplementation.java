package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Reporter;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReporterDaoImplementation implements ReporterDao{

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(Reporter reporter) throws SQLException {
        String query
                = "insert into reporters(phone, name) "
                +  "VALUES (?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, reporter.getPhone());
        ps.setString(2, reporter.getReporterName());

        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void deleteByPhone(String phone) throws SQLException {
        String query
                = "delete from reporters where phone =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, phone);
        ps.executeUpdate();
    }

    @Override
    public Reporter getReporterByPhone(String phone) throws SQLException {
        String query
                = "select * from reporters where phone= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, phone);
        Reporter reporter = new Reporter();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            reporter.setPhone(rs.getString("phone"));
            reporter.setReporterName(rs.getString("name"));
        }

        if (check == true) {
            return reporter;
        }
        else
            return null;
    }

    @Override
    public List<Reporter> getReporters() throws SQLException {
        String query = "select * from reporters";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Reporter> ls = new ArrayList();

        while (rs.next()) {
            Reporter reporter = new Reporter();
            reporter.setPhone(rs.getString("phone"));
            reporter.setReporterName(rs.getString("name"));

            ls.add(reporter);
        }
        return ls;
    }

    @Override
    public void update(Reporter reporter) throws SQLException {
        String query
                = "update enterpriseadmin set phone=?, name=?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, reporter.getPhone());
        ps.setString(2, reporter.getReporterName());

        ps.executeUpdate();
    }
}
