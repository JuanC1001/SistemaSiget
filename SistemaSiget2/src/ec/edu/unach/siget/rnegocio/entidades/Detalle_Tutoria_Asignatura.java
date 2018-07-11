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
public class Detalle_Tutoria_Asignatura {
    private int Codigo_Bigserial;
  private int Codigo_Estudiante;
  private char apellidos_studiante;
  private char nombre_estudiante;
  private char cedula_estudiante;
  private char Observacion1;
  private char Observacion2;
  private char Observacion3;
  private int Codigo_Encabezado;

    public Detalle_Tutoria_Asignatura() {
    }

    public Detalle_Tutoria_Asignatura(int Codigo_Bigserial, int Codigo_Estudiante, char apellidos_studiante, char nombre_estudiante, char cedula_estudiante, char Observacion1, char Observacion2, char Observacion3, int Codigo_Encabezado) {
        this.Codigo_Bigserial = Codigo_Bigserial;
        this.Codigo_Estudiante = Codigo_Estudiante;
        this.apellidos_studiante = apellidos_studiante;
        this.nombre_estudiante = nombre_estudiante;
        this.cedula_estudiante = cedula_estudiante;
        this.Observacion1 = Observacion1;
        this.Observacion2 = Observacion2;
        this.Observacion3 = Observacion3;
        this.Codigo_Encabezado = Codigo_Encabezado;
    }

    public int getCodigo_Encabezado() {
        return Codigo_Encabezado;
    }

    public void setCodigo_Encabezado(int Codigo_Encabezado) {
        this.Codigo_Encabezado = Codigo_Encabezado;
    }

    public int getCodigo_Bigserial() {
        return Codigo_Bigserial;
    }

    public void setCodigo_Bigserial(int Codigo_Bigserial) {
        this.Codigo_Bigserial = Codigo_Bigserial;
    }

    public int getCodigo_Estudiante() {
        return Codigo_Estudiante;
    }

    public void setCodigo_Estudiante(int Codigo_Estudiante) {
        this.Codigo_Estudiante = Codigo_Estudiante;
    }

    public char getApellidos_studiante() {
        return apellidos_studiante;
    }

    public void setApellidos_studiante(char apellidos_studiante) {
        this.apellidos_studiante = apellidos_studiante;
    }

    public char getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(char nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public char getCedula_estudiante() {
        return cedula_estudiante;
    }

    public void setCedula_estudiante(char cedula_estudiante) {
        this.cedula_estudiante = cedula_estudiante;
    }

    public char getObservacion1() {
        return Observacion1;
    }

    public void setObservacion1(char Observacion1) {
        this.Observacion1 = Observacion1;
    }

    public char getObservacion2() {
        return Observacion2;
    }

    public void setObservacion2(char Observacion2) {
        this.Observacion2 = Observacion2;
    }

    public char getObservacion3() {
        return Observacion3;
    }

    public void setObservacion3(char Observacion3) {
        this.Observacion3 = Observacion3;
    }

    
    
}
