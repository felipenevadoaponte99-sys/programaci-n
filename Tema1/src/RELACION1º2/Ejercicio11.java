package RELACION1º2;

import java.util.Scanner;

public class Ejercicio11 {
    static void main (String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("inserta el numero");
        int miNuemro=teclado.nextInt();
        int Invertir=0;
        int Cambiador =0;
        while (miNuemro<0){
            System.out.println("nada de numeros negativos");
            miNuemro =teclado.nextInt();
        }
        while (miNuemro>0){
            Cambiador=miNuemro%10;
            if(miNuemro<10){
                Invertir=(Invertir*10)+Cambiador;
                Cambiador=miNuemro/10;
            }else {
                Invertir=(Invertir*10)+Cambiador;
            }
            miNuemro=miNuemro/10;
        }
        System.out.println(Invertir);
    }
}
