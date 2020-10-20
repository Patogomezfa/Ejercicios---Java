
package ejerciciosDel5Al10;

public class EjerciciosDel5Al10 {
    public static void main(String[] args) {
        int tamanio=5;
        Pila p=new Pila(tamanio);
        for (int i = 0; i < tamanio; i++) {
          p.añadir(i);
        }
        
     
        System.out.println("La Pila esta vacía? " + p.estaVacia());
        System.out.println("Mostramos la Pila: " + p.toString());
      
    }
        
 
}
    

