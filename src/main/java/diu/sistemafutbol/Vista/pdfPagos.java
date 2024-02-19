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
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class pdfPagos {

    LocalDate fecha;
    String Cedula;
    String nombre;
    String apellido;
    String Fecha;
    String Estado;
    String Monto;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public pdfPagos() {
    }

    public pdfPagos(LocalDate fecha, String Cedula, String nombre, String apellido, String Fecha, String Estado, String Monto) {
        this.fecha = fecha;
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.Monto = Monto;

        documento = new Document();
        titulo = new Paragraph("Factura de " + nombre + " " + apellido, new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD));
    }

    public void crarPdfE() throws IOException {
        try {
            archivo = new FileOutputStream("Factura_de_" + nombre + "_" + apellido + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            documento.add(titulo);
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("Estimado/a " + nombre + " " + apellido + ",");
            texto.setAlignment(3);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            LocalDate fechaActual = LocalDate.now();
            Month mes = fechaActual.getMonth();

            String nombreMes = mes.getDisplayName(TextStyle.FULL, Locale.getDefault());
            int anio = fechaActual.getYear();
            Paragraph texto1 = new Paragraph("Es un placer dirigirnos a usted en esta "
                    + "ocasión para proporcionarle detalles sobre su factura mensual "
                    + "correspondiente a los servicios ofrecidos por nuestra Escuela de "
                    + "Fútbol durante el mes de " + nombreMes + " del año " + anio + ".");
            texto.setAlignment(3);
            documento.add(texto1);
            documento.add(Chunk.NEWLINE);
            Paragraph fechas = new Paragraph();
            fechas.add(new Chunk("Fecha de Pago: ", negrita));
            fechas.add(Fecha);
            documento.add(fechas);

            Paragraph estados = new Paragraph();
            estados.add(new Chunk("Estado: ", negrita));
            estados.add(Estado);
            documento.add(estados);
            documento.add(Chunk.NEWLINE);
            Paragraph texto2 = new Paragraph("Agradecemos su participación continua y "
                    + "su compromiso con el desarrollo deportivo. El total a pagar por "
                    + "el período mencionado es de " + Monto + ". Le recordamos "
                    + "que el plazo para realizar el pago vence el al terminar el mes de "+nombreMes+
            ". "
                    + "En caso de haber realizado el pago correspondiente, le agradecemos "
                    + "sinceramente y no necesita tomar ninguna acción adicional.");
            texto.setAlignment(3);
            documento.add(texto2);
            documento.add(Chunk.NEWLINE);
            Paragraph texto3 = new Paragraph("Para cualquier consulta adicional o aclaración sobre"
                    + " esta factura, no dude en ponerse en contacto con nosotros. Estamos aquí "
                    + "para ayudarlo en todo lo que necesite.");
            texto.setAlignment(3);
            documento.add(texto3);
            documento.add(Chunk.NEWLINE);
             Paragraph texto4 = new Paragraph("¡Gracias por confiar en nuestra escuela de fútbol para el crecimiento y la formación deportiva de su hijo/a!");
            texto.setAlignment(3);
            documento.add(texto4);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();
            JOptionPane.showMessageDialog(null, "Archivo Creado con Exito");
            String rutaPDF = "C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\Factura_de_" + nombre + "_" + apellido + ".pdf";
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
