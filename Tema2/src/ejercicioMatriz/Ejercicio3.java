package ejercicioMatriz;

public class Ejercicio3 {
    static void recorreFilas(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
        }
    }

    static void main(){
        int [][] matriz= {{1,2,3},{4,5,6}};
        System.out.println("fila");
        recorreFilas(matriz);

    }
}