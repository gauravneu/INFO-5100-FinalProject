package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UsersDao {
    public int add(User user)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public User getUserById(int id)
            throws SQLException;
    public User getUserByUsernameAndPassword(String username, String password)
            throws SQLException;
    public List<User> getUsers()
            throws SQLException;
    public List<User> getUsersByOrgId(int id)
            throws SQLException;
    public List<User> getUsersByOrgIdAndRole(int id, String role)
            throws SQLException;
    public List<User> getEmployeesByOrgId(int id)
            throws SQLException;
    public void update(User user)
            throws SQLException;
}
