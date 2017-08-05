import java.util.Scanner;

public class Teclado {
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad:");
        
        int edad = scn.nextInt();
        
        System.out.println("La edad que proporcionaste es "+edad);
        System.out.println("Gracias por la información.");
    }
}
