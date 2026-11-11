package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static int[][] multiplicado(int altura/*, int anchura*/) {
        int[][] array = new int[altura][/*anchura*/10];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < /*anchura*/10; j++) {
                array[i][j] = (i+1) * (j+1);
            }
        }
        return array;
    }

    static void main() {
        System.out.print("¿Hasta qué número quieres calcular las tablas de multiplicar?: ");
        Scanner teclado = new Scanner(System.in);
        int altura = teclado.nextInt();
        //int anchura = 10;
        int[][] array = multiplicado(altura/*, anchura*/);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
