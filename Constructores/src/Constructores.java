
public class Constructores {
    
    public Constructores(){
        System.out.println("Hola soy el constructor.");
    }
    
    public Constructores(int a, int b){
        int suma = a + b;
        System.out.println("La suma es " + suma);
    }
    
    /*
    **Constructor copia
    */
    public Constructores(final Constructores c){
    
    }
    
    public static void main(String[] args){
        //Constructores obj = new Constructores();
        Constructores obj2 = new Constructores(2,2);
        Constructores obj3 = new Constructores(obj2);
    }
}
