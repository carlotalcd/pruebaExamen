/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_refactorizacion;

/**
 *
 * @author carlo
 */
public class Padrecito extends RefactorPadrePush {
    
    String nombre = "Soy tu Padre";
    String apellido = "Ortega";

    public Padrecito() {
    }

    public void escribir_nombre() {
        System.out.println(this.nombre);
    }

    public void escribeapellido() {
        System.out.println(this.apellido);
    }
    
}
