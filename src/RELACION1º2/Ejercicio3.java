package RELACION1º2;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args){
        System.out.println("pares y impares:");
        Scanner teclado =new Scanner(System.in);
        int numero = teclado.nextInt();
        while (numero<=0){
            System.out.println("no se permite 0 ni numeros negativos:");
            numero = teclado.nextInt();
        }
        if (numero%2==0){
            System.out.println("el numero "+numero+" es par");
        }else {
            System.out.println("el numero "+numero+" es impar");
        }
    }
}
