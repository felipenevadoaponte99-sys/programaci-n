package ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio12 {
    static void main() {
        int[] vectorEnteros = {5, 22, 30, 5, 6, 8};
        //String[] vectorNombres = {"LUCIA", "ANA MARIA", "LAURA", "ROSA", "JUAN"};

        System.out.println("Antes: ");
        System.out.println(Arrays.toString(vectorEnteros));
        //System.out.println(Arrays.toString(vectorNombres));

        Arrays.sort(vectorEnteros);
        //.sort(vectorNombres);

        System.out.println("Después: ");
        System.out.println(Arrays.toString(vectorEnteros));
        //System.out.println(Arrays.toString(vectorNombres));
    }
}
