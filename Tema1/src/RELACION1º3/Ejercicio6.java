package RELACION1º3;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        System.out.println("inserta el numero de alunmos");
        Scanner teclado=new Scanner(System.in);
        int alumno=teclado.nextInt();
        int apro=0;
        int susp=0;
        System.out.println("inserta las notas");
        for (int i =alumno;i>0;i--){
            int nota=teclado.nextInt();
            if(nota>=5){
                apro++;
            }else {
                susp++;
            }
        }
        System.out.println("el nuemroe de aprobados es "+apro+" y su porcentaje es "+(100*apro)/alumno+" %\n"+
                "el nuemroe de suspensos es "+susp+" y su porcentaje es "+(100*susp)/alumno+" %");
    }
}
