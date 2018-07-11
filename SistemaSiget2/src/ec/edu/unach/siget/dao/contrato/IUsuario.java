/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Usuario;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IUsuario {
    int insertar (Usuario usuario);
     int eliminar (Usuario usuario);
      int modificar (Usuario usuario);
      Usuario obtener(int id)throws Exception;
    List<Usuario> obtener()throws Exception;
}
