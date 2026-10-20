package RELACION1º4;

import java.util.Scanner;

public class Ejercicio2 {
    static void main (String[] args) {
    /*2. Basándote en la implementación del ejercicio anterior, realiza un programa que
    determine si un número es un capicúa. Es decir, si se lee igual de atrás hacia
    delante que de adelante hacia atrás.*/
        Scanner teclado =new Scanner(System.in);
        System.out.println("numero capicuo");
        int miNuemro=teclado.nextInt();
        int invertir=0;
        int cambiador =0;
        int resevado=miNuemro;
        while (miNuemro<0){
            System.out.println("nada de numeros negativos");
            miNuemro =teclado.nextInt();
        }
        while (miNuemro>0){
            cambiador=miNuemro%10;
            invertir=(invertir*10)+cambiador;
            miNuemro=miNuemro/10;
        }
        if (invertir==resevado){
            System.out.printf("el numero es capicuo "+invertir+" = "+resevado);
        }else {
            System.out.printf("el numero es NO capicuo "+invertir+" = "+resevado);
        }
    }
}
