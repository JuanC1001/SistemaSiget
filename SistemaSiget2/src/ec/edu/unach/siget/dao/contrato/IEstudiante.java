/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Estudiante;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IEstudiante {
    int insertar (Estudiante estudiante);
     int eliminar (Estudiante estudiante);
      int modificar (Estudiante estudiante);
      Estudiante  obtener(int id)throws Exception;
    List<Estudiante> obtener()throws Exception;
}
