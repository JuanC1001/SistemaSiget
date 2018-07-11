/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Modalidad_Tutoria;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IModalidad_Tutoria {
    int insertar (Modalidad_Tutoria modalidad_tutoria);
     int eliminar (Modalidad_Tutoria modalidad_tutoria);
      int modificar (Modalidad_Tutoria modalidad_tutoria);
      Modalidad_Tutoria obtener(int id)throws Exception;
    List<Modalidad_Tutoria> obtener()throws Exception;
    
}
