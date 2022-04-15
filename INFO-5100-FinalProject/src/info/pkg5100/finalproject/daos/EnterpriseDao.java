package info.pkg5100.finalproject.daos;


import info.pkg5100.finalproject.models.Enterprise;

import java.sql.SQLException;
import java.util.List;


public interface EnterpriseDao {

    public int add(Enterprise enterprise)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public Enterprise getEnterpriseById(int id)
            throws SQLException;
    public List<Enterprise> getEnterprises()
            throws SQLException;
    public void update(Enterprise enterprise)
            throws SQLException;
}