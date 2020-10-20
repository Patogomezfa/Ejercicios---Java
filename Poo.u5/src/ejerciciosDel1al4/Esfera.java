
package ejerciciosDel1al4;

public class Esfera extends Figura3D {
  private int radio;

    public Esfera() {
    }

    public Esfera(String nombre, int grosorBorde, int color,int radio) {
        super(nombre, grosorBorde, color);
        this.radio=radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    double calcularVolumen() {
        double volumen=(4*Math.PI*Math.pow(radio, 3))/3;
      return volumen;
        
    }

    @Override
    void dibujar() {
      
    }
  
    
}
