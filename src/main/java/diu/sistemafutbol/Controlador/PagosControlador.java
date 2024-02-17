/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Controlador;

import diu.sistemafutbol.Modelo.Estudiante;
import diu.sistemafutbol.Modelo.Pagos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PagosControlador {
    
    private Pagos pagos;
    Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    

    public PagosControlador() {
    
    }
    
    public Pagos getPagos() {
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }
    
    
    
    
// public ArrayList<Object[]> datosPagos() {
//        ArrayList<Object[]> listaTotalPagos = new ArrayList<>();
//        try {
//
//            String SQL = "call VerPagos();";
//            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
//            ResultSet res = ejecutar.executeQuery();
//            //int cont = 1;
//
//            while (res.next()) {
//
//                Object[] fila = new Object[15];
//                for (int i = 0; i < 7; i++) {
//                    fila[i] = res.getObject(i + 1);
//
//                }
//                //fila[0] = cont;
//                listaTotalPagos.add(fila);
//                //cont++;
//            }
//
//            ejecutar.close();
//            return listaTotalPagos;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return null;
//
//    }
 
 
    public ArrayList<Object[]> buscarPorCI(String cedula) {
        ArrayList<Object[]> listaTotalRegistro = new ArrayList<>();

        try {
            String SQL = "call bddescuelafutbol.BuscarPersona('" + cedula + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while (res.next()) {

                Object[] fila = new Object[15];
                for (int i = 0; i < 7; i++) {
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

 public ArrayList<Object[]> obtenerPagos() {
        ArrayList<Object[]> listaPagos = new ArrayList<>();

        try {
            String SQL = "{CALL VerPagos()}";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();

            while (res.next()) {
                Object[] fila = new Object[6];
                fila[0] = res.getString("CI_ESTUDIANTE");
                fila[1] = res.getString("NOMBRES");
                fila[2] = res.getString("APELLIDOS");
                fila[3] = res.getDate("FECHA_PAGO");
                fila[4] = res.getString("Estado");
                fila[5] = res.getDouble("Monto");
                listaPagos.add(fila);
            }

            res.close();
            ejecutar.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPagos;
    }
}
   
    
    



