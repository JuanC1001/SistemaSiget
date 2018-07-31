/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import ec.edu.unach.siget.dao.contrato.IEscuela;
import ec.edu.unach.siget.dao.implementacion.EscuelaImp;
import ec.edu.unach.siget.dao.implementacion.NivelImp;
import ec.edu.unach.siget.rnegocio.entidades.Escuela;
import ec.edu.unach.siget.rnegocio.entidades.Nivel;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author MI PC
 */
public class TestNivel {
    @Test
     public void test() throws Exception{
    NivelImp imp = new NivelImp();
    Nivel nivel = new Nivel();
    IEscuela escuelaimp= new EscuelaImp();
    
    nivel.setCodigo(997);
    nivel.setCodigo_Sicoa(111);
    nivel.setNombre("B04");
    nivel.setParalelo("FFFF");
    nivel.setModalidad("NUPTURANA");
    nivel.setEscuela(escuelaimp.obtener(14));
   
    // Insertar 
    int insert = 0;
         try {
             insert=imp.insertar(nivel);
             if(insert>0){
                System.out.println("INSERTADO: "+nivel.toString());                
            }                      
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL INSERTAR: " + e.getMessage());
        }        
         assertTrue(insert>0);
            
     //Modificar
        int update = 0;
         try {
             nivel.setNombre("SIN");
             update=imp.modificar(nivel);
             if(update>0){
                System.out.println("ACTUALIZADO: "+nivel.toString());                
            }                      
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL MODIFICAR: " + e.getMessage());
        }        
         assertTrue(update>0);
        
            //LISTAR POR CODIGO.
         Nivel  nivel2 = null;
        try {
            nivel2 = imp.obtener(997);
            System.out.println("BUSCADO POR CODIGO: " + nivel2.toString());
        } catch (Exception e) {
            System.err.println("ERROR! ERROR AL BUSCAR: " + e.getMessage());
        }
        assertTrue(nivel2 != null); 
          
        List<Nivel> lista ;
        lista = new ArrayList<>();
        try {            
            lista = imp.obtener();
            
            System.out.println("TODAS LAS PRUEBAS");
            for (Nivel Escuel : lista) {
                System.out.println("\t" + Escuel.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUNA ESCUAL ENCONTRADO: "+lista.size()+" " +e);
        }
        assertTrue(lista.size() >0);   
////        
        
        //LISTAR 
        List<Nivel> listaDato = new ArrayList<>();
        String dato = "12";
        try {
            listaDato = imp.obtener();
            System.out.println("TODOS LOS NIVELES "+dato);
            for (Nivel cli : listaDato) {
                System.out.println("\t" + cli.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUN NIVELES ENCONTRADO: " +e);
        }
        assertTrue(listaDato.size() >0);     
        
        
        
        //ELIMINAR
        int delete = 0;
        try {
            delete = imp.eliminar(nivel);
            if (delete!=0) {
                System.out.println("ELIMINADO: " + nivel.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NO SE PUDO ELIMINAR: "+ e);
        }
        assertTrue(delete >= 0);
}
}
