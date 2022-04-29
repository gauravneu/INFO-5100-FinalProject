package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Organization;

import java.sql.SQLException;
import java.util.List;

public interface OrganizationDao {
    public int add(Organization organization)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public Organization getOrganizationById(int id)
            throws SQLException;
    public List<Organization> getOrganizationByType(String type)
            throws SQLException;
    public List<Organization> getOrganizationByEnterpriseTypeAndLocation(String enterpriseType, String location)
            throws SQLException;
    public List<Organization> getOrganizationByLocation(String location)
            throws SQLException;
    public List<Organization> getOrganizations()
            throws SQLException;
    public void update(Organization organization)
            throws SQLException;
}
