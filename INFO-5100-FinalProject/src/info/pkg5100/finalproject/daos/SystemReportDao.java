/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.daos;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hazel
 */
public interface SystemReportDao {
    public HashMap<String,Integer> getReportIncidentCountWithLocation()
            throws SQLException; 
    public Map<String,Map<String,Integer>> getEmpCountLocationSpecificOrganization()
            throws SQLException; 
}
