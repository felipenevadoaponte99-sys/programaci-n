package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    static Scanner teclado = new Scanner(System.in);

    static void main() {
        int miArray[] = {4,7,6,9,8,1,2,5,3,0};
/*
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] *= -1;
        }
        Arrays.sort(miArray);
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] *= -1;
        }
*/
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray.length-i-1; j++) {
                if (miArray[j]>miArray[j+1]){
                    int cajica=miArray[j];
                    miArray[j]=miArray[j+1];
                    miArray[j+1]=cajica;
                }
            }
        }
        System.out.println(Arrays.toString(miArray));

        /*System.out.print("insete el numero: ");
         busca = teclado.nextInt();
        int valor = MiEntradaSalida.bucarArrayPosicion(miArray, busca);
        if (valor == -1) {
            System.out.println("posicion " + valor + " no encontrado");
        } else {
            System.out.println("esta en la posicion " + valor);
        }*/
    }
}
