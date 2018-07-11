/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Tutor;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface ITutor {
    int insertar (Tutor tutor);
     int eliminar (Tutor tutor);
      int modificar (Tutor tutor);
      Tutor obtener(int id)throws Exception;
    List<Tutor> obtener()throws Exception;
}
