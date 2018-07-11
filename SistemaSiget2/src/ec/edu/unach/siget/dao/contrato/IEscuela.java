/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Escuela;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IEscuela {
    int insertar (Escuela escuela);
     int eliminar (Escuela escuela);
      int modificar (Escuela escuela);
      Escuela obtener(int id)throws Exception;
    List<Escuela> obtener()throws Exception;
    
}
