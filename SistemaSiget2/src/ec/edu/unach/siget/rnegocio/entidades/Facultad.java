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
public class Facultad {
   private int Codigo;
  private char Nombre; 
  private char Descripcion;
  private int Codigo_Sicoa;
  public Facultad(){
  }

    public Facultad(int Codigo, char Nombre, char Descripcion, int Codigo_Sicoa) {
        this.Codigo = Codigo;
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
