
public class Break {
    public static void main(String[] args){
        int cuenta;
        
        for (cuenta = 1;  cuenta <= 10; cuenta++) {
            if (cuenta == 5) {
                break;
            }
            System.out.println("Cuenta es: " + cuenta);
        }
        
        System.out.println("Salio del ciclo en cuenta = " + cuenta);
    }
}

