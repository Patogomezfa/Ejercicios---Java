
package ejerciciosDel1al4;

public class Cuadrado extends Figura2D {
    private int lado;

    public Cuadrado() {}

    

    public Cuadrado(int lado, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.lado = lado;
    }
     public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
       double area=Math.pow(lado, 2);
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro=4*lado;
        return perimetro;
        
    }

    @Override
    void dibujar() {
      
    }
     public int cambiatTamanio(){
        return 0;
            
    }   
}
