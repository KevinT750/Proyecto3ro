/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Modelo;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Estudiante {
    private String ciEstudiante;
    private int idCategoria;
    private Entrenador idEntrenador;
    private Representante ciRepresentante;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String telefono;
    private String provincia;
    private String ciudad;
    private String correo;
    private int edad;
    private String posicion;
    private String subposicion;
    private String nacionalidad;
    private double peso;
    private double estatura;
    private String estado;

    public Estudiante() {
    }

    public Estudiante(String ciEstudiante, int idCategoria, Entrenador idEntrenador, Representante ciRepresentante, String nombres, String apellidos, Date fechaNacimiento, String telefono, String provincia, String ciudad, String correo, int edad, String posicion, String subposicion, String nacionalidad, double peso, double estatura, String estado) {
        this.ciEstudiante = ciEstudiante;
        this.idCategoria = idCategoria;
        this.idEntrenador = idEntrenador;
        this.ciRepresentante = ciRepresentante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.correo = correo;
        this.edad = edad;
        this.posicion = posicion;
        this.subposicion = subposicion;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.estatura = estatura;
        this.estado = estado;
    }

    

    public String getCiEstudiante() {
        return ciEstudiante;
    }

    public void setCiEstudiante(String ciEstudiante) {
        this.ciEstudiante = ciEstudiante;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Entrenador getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(Entrenador idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public Representante getCiRepresentante() {
        return ciRepresentante;
    }

    public void setCiRepresentante(Representante ciRepresentante) {
        this.ciRepresentante = ciRepresentante;
    }

   

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getSubposicion() {
        return subposicion;
    }

    public void setSubposicion(String subposicion) {
        this.subposicion = subposicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
