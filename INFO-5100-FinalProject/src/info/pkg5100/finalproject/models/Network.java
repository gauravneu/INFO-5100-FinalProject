/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.models;

/**
 *
 * @author hazel
 */
public class Network {
    int id;
    String networkName;
    
    public Network(int id, String networkName){
        this.id=id;
        this.networkName=networkName;
    }
    
    public Network(){
        this.id=-1;
        this.networkName="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }  

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
    
}
