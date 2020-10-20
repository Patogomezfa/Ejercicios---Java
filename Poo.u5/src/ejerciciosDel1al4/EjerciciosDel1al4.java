
package ejerciciosDel1al4;

public class EjerciciosDel1al4 {
    public static void main(String[] args) {
        Triangulo triangulo=new Triangulo(3,3,"Equilatero",1,1);
        System.out.println("El area del tringulo es:" +triangulo.calcularArea());
        System.out.println("El area del tringulo es:" +triangulo.calcularPerimetro()); 
        
       imprimirLinea();
        
        Cuadrado cuadrado=new Cuadrado(3, "Cuadrado", 1, 1);
        System.out.println("El area del cuadrado es:" +cuadrado.calcularArea());
        System.out.println("El area del cuadrado es:" +cuadrado.calcularPerimetro()); 
        
        imprimirLinea();
        
         Circulo circulo=new Circulo(3, "Circulo", 1, 1);
        System.out.println("El area del circulo es:" +circulo.calcularArea());
        System.out.println("El area del circulo es:" +circulo.calcularPerimetro()); 
        
        imprimirLinea();
        
        Piramide Pi=new Piramide(4, triangulo, "Piramide", 1, 1);
        System.out.println("El volumen de la piramide es:" +Pi.calcularVolumen()); 
        
          imprimirLinea();
         
          Cubo cu=new Cubo(cuadrado,"Cubo", 1,1);
        System.out.println("El volumen del cubo es:" +cu.calcularVolumen());
        
         imprimirLinea();
         
         Esfera es=new Esfera("Esfera", 1, 1,2);
         System.out.println("El volumen de la esferaes:" + es.calcularVolumen());
        imprimirLinea();
    }
  public static void imprimirLinea(){
      for (int i = 0; i < 50; i++) {
         System.out.print("*"); 
       }
      System.out.println("");
  }
}
