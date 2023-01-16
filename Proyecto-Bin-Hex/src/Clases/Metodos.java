/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Jose Daniel Tistoj Reyes 
 */
public class Metodos {
    private String[] hex = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    private ArrayList<Integer> arrayHex;
    
    public String DecimalBinario(int decimal){
       
        int resultado= decimal, residuo;
        String cadena="";
        while(resultado != 1){
            residuo = resultado % 2;
            resultado = resultado /2;
            //System.out.println(resultado);
            cadena = cadena + residuo +"";
            if(resultado == 1){
                cadena = cadena + resultado + "";
            }
        }
        cadena = ordenarBinario(cadena);
        System.out.println(cadena);
        return cadena;
    }
    private String ordenarBinario(String cadena){
        String nuevaCadena="";
        for(int i=cadena.length()-1;i>=0;i--){
            nuevaCadena = nuevaCadena + String.valueOf(cadena.charAt(i))+ "";
        }
        return nuevaCadena;
    }
    public String decimalHexadecimal(int decimal){
        int resultado = decimal, residuo;
        arrayHex = new ArrayList<Integer>();
        //comprobamos que sea menor a 16 
        if(resultado<16){
            arrayHex.add(resultado);
        }
        //El ciclo sigue siempre y cuando sea igual o mayor a 16
        while(resultado>=16){
            residuo = resultado % 16;
            resultado = resultado / 16;
            //vamos agregandoe el residuo a la lista 
            arrayHex.add(residuo);
            //cuando el resultado ya sea menor a 16 el resultado se agrega a la lista y no el residuo
            if(resultado<16){
                arrayHex.add(resultado);
            }
        }
        Collections.reverse(arrayHex);
        //System.out.println(arrayHex);
        //System.out.println(cadenaHexadecimal(arrayHex));
        return cadenaHexadecimal(arrayHex);
    }
    
   private String cadenaHexadecimal(ArrayList<Integer> array){
       String cadena = "";
       for(int i : array){
         if(i<=9){
             cadena = cadena + i +"";
         }else{

             cadena  = cadena + hex[i]+"";
         }  
       }
       return cadena;
   }
   public String decimalOctadecimala(int decimal){
       int resultado = decimal, residuo;
       String cadena = "";
       if(resultado<8){
           cadena = cadena + resultado + "";
       }
       while(resultado >=8){
           residuo = resultado % 8;
           resultado = resultado / 8;
           cadena = cadena+residuo+"";
           System.out.println(resultado);
           if(resultado<8){
               cadena = cadena + resultado+"";
           }
       }
       cadena = ordenarBinario(cadena);
       System.out.println(cadena);
       return cadena;
   }
   public boolean comprobarBinario(String binario){
       return false;
   }
    
}
