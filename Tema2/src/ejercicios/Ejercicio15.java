package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static int[] primosTacha(int numero, int[] array){
        int primo=0;
        for (int i = 2; i <= numero; i++) {
            int con=0;
            for (int j = 2; j < numero; j++) {
                if (i%j==0){
                    con++;
                }
            }
            if (con<2){
                array[primo]=i;
                primo++;
            }
        }
        return array;
    }
    public static boolean[] cribaEratostenes(int num) {
        boolean[] array = new boolean[num];

        for (int i = 2; i < num/2; i++) {
            if (!array[i]) {
                for (int j = i*2; j < num; j+=i) {
                    array[j] = true;
                }
            }
        }

        return array;
    }

    static void main(){
        System.out.print("¿hasta que números quieres que muestres los primos?: ");
        Scanner teclado = new Scanner(System.in);
        int numero=teclado.nextInt();
        /*int [] array=new int[numero];
        int [] arrayFinal;
        arrayFinal =primosTacha(numero, array);

        for (int i = 0; i < arrayFinal.length; i++) {
            if (arrayFinal[i]!=0){
                System.out.print(arrayFinal[i]+" ");
            }
        }*/

        boolean[] array = cribaEratostenes(numero);

        for (int i = 2; i < array.length; i++) {
            if (!array[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
