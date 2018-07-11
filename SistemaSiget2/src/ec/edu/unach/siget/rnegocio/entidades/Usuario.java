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
public class Usuario {
   int Codigo_Bigserial;
   char Apellidos;
   char Nombres;
   char Identificacion;
   char Nombre_Corto; 
   char Clave;
   char Clave_Pregunta; 
   char Clave_Respuesta;
   char Mail; 
   char Estado;
   //primer_acceso timestamp with time zone DEFAULT now(),
   //utimo_acceso timestamp with time zone DEFAULT now(),
   char Ultima_Ip; 
   // fecha_modificacion timestamp with time zone DEFAULT now(),
   char Codigo_Salt;
   char Ruta_Firma;
}
