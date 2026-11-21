package ejemplo.repaso.matriz;

import ejemplo.MiEntradaSalida;

public class ejercicio3 {
    static int[][] insertar(int[][] matriz) {
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                matriz[i][j] = (int) (Math.random() * 899)+100;
            }
        }
        return matriz;
    }

    static int[][] sumas(int[][] matriz) {
        int fila = 0;
        int columna = 0;
        int total = 0;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                if(j<matriz.length){
                    fila += matriz[i][j];
                }else {
                    matriz[i][j]=fila;
                    total+=fila;
                    fila=0;
                }
            }
        }
        for (int k = 0; k < matriz.length; k++) {
            for (int i = 0; i < matriz.length; i++) {
                if(i==matriz.length-1){
                    matriz[i][k]=columna;
                    total+=columna;
                    columna=0;
                }else {
                    columna += matriz[i][k];
                }
            }
        }
        matriz[matriz.length-1][matriz[matriz.length-1].length-1]=total;


        return matriz;
    }

    static void main() {
        int[][] matriz = new int[5][6];
        insertar(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

        sumas(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
