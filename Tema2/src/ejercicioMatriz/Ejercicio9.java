package ejercicioMatriz;

public class Ejercicio9 {
    /**
     *en este ejercicio comparamos el eje X
     * @param matriz la matriz con los datos
     * @return un boolean que indica si son iguales
     */
    static boolean simetricoLinia(int [][] matriz){
        for (int i = 0; i < matriz.length/2; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //System.out.println(matriz[matriz.length-1-i][j]+"A");
                //System.out.println(matriz[i][j]+"B");
                if (matriz[i][j]!= matriz[matriz.length-1-i][j]){
                  return false;
                }
            }
        }
        return true;
    }
    static void main() {
        int[][] matriz= {{1, 2, 5, 6}, {4, 2, 0, 8}, {4, 2, 0, 8}, {1, 2, 5, 6}};
        //System.out.println(simetrico(matriz));
        if (simetricoLinia(matriz)){
            System.out.println("es simetrico");
        }else {
            System.out.println("NO es simetrico");
        }
    }
}
