package ejercicioMatriz;

import java.util.Scanner;

public class Ejercicio15 {
    static Scanner teclado = new Scanner(System.in);
    /**
     * busca la posico de una matriz
     * @param linea la linea
     * @param columna la colunma
     * @param fecha la matriz donde buscare la posicion
     */
    static void busca(int linea, int columna, int [][] fecha){
        System.out.print(fecha[linea][columna]);
       /* for (int i = 0; i <= linea; i++) {
            for (int j = 0; j <= columna; j++) {
                System.out.print(fecha[i][j]+" ");
            }
            System.out.println();
        }*/
    }

    static void main() {
        int[][] fecha = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}, {19, 20, 21, 25, 23, 24},
                {25, 26, 27, 28, 29, 30}};
        System.out.println("indique la linea");
        int line = teclado.nextInt();
        System.out.println("indique la columna");
        int columna = teclado.nextInt();
        busca(line, columna, fecha);
        /*for (int[] i : fecha) {
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
    }
}
