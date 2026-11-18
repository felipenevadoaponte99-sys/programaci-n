package ejercicioMatriz;

public class Ejercicio8 {
    /**
     * este apartado uilizamos dos matrices y si son iguales en tamaño se suma
     * @param matrizUno matriz primera
     * @param matrizDos matriz segunda
     * @return devuelve la nueva matriz con la suma de los dos
     */
    static int[][] calculo(int[][] matrizUno, int[][] matrizDos) {
        int[][] suma = new int[0][0];
        boolean matrizverdad = true;
        for (int i = 0; i < matrizUno.length; i++) {
            if (matrizUno[i].length != matrizDos[i].length) {
                matrizverdad = false;
            }
        }
        if (matrizUno.length == matrizDos.length && matrizverdad) {
            suma = new int[matrizUno.length][matrizUno[0].length];
            for (int i = 0; i < matrizUno.length; i++) {
                for (int j = 0; j < matrizUno[i].length; j++) {
                    suma[i][j] = matrizUno[i][j] + matrizDos[i][j];
                }
            }
        } else {
            System.out.printf("No son iguales");
        }
        return suma;
    }


    static void main() {
        int[][] matrizUno = {{1, 2}, {4, 6}};
        int[][] matrizDos = {{4, 1}, {1, 0}};

        int[][] suma = calculo(matrizUno, matrizDos);
        if (suma.length != 0) {
            for (int i = 0; i < matrizUno.length; i++) {
                for (int j = 0; j < matrizUno[i].length; j++) {
                    System.out.println("columna " + i + " fila " + j + ": " + matrizUno[i][j] + " + " + matrizDos[i][j] + " = " + suma[i][j]);
                }
            }
        }
    }
}
