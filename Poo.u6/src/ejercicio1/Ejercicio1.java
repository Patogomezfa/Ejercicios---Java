
package ejercicio1;
import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "A continuacion le pediremos la cantidad y el precio de un articulo comprado.", "Atencíon", JOptionPane.INFORMATION_MESSAGE); 
      boolean bandera = false;
       int cantidad;
       double precio, monto = 0;
       do{
        String texto = JOptionPane.showInputDialog (null, "Ingrese la cantidad comprada: ", "Ingresar datos.",JOptionPane.INFORMATION_MESSAGE);
        cantidad=Integer.parseInt(texto);
        
        texto = JOptionPane.showInputDialog (null, "Ingrese el precio del articulo: ", "Ingresar datos.",JOptionPane.INFORMATION_MESSAGE);
        precio=Double.parseDouble(texto);
        monto+=cantidad * precio;
        
        texto=JOptionPane.showInputDialog(null,"Ingrese 'S' para seguir cargando datos o 'N' para terminar. ",JOptionPane.QUESTION_MESSAGE);
        
        if ("n".equals(texto)|| "N".equals(texto)){
            
              bandera=true;
        }
      
        
       }while(bandera==false);
       
         JOptionPane.showMessageDialog(null, "El monto total de la factura es: $"+monto, "Atencíon", JOptionPane.INFORMATION_MESSAGE); 
    }
  
}
