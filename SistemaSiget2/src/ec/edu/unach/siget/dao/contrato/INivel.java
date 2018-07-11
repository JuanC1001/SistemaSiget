/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Nivel;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface INivel {
    int insertar (Nivel nivel);
     int eliminar (Nivel nivel);
      int modificar (Nivel nivel);
      Nivel obtener(int id)throws Exception;
    List<Nivel> obtener()throws Exception;
}
