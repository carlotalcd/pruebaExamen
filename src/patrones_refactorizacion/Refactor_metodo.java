/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_refactorizacion;

/**
 *
 * @author josep
 */
public class Refactor_metodo implements NewInterface {
    
    String _nombre = "DC refactor";
    @Override
     public void imprimirTodo() {
        metodo1();
    } 

    private void metodo1() {
        imprimirBanner();
        metodo2();
    } 

    private void metodo2() {
        metodo6();
    } 

    @Override
    public void metodo6() {
        // detalles de impresión
        System.out.println("nombre: " + _nombre);
        System.out.println("cantidad " + getCargoPendiente());
    } 
    
    @Override
    public void imprimirBanner(){
        System.out.println("Imprimiendo Banner");
        metodo6();
    }
 
    @Override
    public int getCargoPendiente(){
        return 10;
    }
}
