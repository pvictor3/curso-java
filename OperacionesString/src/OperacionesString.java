
public class OperacionesString {
    public static void main(String[] args){
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        
        int enteroAUnir = 20;
        double decimal = 15.32;
        
        //Concatenar cadenas
        String concatenacion = cadena1 + " " + cadena2;
        System.out.println("La concatenacion es " + concatenacion);
        
        String concatenacion2 = cadena1.concat(cadena2);
        System.out.println("La concatenacion es " + concatenacion2);
        
        //Longitud de una cadena
        String cadena3 = "Java";
        System.out.println("Longitud de la cadena es " + cadena3.length());
        System.out.println("Longitud de cadena anónima es " + "Victor".length());
        
        //Extraer una parte de una cadena
        String extraer = "Mi lenguaje favorito es Java".substring(24, 28);
        System.out.println("La extracción es " + extraer);
        
        //Comparacion
        boolean comparacion1 = "Hola".equals("Hola Mundo!");
        String cadena4 = "Hello";
        boolean comparacion2 = cadena4.equals("Hello");
        System.out.println("La comparacion es " + comparacion1);
        System.out.println("La comparacion es " + comparacion2);
        
    }
    
}
