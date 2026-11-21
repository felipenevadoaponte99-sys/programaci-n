package ejemplo.repaso.matriz;

public class ejercicio5 {
    static int[][] insertar(int[][] matriz) {
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = (int) (Math.random() * 1001);
            }
        }
        return matriz;
    }
    static void maxmini(int [] [] matriz){
        int max=Integer.MIN_VALUE;
        int maxposicionfi=0;
        int maxposicionco=0;
        int min= Integer.MAX_VALUE;
        int minposicionfi=0;
        int minposicionco=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (max<matriz[i][j]){
                    max=matriz[i][j];
                    maxposicionfi=i;
                    maxposicionco=j;
                }
                if (min>matriz[i][j]){
                    min=matriz[i][j];
                    minposicionfi=i;
                    minposicionco=j;
                }
            }
        }
        System.out.println("la fila "+(maxposicionfi+1)+" en la columna "+(maxposicionco+1)+" esta el maximo "+max);
        System.out.print("la fila "+(minposicionfi+1)+" en la columna "+(minposicionco+1)+" esta el minimo "+min);



    }


    static void main() {
        int[][] matriz = new int[6][10];
        insertar(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        maxmini(matriz);
    }
}
