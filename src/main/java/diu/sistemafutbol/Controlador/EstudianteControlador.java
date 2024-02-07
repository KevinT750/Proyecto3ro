/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Controlador;

import diu.sistemafutbol.Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kevin
 */
public class EstudianteControlador {

    private Estudiante estudiante;
    Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public EstudianteControlador() {
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void crearEsudiante(Estudiante es) {
        try {
            String SQL = "CALL InsertarEstudiante ('" + es.getCiEstudiante() + "','"
                    + es.getNombres() + "','"
                    + es.getApellidos() + "','"
                    + es.getFechaNacimiento() + "','"
                    + es.getTelefono() + "','"
                    + es.getProvincia() + "','"
                    + es.getCiudad() + "','"
                    + es.getCorreo() + "','"
                    + es.getEdad() + "','"
                    + es.getPosicion() + "','"
                    + es.getSubposicion() + "','"
                    + es.getNacionalidad() + "','"
                    + es.getPeso() + "','"
                    + es.getEstatura() + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);

            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("Estudiante Creado con Exito");
                ejecutar.close();

            } else {

                System.out.println("Revise la informacion ingresada");
            }
        } catch (SQLException e) {
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA" + e);
        }
    }
}
