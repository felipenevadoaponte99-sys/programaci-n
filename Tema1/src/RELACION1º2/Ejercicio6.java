package RELACION1º2;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        int numA = teclado.nextInt();
        int numB = teclado.nextInt();
        int prue = 0;
        for (int i = 1; i<=numB; i++){
            prue=prue+numA;
        }
        System.out.printf("respuesta " + prue);

/*        prue = numA * numB;
        System.out.printf("respuesta " + prue);*/
    }
}
