
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gaurav
 */
public class PatientDAOImpl {

    public static void main(String[] args) {
        People p1 = new People(1, "G1", "12345",
                "g1@gmail.com", "227 H St, Boston");
        int res = DBConnector.executeInsertQuery(convertObjectToSqlInsert(p1));
        System.out.println(res);
        People p2 = new People(2, "G2", "12345",
                "g2@gmail.com", "227 H St, Boston");
        res = DBConnector.executeInsertQuery(convertObjectToSqlInsert(p2));
        System.out.println(res);
        
        People p3 = new People(3, "G3", "12345",
                "g3@gmail.com", "227 H St, Boston");
        res = DBConnector.executeInsertQuery(convertObjectToSqlInsert(p3));
        System.out.println(res);
          
        People p4 = new People(4, "G4", "12345",
                "g4@gmail.com", "227 H St, Boston");
        res = DBConnector.executeInsertQuery(convertObjectToSqlInsert(p4));
        System.out.println(res);
    }

    private static String convertObjectToSqlInsert(People people) {
        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("INSERT INTO hospital_mgmt.people")
                .append("(id, name, phoneNumber, emailId, address)")
                .append("values(").append(people.getId()).append(", '")
                .append(people.getName()).append("', '")
                .append(people.getPhoneNumber()).append("', '")
                .append(people.getEmailId()).append("', '")
                .append(people.getAddress())
                .append("');");
        return sqlQuery.toString();
    }

}
