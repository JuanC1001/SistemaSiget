/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Periodos;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IPeriodos {
    int insertar (Periodos periodos);
     int eliminar (Periodos periodos);
      int modificar (Periodos periodos);
      Periodos obtener(int id)throws Exception;
    List<Periodos> obtener()throws Exception;
    
}
