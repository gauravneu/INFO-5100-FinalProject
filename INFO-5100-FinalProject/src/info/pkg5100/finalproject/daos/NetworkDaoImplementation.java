/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.daos;

import static info.pkg5100.finalproject.daos.EnterpriseDaoImplementation.con;
import info.pkg5100.finalproject.models.Network;
import info.pkg5100.finalproject.utils.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hazel
 */
public class NetworkDaoImplementation implements NetworkDao {

        static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(Network network) throws SQLException {
        String query
                = "insert into networks(id, networkName) VALUES (?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, network.getId());
        ps.setString(2, network.getNetworkName());
    
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from networks where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Network getNetworkById(int id) throws SQLException {
        String query
                = "select * from networks where id= ?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setInt(1, id);
        Network network = new Network();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            network.setId(rs.getInt("id"));    
            network.setNetworkName(rs.getString("networkName"));
        }

        if (check == true) {
            return network;
        }
        else
            return null;
    }

    @Override
    public List<Network> getNetworks() throws SQLException {
        String query = "select * from networks";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Network> ls = new ArrayList();

        while (rs.next()) {
            Network network = new Network();
            network.setId(rs.getInt("id"));
            network.setNetworkName(rs.getString("networkName"));
            
            ls.add(network);
        }
        return ls;
    }

    @Override
    public void update(Network network) throws SQLException {
         String query
                = "update networks set name=? "
                    +" where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, network.getNetworkName());
        ps.setInt(2, network.getId());
        ps.executeUpdate();
    }
    
}
