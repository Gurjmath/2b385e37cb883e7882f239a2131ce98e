/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentSubmit;

/**
 * @author Gurjeet
 */
//library imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SDBconnect {
    //initialising variables
    //change to your localhost in your database
    private final String host = "jdbc:derby://localhost:1527/Student";
    private String username;
    private String password;
    
    public void connect(String user, String pass){
        try {
            //try to connect to the database
            this.username = user;
            this.password = pass;
        
            Connection con = DriverManager.getConnection(host, username, password);
        }
        catch (SQLException err) {
            //if connection fails, throw error
            System.out.println(err.getMessage());
        }
    }
}