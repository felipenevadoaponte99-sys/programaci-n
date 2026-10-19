package RELACION1º2;

import java.util.Scanner;

public class Ejercicio10 {
    static void main (String[] args){
        Scanner teclado =new Scanner(System.in);
        System.out.println("escrive el numeros");
        int miNumero =teclado.nextInt();
        int miAlmacen=1;
        String prue= "";
        while (miNumero<0){
            System.out.println("nada de numeros negativos");
            miNumero =teclado.nextInt();
        }
        /*
        for (int i =0; i<=miNumero; i++){
            if (i==0){
                prue= prue+" "+ miNumero;
            }else {
                miAlmacen=miAlmacen*i;
                int opera=miNumero - i;
                if (opera>1) {
                    prue = prue + " * " + opera;
                }else if(opera!=0){
                    prue = prue + " * " + opera;
                }
            }
        }
        System.out.print("Factorial ("+miAlmacen+")="+prue);
        */
        for (int i =1; i<=miNumero; i++){
                miAlmacen=miAlmacen * i;
        }
        System.out.print("Factorial ("+miNumero+")="+miAlmacen);
    }
}
