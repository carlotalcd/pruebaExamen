/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_refactorizacion;

/**
 *
 * @author josep
 */
public class Refactor_InLine {
   
//Inline constante
double pi = 3.14;
//en vez de crear la variable pi, si solo se va a usar una vez, usar directamente el numero, quitas espacio y todo 

//Inline del método
//si solo vas a usar un método una vez, hacerlo directamente, no crear método



//Inline Variable
    //antes de refactorizar
   // public Prueba simetrico(){
   //     Prueba objeto_prueba = new Prueba();
   //     return objeto_prueba;
   // }
    // constantes, variables y metodos
    
    //despues de refactorizar
    public Prueba simetrico(){
        return new Prueba();
    }

    
    
}
