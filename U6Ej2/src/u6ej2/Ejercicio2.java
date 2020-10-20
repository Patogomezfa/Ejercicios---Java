
package u6ej2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {

        double sueldo=0, sueldoAnual = 0;
        int contador = 0;

        while(sueldo>=0 && contador<12){
        
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo mensual: "));
            sueldoAnual = sueldo+sueldoAnual;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "El total de sueldos que ha cobrado es: "+ sueldoAnual);
    }
    
}
