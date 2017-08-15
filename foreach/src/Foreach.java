/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pvict
 */
public class Foreach {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9};
        int total = 0;
        
        for(int numero : arreglo){
            total += numero;
        }
        
        System.out.println("La suma total es: " + total);
        
        total = 0;
        for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];
        }
        
        System.out.println("La suma total es: " + total);
    }
}
