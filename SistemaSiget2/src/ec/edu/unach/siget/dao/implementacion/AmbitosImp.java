/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.dao.implementacion;

import ec.edu.unach.siget.accesodatos.conexion;
import ec.edu.unach.siget.accesodatos.parametro;
import ec.edu.unach.siget.rnegocio.entidades.Ambitos;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MI PC
 */
public class AmbitosImp {
     public int insertar( Ambitos ambitos) {
int numFilasAfectadas =0;
        String sql = "INSERT INTO actividades.ambitos(codigo, nombre, observacion, estado)" +
                    " VALUES (?, ?, ?, ?);";
        List<parametro> lstpar = new ArrayList<>();
        lstpar.add(new parametro(1, ambitos.getCodigo_Serial()));
        lstpar.add(new parametro(2, ambitos.getNombre()));
        lstpar.add(new parametro (3, ambitos.getObservacion()));
        lstpar.add(new parametro (3, ambitos.getEstado()));
        conexion con = new conexion();
        
        try {
            con.conectar();
            numFilasAfectadas= con.ejecutaComando( sql, lstpar);
        } catch (Exception e) {
            throw  e;
        }finally {
        con.desconectar();
        }
         return numFilasAfectadas;
    }

//    @Override
    public int modificar(Ambitos ambitos) {
        int numFilasAfectadas = 0;
         conexion con = new conexion(); 
        
       String sql=" UPDATE actividades.ambitos SET  nombre=?, observacion=?, estado=?"
               + " WHERE codigo=?";
        List<parametro> lstPar=new ArrayList<>();
        lstPar.add(new parametro(1,ambitos.getNombre()));
        lstPar.add(new parametro(1,ambitos.getObservacion()));
        lstPar.add(new parametro(1,ambitos.getEstado()));
        
        
         numFilasAfectadas=con.ejecutaComando(sql, lstPar);
         con.desconectar();
        
        return numFilasAfectadas;
    }

//    @Override
    public int eliminar(Ambitos ambitos) {
        int numFilasAfectadas = 0;
        conexion con = new conexion(); 
     
        String sql = "DELETE FROM actividades.ambitos"+
      "WHERE codigo=?";

        List<parametro> lstPar=new ArrayList<>();
        lstPar.add(new parametro(1,ambitos.getCodigo_Serial()));
         numFilasAfectadas=con.ejecutaComando(sql, lstPar);
         con.desconectar();
        return numFilasAfectadas;
    }

    
    public Ambitos obtener(int id) throws Exception {
    Ambitos ambitos = null;
     String sql = "SELECT codigo, nombre, observacion, estado"
    +  " FROM ambitos where codigo =?";
       conexion con = new conexion();
       con.conectar();
        try {
            List<parametro> lstpar= new ArrayList<>();
            lstpar.add(new parametro(1,id));
            ResultSet rst = con.ejecutarQuery(sql,lstpar);
            while (rst.next()) {
//                ambitos = new Ambitos();
//                ambitos.setCodigo(rst.getInt(1));
//                ambitos.setNombre(rst.getString(2));
//                ambitos.setObservacion(rst.getString(3));
//                ambitos.setEstado(rst.getInt(4));
           }
        }catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return ambitos;
    }

//    @Override
    public List<Ambitos> obtener() throws Exception {
 List<Ambitos> lista = new ArrayList<>();

        String sql =" SELECT codigo, nombre FROM categoria ";
        conexion con = new conexion();
        con.conectar();
        try {
            ResultSet rst = con.ejecutarQuery(sql);
            while (rst.next()) {
//                Ambitos ambitos = new Ambitos();
//                ambitos.setCodigo(rst.getInt(1));
//                ambitos.setNombre(rst.getString(2));          
//                lista.add(ambitos);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.desconectar();
        }
        return lista;
    }

}
