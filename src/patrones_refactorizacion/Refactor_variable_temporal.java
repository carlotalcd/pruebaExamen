/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_refactorizacion;

/**
 *
 * @author josep
 */
public class Refactor_variable_temporal {
    
    int alto = 100;
    int ancho = 200;
    
    
    public Refactor_variable_temporal(){
        
        //Crea variable con la operación que escribas
        int perimetro = 2 *(alto + ancho);

        System.out.println(perimetro);
        int area = alto*ancho;
    
        System.out.println(area);
    }
    
}
