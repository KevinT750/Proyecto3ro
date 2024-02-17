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
    private String ciEstudiante;
//    private String NombreEs;
//    private String ApellidoEs;
    private LocalDate fechaPago;
    private String estado;
    private double monto;

    public Pagos() {
    }

    public Pagos(int idPago, String ciEstudiante, LocalDate fechaPago, String estado, double monto) {
        this.idPago = idPago;
        this.ciEstudiante = ciEstudiante;
        this.fechaPago = fechaPago;
        this.estado = estado;
        this.monto = monto;
    }

    public String getCiEstudiante() {
        return ciEstudiante;
    }

    public void setCiEstudiante(String ciEstudiante) {
        this.ciEstudiante = ciEstudiante;
    }


   


    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
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
