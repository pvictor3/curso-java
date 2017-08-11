import java.util.Scanner;
public class EdadGenero {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Hola, cuál es tu género?");
        //nextLine se utiliza cuando intentamos leer cadenas de caracteres desde el teclado.
        String genero = sc.nextLine();
        
        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();

        //ahora debes poner el código necesario para realizar el ejercicio
        
        String aviso_1;
        if (edad>=18){
            aviso_1 = "Eres mayor de edad";
        }else{
            aviso_1 = "Eres menor de edad";
        }
        System.out.println(aviso_1);
        
        String aviso_2 = "";
        if (genero.equalsIgnoreCase("masculino")){
            aviso_2 = "Eres un hombre";
        }else if(genero.equalsIgnoreCase("femenino")){
            aviso_2 = "Eres una mujer";
        }
        System.out.println(aviso_2);
        
        System.out.println("Hola, " + aviso_2.toLowerCase()+ " " + "de " + edad + " años." + aviso_1);
        
    }
}
