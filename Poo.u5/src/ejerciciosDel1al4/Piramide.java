
package ejerciciosDel1al4;

public class Piramide extends Figura3D{
  private int altura;
  private Triangulo tri;

    public Piramide() {}
 
    public Piramide(int altura, Triangulo tri, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.altura = altura;
        this.tri = tri;
    }
   
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Triangulo getTri() {
        return tri;
    }

    public void setTri(Triangulo tri) {
        this.tri = tri;
    }

    @Override
    void dibujar() {
        
    }

    @Override
    double calcularVolumen() {
        double volumen=(tri.calcularArea()* altura)/3;
      return volumen;
       
    }


  
}
