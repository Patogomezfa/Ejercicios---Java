
package ejerciciosDel1al4;

public class Triangulo extends Figura2D {
    private int base;
    private int altura;

    public Triangulo() {}
    
    public Triangulo(int base, int altura, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        double area=(base * altura)/2;
        return area;
        
    }
    @Override
    public double calcularPerimetro(){
        double perimetro=(base + altura)+(Math.sqrt(Math.pow(base, 2)+ Math.pow(altura,2)));
        
        return  perimetro;
    }
    @Override
    public void dibujar(){
        
    }
    public int cambiatTamanio(){
        return 0;
            
    }
}
