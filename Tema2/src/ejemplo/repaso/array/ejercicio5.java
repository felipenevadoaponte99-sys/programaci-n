package ejemplo.repaso;

import java.util.Scanner;

public class ejercicio5 {
    static Scanner teclado = new Scanner(System.in);

    static void numero(int[] array){
        int max=Integer.MIN_VALUE;
        int maxposicion=0;
        int min=Integer.MAX_VALUE;
        int minposicion=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(teclado.nextLine());
            if(array[i]>max){
                max=array[i];
                maxposicion=i;
            }
            if(array[i]<min){
                min=array[i];
                minposicion=i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i==maxposicion){
                System.out.println("maximo "+array[i]);
            }else if (i==minposicion){
                System.out.println("minimo "+array[i]);
            }else {
                System.out.println(array[i]);
            }
        }
    }
    static void main(){
        int [] array = new int[10];
        numero(array);

    }
}
