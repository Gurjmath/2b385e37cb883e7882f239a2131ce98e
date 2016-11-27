/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ECS;

//geting the int "key" form program "StudentLogin", which key is SID
import static ECS.StudentLogin.key;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kenneth
 */

public class information {
    
    
    //geting the String "select" form program "page", which user's se;ection of corusework.
    String select = Page.select;
    //define the Sting fn,ln,sid,courseid,cid,cn,mid,mn,cwid,cwt,cwed for othe program use.
    String fn,ln,sid,courseid,cid,cn,mid,mn,cwid,cwt,cwed,moduleid;
    
    information(){
        try{
            //connecting to database.
            String location = "jdbc:derby://localhost:1527/Student";
            String username = "Admin1";
            String password = "password";
            
            Connection cnt = DriverManager.getConnection(location, username, password);
            Statement stmt = cnt.createStatement();
            
            //Query to select the student information uding the student id.
            String skey = "SELECT * FROM STUDENT WHERE STUDENT_ID = '"+ key +"'";
            ResultSet srs = stmt.executeQuery(skey);
            
            //go thought the database
            srs.next();
            
            //Setting Value 
            fn=srs.getString(2);
            ln=srs.getString(3);
            sid=srs.getString(1);
            //courseid= srs.getString(4); //the course id will be used as a key acesss 
            
            /*
            ///Using the course id to  get the information of the moudle
            String ckey = "SELECT * FROM COURSE WHERE COURSE_ID = '"+ courseid +"'";
            ResultSet crs = stmt.executeQuery(ckey);
            
            crs.next();
            cid=crs.getString(1);
            cn=crs.getString(2);
               
            
            ///Using the course id to  get the information of the moudle
            String mkey = "SELECT * FROM MODULE WHERE MODULE = '"+ select +"'";
            ResultSet mrs = stmt.executeQuery(mkey);
            
            
            mrs.next();
            
            mid = mrs.getString(1);//CWselectionAction.getSelectedItem()
            mn = mrs.getString(2);
            
            //geting inforamtion from database
            String cwkey = "SELECT * FROM COURSEWORK1 WHERE MODULE_ID = '"+mid+"'";
            ResultSet cwrs = stmt.executeQuery(cwkey);
            
            cwrs.next();
            cwid = cwrs.getString(1);
            cwt = cwrs.getString(2);
            cwed = cwrs.getString(5);
            */
            
            
            
            //geting inforamtion from database
            String cwkey = "SELECT * FROM COURSEWORK1 WHERE TITLE = '"+ select +"'";
            ResultSet cwrs = stmt.executeQuery(cwkey);
            
            cwrs.next();
            cwid = cwrs.getString(1);
            cwt = cwrs.getString(2);
            cwed = cwrs.getString(5);
            mid = cwrs.getString(6);
            
            ///Using the course id to  get the information of the moudle
            String mkey = "SELECT * FROM MODULE WHERE MODULE_ID = '"+ mid +"'";
            ResultSet mrs = stmt.executeQuery(mkey);
            
            
            mrs.next();
            moduleid = mrs.getString(1);
            mn = mrs.getString(2);
            cid=mrs.getString(4);
            
            //Using the course id to  get the information of the moudle
            String ckey = "SELECT * FROM COURSE WHERE COURSE_ID = '"+ cid +"'";
            ResultSet crs = stmt.executeQuery(ckey);
            
            crs.next();
            //cid=crs.getString(1);
            cn=crs.getString(2);
            
            
            
            
            
            
            
            
            }catch(SQLException ex) {
                System.out.println(ex);
            }
    }
}
