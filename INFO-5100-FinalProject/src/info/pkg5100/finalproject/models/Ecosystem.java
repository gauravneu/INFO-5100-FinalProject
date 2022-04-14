/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.models;

import com.azul.crs.client.models.Network;
import java.util.ArrayList;
import info.pkg5100.finalproject.models.Employee;

/**
 *
 * @author gaurav
 */
public class Ecosystem {
    private ArrayList<Employee> emplist = new ArrayList<>();
    private static Ecosystem newSystem;
    private ArrayList<Network> networkList;
    public static Ecosystem getInstance(){
        if(newSystem==null){
            newSystem=new Ecosystem();
        }
        return newSystem;
    }
    
    public ArrayList<Employee> getEmployeeDirectory(){
        return emplist;
    }
    
    
    
}
