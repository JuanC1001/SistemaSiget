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
public class Ambitos {
   private int Codigo_Serial;
   private char Nombre;
   private char Observacion;
   private int Estado;

    public Ambitos() {
    }

    public Ambitos(int Codigo_Serial, char Nombre, char Observacion, int Estado) {
        this.Codigo_Serial = Codigo_Serial;
        this.Nombre = Nombre;
        this.Observacion = Observacion;
        this.Estado = Estado;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getCodigo_Serial() {
        return Codigo_Serial;
    }

    public void setCodigo_Serial(int Codigo_Serial) {
        this.Codigo_Serial = Codigo_Serial;
    }

    public char getNombre() {
        return Nombre;
    }

    public void setNombre(char Nombre) {
        this.Nombre = Nombre;
    }

    public char getObservacion() {
        return Observacion;
    }

    public void setObservacion(char Observacion) {
        this.Observacion = Observacion;
    }
   

    
    
}
