package RELACION1º3;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args){
        System.out.println("inserta numero");
        Scanner teclado=new Scanner(System.in);
        int miNumero1=teclado.nextInt();
        int miNumero2=teclado.nextInt();
        if (miNumero1>0 && miNumero2>0){
            int mcd=0;
            do{
                System.out.println(miNumero1+" : "+miNumero2+" = "+(miNumero1/miNumero2)+" y el resto "+(miNumero1%miNumero2));
                mcd=miNumero1%miNumero2;
                miNumero1=miNumero2;
                miNumero2=mcd;
            }while (mcd>0);
            System.out.println("el MCD es de"+miNumero1);
        }
    }
}
