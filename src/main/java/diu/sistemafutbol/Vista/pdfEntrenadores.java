/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Vista;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class pdfEntrenadores {

    LocalDate fecha;

    String nombre;
    String apellido;
    String cedula;
    String telefono;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public pdfEntrenadores(LocalDate fecha, String nombre,
            String apellido, String cedula, String telefono
    ) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;

        documento = new Document();
        titulo = new Paragraph("Información de " + nombre + " " + apellido, new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD));
    }

    public void crarPdfAdministrador() throws IOException {
        try {
            archivo = new FileOutputStream("Informacion_de_" + nombre + "_" + apellido + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            documento.add(titulo);
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

            documento.add(Chunk.NEWLINE);
            Paragraph nombres = new Paragraph();
            nombres.add(new Chunk("Nombre Completo: ", negrita));
            nombres.add(nombre + " " + apellido);
            documento.add(nombres);

            documento.add(Chunk.NEWLINE);
            Paragraph cedulas = new Paragraph();
            cedulas.add(new Chunk("Cédula de Identidad: ", negrita));
            cedulas.add(cedula);
            documento.add(cedulas);

            documento.add(Chunk.NEWLINE);
            Paragraph telefonos = new Paragraph();
            telefonos.add(new Chunk("Teléfono: ", negrita));
            telefonos.add(telefono);
            documento.add(telefonos);

            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph(nombre + " " + apellido + " es una entrenadora"
                    + " de fútbol con una amplia experiencia en el campo. Su dedicación"
                    + " y pasión por el deporte han sido evidentes a lo largo de su"
                    + " carrera. Con un enfoque en el desarrollo integral de sus jugadores"
                    + ", " + nombre + " se ha destacado por su habilidad para motivar y guiar a"
                    + " su equipo hacia el éxito. Su conocimiento táctico y su capacidad"
                    + " para identificar y potenciar el talento individual hacen de"
                    + " el/la una figura invaluable en el mundo del fútbol. A través de su"
                    + " liderazgo y compromiso, " + nombre + " ha dejado una marca indeleble en la"
                    + " vida de sus jugadores y en el deporte en general.");
            texto.setAlignment(3);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();
            JOptionPane.showMessageDialog(null, "Archivo Creado con Exito");
            String rutaPDF = "C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\Informacion_de_" + nombre + "_" + apellido + ".pdf";
            abrirPDF(rutaPDF);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.out.println(e);
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
