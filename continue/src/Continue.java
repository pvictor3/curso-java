
public class Continue {
    public static void main(String[] args) {
        int cuenta;
        for (cuenta = 1; cuenta <= 10; cuenta++) {
            if (cuenta == 5) {
                continue;
            }
            System.out.println("El valor de cuenta es: " + cuenta);
        }
        System.out.println("Fin del programa");
    }
}
