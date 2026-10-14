package RELACION1º2;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        System.out.println("inserta los numeros de la operacion: ");
        int numA = teclado.nextInt();
        int numB = teclado.nextInt();
        int numFinal = 0;
        for (int i = 1; i<=numB; i++){
            numFinal=numFinal+numA;
        }
        System.out.printf("respuesta " + numFinal);

/*        prue = numA * numB;
        System.out.printf("respuesta " + prue);*/
    }
}
