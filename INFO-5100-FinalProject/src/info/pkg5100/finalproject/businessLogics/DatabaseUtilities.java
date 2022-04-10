/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.businessLogics;

import java.nio.file.Paths;

/**
 *
 * @author gaurav
 */
public class DatabaseUtilities {
    
    private static String FILENAME = Paths.get("DBFile.db4o").toAbsolutePath().toString();
    private static DatabaseUtilities databaseUtilities;
    
    public synchronized static DatabaseUtilities getInstance(){
        if (databaseUtilities == null){
            databaseUtilities = new DatabaseUtilities();
        }
        return databaseUtilities;
    }
}
