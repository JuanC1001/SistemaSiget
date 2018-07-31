/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.rnegocio.entidades;

/**
 *
 * @author MI PC
 */
public class Nivel {

    private int Codigo;
    private int Codigo_Sicoa;
    private String Nombre;
    private String Paralelo;
    private String Modalidad;
    private Escuela escuela;

    public Nivel() {
    }

    public Nivel(int Codigo, int Codigo_Sicoa, String Nombre, String Paralelo, String Modalidad, Escuela escuela) {
        this.Codigo = Codigo;
        this.Codigo_Sicoa = Codigo_Sicoa;
        this.Nombre = Nombre;
        this.Paralelo = Paralelo;
        this.Modalidad = Modalidad;
        this.escuela = escuela;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCodigo_Sicoa() {
        return Codigo_Sicoa;
    }

    public void setCodigo_Sicoa(int Codigo_Sicoa) {
        this.Codigo_Sicoa = Codigo_Sicoa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getParalelo() {
        return Paralelo;
    }

    public void setParalelo(String Paralelo) {
        this.Paralelo = Paralelo;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public void getParalelo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
