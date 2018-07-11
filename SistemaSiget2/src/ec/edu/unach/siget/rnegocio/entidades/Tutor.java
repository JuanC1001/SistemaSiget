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
public class Tutor {
    private int Codigo;
    private int Codigo_Nivel;
    private int Codigo_Periodo;
    private int Codigo_Usuario_Rol;

    public Tutor() {
    }

    public Tutor(int Codigo, int Codigo_Nivel, int Codigo_Periodo, int Codigo_Usuario_Rol) {
        this.Codigo = Codigo;
        this.Codigo_Nivel = Codigo_Nivel;
        this.Codigo_Periodo = Codigo_Periodo;
        this.Codigo_Usuario_Rol = Codigo_Usuario_Rol;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCodigo_Nivel() {
        return Codigo_Nivel;
    }

    public void setCodigo_Nivel(int Codigo_Nivel) {
        this.Codigo_Nivel = Codigo_Nivel;
    }

    public int getCodigo_Periodo() {
        return Codigo_Periodo;
    }

    public void setCodigo_Periodo(int Codigo_Periodo) {
        this.Codigo_Periodo = Codigo_Periodo;
    }

    public int getCodigo_Usuario_Rol() {
        return Codigo_Usuario_Rol;
    }

    public void setCodigo_Usuario_Rol(int Codigo_Usuario_Rol) {
        this.Codigo_Usuario_Rol = Codigo_Usuario_Rol;
    }
      
    
    
}
