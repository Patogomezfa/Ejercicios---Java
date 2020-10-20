
package ejerciciosDel1al4;

public class Cubo extends Figura3D {
    private Cuadrado c;

    public Cubo() {} 
    

    public Cubo(Cuadrado c, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.c = c;
    }

    public Cuadrado getC() {
        return c;
    }

    public void setC(Cuadrado c) {
        this.c = c;
    }

    @Override
    double calcularVolumen() {
        double volumen=Math.pow(c.getLado(), 3);
        return volumen;
       
    }

    @Override
    void dibujar() {
       
    }

  
    
    
}
