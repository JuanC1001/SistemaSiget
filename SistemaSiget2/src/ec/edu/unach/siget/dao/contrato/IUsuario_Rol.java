/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.contrato;

import ec.edu.unach.siget.rnegocio.entidades.Usuario_Rol;
import java.util.List;

/**
 *
 * @author MI PC
 */
public interface IUsuario_Rol {
    int insertar (Usuario_Rol usuario_rol);
     int eliminar (Usuario_Rol usuario_rol);
      int modificar (Usuario_Rol usuario_rol);
      Usuario_Rol obtener(int id)throws Exception;
    List<Usuario_Rol> obtener()throws Exception;
    
}
