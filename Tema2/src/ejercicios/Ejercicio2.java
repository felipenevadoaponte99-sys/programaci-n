package ejercicios;

public class Ejercicio2 {
    static int sumaNumerosNegativo(int[] unArray) {
        int contador = 0;
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] < 0) {
                contador++;
            }
        }
        return contador;
    }

    static void main() {
        int miArray[] = {1, -2, 3, -4, 5};
        int negativo = sumaNumerosNegativo(miArray);
        System.out.println("El numero de negativos es " + negativo);
    }
}
