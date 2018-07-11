/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Encabezado_Tutoria_Asignatura;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IEncabezado_Tutoria_Asignatura {
     int insertar (Encabezado_Tutoria_Asignatura encabezado_tutoria_asignatura);
     int eliminar (Encabezado_Tutoria_Asignatura encabezado_tutoria_asignatura);
      int modificar (Encabezado_Tutoria_Asignatura encabezado_tutoria_asignatura);
      Encabezado_Tutoria_Asignatura  obtener(int id)throws Exception;
    List<Encabezado_Tutoria_Asignatura > obtener()throws Exception;
}
