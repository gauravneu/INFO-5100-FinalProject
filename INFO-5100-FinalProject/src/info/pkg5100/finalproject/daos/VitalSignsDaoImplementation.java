package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.VitalSigns;
import info.pkg5100.finalproject.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VitalSignsDaoImplementation implements VitalSignsDao {

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from vitalsigns where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public int add(VitalSigns vitalSigns) throws SQLException {

        String query
                = "insert into vitalsigns(id, patientid, bloodpressure, glucoselevel,"
                + " bodytemp, respirationrate, oxygensaturation, painlevel, date)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, vitalSigns.getId());
        ps.setInt(2, vitalSigns.getPatientId());
        ps.setInt(3, vitalSigns.getBloodPressure());
        ps.setInt(4, vitalSigns.getGlucoseLevel());
        ps.setInt(5, vitalSigns.getBodyTemp());
        ps.setInt(6, vitalSigns.getRespirationRate());
        ps.setInt(7, vitalSigns.getOxygenSaturation());     
        ps.setString(8, vitalSigns.getPainLevel());
        ps.setDate(9, new java.sql.Date(vitalSigns.getDate().getTime()));
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public List<VitalSigns> getVitalSignsByPatientId(int patientId) throws SQLException {
        String query = "select * from vitalsigns where patientid= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ResultSet rs = ps.executeQuery();
        List<VitalSigns> ls = new ArrayList();

        while (rs.next()) {
            VitalSigns vitalSigns = new VitalSigns();
            vitalSigns.setId(rs.getInt("id"));
            vitalSigns.setPatientId(rs.getInt("patientid"));
            vitalSigns.setBloodPressure(rs.getInt("bloodpressure"));
            vitalSigns.setGlucoseLevel(rs.getInt("glucoselevel"));
            vitalSigns.setBodyTemp(rs.getInt("bodytemp"));
            vitalSigns.setRespirationRate(rs.getInt("respirationrate"));
            vitalSigns.setOxygenSaturation(rs.getInt("oxygensaturation"));
            vitalSigns.setPainLevel(rs.getString("painlevel"));
            vitalSigns.setDate(rs.getDate("date"));
            ls.add(vitalSigns);
        }
        return ls;
    }

    @Override
    public VitalSigns getVitalSignsById(int id) throws SQLException {
        String query
                = "select * from pharmacy where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        VitalSigns vitalSigns = new VitalSigns();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
      
        while (rs.next()) {
            check = true;
            vitalSigns.setId(rs.getInt("id"));
            vitalSigns.setPatientId(rs.getInt("patientid"));
            vitalSigns.setBloodPressure(rs.getInt("bloodpressure"));
            vitalSigns.setGlucoseLevel(rs.getInt("glucoselevel"));
            vitalSigns.setBodyTemp(rs.getInt("bodytemp"));
            vitalSigns.setRespirationRate(rs.getInt("respirationrate"));
            vitalSigns.setOxygenSaturation(rs.getInt("oxygensaturation"));
            vitalSigns.setPainLevel(rs.getString("painlevel"));
            vitalSigns.setDate(rs.getDate("date"));
        }

        if (check == true) {
            return vitalSigns;
        } else {
            return null;
        }
    }

    @Override
    public void update(VitalSigns vitalSigns) throws SQLException {

        String query
                = "update vitalsigns set  bloodpressure= ?, glucoselevel= ?,"
                + " bodytemp= ?,  respirationrate= ?, oxygensaturation= ?,"
                + " painlevel= ? "
                + "where id = ? ";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, vitalSigns.getBloodPressure());
        ps.setInt(2, vitalSigns.getGlucoseLevel());
        ps.setInt(3, vitalSigns.getBodyTemp());
        ps.setInt(4, vitalSigns.getRespirationRate());
        ps.setInt(5, vitalSigns.getOxygenSaturation());
        ps.setString(6, vitalSigns.getPainLevel());
        ps.setInt(7, vitalSigns.getId());
        ps.executeUpdate();
    }
}
