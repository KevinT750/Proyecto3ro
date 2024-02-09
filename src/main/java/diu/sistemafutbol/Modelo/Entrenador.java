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
    private String CedulaE;
    private String nombreEnt;
    private String apellidoEnt;
    private String telefono;
    private String usuario;
    private String contrasena;
    private String rol;

    public Entrenador(int idEntrenador, String CedulaE, String nombreEnt, String apellidoEnt, String telefono, String usuario, String contrasena, String rol) {
        this.idEntrenador = idEntrenador;
        this.CedulaE = CedulaE;
        this.nombreEnt = nombreEnt;
        this.apellidoEnt = apellidoEnt;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Entrenador() {
    }

    public String getCedulaE() {
        return CedulaE;
    }

    public void setCedulaE(String CedulaE) {
        this.CedulaE = CedulaE;
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
