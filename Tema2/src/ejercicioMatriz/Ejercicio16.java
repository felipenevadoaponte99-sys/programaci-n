package ejercicioMatriz;

public class Ejercicio16 {
    static void busca(int[][] datos) {
        int datoUno = -1;
        int datoDos = -1;
        /*int impar = 0;*/
        int[][] matriz = new int[datos.length][datos[0].length];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                int k=i-1;
                int l=j-1;
               /* for (int k=i-1; k <i+1; k++) {
                    for (int l=j-1; l <j+1; l++) {*/
                        if ( k >= 0 && k < datos.length) {
                            if ( l >= 0 && l < datos[k].length) {
                                System.out.print(datos[k][l]);
                            }
                        }
                    /*}
                }*/
            }
        }
        //return matriz;
    }

    static void main() {
        int[][] datos = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5}, {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}};
        int[][] nuevaMatriz;

        // nuevaMatriz = busca(datos);
        busca(datos);
    }
}
