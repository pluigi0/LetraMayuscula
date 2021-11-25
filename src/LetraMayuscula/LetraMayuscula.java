
package LetraMayuscula;

import javax.swing.JOptionPane;

public class LetraMayuscula {
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Hola, escribe una letra: ").charAt(0);
        
        if (Character.isUpperCase(letra)){ // Determina si el caracter en cuestion es mayuscula
            JOptionPane.showMessageDialog(null, " Es una letra mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, " Es minuscula");            
        }
    }
    
}
