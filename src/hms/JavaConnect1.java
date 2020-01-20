package hms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CM Chandan
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect1 {
    Connection conn;
    public static Connection connecrDb(){
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
        return conn;
       
    }catch(Exception e) {
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
    

}
    
}
