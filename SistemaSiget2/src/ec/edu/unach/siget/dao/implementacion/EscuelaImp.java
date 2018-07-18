/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.implementacion;

import ec.edu.unach.siget.accesodatos.conexion;
import ec.edu.unach.siget.accesodatos.parametro;
import ec.edu.unach.siget.dao.contrato.IEscuela;
import ec.edu.unach.siget.dao.contrato.IFacultad;
import ec.edu.unach.siget.rnegocio.entidades.Escuela;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JORGE
 */
public class EscuelaImp implements IEscuela {

    @Override
    public int insertar(Escuela escuela) {
        int numFilasAfectadas = 0;
        String sql = "SELECT * FROM actividades.fn_insertar_escuelas(?,?,?,?,?)";
        List<parametro> lstpar = new ArrayList<>();
        lstpar.add(new parametro(1, escuela.getCodigo()));
        lstpar.add(new parametro(2, escuela.getFacultad().getCodigo()));
        lstpar.add(new parametro(3, escuela.getNombre()));
        lstpar.add(new parametro(4, escuela.getDescripcion()));
        lstpar.add(new parametro(5, escuela.getCodigo_Sicoa()));

        conexion con = new conexion();

        try {
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return numFilasAfectadas;
    }

    @Override
    public int eliminar(Escuela escuela) {
        int numFilasAfectadas = 0;
        conexion con = new conexion();
        String sql = "DELETE FROM escuela"
                + "  where codigo = ?";
        List<parametro> lstPar = new ArrayList<>();
        lstPar.add(new parametro(1, escuela.getCodigo()));
        numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        con.desconectar();
        return numFilasAfectadas;
    }

    @Override
    public int modificar(Escuela escuela) {
        int numFilasAfectadas = 0;
        conexion con = new conexion();
        String sql = "SELECT actividades.fn_actualizar_escuelas(?,?,?,?,?);";
        List<parametro> lstPar = new ArrayList<>();
        lstPar.add(new parametro(1, escuela.getCodigo()));
        lstPar.add(new parametro(2, escuela.getFacultad().getCodigo()));
        lstPar.add(new parametro(3, escuela.getNombre()));
        lstPar.add(new parametro(4, escuela.getDescripcion()));
        lstPar.add(new parametro(5, escuela.getCodigo_Sicoa()));

        numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        con.desconectar();

        return numFilasAfectadas;
    }

    @Override
    public Escuela obtener(int id) throws Exception {
        Escuela escuela = null;
        String sql = "SELECT codigo, nombre";
        conexion con = new conexion();
        con.conectar();
        try {
            List<parametro> lstpar = new ArrayList<>();
            lstpar.add(new parametro(1, id));
            ResultSet rst = con.ejecutarQuery(sql, lstpar);
            while (rst.next()) {
                escuela = new Escuela();
                IFacultad facultaddao = new FacultadImp();

                escuela.setCodigo(rst.getInt(1));
                escuela.setFacultad(facultaddao.obtener(rst.getInt(2)));
                escuela.setNombre(rst.getString(3));
                escuela.setDescripcion(rst.getString(4));
                escuela.setCodigo_Sicoa(rst.getInt(5));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return escuela;
    }

    @Override
    public List<Escuela> obtener() throws Exception {
        List<Escuela> lista = new ArrayList<>();

        String sql = "SELECT codigo, codigo_facultad, nombre, descripcion, codigo_sicoa FROM actividades.escuela;";
        conexion con = new conexion();
        con.conectar();
        try {
            ResultSet rst = con.ejecutarQuery(sql);
            while (rst.next()) {
                Escuela escuela = new Escuela();
                IFacultad facultaddao = new FacultadImp();
                
                escuela.setCodigo(rst.getInt(1));
                escuela.setFacultad(facultaddao.obtener(rst.getInt(2)));
                escuela.setNombre(rst.getString(3));
                escuela.setDescripcion(rst.getString(4));
                escuela.setCodigo_Sicoa(rst.getInt(5));
                lista.add(escuela);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return lista;
    }

}
