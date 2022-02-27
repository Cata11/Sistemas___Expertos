/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.maria;

import estimados.estimados;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moreno
 */
public class EjercicioMaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<estimados> listachicos = new ArrayList<>();
    estimados juan =new estimados("juan","masculino","pistear");
     estimados pedro =new estimados("pedro","masculino","");
      estimados luis =new estimados("luis","masculino","bailar");
       estimados mateo =new estimados("mateo","masculino","bailar");
        estimados ana =new estimados("ana","femennino","bailar");
        estimados maria =new estimados("maria","femenino","pistear");
       
    
          
          listachicos.add(juan);
           listachicos.add(pedro);
            listachicos.add(luis);
             listachicos.add(mateo);
              listachicos.add(ana);
               listachicos.add(maria);
            ;
                
                
                for (estimados lista:listachicos){
                    if (lista.gusto.equals("bailar")&& lista.genero.equals("masculino")) {
                        System.out.println("A maria le gustan...."+ lista.nombre + " por que es de sexo.."+ lista.getGenero() + " y por que le encanta" + lista.gusto);
                    }
                }
    }
    
}
