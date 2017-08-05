import javax.swing.JOptionPane;
public class Dialogos {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
    }
 
}
