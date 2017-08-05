
public class Estaticos {
    static String atrib = "Atributo";
    
    public static int sumar(int x, int y){
        int suma = x + y;
        return suma;
    }
    
    public static void main(String[] args) {
        Estaticos est1 = new Estaticos();
        Estaticos est2 = new Estaticos();
        
        est1.atrib = "Atributo cambiado";
        
        est2.atrib = "Valor estático";
        
        System.out.println("Varible1 es " + est1.atrib);
        System.out.println("Variable2 es " + est2.atrib);
        
        int suma = Estaticos.sumar(5, 5);
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("Variable de clase: " + Estaticos.atrib);
    }
}
