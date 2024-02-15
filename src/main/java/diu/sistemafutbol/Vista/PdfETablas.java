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
import diu.sistemafutbol.Controlador.EntrenadorControlador;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class PdfETablas {

    ArrayList<Object[]> ListaEstudiantes = new ArrayList<>();
    LocalDate fecha;

    Document documento;

    FileOutputStream archivo;
    Paragraph titulo;

    public PdfETablas(LocalDate fecha, ArrayList<Object[]> ListaEstudiantes) {
        this.fecha = fecha;
        this.ListaEstudiantes = ListaEstudiantes;
        documento = new Document(new Rectangle(PageSize.A2.getWidth(), PageSize.A2.getHeight()));
        titulo = new Paragraph("Lista de Estudiantes");
    }

    public void crearpdfTablas() {
        try {
            archivo = new FileOutputStream("Estudiantes2024.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("La escuela de fútbol \"Imbabura\" se"
                    + " enorgullece de contar con un grupo diverso y talentoso de"
                    + " estudiantes que participan activamente en nuestras actividades"
                    + " deportivas. Nuestro compromiso es brindarles una experiencia"
                    + " enriquecedora que no solo fomente el desarrollo de sus habilidades"
                    + " futbolísticas, sino también promueva valores como el trabajo en equipo,"
                    + " la disciplina y el respeto. Estamos dedicados a proporcionarles un entorno"
                    + " seguro y estimulante donde puedan crecer tanto en lo deportivo como"
                    + " en lo personal. A continuación, se presenta la lista de los estudiantes"
                    + " actualmente inscritos en la escuela de fútbol \"Imbabura\", quienes"
                    + " son la piedra angular de nuestra comunidad deportiva.");

            texto.setAlignment(3);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);

            // Definir los anchos de las columnas (en porcentaje del ancho total)
            float[] columnWidths = {5f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 4f, 12f, 5f, 5f, 4f, 4f};
            // Crear la tabla con los anchos de columna definidos
            PdfPTable tabla = new PdfPTable(columnWidths);
            tabla.setWidthPercentage(100);

            PdfPCell num = new PdfPCell(new Phrase("Numero"));
            num.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(num);

            PdfPCell ced = new PdfPCell(new Phrase("Cedula"));
            ced.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(ced);

            PdfPCell name = new PdfPCell(new Phrase("Nombre"));
            name.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(name);

            PdfPCell ape = new PdfPCell(new Phrase("Apellido"));
            ape.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(ape);

            PdfPCell nac = new PdfPCell(new Phrase("Nacionalidad"));
            nac.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(nac);

            PdfPCell tel = new PdfPCell(new Phrase("Telefono"));
            tel.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(tel);

            PdfPCell prov = new PdfPCell(new Phrase("Provincia"));
            prov.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(prov);

            PdfPCell cant = new PdfPCell(new Phrase("Cantón"));
            cant.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(cant);

            PdfPCell edad = new PdfPCell(new Phrase("Edad"));
            edad.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(edad);
            
            PdfPCell corr = new PdfPCell(new Phrase("Correo"));
            corr.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(corr);

            

            PdfPCell pos = new PdfPCell(new Phrase("Posición"));
            pos.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(pos);

            PdfPCell subp = new PdfPCell(new Phrase("Subposición"));
            subp.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(subp);

            PdfPCell pes = new PdfPCell(new Phrase("Peso"));
            pes.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(pes);

            PdfPCell alt = new PdfPCell(new Phrase("Altura"));
            alt.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(alt);

            // Cambiar el tamaño de la hoja a A2 en formato horizontal
            documento.setPageSize(new Rectangle(PageSize.A2.getWidth(), PageSize.A2.getHeight()));

            int contador = 0;
            EstudianteControlador ec = new EstudianteControlador();
            ArrayList<Object[]> listaEntrenador = ec.datosEstudiante();
            for (Object[] fila : listaEntrenador) {
                tabla.addCell(String.valueOf(contador + 1));
                tabla.addCell((String) fila[1]);
                tabla.addCell((String) fila[2]);
                tabla.addCell((String) fila[3]);
                tabla.addCell((String) fila[12]);
                tabla.addCell((String) fila[5]);
                tabla.addCell((String) fila[6]);
                tabla.addCell((String) fila[7]);
                tabla.addCell(String.valueOf(fila[9]));
                tabla.addCell((String) fila[8]);
                tabla.addCell((String) fila[10]);
                tabla.addCell((String) fila[11]);
                tabla.addCell(String.valueOf(fila[13]));
                tabla.addCell(String.valueOf(fila[14]));
                contador++;
            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();

            System.out.println("Archivo creado con EXITO");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void crearpdfTablasCat(String cat) {
        try {
            Paragraph titul;
            archivo = new FileOutputStream(cat+".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titul = new Paragraph("Lista de Estudiantes por Categoria ("+cat+")");
            titul.setAlignment(1);

            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("La escuela de fútbol \"Imbabura\" se"
                    + " enorgullece de contar con un grupo diverso y talentoso de"
                    + " estudiantes que participan activamente en nuestras actividades"
                    + " deportivas. Nuestro compromiso es brindarles una experiencia"
                    + " enriquecedora que no solo fomente el desarrollo de sus habilidades"
                    + " futbolísticas, sino también promueva valores como el trabajo en equipo,"
                    + " la disciplina y el respeto. Estamos dedicados a proporcionarles un entorno"
                    + " seguro y estimulante donde puedan crecer tanto en lo deportivo como"
                    + " en lo personal. A continuación, se presenta la lista de los estudiantes"
                    + " actualmente inscritos en la escuela de fútbol \"Imbabura\", quienes"
                    + " son la piedra angular de nuestra comunidad deportiva.");

            texto.setAlignment(3);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);

            // Definir los anchos de las columnas (en porcentaje del ancho total)
            float[] columnWidths = {5f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 5f, 5f, 5f, 5f, 5f};
            // Crear la tabla con los anchos de columna definidos
            PdfPTable tabla = new PdfPTable(columnWidths);
            tabla.setWidthPercentage(100);

            PdfPCell num = new PdfPCell(new Phrase("Numero"));
            num.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(num);

            PdfPCell ced = new PdfPCell(new Phrase("Cedula"));
            ced.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(ced);

            PdfPCell name = new PdfPCell(new Phrase("Nombre"));
            name.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(name);

            PdfPCell ape = new PdfPCell(new Phrase("Apellido"));
            ape.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(ape);

            PdfPCell nac = new PdfPCell(new Phrase("Nacionalidad"));
            nac.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(nac);

            PdfPCell tel = new PdfPCell(new Phrase("Telefono"));
            tel.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(tel);

            PdfPCell prov = new PdfPCell(new Phrase("Provincia"));
            prov.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(prov);

            PdfPCell cant = new PdfPCell(new Phrase("Cantón"));
            cant.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(cant);

            PdfPCell edad = new PdfPCell(new Phrase("Edad"));
            edad.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(edad);
            
            PdfPCell corr = new PdfPCell(new Phrase("Correo"));
            corr.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(corr);

            

            PdfPCell pos = new PdfPCell(new Phrase("Posición"));
            pos.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(pos);

            PdfPCell subp = new PdfPCell(new Phrase("Subposición"));
            subp.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(subp);

            PdfPCell pes = new PdfPCell(new Phrase("Peso"));
            pes.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(pes);

            PdfPCell alt = new PdfPCell(new Phrase("Altura"));
            alt.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(alt);

            // Cambiar el tamaño de la hoja a A2 en formato horizontal
            documento.setPageSize(new Rectangle(PageSize.A2.getWidth(), PageSize.A2.getHeight()));
            int categoriaID;
            switch (cat) {
            case "Prebenjamines":
                categoriaID = 1;
                break;
            case "Benjamines":
                categoriaID = 2;
                break;
            case "Alevines":
                categoriaID = 3;
                break;
            case "Infantiles":
                categoriaID = 4;
                break;
            case "Cadetes":
                categoriaID = 5;
                break;
            case "Juveniles":
                categoriaID = 6;
                break;
            default:
                // Si la categoría no coincide con ninguna de las anteriores, salir del método
                return;
        }

            int contador = 0;
            EstudianteControlador ec = new EstudianteControlador();
            ArrayList<Object[]> listaEntrenador = ec.estudiantesCategoria(categoriaID);
            for (Object[] fila : listaEntrenador) {
                tabla.addCell(String.valueOf(contador + 1));
                tabla.addCell((String) fila[1]);
                tabla.addCell((String) fila[2]);
                tabla.addCell((String) fila[3]);
                tabla.addCell((String) fila[12]);
                tabla.addCell((String) fila[5]);
                tabla.addCell((String) fila[6]);
                tabla.addCell((String) fila[7]);
                tabla.addCell(String.valueOf(fila[9]));
                tabla.addCell((String) fila[8]);
                tabla.addCell((String) fila[10]);
                tabla.addCell((String) fila[11]);
                tabla.addCell(String.valueOf(fila[13]));
                tabla.addCell(String.valueOf(fila[14]));
                contador++;
            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha.now().toString()));
            documento.close();

            System.out.println("Archivo creado con EXITO");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
