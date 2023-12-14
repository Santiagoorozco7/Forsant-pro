/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author USER
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class conexion {
    Connection con;
    public conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FORSANT", "root", "Santiago");
        } catch (Exception e){
         System.out.println(e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}

