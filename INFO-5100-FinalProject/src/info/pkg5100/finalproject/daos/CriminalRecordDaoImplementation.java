/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.daos;

import static info.pkg5100.finalproject.daos.LabRequestDaoImplementation.con;
import info.pkg5100.finalproject.models.LabRequest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gaurav
 */
public class CriminalRecordDaoImplementation implements CriminalRecordDao{

    @Override
    public int add(int patientId, String status) throws SQLException {
        String query
                = "insert into patientcriminalrecord(patientid, criminalrecord)"
                + " VALUES (?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, patientId);
        ps.setString(2, status);
        
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int patientId) throws SQLException {
        String query
                = "delete from patientcriminalrecord where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, patientId);
        ps.executeUpdate();
    }

    @Override
    public String getCriminalRecordByPatientId(int patientId) throws SQLException {
        String query
                = "select * from patientcriminalrecord where patientId= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, patientId);
        String record = "";
        ResultSet rs = ps.executeQuery();
       
        while (rs.next()) {
            
            record = rs.getString("criminalrecord");
            
        }

        return record;
    }

    @Override
    public void update(int patientId, String status) throws SQLException {
       String query
                = "update patientcriminalrecord set criminalrecord=? "
                + "where patientId = ? ";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, patientId);
        ps.setString(2, status);
        ps.executeUpdate(); 
    }
    
}
