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
public class Escuela {
   private int Codigo;
  private int Codigo_Facultad;
  private char Nombre;
  private char Descripcion;
  private int Codigo_Sicoa;
    public Escuela(){
    
    }

    public Escuela(int Codigo, int Codigo_Facultad, char Nombre, char Descripcion, int Codigo_Sicoa) {
        this.Codigo = Codigo;
        this.Codigo_Facultad = Codigo_Facultad;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Codigo_Sicoa = Codigo_Sicoa;
    }

    public int getCodigo_Sicoa() {
        return Codigo_Sicoa;
    }

    public void setCodigo_Sicoa(int Codigo_Sicoa) {
        this.Codigo_Sicoa = Codigo_Sicoa;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCodigo_Facultad() {
        return Codigo_Facultad;
    }

    public void setCodigo_Facultad(int Codigo_Facultad) {
        this.Codigo_Facultad = Codigo_Facultad;
    }

    public char getNombre() {
        return Nombre;
    }

    public void setNombre(char Nombre) {
        this.Nombre = Nombre;
    }

    public char getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(char Descripcion) {
        this.Descripcion = Descripcion;
    }

   
}
