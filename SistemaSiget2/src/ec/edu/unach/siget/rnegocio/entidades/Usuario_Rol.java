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
public class Usuario_Rol {
   private int Codigo;
   private int Codigo_Rol;
   private int Codigo_Usuario;
   private int Estado;

    public Usuario_Rol() {
    }

    public Usuario_Rol(int Codigo, int Codigo_Rol, int Codigo_Usuario, int Estado) {
        this.Codigo = Codigo;
        this.Codigo_Rol = Codigo_Rol;
        this.Codigo_Usuario = Codigo_Usuario;
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

    public int getCodigo_Rol() {
        return Codigo_Rol;
    }

    public void setCodigo_Rol(int Codigo_Rol) {
        this.Codigo_Rol = Codigo_Rol;
    }

    public int getCodigo_Usuario() {
        return Codigo_Usuario;
    }

    public void setCodigo_Usuario(int Codigo_Usuario) {
        this.Codigo_Usuario = Codigo_Usuario;
    }
    
}
