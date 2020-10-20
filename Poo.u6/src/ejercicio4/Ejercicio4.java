
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción","Selector de opciones", JOptionPane.QUESTION_MESSAGE,null,  // null para icono defecto
         new Object[] { "1.Saludar", "2.Despedirse", "3.Salir" },"1.Saludar");
        
      switch (seleccion.toString()){
          case "1.Saludar":
              String texto = JOptionPane.showInputDialog(null,"Por favor, ingrese su nombre:",JOptionPane.QUESTION_MESSAGE);  // el icono sera un iterrogante
              JOptionPane.showMessageDialog(null, "Hola "+texto, "Saludo!", JOptionPane.INFORMATION_MESSAGE); 
              break;
          case "2.Despedirse":
              JOptionPane.showMessageDialog(null, "Adiós", "Despedida", JOptionPane.INFORMATION_MESSAGE); 
               break;
          case  "3.Salir":
              break;
    }  
    }
   
}
