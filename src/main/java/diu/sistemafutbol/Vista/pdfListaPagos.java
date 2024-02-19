/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Vista;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Controlador.PagosControlador;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class pdfListaPagos {

    ArrayList<Object[]> ListaPagos = new ArrayList<>();
    LocalDate fecha;

    Document documento;

    FileOutputStream archivo;
    Paragraph titulo;

    public pdfListaPagos() {
    }

    public pdfListaPagos(LocalDate fecha, ArrayList<Object[]> ListaPagos) {
        this.fecha = fecha;
        this.ListaPagos = ListaPagos;
        documento = new Document();
        titulo = new Paragraph("Lista de Estudiantes de Pagos");
    }

    public void crearpdfTablas() throws IOException {
        try {
            archivo = new FileOutputStream("Lista de pagos.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            // Crear la tabla con los anchos de columna definidos
            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidthPercentage(100);

            PdfPCell num = new PdfPCell(new Phrase("Cedula"));
            num.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(num);

            PdfPCell ced = new PdfPCell(new Phrase("Nombre"));
            ced.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(ced);

            PdfPCell name = new PdfPCell(new Phrase("Apellido"));
            name.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(name);

            PdfPCell ape = new PdfPCell(new Phrase("Fecha de pago"));
            ape.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(ape);

            PdfPCell nac = new PdfPCell(new Phrase("Estado"));
            nac.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(nac);

            PdfPCell tel = new PdfPCell(new Phrase("Monto"));
            tel.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(tel);

            PagosControlador ec = new PagosControlador();
            ArrayList<Object[]> listaPagos = ec.obtenerPagos();
            for (Object[] fila : listaPagos) {

                tabla.addCell((String) fila[0]);
                tabla.addCell((String) fila[1]);
                tabla.addCell((String) fila[2]);
                java.sql.Date fecha = (java.sql.Date) fila[3];
                String fechaString = fecha.toString();
                tabla.addCell(fechaString);
                tabla.addCell((String) fila[4]);
                Double monto = (Double) fila[5]; // Suponiendo que fila[5] contiene el monto como Double
                String montoString = monto.toString();
                tabla.addCell(montoString);

            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();

            JOptionPane.showMessageDialog(null, "Archivo creado con EXITO");
            String rutaPDF = "C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\Lista de pagos.pdf";
            abrirPDF(rutaPDF);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void crearpdfTablasEstado(String Estado) throws IOException {
        try {
            archivo = new FileOutputStream("Lista de pagos"+Estado+".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo = new Paragraph("Lista de Pagos de Estudiantes "+ Estado);
            titulo.setAlignment(1);

            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            // Crear la tabla con los anchos de columna definidos
            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidthPercentage(100);

            PdfPCell num = new PdfPCell(new Phrase("Cedula"));
            num.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(num);

            PdfPCell ced = new PdfPCell(new Phrase("Nombre"));
            ced.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(ced);

            PdfPCell name = new PdfPCell(new Phrase("Apellido"));
            name.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(name);

            PdfPCell ape = new PdfPCell(new Phrase("Fecha de pago"));
            ape.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(ape);

            PdfPCell nac = new PdfPCell(new Phrase("Estado"));
            nac.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(nac);

            PdfPCell tel = new PdfPCell(new Phrase("Monto"));
            tel.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(tel);

            PagosControlador ec = new PagosControlador();
            ArrayList<Object[]> listaPagos = ec.VerPagosEstado(Estado);
            for (Object[] fila : listaPagos) {

                tabla.addCell((String) fila[0]);
                tabla.addCell((String) fila[1]);
                tabla.addCell((String) fila[2]);
                java.sql.Date fecha = (java.sql.Date) fila[3];
                String fechaString = fecha.toString();
                tabla.addCell(fechaString);
                tabla.addCell((String) fila[4]);
                Double monto = (Double) fila[5]; // Suponiendo que fila[5] contiene el monto como Double
                String montoString = monto.toString();
                tabla.addCell(montoString);

            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();

            JOptionPane.showMessageDialog(null, "Archivo creado con EXITO");
            String rutaPDF = "C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\Lista de pagos"+Estado+".pdf";
            abrirPDF(rutaPDF);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void abrirPDF(String rutaPDF) throws IOException {
        File archivoPDF = new File(rutaPDF);
        if (archivoPDF.exists()) {
            Desktop.getDesktop().open(archivoPDF);
        } else {
            System.out.println("El archivo PDF no existe en la ruta especificada.");
        }
    }
}
