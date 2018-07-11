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
public class Modalidad_Tutoria {
  private int Codigo;
  private char Nombre; 
  private char Descripcion;
  private int Estado;

    public Modalidad_Tutoria() {
    }

    public Modalidad_Tutoria(int Codigo, char Nombre, char Descripcion, int Estado) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
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

