
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pvict
 */
public class Grafico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        String nacionalidad = JOptionPane.showInputDialog("Escribe tu nacionalidad");
        String altura = JOptionPane.showInputDialog("Escribe tu altura");
        String edad = JOptionPane.showInputDialog("Escribe tu edad");
        
        double alt = Double.parseDouble(altura);
        int ed = Integer.parseInt(edad);
        
        Persona usuario = new Persona();
        usuario.setNombre(nombre);
        usuario.setNacionalidad(nacionalidad);
        usuario.setAltura(alt);
        usuario.setEdad(ed);
        
        JOptionPane.showMessageDialog(null, "Nombre: " + usuario.getNombre());
        JOptionPane.showMessageDialog(null, "Nacionalidad: " + usuario.getNacionalidad());
        JOptionPane.showMessageDialog(null, "Altura: " + usuario.getAltura());
        JOptionPane.showMessageDialog(null, "Edad: " + usuario.getEdad());
        
        
    }
}
