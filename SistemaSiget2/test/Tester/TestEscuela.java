/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import ec.edu.unach.siget.dao.implementacion.EscuelaImp;
import ec.edu.unach.siget.dao.implementacion.FacultadImp;
import ec.edu.unach.siget.rnegocio.entidades.Escuela;
import ec.edu.unach.siget.rnegocio.entidades.Facultad;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author MI PC
 */
public class TestEscuela {

    @Test
    public void test() throws Exception {
        System.out.println("aqui deberia de empezar");

        EscuelaImp imp = new EscuelaImp();
        Escuela escuela = new Escuela();
        Facultad facultad = new Facultad();
        FacultadImp facultadimp = new FacultadImp();
        escuela.setCodigo(992);
        escuela.setFacultad(facultadimp.obtener(2));
        System.out.println("aqui deberia estar el nombre " + escuela.getFacultad().getNombre());
        escuela.setNombre("SISTEMAS COMPUTACION0");
        escuela.setDescripcion("xxxxxxxxxxxxx");
        escuela.setCodigo_Sicoa(101);

        // Insertar 
        int insert = 0;
        try {
            insert = imp.insertar(escuela);
            if (insert > 0) {
                System.out.println("INSERTADO: " + escuela.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL INSERTAR: " + e.getMessage());
        }
        assertTrue(insert > 0);

        //Modificar
        int update = 0;
        try {
            escuela.setDescripcion("SIN");
            update = imp.modificar(escuela);
            if (update > 0) {
                System.out.println("ACTUALIZADO: " + escuela.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL MODIFICAR: " + e.getMessage());
        }
        assertTrue(update > 0);

        //LISTAR POR CODIGO.
        Escuela esc2 = null;
        try {
            esc2 = imp.obtener(992);
            System.out.println("BUSCADO POR CODIGO: " + esc2.toString());
        } catch (Exception e) {
            System.err.println("ERROR! ERROR AL BUSCAR: " + e.getMessage());
        }
        assertTrue(esc2 != null);

        List<Escuela> lista;
        lista = new ArrayList<>();
        try {
            lista = imp.obtener();

            System.out.println("TODAS LAS PRUEBAS");
            for (Escuela facul : lista) {
                System.out.println("\t" + facul.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUNA ESCUAL ENCONTRADO: " + lista.size() + " " + e);
        }
        assertTrue(lista.size() > 0);
////        

        //LISTAR POR NOMBRE O CODIGO
        List<Escuela> listaDato = new ArrayList<>();
        String dato = "12";
        try {
            listaDato = imp.obtener();
            System.out.println("TODOS LAS ESCUELAS " + dato);
            for (Escuela cli : listaDato) {
                System.out.println("\t" + cli.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUNA ESCUELA   ENCONTRADO: " + e);
        }
        assertTrue(listaDato.size() > 0);

        //ELIMINAR
        int delete = 0;
        try {
            delete = imp.eliminar(escuela);
            if (delete != 0) {
                System.out.println("ELIMINADO: " + escuela.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NO SE PUDO ELIMINAR: " + e);
        }
        assertTrue(delete >= 0);
    }

}
