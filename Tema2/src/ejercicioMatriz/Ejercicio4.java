package ejercicioMatriz;

public class Ejercicio4 {
    static void recorreFilasInversa(int[][] matriz){

        for (int i = matriz.length-1; i >=0; i--) {
            for (int j = matriz[0].length-1; j >=0; j--) {
                System.out.print(matriz[i][j]+" ");
            }
        }
    }

    static void main(){
        int [][] matriz= {{1,2,3},{4,5,6}};
        System.out.println("fila");
        recorreFilasInversa(matriz);

    }
}
