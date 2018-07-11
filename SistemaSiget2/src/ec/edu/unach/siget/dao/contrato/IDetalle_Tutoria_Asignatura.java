/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Detalle_Tutoria_Asignatura;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IDetalle_Tutoria_Asignatura {
    int insertar (Detalle_Tutoria_Asignatura detalle_tutoria_asignatura);
     int eliminar (Detalle_Tutoria_Asignatura detalle_tutoria_asignatura);
      int modificar (Detalle_Tutoria_Asignatura detalle_tutoria_asignatura);
      Detalle_Tutoria_Asignatura  obtener(int id)throws Exception;
    List<Detalle_Tutoria_Asignatura > obtener()throws Exception;
    
}
