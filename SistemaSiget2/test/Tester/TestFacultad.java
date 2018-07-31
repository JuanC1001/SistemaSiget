/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import ec.edu.unach.siget.dao.implementacion.FacultadImp;
import ec.edu.unach.siget.rnegocio.entidades.Facultad;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author GHISSEL
 */
public class TestFacultad {
     @Test
    public void test() {
        
        FacultadImp imp = new FacultadImp();
        Facultad facultad = new Facultad();
        facultad= new Facultad(100, "Ingenieria", "de unach",10);
        facultad.setCodigo(100);
        facultad.setNombre("INGENIERA SISTEMAS");
        facultad.setDescripcion("facultad de ingeniera ");
        facultad.setCodigo_Sicoa(100);
        
        
        //INSERTAR 
        int insert = 0;
         try {
             insert=imp.insertar(facultad);
             if(insert>0){
                System.out.println("INSERTADO: "+facultad.toString());                
            }                      
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL INSERTAR: " + e.getMessage());
        }        
         assertTrue(insert>0);
        
        //ACTUALIZAR
        int update = 0;
         try {
             facultad.setDescripcion("SIN");
             update=imp.modificar(facultad);
             if(update>0){
                System.out.println("ACTUALIZADO: "+facultad.toString());                
            }                      
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL ACTUALIZAR: " + e.getMessage());
        }        
         assertTrue(update>0);
        
         //LISTAR POR CODIGO.
         Facultad  fac2 = null;
        try {
            fac2 = imp.obtener(100);
            System.out.println("BUSCADO POR CODIGO: " + fac2.toString());
        } catch (Exception e) {
            System.err.println("ERROR! ERROR AL BUSCAR: " + e.getMessage());
        }
        assertTrue(fac2 != null);       
        
        //LISTAR TODOS
        List<Facultad> lista ;
        lista = new ArrayList<>();
        try {            
            lista = imp.obtener();
            
            System.out.println("TODAS LAS FACULTADES");
            for (Facultad facul : lista) {
                System.out.println("\t" + facul.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUN FACULTAD ENCONTRADO: "+lista.size()+" " +e);
        }
        assertTrue(lista.size() >0);   
////        
        
        //LISTAR POR NOMBRE O CEDULA
        List<Facultad> listaDato = new ArrayList<>();
        String dato = "12";
        try {
            listaDato = imp.obtener();
            System.out.println("TODOS LOS CLIENTES "+dato);
            for (Facultad cli : listaDato) {
                System.out.println("\t" + cli.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUNA FACULTAD  ENCONTRADO: " +e);
        }
        assertTrue(listaDato.size() >0);     
        
        
        
        //ELIMINAR
        int delete = 0;
        try {
            delete = imp.eliminar(facultad);
            if (delete!=0) {
                System.out.println("ELIMINADO: " + facultad.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NO SE PUDO ELIMINAR: "+ e);
        }
        assertTrue(delete >= 0);

    }
  
        
        
        
    }

