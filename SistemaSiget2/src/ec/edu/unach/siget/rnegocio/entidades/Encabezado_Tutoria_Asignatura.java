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
public class Encabezado_Tutoria_Asignatura {
    //codigo bigserial NOT NULL,
  //fecha date,
  //hora time without time zone,
  int Codigo_Periodo;
  char Nombre_Periodo;
  int Codigo_Carrera;
  char Nombre_Carrera;
  int Codigo_Nivel;
  char Nombre_Nivel;
  int Codigo_Paralelo;
  char Nombre_Paralelo;
  int Codigo_Asignatura;
  char Nombre_Asignatura;
  int Codigo_Modalidad;
  int Codigo_Ambito;
  char Motivo;
  char Instancia_Apoyo;
  int Codigo_Docente;
  char Apellidos_Docente;
  int Nombre_Docente;
  char Cedula_Docente;
  char Observacion1;
  char Observacion2;
  char Observacion3;
  int Codigo_Actividades_Planificadas;
  int Estado;
  int Origen;
  int Referencia_Pedido;
  // fecha_registro_pedido timestamp without time zone DEFAULT now(),
  int Constatado_Estudiante;
}
