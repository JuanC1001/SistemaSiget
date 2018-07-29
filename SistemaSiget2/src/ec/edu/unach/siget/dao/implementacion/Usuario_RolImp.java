/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.implementacion;

import ec.edu.unach.siget.accesodatos.conexion;
import ec.edu.unach.siget.accesodatos.parametro;
import ec.edu.unach.siget.dao.contrato.IUsuario_Rol;
import ec.edu.unach.siget.rnegocio.entidades.Usuario_Rol;
import ec.edu.unach.siget.rnegocio.entidades.Usuario_Rol;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GHISSEL
 */
public class Usuario_RolImp implements IUsuario_Rol {

    @Override
    public int insertar(Usuario_Rol usuario_rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Usuario_Rol usuario_rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Usuario_Rol usuario_rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario_Rol> obtener() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario_Rol obtener(int rol, String ident, String clave) throws Exception {
        Usuario_Rol usuario_rol = null;
        String sql = "SELECT usuario_rol.codigo, usuario_rol.codigo_rol,  usuario_rol.codigo_usuario,  usuario_rol.estado\n"
                + "FROM actividades.usuario_rol INNER JOIN  actividades.usuario ON usuario_rol.codigo_usuario = usuario.codigo\n"
                + "WHERE usuario_rol.codigo_rol=? and usuario.identificacion=? and usuario.clave = ?";
        conexion con = new conexion();
        con.conectar();
        try {
            List<parametro> lstpar = new ArrayList<>();
            lstpar.add(new parametro(1, rol));
            lstpar.add(new parametro(2, ident));
            lstpar.add(new parametro(3, clave));
            ResultSet rst = con.ejecutarQuery(sql, lstpar);
            System.out.println(rst);
            while (rst.next()) {
                usuario_rol = new Usuario_Rol();
                System.out.println(rst.getInt(1));
                System.out.println(rst.getInt(2));
                System.out.println(rst.getInt(3));
                System.out.println(rst.getInt(4));

                usuario_rol.setCodigo(rst.getInt(1));
                usuario_rol.setCodigo_Rol(rst.getInt(2));
                usuario_rol.setCodigo_Usuario(rst.getInt(3));
                usuario_rol.setEstado(rst.getInt(4));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return usuario_rol;
    }

}
