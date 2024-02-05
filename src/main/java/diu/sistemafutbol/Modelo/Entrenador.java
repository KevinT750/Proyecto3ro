/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Modelo;

/**
 *
 * @author kevin
 */
public class Entrenador {
    private int idEntrenador;
    private String nombreEnt;
    private String apellidoEnt;
    private String telefono;
    private String usuario;
    private String contrasena;

    public Entrenador(int idEntrenador, String nombreEnt, String apellidoEnt, String telefono, String usuario, String contrasena) {
        this.idEntrenador = idEntrenador;
        this.nombreEnt = nombreEnt;
        this.apellidoEnt = apellidoEnt;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Entrenador() {
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNombreEnt() {
        return nombreEnt;
    }

    public void setNombreEnt(String nombreEnt) {
        this.nombreEnt = nombreEnt;
    }

    public String getApellidoEnt() {
        return apellidoEnt;
    }

    public void setApellidoEnt(String apellidoEnt) {
        this.apellidoEnt = apellidoEnt;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
