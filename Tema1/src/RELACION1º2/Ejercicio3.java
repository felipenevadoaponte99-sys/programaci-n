package RELACION1º2;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        System.out.print("cuantas veces ");
        int veces =teclado.nextInt();
        while (veces<=0){
            System.out.println("no se permite 0 ni numeros negativos:");
            veces = teclado.nextInt();
        }
        System.out.println("pares y impares:");
        for (int i =1; i<=veces; i++){
            int numero = teclado.nextInt();
            if (numero%2==0){
                System.out.println("el numero "+numero+" es par");
            }else {
                System.out.println("el numero "+numero+" es impar");
            }
        }

    }
}
