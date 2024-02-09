/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Modelo;

import java.time.LocalDate;
import javax.swing.JComboBox;

/**
 *
 * @author kevin
 */
public class Estudiante {
    private int IdEstudiante;
    private String ciEstudiante;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String provincia;
    private String ciudad;
    private String correo;
    private int edad;
    private String posicion;
    private String subposicion;
    private String nacionalidad;
    private double peso;
    private double estatura;

    public Estudiante() {
    }

    public Estudiante(int IdEstudiante, String ciEstudiante, String nombres, String apellidos, LocalDate fechaNacimiento, String telefono, String provincia, String ciudad, String correo, int edad, String posicion, String subposicion, String nacionalidad, double peso, double estatura) {
        this.IdEstudiante = IdEstudiante;
        this.ciEstudiante = ciEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.correo = correo;
        this.edad = edad;
        this.posicion = posicion;
        this.subposicion = subposicion;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public int getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    public String getCiEstudiante() {
        return ciEstudiante;
    }

    public void setCiEstudiante(String ciEstudiante) {
        this.ciEstudiante = ciEstudiante;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getSubposicion() {
        return subposicion;
    }

    public void setSubposicion(String subposicion) {
        this.subposicion = subposicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    public static void provinciasEcuador(JComboBox cbProvincias) {

        cbProvincias.addItem("Azuay");
        cbProvincias.addItem("Bolívar");
        cbProvincias.addItem("Cañar");
        cbProvincias.addItem("Carchi");
        cbProvincias.addItem("Chimborazo");
        cbProvincias.addItem("Cotopaxi");
        cbProvincias.addItem("El Oro");
        cbProvincias.addItem("Esmeraldas");
        cbProvincias.addItem("Galápagos");
        cbProvincias.addItem("Guayas");
        cbProvincias.addItem("Imbabura");
        cbProvincias.addItem("Loja");
        cbProvincias.addItem("Los Ríos");
        cbProvincias.addItem("Manabí");
        cbProvincias.addItem("Morona Santiago");
        cbProvincias.addItem("Napo");
        cbProvincias.addItem("Orellana");
        cbProvincias.addItem("Pastaza");
        cbProvincias.addItem("Pichincha");
        cbProvincias.addItem("Santa Elena");
        cbProvincias.addItem("Santo Domingo de los Tsáchilas");
        cbProvincias.addItem("Sucumbíos");
        cbProvincias.addItem("Tungurahua");
        cbProvincias.addItem("Zamora Chinchipe");
    }

    public static void cantonesPorProvincia(JComboBox cbProvincia, JComboBox cbCantones) {
        cbCantones.removeAllItems();
        String provinciaSeleccionada = cbProvincia.getSelectedItem().toString();

        switch (provinciaSeleccionada) {
            case "Azuay":
                cbCantones.addItem("Camilo Ponce Enríquez");
                cbCantones.addItem("Chordeleg");
                cbCantones.addItem("Cuenca");
                cbCantones.addItem("El Pan");
                cbCantones.addItem("Girón");
                cbCantones.addItem("Guachapala");
                cbCantones.addItem("Gualaceo");
                cbCantones.addItem("Nabón");
                cbCantones.addItem("Oña");
                cbCantones.addItem("Paute");
                cbCantones.addItem("Pucará");
                cbCantones.addItem("San Fernando");
                cbCantones.addItem("Santa Isabel");
                cbCantones.addItem("Sevilla de Oro");
                cbCantones.addItem("Sígsig");
                break;
            case "Bolívar":
                cbCantones.addItem("Caluma");
                cbCantones.addItem("Chillanes");
                cbCantones.addItem("Chimbo");
                cbCantones.addItem("Echeandía");
                cbCantones.addItem("Guaranda");
                cbCantones.addItem("Las Naves");
                cbCantones.addItem("San Miguel");
                break;
            case "Cañar":
                cbCantones.addItem("Azogues");
                cbCantones.addItem("Biblián");
                cbCantones.addItem("Cañar");
                cbCantones.addItem("Déleg");
                cbCantones.addItem("El Tambo");
                cbCantones.addItem("La Troncal");
                cbCantones.addItem("Suscal");
                break;
            case "Carchi":
                cbCantones.addItem("Bolívar");
                cbCantones.addItem("Espejo");
                cbCantones.addItem("Mira");
                cbCantones.addItem("Montúfar");
                cbCantones.addItem("San Pedro de Huaca");
                cbCantones.addItem("Tulcán");
                break;
            case "Chimborazo":
                cbCantones.addItem("Alausí");
                cbCantones.addItem("Chambo");
                cbCantones.addItem("Chunchi");
                cbCantones.addItem("Colta");
                cbCantones.addItem("Cumandá");
                cbCantones.addItem("Guamote");
                cbCantones.addItem("Guano");
                cbCantones.addItem("Pallatanga");
                cbCantones.addItem("Penipe");
                cbCantones.addItem("Riobamba");
                break;
            case "Cotopaxi":
                cbCantones.addItem("La Maná");
                cbCantones.addItem("Latacunga");
                cbCantones.addItem("Pangua");
                cbCantones.addItem("Pujilí");
                cbCantones.addItem("Salcedo");
                cbCantones.addItem("Saquisilí");
                cbCantones.addItem("Sigchos");
                break;
            case "El Oro":
                cbCantones.addItem("Arenillas");
                cbCantones.addItem("Atahualpa");
                cbCantones.addItem("Balsas");
                cbCantones.addItem("Chilla");
                cbCantones.addItem("El Guabo");
                cbCantones.addItem("Huaquillas");
                cbCantones.addItem("Las Lajas");
                cbCantones.addItem("Machala");
                cbCantones.addItem("Marcabelí");
                cbCantones.addItem("Pasaje");
                cbCantones.addItem("Piñas");
                cbCantones.addItem("Portovelo");
                cbCantones.addItem("Santa Rosa");
                cbCantones.addItem("Zaruma");
                break;
            case "Esmeraldas":
                cbCantones.addItem("Atacames");
                cbCantones.addItem("Eloy Alfaro");
                cbCantones.addItem("Esmeraldas");
                cbCantones.addItem("Muisne");
                cbCantones.addItem("Quinindé");
                cbCantones.addItem("Rioverde");
                cbCantones.addItem("San Lorenzo");
                break;
            case "Galápagos":
                cbCantones.addItem("Isabela");
                cbCantones.addItem("San Cristóbal");
                cbCantones.addItem("Santa Cruz");
                break;
            case "Guayas":
                cbCantones.addItem("Alfredo Baquerizo Moreno");
                cbCantones.addItem("Balao");
                cbCantones.addItem("Balzar");
                cbCantones.addItem("Colimes");
                cbCantones.addItem("Coronel Marcelino Maridueña");
                cbCantones.addItem("Daule");
                cbCantones.addItem("Durán");
                cbCantones.addItem("El Empalme");
                cbCantones.addItem("El Triunfo");
                cbCantones.addItem("General Antonio Elizalde");
                cbCantones.addItem("Guayaquil");
                cbCantones.addItem("Isidro Ayora");
                cbCantones.addItem("Lomas de Sargentillo");
                cbCantones.addItem("Milagro");
                cbCantones.addItem("Naranjal");
                cbCantones.addItem("Naranjito");
                cbCantones.addItem("Nobol");
                cbCantones.addItem("Palestina");
                cbCantones.addItem("Pedro Carbo");
                cbCantones.addItem("Playas");
                cbCantones.addItem("Salitre");
                cbCantones.addItem("Samborondón");
                cbCantones.addItem("Santa Lucía");
                cbCantones.addItem("Simón Bolívar");
                cbCantones.addItem("Yaguachi");
                break;
            case "Imbabura":
                cbCantones.addItem("Antonio Ante");
                cbCantones.addItem("Cotacachi");
                cbCantones.addItem("Ibarra");
                cbCantones.addItem("Otavalo");
                cbCantones.addItem("Pimampiro");
                cbCantones.addItem("San Miguel de Urcuquí");
                break;
            case "Loja":
                cbCantones.addItem("Calvas");
                cbCantones.addItem("Catamayo");
                cbCantones.addItem("Celica");
                cbCantones.addItem("Chaguarpamba");
                cbCantones.addItem("Espíndola");
                cbCantones.addItem("Gonzanamá");
                cbCantones.addItem("Loja");
                cbCantones.addItem("Macará");
                cbCantones.addItem("Olmedo");
                cbCantones.addItem("Paltas");
                cbCantones.addItem("Pindal");
                cbCantones.addItem("Puyango");
                cbCantones.addItem("Quilanga");
                cbCantones.addItem("Saraguro");
                cbCantones.addItem("Sozoranga");
                cbCantones.addItem("Zapotillo");
                break;
            case "Los Ríos":
                cbCantones.addItem("Baba");
                cbCantones.addItem("Babahoyo");
                cbCantones.addItem("Buena Fe");
                cbCantones.addItem("Mocache");
                cbCantones.addItem("Montalvo");
                cbCantones.addItem("Palenque");
                cbCantones.addItem("Puebloviejo");
                cbCantones.addItem("Quevedo");
                cbCantones.addItem("Quinsaloma");
                cbCantones.addItem("Urdaneta");
                cbCantones.addItem("Valencia");
                cbCantones.addItem("Ventanas");
                cbCantones.addItem("Vinces");
                break;
            case "Manabí":
                cbCantones.addItem("Bolívar");
                cbCantones.addItem("Chone");
                cbCantones.addItem("El Carmen");
                cbCantones.addItem("Flavio Alfaro");
                cbCantones.addItem("Jama");
                cbCantones.addItem("Jaramijó");
                cbCantones.addItem("Jipijapa");
                cbCantones.addItem("Junín");
                cbCantones.addItem("Manta");
                cbCantones.addItem("Montecristi");
                cbCantones.addItem("Olmedo");
                cbCantones.addItem("Paján");
                cbCantones.addItem("Pedernales");
                cbCantones.addItem("Pichincha");
                cbCantones.addItem("Portoviejo");
                cbCantones.addItem("Puerto López");
                cbCantones.addItem("Rocafuerte");
                cbCantones.addItem("San Vicente");
                cbCantones.addItem("Santa Ana");
                cbCantones.addItem("Sucre");
                cbCantones.addItem("Tosagua");
                cbCantones.addItem("Veinticuatro de Mayo");
                break;
            case "Morona Santiago":
                cbCantones.addItem("Gualaquiza");
                cbCantones.addItem("Huamboya");
                cbCantones.addItem("Limón Indanza");
                cbCantones.addItem("Logroño");
                cbCantones.addItem("Morona");
                cbCantones.addItem("Pablo Sexto");
                cbCantones.addItem("Palora");
                cbCantones.addItem("San Juan Bosco");
                cbCantones.addItem("Santiago de Méndez");
                cbCantones.addItem("Sucúa");
                cbCantones.addItem("Taisha");
                cbCantones.addItem("Tiwintza");
                break;
            case "Napo":
                cbCantones.addItem("Archidona");
                cbCantones.addItem("Carlos Julio Arosemena Tola");
                cbCantones.addItem("El Chaco");
                cbCantones.addItem("Quijos");
                cbCantones.addItem("Tena");
                break;
            case "Orellana":
                cbCantones.addItem("Aguarico");
                cbCantones.addItem("La Joya de los Sachas");
                cbCantones.addItem("Loreto");
                cbCantones.addItem("Orellana");
                break;
            case "Pastaza":
                cbCantones.addItem("Arajuno");
                cbCantones.addItem("Mera");
                cbCantones.addItem("Pastaza");
                cbCantones.addItem("Santa Clara");
                break;
            case "Pichincha":
                cbCantones.addItem("Cayambe");
                cbCantones.addItem("Distrito Metropolitano de Quito");
                cbCantones.addItem("Mejía");
                cbCantones.addItem("Pedro Moncayo");
                cbCantones.addItem("Pedro Vicente Maldonado");
                cbCantones.addItem("Puerto Quito");
                cbCantones.addItem("Rumiñahui");
                cbCantones.addItem("San Miguel de Los Bancos");
                break;
            case "Santa Elena":
                cbCantones.addItem("La Libertad");
                cbCantones.addItem("Salinas");
                cbCantones.addItem("Santa Elena");
                break;
            case "Santo Domingo de los Tsáchilas":
                cbCantones.addItem("La Concordia");
                cbCantones.addItem("Santo Domingo");
                break;
            case "Sucumbíos":
                cbCantones.addItem("Cascales");
                cbCantones.addItem("Cuyabeno");
                cbCantones.addItem("Gonzalo Pizarro");
                cbCantones.addItem("Lago Agrio");
                cbCantones.addItem("Putumayo");
                cbCantones.addItem("Shushufindi");
                cbCantones.addItem("Sucumbíos");
                break;
            case "Tungurahua":
                cbCantones.addItem("Ambato");
                cbCantones.addItem("Baños");
                cbCantones.addItem("Cevallos");
                cbCantones.addItem("Mocha");
                cbCantones.addItem("Patate");
                cbCantones.addItem("Pelileo");
                cbCantones.addItem("Píllaro");
                cbCantones.addItem("Quero");
                cbCantones.addItem("Tisaleo");
                break;
            case "Zamora Chinchipe":
                cbCantones.addItem("Centinela del Cóndor");
                cbCantones.addItem("Chinchipe");
                cbCantones.addItem("El Pangui");
                cbCantones.addItem("Nangaritza");
                cbCantones.addItem("Palanda");
                cbCantones.addItem("Paquisha");
                cbCantones.addItem("Yacuambi");
                cbCantones.addItem("Yantzaza");
                cbCantones.addItem("Zamora");
                break;
            default:
                throw new AssertionError("Provincia no reconocida: " + provinciaSeleccionada);
        }
    }

    public static void posicion(JComboBox cbPosicion) {

        cbPosicion.addItem("Portero");
        cbPosicion.addItem("Defensa");
        cbPosicion.addItem("CentroCampista");
        cbPosicion.addItem("Delantero");

    }

    public static void subposicion(JComboBox cbPosicion, JComboBox cbSubposicion) {
        cbSubposicion.removeAllItems();
        switch (cbPosicion.getSelectedItem().toString()) {
            case "Portero":
                cbSubposicion.setEnabled(false);
                cbSubposicion.addItem("Ninguno");
                break;
            case "Defensa":
                cbSubposicion.setEnabled(true);
                cbSubposicion.addItem("Defensa Central");
                cbSubposicion.addItem("Lateral");
                cbSubposicion.addItem("Libre");
                cbSubposicion.addItem("Carrilero");
                break;
            case "CentroCampista":
                cbSubposicion.setEnabled(true);
                cbSubposicion.addItem("Pivote");
                cbSubposicion.addItem("Media Punta");
                cbSubposicion.addItem("Volante");
                cbSubposicion.addItem("Interior");
                break;
            case "Delantero":
                cbSubposicion.setEnabled(true);
                cbSubposicion.addItem("Segundo Delantero");
                cbSubposicion.addItem("Delantero Centro");
                cbSubposicion.addItem("Extremo");

                break;
            default:
                throw new AssertionError();
        }

    }

    public static void mes(JComboBox cbMes) {

        cbMes.addItem("1");
        cbMes.addItem("2");
        cbMes.addItem("3");
        cbMes.addItem("4");
        cbMes.addItem("5");
        cbMes.addItem("6");
        cbMes.addItem("7");
        cbMes.addItem("8");
        cbMes.addItem("9");
        cbMes.addItem("10");
        cbMes.addItem("11");
        cbMes.addItem("12");

    }

    public static void dia(JComboBox cbMes, JComboBox cbDias) {
        cbDias.removeAllItems();
        String mesSeleccionado = cbMes.getSelectedItem().toString();
        if (mesSeleccionado.equals("1") || mesSeleccionado.equals("3") || mesSeleccionado.equals("5")
                || mesSeleccionado.equals("7") || mesSeleccionado.equals("8") || mesSeleccionado.equals("10")
                || mesSeleccionado.equals("12")) {
            cbDias.addItem("1");
            cbDias.addItem("2");
            cbDias.addItem("3");
            cbDias.addItem("4");
            cbDias.addItem("5");
            cbDias.addItem("6");
            cbDias.addItem("7");
            cbDias.addItem("8");
            cbDias.addItem("9");
            cbDias.addItem("10");
            cbDias.addItem("11");
            cbDias.addItem("12");
            cbDias.addItem("13");
            cbDias.addItem("14");
            cbDias.addItem("15");
            cbDias.addItem("16");
            cbDias.addItem("17");
            cbDias.addItem("18");
            cbDias.addItem("19");
            cbDias.addItem("20");
            cbDias.addItem("21");
            cbDias.addItem("22");
            cbDias.addItem("23");
            cbDias.addItem("24");
            cbDias.addItem("25");
            cbDias.addItem("26");
            cbDias.addItem("27");
            cbDias.addItem("28");
            cbDias.addItem("29");
            cbDias.addItem("30");
            cbDias.addItem("31");

        } else if (mesSeleccionado.equals("2")) {
            cbDias.addItem("1");
            cbDias.addItem("2");
            cbDias.addItem("3");
            cbDias.addItem("4");
            cbDias.addItem("5");
            cbDias.addItem("6");
            cbDias.addItem("7");
            cbDias.addItem("8");
            cbDias.addItem("9");
            cbDias.addItem("10");
            cbDias.addItem("11");
            cbDias.addItem("12");
            cbDias.addItem("13");
            cbDias.addItem("14");
            cbDias.addItem("15");
            cbDias.addItem("16");
            cbDias.addItem("17");
            cbDias.addItem("18");
            cbDias.addItem("19");
            cbDias.addItem("20");
            cbDias.addItem("21");
            cbDias.addItem("22");
            cbDias.addItem("23");
            cbDias.addItem("24");
            cbDias.addItem("25");
            cbDias.addItem("26");
            cbDias.addItem("27");
            cbDias.addItem("28");
        } else {
            cbDias.addItem("1");
            cbDias.addItem("2");
            cbDias.addItem("3");
            cbDias.addItem("4");
            cbDias.addItem("5");
            cbDias.addItem("6");
            cbDias.addItem("7");
            cbDias.addItem("8");
            cbDias.addItem("9");
            cbDias.addItem("10");
            cbDias.addItem("11");
            cbDias.addItem("12");
            cbDias.addItem("13");
            cbDias.addItem("14");
            cbDias.addItem("15");
            cbDias.addItem("16");
            cbDias.addItem("17");
            cbDias.addItem("18");
            cbDias.addItem("19");
            cbDias.addItem("20");
            cbDias.addItem("21");
            cbDias.addItem("22");
            cbDias.addItem("23");
            cbDias.addItem("24");
            cbDias.addItem("25");
            cbDias.addItem("26");
            cbDias.addItem("27");
            cbDias.addItem("28");
            cbDias.addItem("29");
            cbDias.addItem("30");
        }
    }

    
}
