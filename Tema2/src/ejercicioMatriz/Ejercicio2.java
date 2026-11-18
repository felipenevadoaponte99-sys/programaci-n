package ejercicioMatriz;

public class Ejercicio2 {
    static void matrizSumada(int[][] matriz){
        int numero=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
             numero+=matriz[i][j];
            }
        }
        //System.out.print("a suma de todas las posiciones es "+numero);
        System.out.printf("a suma de todas las posiciones es %d", numero);
    }
    static void main() {
        int [][] matriz= {{1,2,3},{4,5,6}};
        matrizSumada(matriz);
    }
}
