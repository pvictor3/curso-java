import javax.swing.JOptionPane;
public class EncuestaEstudiantes {
    
    public static void main(String[] args) {
        int[] respuestas = {1,2,3,4,5,5,4,3,2,1,1,2,3,4,5,5,4,3,2,14};
        int[] frecuencia = new int[6];
        
        for (int i = 0; i < respuestas.length; i++) {
            try{
                frecuencia[respuestas[i]] += 1;
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Valor incorrecto: " + respuestas[i]);
            }
        }
        
        System.out.printf("%s %10s\n", "Calificación", "Frecuencia");
            
            for (int j = 1; j < frecuencia.length; j++) {
                System.out.printf("%6d %10d\n", j, frecuencia[j]);
            }
    }
}
