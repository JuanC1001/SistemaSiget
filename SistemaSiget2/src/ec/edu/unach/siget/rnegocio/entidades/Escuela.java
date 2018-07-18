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
  private Facultad facultad;
  private String Nombre;
  private String Descripcion;
  private int Codigo_Sicoa;
    public Escuela(){
    
    }

    public Escuela(int Codigo, Facultad facultad, String Nombre, String Descripcion, int Codigo_Sicoa) {
        this.Codigo = Codigo;
        this.facultad = facultad;
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

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

   
}
