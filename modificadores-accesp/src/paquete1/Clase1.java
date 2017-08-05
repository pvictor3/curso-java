/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author pvict
 */
public class Clase1 {
    /*
    **Modificador de acceso por defecto solo las clases
    **del mismo paquete pueden ver sus atributos y métodos
    */
    int variable1;
    
    /**
     * Modificador de acceso public, los atributos y métodos 
     * pueden ser vistos desde cualquier paquete o proyecto.
     */
    public float variable2;
    
    /**
     * Modificador de acceso private, solo la clase puede ver sus
     * métodos y atributos.
     */
    private double variable3;
    
}
