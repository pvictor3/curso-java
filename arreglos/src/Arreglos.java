/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pvict
 */
public class Arreglos {
    public static void main(String[] args) {
        String[] arreglo1 = new String[5];
        int[] arreglo2 = {1,2,3,4,5};
        
        arreglo1[0] = "uno";
        arreglo1[1] = "dos";
        arreglo1[2] = "tres";
        arreglo1[3] = "cuatro";
        arreglo1[4] = "cinco";
        
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Valor: " + arreglo1[i]);
        }
        
    }
}
