package info.pkg5100.finalproject.utils;

import info.pkg5100.finalproject.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class SimpleTools {
    static Connection con = DatabaseConnection.getConnection();

    public static int getRandomNumber(int low, int high) {
        Random r = new Random();
        int result = r.nextInt(high-low) + low;

        return result;
    }

    public static int getUnusedId(String tableName, int low, int high) throws SQLException {
        int currentTestId = getRandomNumber(low, high);
        boolean check = false;

        while(!check) {
            System.out.println(currentTestId);
            String query = "select * from " + tableName + " where id= ?";
            PreparedStatement ps
                    = con.prepareStatement(query);

            ps.setInt(1, currentTestId);
            ResultSet rs = ps.executeQuery();

            if(!rs.next())
                check = true;

            if (check == true) {
               break;
            }
            else
                currentTestId = getRandomNumber(low, high);
        }

        return currentTestId;
    }

 
        public static List<String> getPossibleRoles(String organizationType) {
        List<String> roles = new ArrayList<>();
        if (organizationType.equals("Incidence Management Police")) {

            roles.add("incident-police");

        } else if (organizationType.equals("Ambulance")) {

            roles.add("ambulance-emp");

        } else if (organizationType.equals("Doctor")) {

            
            roles.add("hospital-manager");

        } else if (organizationType.equals("Detention")) {

            roles.add("detention-manager");

        } else if (organizationType.equals("Investigation Police")) {

            roles.add("investigation-police");

        } else if (organizationType.equals("Lab Technician")) {

            roles.add("lab-technician");

        } else if (organizationType.equals("Pharmacist")) {

            roles.add("pharmacist");

        } else {
            roles.add("housing-manager");
            
        }

        return roles;
    }
    
    
    
}
