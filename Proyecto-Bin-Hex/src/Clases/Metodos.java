/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jose Daniel Tistoj Reyes 
 */
public class Metodos {
    
    public String DecimalBinario(int decimal){
        int resultado= decimal, residuo;
        String cadena="";
        while(resultado != 1){
            residuo = resultado % 2;
            resultado = resultado /2;
            System.out.println(resultado);
            cadena = cadena + residuo +"";
            if(resultado == 1){
                cadena = cadena + resultado + "";
            }
        }
        cadena = ordenarBinario(cadena);
        return cadena;
    }
    private String ordenarBinario(String cadena){
        String nuevaCadena="";
        System.out.println(cadena);
        for(int i=cadena.length()-1;i>=0;i--){
            nuevaCadena = nuevaCadena + String.valueOf(cadena.charAt(i))+ "";
        }
        return nuevaCadena;
    }
    
}
