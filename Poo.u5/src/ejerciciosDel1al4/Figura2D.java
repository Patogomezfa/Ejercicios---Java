
package ejerciciosDel1al4;

public abstract class Figura2D extends Figura{

    public Figura2D() {
    }

    public Figura2D(String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
    }
   abstract double calcularArea();  
   
   abstract double calcularPerimetro();
}
