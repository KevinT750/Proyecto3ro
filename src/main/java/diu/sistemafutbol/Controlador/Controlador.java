/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Controlador;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kevin
 */
public class Controlador {
    java.sql.Connection conexion;
     public java.sql.Connection conectar(){
        //LANZAR CÓDIGO DE PRUEBA 
        try {
            //Manera de Conexión a la Base de Datos
            Class.forName("com.mysql.jdbc.Driver");
            //Parámetros de conexión url/usuario/clave en mysql
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/bddescuelafutbol1?autoReconnect=true&useSSL=false","root","Holagerman1.");
            System.out.println("CONECTADO"); 
        } catch (ClassNotFoundException | SQLException e)//CAPTURAR ERRORES 
        {
             System.out.println("ERROR DE CONEXION A LA BASE DE DATOS");
        }
        return conexion;
    }
    
}
