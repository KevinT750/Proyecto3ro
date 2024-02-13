/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Modelo;


import java.time.LocalDate;

/**
 *
 * @author Belial
 */
public class Pagos {
    private int idPago;
    private String NombreEs;
    private String ApellidoEs;
    private Estudiante ciEstudiante;
    private LocalDate fechaPago;
    private String estado;
    private double monto;

    public Pagos() {
    }

    public Pagos(int idPago, String NombreEs, String ApellidoEs, Estudiante ciEstudiante, LocalDate fechaPago, String estado, double monto) {
        this.idPago = idPago;
        this.NombreEs = NombreEs;
        this.ApellidoEs = ApellidoEs;
        this.ciEstudiante = ciEstudiante;
        this.fechaPago = fechaPago;
        this.estado = estado;
        this.monto = monto;
    }

    public String getNombreEs() {
        return NombreEs;
    }

    public void setNombreEs(String NombreEs) {
        this.NombreEs = NombreEs;
    }

    public String getApellidoEs() {
        return ApellidoEs;
    }

    public void setApellidoEs(String ApellidoEs) {
        this.ApellidoEs = ApellidoEs;
    }

  

    

    

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Estudiante getCiEstudiante() {
        return ciEstudiante;
    }

    public void setCiEstudiante(Estudiante ciEstudiante) {
        this.ciEstudiante = ciEstudiante;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
