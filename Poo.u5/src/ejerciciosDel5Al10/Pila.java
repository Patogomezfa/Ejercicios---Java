
package ejerciciosDel5Al10;

import java.util.Arrays;

public class Pila implements IColeccion {

    
    private Object[] array;
    private int contador;

    public Pila(int tamanio) {
     array = new Object[tamanio];
     contador=0;
}

    @Override
    public boolean estaVacia() {
        return contador==0;
        
    }

    @Override
    public Object extraer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object primero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    

    @Override
    public boolean añadir(Object ob) {
        if(contador==array.length){
           return false; 
        }else{
           array[contador] = ob;
           contador++;
            return true; 
        }
        
       
    }

        @Override
        public String toString() {
            return "Pila{" + "array=" + Arrays.toString(array) + ", contador=" + contador + '}';
        }

   
     
       
        
    
}
    
