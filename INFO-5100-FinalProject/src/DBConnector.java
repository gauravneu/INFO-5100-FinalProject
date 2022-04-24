
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gaurav
 */
public class DBConnector {

    public static ResultSet executeSelectQuery(String sqlStatement) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aed", "root", "root1234");
//here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlStatement);
            con.close();
            return rs;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException sqe) {
                System.out.println(sqe.getMessage());
            }

        }
        return null;
    }
    
        public static int executeInsertQuery(String sqlStatement) {
        Connection con = null;
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            //here aed is database name, root is username and password  
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aed", "root", "root1234");
            
            PreparedStatement stmt=con.prepareStatement(sqlStatement);  
            return stmt.executeUpdate(); 
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException sqe) {
                System.out.println(sqe.getMessage());
            }
        }
        return 0;
    }

    public static Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aed", "root", "root1234");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException sqe) {
            System.out.println(sqe.getMessage());
        }
    }
}
