package ejercicioMatriz;

public class Ejercicio16 {
    static int[][] busca(int[][] datos) {
        int[][] matriz = new int[datos.length][datos[0].length];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                int con = 0;
                // comprobar las 8 casillas adyacentes
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        // evitar comprobar la propia casilla
                        if (k == i && l == j) {
                            continue;
                        }
                        // comprobar que estamos dentro de la matriz
                        if (k >= 0 && k < datos.length && l >= 0 && l < datos[k].length) {
                            //comprobar si el numero es par de la matriz datos
                            if (datos[k][l] % 2 == 0) {
                                con++;
                            }
                        }
                    }
                }
                matriz[i][j] = con;
            }
        }
        return matriz;
    }

    static void main() {
        int[][] datos = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5}, {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}};

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");


        int[][] nuevaMatriz;
        nuevaMatriz = busca(datos);
        for (int i = 0; i < nuevaMatriz.length; i++) {
            for (int j = 0; j < nuevaMatriz[i].length; j++) {
                System.out.print(nuevaMatriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
