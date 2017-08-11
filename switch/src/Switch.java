import javax.swing.JOptionPane;
public class Switch {
    public static void main(String[] args) {
        String eleccion = JOptionPane.showInputDialog("Elige el mes");
        int elec = Integer.parseInt(eleccion);
                
        switch(elec){
            case 1:
                JOptionPane.showMessageDialog(null, "Enero");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Febrero");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No hay mes");
        }
        
    }
}
