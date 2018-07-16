/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.rnegocio.entidades;

import ec.edu.unach.siget.dao.contrato.IUsuario;
import ec.edu.unach.siget.dao.implementacion.UsuarioImp;

/**
 *
 * @author MI PC
 */
public class Usuario {

    private int Codigo;
    private String Apellidos;
    private String Nombres;
    private String Identificacion;
    private String Nombre_Corto;
    private String Clave;
    private String Clave_Pregunta;
    private String Clave_Respuesta;
    private String Mail;
    private String Estado;
    //primer_acceso timestamp with time zone DEFAULT now(),
    //utimo_acceso timestamp with time zone DEFAULT now(),
    private String Ultima_Ip;
    // fecha_modificacion timestamp with time zone DEFAULT now(),
    private String Codigo_Salt;
    private String Ruta_Firma;

    public Usuario() {
    }

    public Usuario(int Codigo, String Apellidos, String Nombres, String Identificacion, String Nombre_Corto, String Clave, String Clave_Pregunta, String Clave_Respuesta, String Mail, String Estado, String Ultima_Ip, String Codigo_Salt, String Ruta_Firma) {
        this.Codigo = Codigo;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Identificacion = Identificacion;
        this.Nombre_Corto = Nombre_Corto;
        this.Clave = Clave;
        this.Clave_Pregunta = Clave_Pregunta;
        this.Clave_Respuesta = Clave_Respuesta;
        this.Mail = Mail;
        this.Estado = Estado;
        this.Ultima_Ip = Ultima_Ip;
        this.Codigo_Salt = Codigo_Salt;
        this.Ruta_Firma = Ruta_Firma;
    }

    public String getRuta_Firma() {
        return Ruta_Firma;
    }

    public void setRuta_Firma(String Ruta_Firma) {
        this.Ruta_Firma = Ruta_Firma;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre_Corto() {
        return Nombre_Corto;
    }

    public void setNombre_Corto(String Nombre_Corto) {
        this.Nombre_Corto = Nombre_Corto;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getClave_Pregunta() {
        return Clave_Pregunta;
    }

    public void setClave_Pregunta(String Clave_Pregunta) {
        this.Clave_Pregunta = Clave_Pregunta;
    }

    public String getClave_Respuesta() {
        return Clave_Respuesta;
    }

    public void setClave_Respuesta(String Clave_Respuesta) {
        this.Clave_Respuesta = Clave_Respuesta;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getUltima_Ip() {
        return Ultima_Ip;
    }

    public void setUltima_Ip(String Ultima_Ip) {
        this.Ultima_Ip = Ultima_Ip;
    }

    public String getCodigo_Salt() {
        return Codigo_Salt;
    }

    public void setCodigo_Salt(String Codigo_Salt) {
        this.Codigo_Salt = Codigo_Salt;
    }

//    public int ValidarUsurio(String user, String Clave) {
//        int band;
//        IUsuario consultaempleado = new UsuarioImp();
//        usuario2 = consultaempleado.obtener(user);
//        if (usuario2 != null) {
//            if (user.equals(usuario2.getCedula()) && Clave.equalsIgnoreCase("1001")) {
//                band = 1;
//            } else {
//                band = 0;
//            }
//        } else {
//            band = 0;
//        }
//        return band;
//    }
}
