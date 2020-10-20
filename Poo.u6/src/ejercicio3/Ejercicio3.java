package ejercicio3;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio3 {

    static int arregloA[] = new int[5];
    static int arregloB[] = new int[5];
    static int arregloC[] = new int[5];

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Se le pedirá que ingrese dos arreglos de 5 numeros cada uno.\nLa computadora mostrará la suma de cada posición", "Atencíon", JOptionPane.INFORMATION_MESSAGE);
        cargarA();
        cargarB();
        sumaAB(arregloA, arregloB);
    }

    static void cargarA() {

        for (int i = 0; i < arregloA.length; i++) {
            String texto = JOptionPane.showInputDialog(null, "Arreglo A.-Ingrese el número " + (i + 1) + ":", "Ingresar datos.", JOptionPane.INFORMATION_MESSAGE);
            arregloA[i] = Integer.parseInt(texto);
        }
    }

    static void cargarB() {

        for (int i = 0; i < arregloB.length; i++) {
            String texto = JOptionPane.showInputDialog(null, "Arreglo B.-Ingrese el número " + (i + 1) + ":", "Ingresar datos.", JOptionPane.INFORMATION_MESSAGE);
            arregloB[i] = Integer.parseInt(texto);
        }
    }

    static void sumaAB(int A[], int B[]) {

        for (int i = 0; i < arregloC.length; i++) {
            arregloC[i] = A[i] + B[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de los arreglos es:" + Arrays.toString(arregloC), "Atencíon", JOptionPane.INFORMATION_MESSAGE);

    }
}
