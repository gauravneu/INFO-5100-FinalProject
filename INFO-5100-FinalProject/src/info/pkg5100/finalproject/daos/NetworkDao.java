/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package info.pkg5100.finalproject.daos;

import info.pkg5100.finalproject.models.Network;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hazel
 */
public interface NetworkDao {
     public int add(Network network)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public Network getNetworkById(int id)
            throws SQLException;
    public List<Network> getNetworks()
            throws SQLException;
    public void update(Network network)
            throws SQLException;
}
