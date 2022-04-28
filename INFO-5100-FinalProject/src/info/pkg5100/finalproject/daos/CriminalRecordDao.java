/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package info.pkg5100.finalproject.daos;

import java.sql.SQLException;

/**
 *
 * @author gaurav
 */
public interface CriminalRecordDao {
    public int add(int patientId,String status)
            throws SQLException;
    public void delete(int patientId)
            throws SQLException;
    public String getCriminalRecordByPatientId(int patientId)
            throws SQLException;
    public void update(int patientId,String status)
            throws SQLException;
}
