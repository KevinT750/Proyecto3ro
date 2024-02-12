/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Controlador;

import diu.sistemafutbol.Modelo.Estudiante;
import diu.sistemafutbol.Vista.VerEstudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
            
                String SQL = "CALL AgregarEstudiante ('" + es.getCiEstudiante() + "','"
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
                        + es.getEstatura() + "')";
                ejecutar = (PreparedStatement) conectado.prepareCall(SQL);

                int res = ejecutar.executeUpdate();
                if (res > 0) {
                    System.out.println("Estudiante Creado con Exito");
                    ejecutar.close();

                } else {

                    System.out.println("Revise la informacion ingresada del estudiante");
                }
            
        } catch (SQLException e) {
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA" + e);
        }
    }

    public ArrayList<Object[]> datosEstudiante() {
        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();
        try {

            String SQL = "call VerEstudiantes();";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            //int cont = 1;

            while (res.next()) {

                Object[] fila = new Object[15];
                for (int i = 0; i < 15; i++) {
                    fila[i] = res.getObject(i + 1);

                }
                //fila[0] = cont;
                listaTotalRegistro.add(fila);
                //cont++;
            }

            ejecutar.close();
            return listaTotalRegistro;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

    public ArrayList<Object[]> buscarPorNombre(String Nombre) {
        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();
        RepresentanteControlador p = new RepresentanteControlador();
        try {
            String SQL = "call bddescuelafutbol.BuscarPorNombre('" + Nombre + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while (res.next()) {

                Object[] fila = new Object[15];
                for (int i = 0; i < 15; i++) {
                    fila[i] = res.getObject(i + 1);

                }
                //fila[0] = cont;
                listaTotalRegistro.add(fila);
                //cont++;
            }

            ejecutar.close();
            return listaTotalRegistro;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

    public ArrayList<Object[]> buscarPorCI(String cedula) {
        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();

        try {
            String SQL = "call bddescuelafutbol.BuscarPersona('" + cedula + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while (res.next()) {

                Object[] fila = new Object[15];
                for (int i = 0; i < 15; i++) {
                    fila[i] = res.getObject(i + 1);

                }
                //fila[0] = cont;
                listaTotalRegistro.add(fila);
                //cont++;
            }

            ejecutar.close();
            return listaTotalRegistro;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public ArrayList<Object[]> estudiantesCategoria(int n) {

        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();

        try {
            String SQL = "CALL MostrarEstudiantesPorCategoria(" + n + ");";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while (res.next()) {

                Object[] fila = new Object[15];
                for (int i = 0; i < 15; i++) {
                    fila[i] = res.getObject(i + 1);

                }
                //fila[0] = cont;
                listaTotalRegistro.add(fila);
                //cont++;
            }

            ejecutar.close();
            return listaTotalRegistro;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

    public ArrayList<Object[]> datosActualizar(String n) {

        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();

        try {
            String SQL = "CALL ObtenerDatosEstudiantePorCedula(" + n + ");";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while (res.next()) {
                Object[] fila = new Object[8];
                fila[0] = res.getString("NOMBRES");
                fila[1] = res.getString("APELLIDOS");
                fila[2] = res.getString("TELEFONO");
                fila[3] = res.getString("CORREO");
                fila[4] = res.getString("Posicion");
                fila[5] = res.getString("SubPosicion");
                fila[6] = res.getDouble("PESO");
                fila[7] = res.getDouble("ESTATURA");

                listaTotalRegistro.add(fila);
            }

            ejecutar.close();
            return listaTotalRegistro;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

    public void actualizarEstudiantes(Estudiante es) {
        try {
            String SQL = "CALL ActualizarDatosEstudiante('" + es.getCiEstudiante() + "', '"
                    + es.getNombres() + "', '"
                    + es.getApellidos() + "', '"
                    + es.getTelefono() + "', '"
                    + es.getCorreo() + "', '"
                    + es.getPosicion() + "', '"
                    + es.getSubposicion() + "', "
                    + es.getPeso() + ", "
                    + es.getEstatura() + ");";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);

            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("Estudiante Actualizado con Exito");
                ejecutar.close();
            } else {
                System.out.println("Revise la información ingresada para actualizar");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
