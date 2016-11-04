package Disputes;

//library imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wise
 */
public class DBConnect {
    //initialising variables
    //change to your localhost in your database
    private final String host = "jdbc:derby://localhost:1527/ECS";
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
