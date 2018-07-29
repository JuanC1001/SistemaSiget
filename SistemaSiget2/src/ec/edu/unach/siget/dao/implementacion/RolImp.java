/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.implementacion;

import ec.edu.unach.siget.accesodatos.conexion;
import ec.edu.unach.siget.dao.contrato.IRol;
import ec.edu.unach.siget.rnegocio.entidades.Facultad;
import ec.edu.unach.siget.rnegocio.entidades.Rol;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GHISSEL
 */
public class RolImp implements IRol {

    @Override
    public int insertar(Rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol obtener(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> obtener() throws Exception {
        List<Rol> lista = new ArrayList<>();
        String sql = "SELECT codigo, nombre, descripcion, estado, codigo_modulo FROM actividades.rol;";
        conexion con = new conexion();
        con.conectar();
        try {
            ResultSet rst = con.ejecutarQuery(sql);
            while (rst.next()) {
                Rol rol = new Rol();
                rol.setCodigo(rst.getInt(1));
                rol.setNombre(rst.getString(2));
                rol.setDescripcion(rst.getString(3));
                rol.setEstado(rst.getInt(4));
                rol.setCodigo_modulo(rst.getInt(5));
                lista.add(rol);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return lista;
    }

}
