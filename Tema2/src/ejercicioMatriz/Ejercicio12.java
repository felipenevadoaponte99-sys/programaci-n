package ejercicioMatriz;

public class Ejercicio12 {
    static int[][] cuadrado(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz.length != matriz[i].length) {
                System.out.print("no es cuadrado");
                return null;
            }
        }
        int[][] transforme = new int[matriz.length][matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                transforme[j][i] = matriz[i][j];
            }
        }
        return transforme;
    }

    static void main() {
        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 9, 0}, {3, 2, 1, 4, 5}, {9, 5, 8, 6, 7}, {0, 9, 8, 5, 4}};
        int[][] transforme;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");

        transforme = cuadrado(matriz);
        if (transforme != null) {
            for (int i = 0; i < transforme.length; i++) {
                for (int j = 0; j < transforme[i].length; j++) {
                    System.out.print(transforme[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
