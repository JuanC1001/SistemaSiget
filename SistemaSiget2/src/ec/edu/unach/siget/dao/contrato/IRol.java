/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Rol;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IRol {
    int insertar (Rol rol);
     int eliminar (Rol rol);
      int modificar (Rol rol);
      Rol obtener(int id)throws Exception;
    List<Rol> obtener()throws Exception;
    
}
