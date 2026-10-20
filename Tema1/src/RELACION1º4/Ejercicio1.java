package RELACION1º4;

import java.util.Scanner;

public class Ejercicio1 {
    static void main (String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("inserta el numero");
        int miNuemro=teclado.nextInt();
        int invertir=0;
        int cambiador =0;
        while (miNuemro<0){
            System.out.println("nada de numeros negativos");
            miNuemro =teclado.nextInt();
        }
        while (miNuemro>0){
            cambiador=miNuemro%10;
            invertir=(invertir*10)+cambiador;
            miNuemro=miNuemro/10;
        }
        System.out.println(invertir);
    }
}
