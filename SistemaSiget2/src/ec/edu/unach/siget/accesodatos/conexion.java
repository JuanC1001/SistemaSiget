/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author JORGE
 */
public class conexion {
     private Connection con;
    final String DRIVER = "org.postgresql.Driver";
    final String URL = "jdbc:postgresql://localhost:5432/sistema_siget";
    final String USUARIO = "postgres";
    final String CLAVE = "unach";

    public void conectar() {
        try {
            Class.forName(DRIVER);
            try {
                con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            } catch (SQLException e) {
                System.out.println("Error al conectar:" + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver:" + e.getMessage());
        }
    }

    public ResultSet ejecutarQuery(String sql) {
        ResultSet rst = null;
        conectar();
        try {
            Statement stm = con.createStatement();
            rst = stm.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
        return rst;
    }

    public ResultSet ejecutarQuery(String sql, List<parametro> lst) {
        ResultSet rst = null;
        try {
            conectar();
            PreparedStatement pstm = con.prepareStatement(sql);
            for (parametro par : lst) {
                if (par.getValor() instanceof java.util.Date) {
                    pstm.setObject(par.getPosicion(),
                            new java.sql.Date(((java.util.Date) par.getValor()).getTime()));
                } else {
                    pstm.setObject(par.getPosicion(), par.getValor());
                }
            }
            rst = pstm.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
        return rst;
    }

    public int ejecutaComando(String sql) {
        int numFilasAfectadas = 0;
        try {
            conectar();
            Statement stm = con.createStatement();
            numFilasAfectadas = stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
        return numFilasAfectadas;
    }

    public int ejecutaComando(String sql, List<parametro> lst) {
        int numFilasAfectadas = 0;
        try {
            conectar();
            PreparedStatement pstm = con.prepareStatement(sql);
            for (parametro prm : lst) {
                if (prm.getValor() instanceof java.util.Date) {
//                    java.sql.Date fechaBD;
//                    java.util.Date fechaOriginal = (java.util.Date) prm.getValor();
//                    fechaBD = new java.sql.Date(fechaOriginal.getTime());
//                    pstm.setObject(prm.getPosicion(), fechaBD);
                    pstm.setObject(prm.getPosicion(), 
                    new java.sql.Date(((java.util.Date)prm.getValor()).getTime()));
                } else {
                    pstm.setObject(prm.getPosicion(), prm.getValor());
                }
            }
            numFilasAfectadas = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
        return numFilasAfectadas;
    }

    public void desconectar() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
