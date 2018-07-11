/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Ambitos;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IAmbitos {
    int insertar (Ambitos ambitos);
     int eliminar (Ambitos ambitos);
      int modificar (Ambitos ambitos);
      Ambitos obtener(int id)throws Exception;
    List<Ambitos> obtener()throws Exception;
      
}
