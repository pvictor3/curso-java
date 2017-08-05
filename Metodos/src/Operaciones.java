import java.util.Scanner;
public class Operaciones {
    /*
    *Este método va a realizar la suma de dos números
    */
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    
    /*
    *Este método va a realizar la resta de dos números
    */
    public int restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    
    /*
    *Este método va a realizar la división de dos números
    */
    public int multiplicar(int numero1, int numero2){
        int mult = numero1 * numero2;
        return mult;
    }
    
    /*
    *Este método va a realizar la división de dos números
    */
    public int dividir(int numero1, int numero2){
        int div = numero1/numero2;
        return div;
    }
    
    /*
    *Este método va a realizar la impresión de los resultados de las operaciones
    */
    public void imprimirResultados(int suma, int resta, int mult, int div){
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicación es " + mult);
        System.out.println("El resultado de la división es " + div);
    }
    
    public static void main(String[] args){
        Operaciones op = new Operaciones();
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe el primer número");
        int numero1 = scn.nextInt();
        System.out.println("Escribe el segundo número");
        int numero2 = scn.nextInt();
        
        int suma = op.sumar(numero1, numero2);
        int resta = op.restar(numero1, numero2);
        int mult = op.multiplicar(numero1, numero2);
        int div = op.dividir(numero1, numero2);
        op.imprimirResultados(suma, resta, mult, div);
        
    }
}
