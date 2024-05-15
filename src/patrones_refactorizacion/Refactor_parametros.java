/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_refactorizacion;

/**
 *
 * @author josep
 */
public class Refactor_parametros {
    
    //Cuando quieres meter una variable que esta fuera, dentro del propio método
    
    int entrada;
    public Refactor_parametros(){
        
    }
    
    public int descuento(int cantidad, int año, int entrada1){
        int resultado = entrada1;
      if(entrada1 > 50) {
          resultado -=2;
      }  
      
      return resultado;
    }
    
    
}   
    

