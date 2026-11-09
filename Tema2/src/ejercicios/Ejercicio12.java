package ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio12 {
    static void main() {
        int[] vectorEnteros = {5, 22, 30, 5, 6, 8};

        System.out.println("Antes: ");
        System.out.println(Arrays.toString(vectorEnteros));

        //Arrays.sort(vectorEnteros);

        //System.out.println("Después: ");
        //System.out.println(Arrays.toString(vectorEnteros));
        for (int i = 0; i < vectorEnteros.length; i++) {
            for (int j = 0; j < vectorEnteros.length-i-1; j++) {
                if (vectorEnteros[j]>vectorEnteros[j+1]){
                    int cajica=vectorEnteros[j];
                    vectorEnteros[j]=vectorEnteros[j+1];
                    vectorEnteros[j+1]=cajica;
                }
            }
        }
        System.out.println(Arrays.toString(vectorEnteros));
    }
}
