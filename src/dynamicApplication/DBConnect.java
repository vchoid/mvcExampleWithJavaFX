package dynamicApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author Narayan
 */

public class DBConnect {

    private static Connection conn;
    private static String url = "jdbc:derby://localhost:1527/ServerPortDB;";
    private static String user = "vchoid";
    private static String pass = "flaig";

    public static Connection connect() throws SQLException{
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }catch(ClassNotFoundException cnfe){
            System.err.println("Error: "+cnfe.getMessage());
        }

        conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        if(conn !=null && !conn.isClosed())
            return conn;
        connect();
        return conn;

    }
}