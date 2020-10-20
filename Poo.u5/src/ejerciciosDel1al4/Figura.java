
package ejerciciosDel1al4;

public abstract class Figura {
 private String nombre;
 private int grosorBorde;
 private int color;
    public Figura(){}

    public String getNombre() {
        return nombre;
    }
    public Figura(String nombre, int grosorBorde, int color) {
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrosorBorde() {
        return grosorBorde;
    }

    public void setGrosorBorde(int grosorBorde) {
        this.grosorBorde = grosorBorde;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
     abstract void dibujar();
        
    
 
}
