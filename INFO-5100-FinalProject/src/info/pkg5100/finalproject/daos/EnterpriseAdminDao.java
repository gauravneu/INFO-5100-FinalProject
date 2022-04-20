package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.EnterpriseAdmin;

import java.sql.SQLException;
import java.util.List;

public interface EnterpriseAdminDao {
    public int add(EnterpriseAdmin enterpriseAdmin)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public EnterpriseAdmin getEnterpriseAdminById(int id)
            throws SQLException;
    public List<EnterpriseAdmin> getEnterpriseAdmins()
            throws SQLException;
    public void update(EnterpriseAdmin enterpriseAdmin)
            throws SQLException;
}
