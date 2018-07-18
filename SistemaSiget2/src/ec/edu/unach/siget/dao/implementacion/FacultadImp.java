/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.implementacion;

import ec.edu.unach.siget.accesodatos.conexion;
import ec.edu.unach.siget.accesodatos.parametro;
import ec.edu.unach.siget.dao.contrato.IFacultad;
import ec.edu.unach.siget.rnegocio.entidades.Facultad;
import ec.edu.unach.siget.rnegocio.entidades.Facultad;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JORGE
 */
public class FacultadImp implements IFacultad {

    @Override
    public int insertar(Facultad facultad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Facultad facultad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Facultad facultad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Facultad obtener(int id) throws Exception {
        Facultad facultad = null;
        String sql = "SELECT *FROM actividades.fn_buscar_facultades(?);";
        conexion con = new conexion();
        con.conectar();
        try {
            List<parametro> lstpar = new ArrayList<>();
            lstpar.add(new parametro(1, id));
            ResultSet rst = con.ejecutarQuery(sql, lstpar);
            while (rst.next()) {
                facultad = new Facultad();
                facultad.setCodigo(rst.getInt(1));
                facultad.setNombre(rst.getString(2));
                facultad.setDescripcion(rst.getString(3));
                facultad.setCodigo_Sicoa(rst.getInt(4));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return facultad;
    }

    @Override
    public List<Facultad> obtener() throws Exception {
        List<Facultad> lista = new ArrayList<>();
        String sql = "SELECT *FROM actividades.fn_listar_facultades();";
        conexion con = new conexion();
        con.conectar();
        try {
            ResultSet rst = con.ejecutarQuery(sql);
            while (rst.next()) {
                Facultad facultad = new Facultad();

                facultad.setCodigo(rst.getInt(1));
                facultad.setNombre(rst.getString(2));
                facultad.setDescripcion(rst.getString(3));
                facultad.setCodigo_Sicoa(rst.getInt(4));
                lista.add(facultad);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return lista;
    }

}
