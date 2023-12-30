
package ConnectionHandler;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class ConnectionHandle {
    public static Connection makeConnection() throws ClassNotFoundException, SQLException{
        try{
            
            Class.forName("com.mysql.jdbc.Driver");   
            String url = "jdbc:mysql://127.0.0.1/blood bank database";
            String user = "root";
            String password = ""; 
            Connection c = (Connection) DriverManager.getConnection(url,user,password);
            return c;
        }catch(Exception e){
        System.out.println("Something went wrong!");
        return null;
        }
        }
    }
