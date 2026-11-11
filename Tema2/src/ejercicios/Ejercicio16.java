package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static int[][] multiplicado(int numero) {
        int[][] array = new int[numero][10];
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < 10; j++) {
                //System.out.print(i*j+"|");
                array[i][j] = (i+1) * (j+1);
            }
            //System.out.println();
        }
        return array;
    }

    static void main() {
        System.out.print("¿Hasta qué número quieres calcular las tablas de multiplicar?: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int[][] array = multiplicado(numero);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
