package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {public static int[][] figura(int altura, int anchura) {
    int[][] array = new int[altura][anchura];
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < anchura; j++) {
            //System.out.print(i*j+"|");
            array[i][j] =0;
        }
        //System.out.println();
    }
    return array;
}

    static void main() {
        System.out.println("figuras locas: ");
        Scanner teclado = new Scanner(System.in);
        System.out.print("altura: ");
        int altura = teclado.nextInt();
        System.out.print("anchura: ");
        int anchura = teclado.nextInt();
        int[][] array = figura(altura, anchura);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
