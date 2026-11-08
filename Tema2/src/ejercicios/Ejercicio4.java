package ejercicios;

import ejemplo.MiEntradaSalida;

public class Ejercicio4 {
    /*public static void numerosLocos(int TOTAL_NUMEROS, int nume, int asta) {
        int almace = 0;
        int muchoNumeros=0;

        int[] cuantos =new int[asta];
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            muchoNumeros = MiEntradaSalida.numeroAleatorio(nume);
            int resto=muchoNumeros%10;
            cuantos[resto]+=1;
        }
        double porcentaje;
        double porcentajeTotal=0;
        for (int i = 0; i < cuantos.length; i++) {
            porcentaje=(double)(cuantos[i] * 100) / TOTAL_NUMEROS;
            System.out.printf("El nº %d se ha repetido %d veces. Esto equivale a un %.2f%%\n", i, cuantos[i], porcentaje);
            porcentajeTotal+=porcentaje;
        }
        System.out.printf("La sumade todos los porcentajes es equivalente al %.2f%%. El %% medio para cada contador es de %.2f%%. \n", porcentajeTotal, porcentajeTotal/10);
    }*/

        static final int TOTAL_NUMEROS =6000;
    static void main() {
        int nume = 100;
        int asta = 10;
        //numerosLocos(TOTAL_NUMEROS,nume,asta);

        int almace = 0;
        int muchoNumeros=0;
        /**/int lugarMax=0;
        /**/int lugarMin=0;

        int[] cuantos =new int[asta];
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            muchoNumeros = MiEntradaSalida.numeroAleatorio(nume);
            /**/almace += muchoNumeros;
            int resto=muchoNumeros%10;
            cuantos[resto]+=1;
        }
        /**/System.out.println("media de los numeros "+(double)almace/TOTAL_NUMEROS);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < cuantos.length; i++) {
            if (max<cuantos[i]){
                max=cuantos[i];
                lugarMax=i;
            }
            if (min>cuantos[i]){
                min=cuantos[i];
                lugarMin=i;
            }
        }
        System.out.println("numero maximo "+lugarMax);
        /**/System.out.println("numero minimo "+lugarMin);
        double porcentaje;
        double porcentajeTotal=0;
        for (int i = 0; i < cuantos.length; i++) {
            porcentaje=(double)(cuantos[i] * 100) / TOTAL_NUMEROS;
            System.out.printf("El nº %d se ha repetido %d veces. Esto equivale a un %.2f%%\n", i, cuantos[i], porcentaje);
            porcentajeTotal+=porcentaje;
        }
        System.out.printf("La sumade todos los porcentajes es equivalente al %.2f%%. El %% medio para cada contador es de %.2f%%. \n", porcentajeTotal, porcentajeTotal/10);

    }
}
