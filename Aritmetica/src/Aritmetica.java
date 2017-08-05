import java.util.Scanner;
public class Aritmetica {
    public static void main(String[] args){
        int i;
        int j;
        int suma;
        int resta;
        int mult;
        int div;
        int modulo;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresa el primer valor:");
        i = scn.nextInt();
        System.out.println("Ingres el segundo valor:");
        j = scn.nextInt();
        
        suma = i + j;
        resta = i - j;
        div = i / j;
        modulo = i % j;
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La división es " + div);
        System.out.println("El módulo es " + modulo);
    }
}
