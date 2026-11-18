package ejercicioMatriz;

public class Ejercicio10 {
    /**
     *en este ejercicio comparamos el eje Y
     * @param matriz la matriz con los datos
     * @return un boolean que indica si son iguales
     */
    static boolean simetricoColumna(int [][] matriz){
        for (int j = 0; j < matriz[0].length/2; j++) {
            for (int i = 0; i < matriz.length; i++) {
                //System.out.println(matriz[i][j]+"A");
                //System.out.println(matriz[i][matriz.length+1-j]+"B");
                if (matriz[i][j]!= matriz[i][matriz.length+1-j]){
                    return false;
                }
            }
        }
        return true;
    }
    static void main() {
        int[][] matriz= {{1, 3, 3, 1}, {4, 2, 2, 4}};
        //System.out.println(simetrico(matriz));
        if (simetricoColumna(matriz)){
            System.out.println("es simetrico");
        }else {
            System.out.println("NO es simetrico");
        }
    }
}
