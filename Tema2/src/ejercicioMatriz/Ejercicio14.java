package ejercicioMatriz;

public class Ejercicio14 {
    static int [] [] traslacion(int[][] matriz){
        int[][] transformer = new int[matriz.length][matriz[0].length];
        for (int j= 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                transformer[j][i]=matriz[i][j];
            }
        }
        return transformer;
    }
    static void main(){
        int [][] matriz= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transformer;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

        transformer = traslacion(matriz);

        for (int i = 0; i < transformer.length; i++) {
            for (int j = 0; j < transformer[i].length; j++) {
                System.out.print(transformer[i][j]+" ");
            }
            System.out.println();
        }


    }
}
