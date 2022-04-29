/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.daos;

import static info.pkg5100.finalproject.daos.NetworkDaoImplementation.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author hazel
 */
public class SystemReportDaoImplementation implements SystemReportDao{

    @Override
    public HashMap<String, Integer> getReportIncidentCountWithLocation() throws SQLException {
        String query="Select location,count(*) as incidents FROM incidentcases group by location";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        HashMap<String, Integer> map = new HashMap<>();
        while(rs.next()){
           map.put(rs.getString("location"),rs.getInt("incidents"));
        }
        return map;
    }

    @Override
    public HashMap<String, HashMap<String, Integer>> getEmpCountLocationSpecificOrganization() throws SQLException {
        String query="Select o.location,o.name,count(*) as empcount from \n" +
                    "organizations o left join users u\n" +
                    " on o.id=u.orgid\n" +
                    "group by o.name,o.location;";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        HashMap<String, HashMap<String, Integer>> map= new HashMap<>();
        HashMap<String, Integer> sub=new HashMap<>();
        while(rs.next()){
            sub.put(rs.getString("name"),rs.getInt("empcount"));
            map.put(rs.getString("location"), sub);
        }
        return map;    
    }
    
    
    
}
