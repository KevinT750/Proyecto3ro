/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Modelo;

/**
 *
 * @author kevin
 */
public class Representante {
    private String ciRepresentante;
    private String nombreRep;
    private String apellidoRep;
    private String telefono;

    public Representante() {
    }

    public Representante(String ciRepresentante, String nombreRep, String apellidoRep, String telefono) {
        this.ciRepresentante = ciRepresentante;
        this.nombreRep = nombreRep;
        this.apellidoRep = apellidoRep;
        this.telefono = telefono;
    }

    public String getCiRepresentante() {
        return ciRepresentante;
    }

    public void setCiRepresentante(String ciRepresentante) {
        this.ciRepresentante = ciRepresentante;
    }

    public String getNombreRep() {
        return nombreRep;
    }

    public void setNombreRep(String nombreRep) {
        this.nombreRep = nombreRep;
    }

    public String getApellidoRep() {
        return apellidoRep;
    }

    public void setApellidoRep(String apellidoRep) {
        this.apellidoRep = apellidoRep;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
