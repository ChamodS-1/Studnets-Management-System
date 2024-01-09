/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fireship.student.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author E-ZONE
 */
public class DBConnection {
    
    public static Connection connect() throws SQLException{
        Connection conn = null;
        
        
		String url = "jdbc:mysql://localhost:3306/crudsystem";
		String user = "root";
		String password = "";
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
	   conn = (Connection) DriverManager.getConnection(url, user, password);
           System.out.println("Successfull");  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
}
