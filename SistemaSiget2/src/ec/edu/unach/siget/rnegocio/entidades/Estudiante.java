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
public class Estudiante {
    private int Codigo;
    private char Nombre;
    private char Apellido;
    private char Cedula; 
    private int Codigo_Sicoa;
    private int Codigo_Periodo;
    private int Codigo_Nivel; 
    private int Codigo_Nive; 
    public Estudiante(){
    }

    public Estudiante(int Codigo, char Nombre, char Apellido, char Cedula, int Codigo_Sicoa, int Codigo_Periodo, int Codigo_Nivel) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Codigo_Sicoa = Codigo_Sicoa;
        this.Codigo_Periodo = Codigo_Periodo;
        this.Codigo_Nivel = Codigo_Nivel;
    }

    public int getCodigo_Nivel() {
        return Codigo_Nivel;
    }

    public void setCodigo_Nivel(int Codigo_Nivel) {
        this.Codigo_Nivel = Codigo_Nivel;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public char getNombre() {
        return Nombre;
    }

    public void setNombre(char Nombre) {
        this.Nombre = Nombre;
    }

    public char getApellido() {
        return Apellido;
    }

    public void setApellido(char Apellido) {
        this.Apellido = Apellido;
    }

    public char getCedula() {
        return Cedula;
    }

    public void setCedula(char Cedula) {
        this.Cedula = Cedula;
    }

    public int getCodigo_Sicoa() {
        return Codigo_Sicoa;
    }

    public void setCodigo_Sicoa(int Codigo_Sicoa) {
        this.Codigo_Sicoa = Codigo_Sicoa;
    }

    public int getCodigo_Periodo() {
        return Codigo_Periodo;
    }

    public void setCodigo_Periodo(int Codigo_Periodo) {
        this.Codigo_Periodo = Codigo_Periodo;
    }

    
}
