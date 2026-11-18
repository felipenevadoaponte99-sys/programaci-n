package ejercicioMatriz;

public class Ejercicio1 {
    static boolean matrizNegativa(int[][] matriz){
        boolean numero=true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]<0){
                    numero=false;
                }
            }
        }
        return numero;
    }
    static void main() {
        int [][] matriz= {{1,2,3},{4,5,6}};
        boolean numero= matrizNegativa(matriz);
        if (numero){
            System.out.printf("no hay numero negativos");
        }else {
            System.out.printf("hay numeros negativos");
        }
    }
}
