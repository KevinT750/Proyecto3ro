/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Controlador;

import diu.sistemafutbol.Modelo.Entrenador;
import diu.sistemafutbol.Vista.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class EntrenadorControlador {

    private Entrenador entrenador;
    Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public EntrenadorControlador() {
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public boolean inisiarSesion(String Usuario, String Contrasenia) {
        try {
            String SQL = "SELECT ID_ENTRENADOR, NOMBREENT, APELLIDOENT "
                    + "FROM Entrenadores "
                    + "WHERE Usuario = '" + Usuario + "' AND Contrasenia = '" + Contrasenia + "';";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();

            if (res.next()) {

                System.out.println("Bienvenido " + Usuario);
                JOptionPane.showMessageDialog(null, "Bienvenido " + Usuario);
                ejecutar.close();

                return true;
            } else {
                System.out.println("Usuario o Contraseña incorrecto");
                 ejecutar.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error de coneccion" + e);
            return false;
        }

    }
}
