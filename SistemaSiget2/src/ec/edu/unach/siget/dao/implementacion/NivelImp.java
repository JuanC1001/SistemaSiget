/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.implementacion;

import ec.edu.unach.siget.accesodatos.conexion;
import ec.edu.unach.siget.accesodatos.parametro;
import ec.edu.unach.siget.dao.contrato.IEscuela;
import ec.edu.unach.siget.dao.contrato.INivel;
import ec.edu.unach.siget.dao.implementacion.EscuelaImp;
import ec.edu.unach.siget.rnegocio.entidades.Nivel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MI PC
 */
public class NivelImp implements INivel {

        @Override
        public int insertar(Nivel nivel) {
        int numFilasAfectadas = 0;
        String sql = "INSERT INTO actividades.nivel (codigo, codigo_sicoa, nombre, paralelo, modalidad, codigo_escuela)" +
"    VALUES (?, ?, ?, ?, ?, ?);";
        List<parametro> lstpar = new ArrayList<>();
        lstpar.add(new parametro(1, nivel.getCodigo()));
        lstpar.add(new parametro(2, nivel.getCodigo_Sicoa()));
        lstpar.add(new parametro(3, nivel.getNombre()));
        lstpar.add(new parametro(4, nivel.getParalelo()));
        lstpar.add(new parametro(5, nivel.getModalidad()));
        lstpar.add(new parametro(6, nivel.getEscuela().getCodigo()));

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
    public int eliminar(Nivel nivel) {
        int numFilasAfectadas = 0;
        conexion con = new conexion();
        String sql = "DELETE FROM actividades.nivel where codigo = ?";
        List<parametro> lstPar = new ArrayList<>();
        lstPar.add(new parametro(1, nivel.getCodigo()));
        numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        con.desconectar();
        return numFilasAfectadas;
    }

        @Override
    public int modificar(Nivel nivel) {
        int numFilasAfectadas = 0;
        conexion con = new conexion();
        String sql = "UPDATE actividades.nivel\n" +
"   SET codigo_sicoa=?, nombre=?, paralelo=?, modalidad=?, \n" +
"       codigo_escuela=?\n" +
" WHERE codigo=?; ";
        List<parametro> lstPar = new ArrayList<>();
       
        lstPar.add(new parametro(1, nivel.getCodigo_Sicoa()));
        lstPar.add(new parametro(2, nivel.getNombre()));
        lstPar.add(new parametro(3, nivel.getParalelo()));
        lstPar.add(new parametro(4, nivel.getModalidad()));
        lstPar.add(new parametro(5, nivel.getEscuela().getCodigo()));
         lstPar.add(new parametro(6, nivel.getCodigo()));

        numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        con.desconectar();

        return numFilasAfectadas;
    }

        @Override
    public Nivel obtener(int id) throws Exception {
        Nivel nivel = null;
        String sql = "SELECT codigo, codigo_sicoa, nombre, paralelo, modalidad, codigo_escuela" +
"  FROM actividades.nivel WHERE codigo=?";
        conexion con = new conexion();
        con.conectar();
        try {
            List<parametro> lstpar = new ArrayList<>();
            lstpar.add(new parametro(1, id));
            ResultSet rst = con.ejecutarQuery(sql, lstpar);
            while (rst.next()) {
                nivel = new Nivel();
                IEscuela escueladao = new EscuelaImp();

                nivel.setCodigo(rst.getInt(1));
                nivel.setCodigo_Sicoa(rst.getInt(2));
                nivel.setNombre(rst.getString(3));
                nivel.setParalelo(rst.getString(4));
                nivel.setModalidad(rst.getString(5));
                nivel.setEscuela(escueladao.obtener(rst.getInt(6)));
                
                            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return nivel;
    }

        @Override
    public List<Nivel> obtener() throws Exception {
        List<Nivel> lista = new ArrayList<>();

        String sql = "SELECT codigo, codigo_sicoa, nombre, paralelo, modalidad, codigo_escuela" +
        "  FROM actividades.nivel;";
        conexion con = new conexion();
        con.conectar();
        try {
            ResultSet rst = con.ejecutarQuery(sql);
            while (rst.next()) {
                Nivel nivel = new Nivel();
                IEscuela escueladao =  new EscuelaImp();
                
                nivel.setCodigo(rst.getInt(1));
                nivel.setCodigo_Sicoa(rst.getInt(2));
                nivel.setNombre(rst.getString(3));
                nivel.setParalelo(rst.getString(4));
                nivel.setModalidad(rst.getString(5));
                nivel.setEscuela(escueladao.obtener(rst.getInt(6)));
                lista.add(nivel);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return lista;
    }

}
