package RELACION1º3;

import java.util.Scanner;

public class Ejercicio1 {
    static void main (String[] args) {
    System.out.println("inseta numero");
    Scanner teclado=new Scanner(System.in);
    int min=0;
    int max=0;
    int medi=0;
        for (int i =0; i<3; i++){
        int miNumero=teclado.nextInt();
        if (i==0){
            min=miNumero;
            max=miNumero;
            medi=miNumero;
        }else{
            if (miNumero<medi){
                medi=min;
                min=miNumero;
            }
            if(miNumero>medi){
                medi=max;
                max=miNumero;
            }
        }
    }
        System.out.println("el orde es "+ min +" "+medi+" "+max);
    }
}
