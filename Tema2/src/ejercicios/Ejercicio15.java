package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static int[] primosTacha(int numero, int[] array){
        //System.out.print("2 ");
        int primo=0;
        for (int i = 2; i < numero; i++) {
            int con=0;
            for (int j = 2; j < numero; j++) {
                if (i%j==0){
                    con++;
                }
            }
            if (con<2){
                //array[i]=i;
                array[primo]=i;
                primo++;
            }/*else {
                array[i]=0;
            }*/
        }
        return array;
    }
    static void main(){
        Scanner teclado = new Scanner(System.in);
        int numero=teclado.nextInt();
        int [] array=new int[numero];
        int [] arrayFinal;
        arrayFinal =primosTacha(numero, array);

        for (int i = 0; i < arrayFinal.length; i++) {
            if (arrayFinal[i]!=0){
                System.out.print(arrayFinal[i]+" ");
            }
            //System.out.print(arrayFinal[i]+" ");
        }
    }
}
