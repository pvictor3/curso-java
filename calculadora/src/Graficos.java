import javax.swing.JOptionPane;

/**
 * Esta clase crea una calculadora gráfica utilizando los métodos de la clase operaciones
 * @author pvict
 */
public class Graficos {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Ingresa el primer número");
        String n2 = JOptionPane.showInputDialog("Ingresa el seguno número");
        
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
        Operaciones op = new Operaciones();
        
        double suma = op.sumar(num1, num2);
        double resta = op.restar(num1, num2);
        double divi = op.div(num1, num2);
        double multi = op.mult(num1, num2);
        
        JOptionPane.showMessageDialog(null, "La suma es " + suma);
        JOptionPane.showMessageDialog(null, "La resta es " + resta);
        JOptionPane.showMessageDialog(null, "La división es " + divi);
        JOptionPane.showMessageDialog(null, "La multiplicación es " + multi);
        
        
    }
}
