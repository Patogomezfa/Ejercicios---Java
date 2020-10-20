
package ejerciciosDel1al4;

public class Circulo extends Figura2D {

    private int radio;

    public Circulo() {} 
    

    public Circulo(int radio, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
       double area=Math.PI*Math.pow(radio, 2);
        return area;
    }

    @Override
    double calcularPerimetro() {
      double perimetro=2*Math.PI*radio;
        return perimetro;
        
    }

    @Override
    void dibujar() {
       
    }
     public int cambiatTamanio(){
        return 0;
            
    }   
    
}
