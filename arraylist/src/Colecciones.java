import java.util.ArrayList;
public class Colecciones {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        
        array.add("rojo");
        array.add("verde");
        array.add("azul");
        
        for(String elemento : array){
            System.out.println(elemento);
        }
        
        if (array.contains("verde")) {
            System.out.println("Si tengo el elemento");
        }
        
        if (array.contains("amarillo")) {
            System.out.println("Si tengo el elemento amarillo");
           
        }else
            System.out.println("No tengo el elemento amarillo");
        
        System.out.println("El array está vacío? " + array.isEmpty());
        
        array.clear();
        
        System.out.println("El array está vacío? " + array.isEmpty());
    }
}
