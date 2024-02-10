/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Controlador;

import diu.sistemafutbol.Modelo.Entrenador;
import diu.sistemafutbol.Modelo.Estudiante;
import diu.sistemafutbol.Vista.Login;
import diu.sistemafutbol.Vista.Menu;
import diu.sistemafutbol.Vista.MenuUsuario;
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

    public boolean inisiarSesion(Entrenador es) {
        try {
            String SQL = "SELECT ID_ENTRENADOR, NOMBREENT, APELLIDOENT, Rol "
                    + "FROM Entrenadores "
                    + "WHERE Usuario = '" + es.getUsuario() + "' AND Contrasenia = '" + es.getContrasena() + "';";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();

            if (res.next()) {
                String rol = res.getString("Rol");
                String Nombre = res.getString("NOMBREENT");
                System.out.println("Bienvenido " + Nombre);
                JOptionPane.showMessageDialog(null, "Bienvenido " + Nombre);

                if (rol.equalsIgnoreCase("Usuario")) {
                    MenuUsuario m = new MenuUsuario();
                    m.setVisible(true);
                    Login l = new Login();
                    l.dispose();
                } else {
                    Menu m = new Menu();
                    m.setVisible(true);
                    Login l = new Login();
                    l.dispose();

                }

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

    public void CrearEntrenador(Entrenador es) {

        try {
            String SQL = "CALL InsertarEntrenador('" + es.getCedulaE()
                    + "', '" + es.getNombreEnt()
                    + "', '" + es.getApellidoEnt()
                    + "', '" + es.getTelefono()
                    + "', '" + es.getUsuario()
                    + "', '" + es.getContrasena()
                    + "', '" + es.getRol() + "')";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("Entrenador Creado con Exito");
                ejecutar.close();

            } else {

                System.out.println("Revise la informacion ingresada");
            }
        } catch (Exception e) {
        }
    }

    public ArrayList<Object[]> datosEntrenador() {
        ArrayList<Object[]> listaEntrenador = new ArrayList<>();
        try {
            String SQL = "CALL MostrarEntrenadores()";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();

            while (res.next()) {
                Object[] fila = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listaEntrenador.add(fila);

            }
            res.close();
            return listaEntrenador;
        } catch (Exception e) {
            System.out.println(e);

        }
        return null;

    }

    public ArrayList<Object[]> buscarRol(String c) {
        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();

        try {
            String SQL = "call MostrarEntrenadoresPorRol('" + c + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while (res.next()) {

                Object[] fila = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = res.getObject(i + 1);

                }
                //fila[0] = cont;
                listaTotalRegistro.add(fila);
                //cont++;
            }

            ejecutar.close();
            return listaTotalRegistro;
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;

    }
    public ArrayList<Object[]> buscarNombre(String nombre) {
        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();

        try {
            String SQL = "call MostrarEntrenadoresPorNombre('" + nombre + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while (res.next()) {

                Object[] fila = new Object[8];
                for (int i = 0; i < 8; i++) {
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
    public ArrayList<Object[]> buscarCedula(String cedula) {
        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();

        try {
            String SQL = "call MostrarEntrenadoresPorCedula('" + cedula + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while (res.next()) {

                Object[] fila = new Object[8];
                for (int i = 0; i < 8; i++) {
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
}
