package ejercicioMatriz;

public class Ejercicio5 {
    static void recorreColumnas(int[][] matriz){
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
    static void main(){
        int [][] matriz= {{1,3,5},{2,4,6}};
        System.out.println("columnas");
        recorreColumnas(matriz);
    }
}
