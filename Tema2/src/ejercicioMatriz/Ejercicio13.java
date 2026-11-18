package ejercicioMatriz;

public class Ejercicio13 {
    static int [][] cuadrado(int[][]matriz){
        int[][] transforme = new int[matriz.length][matriz[0].length];
        for (int j = matriz[0].length-1; j >=0; j--) {
            for (int i = matriz.length-1; i >= 0; i--) {
                transforme[matriz[0].length-1-j][matriz.length-1-i]=matriz[i][j];
                /*if (matriz.length-1==j){
                    int prueba;
                    for (int k = 0; k<matriz[i].length-j; k++) {
                        prueba=matriz[i+k][j];
                        matriz[i+k][j]=matriz[i][j+k];
                        matriz[i][j+k]=prueba;
                    }
                }*/
                //System.out.print(matriz[i][j]+" ");
            }
            //System.out.println();
        }
        return transforme;
    }
    static void main() {
        int[][] matriz= {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {3, 2, 1, 4, 5}, {9, 5, 8, 6, 7}, {0, 9, 8, 5, 4}};
        int[][] transforme;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");

        transforme = cuadrado(matriz);

        for (int i = 0; i < transforme.length; i++) {
            for (int j = 0; j < transforme[i].length; j++) {
                System.out.print(transforme[i][j]+" ");
            }
            System.out.println();
        }
    }
}
