/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pvict
 */
public class Objetos {
    String nombre;
    String color;
    
    public static void main(String[] args){
        Objetos objeto1 = new Objetos();
        Objetos objeto2 = new Objetos();
        
        objeto1.nombre = "Objeto1";
        objeto2.nombre = "Obejto2";
        objeto1.color = "Azul";
        objeto2.color = "Rojo";
        
        System.out.println("El nombre del objeto1 es " + objeto1.nombre);
        System.out.println("El color del objeto1 es " + objeto1.color);
        System.out.println("El nombre del objeto2 es " + objeto2.nombre);
        System.out.println("El color del objeto2 es " + objeto2.color);
        
    }
}
