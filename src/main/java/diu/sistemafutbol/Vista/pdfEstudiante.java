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
public class pdfEstudiante {

    LocalDate fecha;

    String nombre;
    String apellido;
    String cedula;
    String telefono;
    String edad;
    String correo;
    String posicion;
    String subposicion;
    String peso;
    String altura;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public pdfEstudiante() {
    }

    public pdfEstudiante(LocalDate fecha, String nombre,
            String apellido, String cedula, String telefono,
            String edad, String correo, String posicion,
            String subposicion, String peso, String altura) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
        this.posicion = posicion;
        this.subposicion = subposicion;
        this.peso = peso;
        this.altura = altura;

        documento = new Document();
        titulo = new Paragraph("Información de " + nombre + " " + apellido, new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD));
    }

    public void crarPdfE() throws IOException {
        try {
            archivo = new FileOutputStream("Información_de_" + nombre + "_" + apellido + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            documento.add(titulo);
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

            Paragraph nombres = new Paragraph();
            nombres.add(new Chunk("Nombre Completo: ", negrita));
            nombres.add(nombre + " " + apellido);
            documento.add(nombres);

            Paragraph cedulas = new Paragraph();
            cedulas.add(new Chunk("Cédula de Identidad: ", negrita));
            cedulas.add(cedula);
            documento.add(cedulas);

            Paragraph telefonos = new Paragraph();
            telefonos.add(new Chunk("Teléfono: ", negrita));
            telefonos.add(telefono);
            documento.add(telefonos);

            Paragraph edades = new Paragraph();
            edades.add(new Chunk("Edad: ", negrita));
            edades.add(edad);
            documento.add(edades);

            Paragraph correos = new Paragraph();
            correos.add(new Chunk("Correo Electrónico: ", negrita));
            correos.add(correo);
            documento.add(correos);

            Paragraph posiciones = new Paragraph();
            posiciones.add(new Chunk("Posición: ", negrita));
            posiciones.add(posicion);
            documento.add(posiciones);

            Paragraph subposiciones = new Paragraph();
            subposiciones.add(new Chunk("Subposición: ", negrita));
            subposiciones.add(subposicion);
            documento.add(subposiciones);

            Paragraph pesos = new Paragraph();
            pesos.add(new Chunk("Peso: ", negrita));
            pesos.add(peso);
            documento.add(pesos);

            Paragraph alturas = new Paragraph();
            alturas.add(new Chunk("Altura: ", negrita));
            alturas.add(altura);
            documento.add(alturas);

            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph(nombre + " " + apellido + " es un estudiante de fútbol"
                    + " que ocupa la posición de "+posicion+", específicamente"
                    + " como "+subposicion+". Con "+ edad+" años, posee una"
                    + " estructura física adecuada para su posición, con"
                    + " un peso de "+peso+" kg y una altura de "+altura+"m. Su participación"
                    + " en el equipo se destaca por su desempeño en la zona ofensiva,"
                    + " contribuyendo al ataque y aportando soluciones en la creación"
                    + " de jugadas.");
            texto.setAlignment(3);
            documento.add(texto);
            
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();
            JOptionPane.showMessageDialog(null, "Archivo Creado con Exito");
            String rutaPDF = "C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\Información_de_" + nombre + "_" + apellido + ".pdf";
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
