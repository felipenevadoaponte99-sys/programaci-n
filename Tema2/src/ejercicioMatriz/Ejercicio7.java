package ejercicioMatriz;

public class Ejercicio7 {
    /**
     * compara las matricessi son iguales
     * @param matrizUno la primera matriz
     * @param matrizDos la segunda
     * @return true si las dos matrices son iguales en tamaño y contenido
     */
    static boolean comparador(int [][] matrizUno, int[][] matrizDos){
        boolean igual=true;
        if (matrizUno.length==matrizDos.length && matrizUno[0].length==matrizDos[0].length){
            for (int i = 0; i < matrizUno.length; i++) {
                for (int j = 0; j < matrizUno[i].length; j++) {
                    if (matrizUno[i][j]!=matrizDos[i][j]){
                        igual=false;
                    }
                }
            }
        }else {
            igual=false;
        }
        return igual;
    }

    static void main(){
        int [][] matrizUno= {{1,3,5},{2,4,6}};
        int [][] matrizDos= {{1,3,5},{2,4,6}};

        boolean igual= comparador(matrizUno, matrizDos);

        if (igual){
            System.out.printf("son iguales");
        }else {
            System.out.printf("no son iguales");
        }
    }
}
