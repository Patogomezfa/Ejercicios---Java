
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A continuacion le pediremos que ingrese los montos de sus sueldos mensuales.\n"+"Si ingresa un valor negativo, significa que no se ha cobrado el mes en curso y se muestra la suamtoria.", "Atencíon", JOptionPane.INFORMATION_MESSAGE); 
        int contador=1;
        double sueldo,suma=0;
      while(contador<=12){
         
        String texto = JOptionPane.showInputDialog (null, "Ingrese la cantidad comprada: ", "Ingresar datos.",JOptionPane.INFORMATION_MESSAGE);
        sueldo=Double.parseDouble(texto);
        if (sueldo>0){ 
        suma+=sueldo;
        contador++;
        } else{ 
            break;
        }
      }
        JOptionPane.showMessageDialog(null, "El resultado de la suma de sueldos ingresados es:$"+suma, "Atencíon", JOptionPane.INFORMATION_MESSAGE); 
    }
 
}
