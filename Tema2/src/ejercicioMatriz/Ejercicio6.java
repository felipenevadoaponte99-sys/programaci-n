package ejercicioMatriz;

public class Ejercicio6 {
    static void recorreColumnasInversa(int[][] matriz){
        for (int j = matriz[0].length-1; j >=0; j--) {
            for (int i = matriz.length-1; i >= 0; i--) {
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
    static void main(){
        int [][] matriz= {{1,3,5},{2,4,6}};
        System.out.println("columnas");
        recorreColumnasInversa(matriz);
    }
}
