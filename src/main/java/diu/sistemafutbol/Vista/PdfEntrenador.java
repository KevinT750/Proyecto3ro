package diu.sistemafutbol.Vista;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import diu.sistemafutbol.Controlador.EntrenadorControlador;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PdfEntrenador {

    ArrayList<Object[]> ListaEntrenador = new ArrayList<>();
    LocalDate fecha;

    Document documento;

    FileOutputStream archivo;
    Paragraph titulo;

    public PdfEntrenador() {
    }

    public PdfEntrenador(LocalDate fecha, ArrayList<Object[]> listaEntrenador) {
        this.fecha = fecha;
        this.ListaEntrenador = listaEntrenador;

        documento = new Document();
        titulo = new Paragraph("Lista de Entrenadores");
    }

    public void CrearPdf() throws DocumentException, IOException {
        try {
            archivo = new FileOutputStream("Entrenadores2024.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("La escuela de fútbol \"IMBABURA\" se enorgullece de contar "
                    + "con un equipo de entrenadores altamente calificados y"
                    + " dedicados, comprometidos con el desarrollo "
                    + "deportivo y personal de cada estudiante. A continuación,"
                    + " se presenta una tabla con los datos de los entrenadores:");
            texto.setAlignment(3);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(100);
            PdfPCell num = new PdfPCell(new Phrase("Numero"));
            num.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell name = new PdfPCell(new Phrase("Cedula"));
            name.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell ape = new PdfPCell(new Phrase("Nombre"));
            ape.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell ced = new PdfPCell(new Phrase("Apellido"));
            ced.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell tel = new PdfPCell(new Phrase("Telefono"));
            tel.setBackgroundColor(BaseColor.ORANGE);

            tabla.addCell(num);
            tabla.addCell(name);
            tabla.addCell(ape);
            tabla.addCell(ced);
            tabla.addCell(tel);

            int contador = 0; // Inicializar el contador aquí
            EntrenadorControlador ec = new EntrenadorControlador();
            ArrayList<Object[]> listaEntrenador = ec.datosEntrenador();
            for (Object[] fila : listaEntrenador) {
                tabla.addCell(String.valueOf(contador + 1));
                tabla.addCell((String) fila[1]);
                tabla.addCell((String) fila[2]);
                tabla.addCell((String) fila[3]);
                tabla.addCell((String) fila[4]);
                contador++;
            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();

            JOptionPane.showMessageDialog(null,"Archivo creado con EXITO");
            String rutaPDF = "C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\Entrenadores2024.pdf";
            abrirPDF(rutaPDF);
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void CrearPdfUsuario() throws DocumentException, IOException {
        try {
            archivo = new FileOutputStream("EntrenadoresUsuario.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            Paragraph titulos;
            titulos = new Paragraph("Lista con rol de Usuario \"ENTRENADORES\"");
            titulos.setAlignment(1);

            documento.add(titulos);
            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("La siguiente es la lista de "
                    + "entrenadores que cuentan con acceso limitado al programa "
                    + "y solo pueden utilizar ciertas funcionalidades sin tener "
                    + "privilegios de administrador. Es importante que estos usuarios"
                    + " comprendan las restricciones de su cuenta y utilicen el software"
                    + " de manera acorde a sus permisos asignados. Esta medida se"
                    + " implementa con el fin de garantizar la seguridad y la integridad"
                    + " de los datos del sistema, así como para mantener un control"
                    + " adecuado sobre las acciones realizadas en la plataforma."
                    + " Los entrenadores pueden acceder a funciones específicas"
                    + " relacionadas con la gestión de entrenamientos, seguimiento"
                    + " de progreso de los jugadores y programación de eventos, entre"
                    + " otras. Sin embargo, no tienen autorización para realizar"
                    + " modificaciones en la configuración del programa o acceder"
                    + " a áreas sensibles del sistema reservadas para el administrador.");
            texto.setAlignment(3);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(100);
            PdfPCell num = new PdfPCell(new Phrase("Numero"));
            num.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell name = new PdfPCell(new Phrase("Cedula"));
            name.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell ape = new PdfPCell(new Phrase("Nombre"));
            ape.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell ced = new PdfPCell(new Phrase("Apellido"));
            ced.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell tel = new PdfPCell(new Phrase("Telefono"));
            tel.setBackgroundColor(BaseColor.ORANGE);

            tabla.addCell(num);
            tabla.addCell(name);
            tabla.addCell(ape);
            tabla.addCell(ced);
            tabla.addCell(tel);

            int contador = 0; // Inicializar el contador aquí
            EntrenadorControlador ec = new EntrenadorControlador();
            ArrayList<Object[]> listaEntrenador = ec.buscarRol("Usuario");
            for (Object[] fila : listaEntrenador) {
                tabla.addCell(String.valueOf(contador + 1));
                tabla.addCell((String) fila[1]);
                tabla.addCell((String) fila[2]);
                tabla.addCell((String) fila[3]);
                tabla.addCell((String) fila[4]);
                contador++;
            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();

            JOptionPane.showMessageDialog(null,"Archivo creado con EXITO");
            String rutaPDF = "C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\EntrenadoresAdministrador.pdf";
            abrirPDF(rutaPDF);
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void CrearPdfAdministrador() throws DocumentException, IOException {
        try {
            archivo = new FileOutputStream("EntrenadoresAdministrador.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            Paragraph titulos;
            titulos = new Paragraph("Lista con rol de ADMINISTRADOR \"ENTRENADORES\"");
            titulos.setAlignment(1);

            documento.add(titulos);
            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("El administrador tiene privilegios"
                    + " ampliados en el programa, lo que le permite realizar"
                    + " una serie de acciones clave para la gestión efectiva"
                    + " del sistema. Entre estas funciones, el administrador"
                    + " puede modificar, eliminar, crear y leer los datos tanto"
                    + " de los estudiantes como de los entrenadores. Con respecto"
                    + " a los entrenadores, el administrador puede asignarles su"
                    + " rol dentro del sistema, otorgándoles los permisos"
                    + " correspondientes como administrador o usuario estándar."
                    + " Esta capacidad de control garantiza que el administrador"
                    + " pueda gestionar eficientemente las cuentas de los usuarios,"
                    + " mantener la integridad de los datos y supervisar todas las"
                    + " operaciones realizadas en la plataforma.");
            texto.setAlignment(3);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(100);
            PdfPCell num = new PdfPCell(new Phrase("Numero"));
            num.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell name = new PdfPCell(new Phrase("Cedula"));
            name.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell ape = new PdfPCell(new Phrase("Nombre"));
            ape.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell ced = new PdfPCell(new Phrase("Apellido"));
            ced.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell tel = new PdfPCell(new Phrase("Telefono"));
            tel.setBackgroundColor(BaseColor.ORANGE);

            tabla.addCell(num);
            tabla.addCell(name);
            tabla.addCell(ape);
            tabla.addCell(ced);
            tabla.addCell(tel);

            int contador = 0; // Inicializar el contador aquí
            EntrenadorControlador ec = new EntrenadorControlador();
            ArrayList<Object[]> listaEntrenador = ec.buscarRol("ADMINISTRADOR");
            for (Object[] fila : listaEntrenador) {
                tabla.addCell(String.valueOf(contador + 1));
                tabla.addCell((String) fila[1]);
                tabla.addCell((String) fila[2]);
                tabla.addCell((String) fila[3]);
                tabla.addCell((String) fila[4]);
                contador++;
            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();

            JOptionPane.showMessageDialog(null,"Archivo creado con EXITO");
            String rutaPDF = "C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\EntrenadoresAdministrador.pdf";
            abrirPDF(rutaPDF);
        } catch (DocumentException | FileNotFoundException e) {
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
