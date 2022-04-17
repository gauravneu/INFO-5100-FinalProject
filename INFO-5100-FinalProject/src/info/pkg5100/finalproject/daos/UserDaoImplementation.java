package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Enterprise;
import info.pkg5100.finalproject.models.User;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplementation implements UsersDao {

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(User user) throws SQLException {
        String query
                = "insert into users(id, username, password, name, age, phone, role, orgid) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, user.getId());
        ps.setString(2, user.getUsername());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getName());
        ps.setString(5, user.getAge());
        ps.setString(6, user.getPhone());
        ps.setString(7, user.getRole());
        ps.setInt(8, user.getOrgid());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from users where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public User getUserById(int id) throws SQLException {
        String query
                = "select * from users where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        User user = new User();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getString("age"));
            user.setPhone(rs.getString("phone"));
            user.setRole(rs.getString("role"));
            user.setOrgid(rs.getInt("orgid"));
        }

        if (check == true) {
            return user;
        }
        else
            return null;
    }

    @Override
    public User getUserByUsernameAndPassword(String username, String password) throws SQLException {
        String query
                = "select * from users where username= ? AND password= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, username);
        ps.setString(2, password);
        User user = new User();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getString("age"));
            user.setPhone(rs.getString("phone"));
            user.setRole(rs.getString("role"));
            user.setOrgid(rs.getInt("orgid"));
        }

        if (check == true) {
            return user;
        }
        else
            return null;
    }

    @Override
    public List<User> getUsers() throws SQLException {
        String query = "select * from users";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<User> ls = new ArrayList();

        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getString("age"));
            user.setPhone(rs.getString("phone"));
            user.setRole(rs.getString("role"));
            user.setOrgid(rs.getInt("orgid"));
            ls.add(user);
        }
        return ls;
    }

    @Override
    public List<User> getUsersByOrgId(int id) throws SQLException {
        String query = "select * from users WHERE orgid = ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        List<User> ls = new ArrayList();

        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getString("age"));
            user.setPhone(rs.getString("phone"));
            user.setRole(rs.getString("role"));
            user.setOrgid(rs.getInt("orgid"));
            ls.add(user);
        }
        return ls;
    }

    @Override
    public List<User> getEmployeesByOrgId(int id) throws SQLException {
        String query = "select * from users WHERE orgid = ? AND role != 'orgadmin'";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        List<User> ls = new ArrayList();

        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getString("age"));
            user.setPhone(rs.getString("phone"));
            user.setRole(rs.getString("role"));
            user.setOrgid(rs.getInt("orgid"));
            ls.add(user);
        }
        return ls;
    }

    @Override
    public void update(User user) throws SQLException {
        String query
                = "update users set username = ?, "
                + " password= ? , name = ?, age = ?, phone = ?, role = ?, orgid = ?  where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());
        ps.setString(2, user.getName());
        ps.setString(2, user.getAge());
        ps.setString(2, user.getPhone());
        ps.setString(2, user.getRole());
        ps.setInt(2, user.getOrgid());
        ps.setInt(3, user.getId());
        ps.executeUpdate();
    }
}
