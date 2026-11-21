package ejercicioMatriz;
public class Ejercicio11 {
    /**
     * compara dos matrices una normal y otra inversa
     * @param matrizUno matriz normal
     * @param matrizDos matriz inversa
     * @return devuelve el boolean si son iguales o no
     */
    static boolean inverso(int [][] matrizUno, int[][] matrizDos){
        boolean igual=true;
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j <matrizUno[0].length; j++){
                if (matrizUno[i][j]!=matrizDos[matrizUno.length-1-i][matrizUno[0].length-1-j]){
                    igual=false;
                    break;
                }
            }
        }
        return igual;
    }
    static void main() {
        int[][] matrizUno= {{5, 8, 9, 0}, {4, 7, 5, 2}, {1, 7, 3, 2}};
        int[][] matrizDos= {{2, 3, 7, 1}, {2, 5, 7, 4}, {0, 9, 8, 5}};
        if (inverso(matrizUno,matrizDos)){
            System.out.println("son iguales");
        }else {
            System.out.println("NO son iguales");
        }
    }
}
