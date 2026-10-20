package RELACION1º4;

import java.util.Scanner;

public class Arbolito {
    static void main (String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("altura del triangulo");
        int altura =teclado.nextInt();
        for (int i =0; i<altura;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        int espacio=altura;
        int imprimi=1;
        //while (altura >= 0) {
        for (int a=0; a<altura; a++){
            for (int i=0; i<espacio-a;i++){
                System.out.print(" ");
            }
            for (int j=0;j<imprimi;j++){
                System.out.print("* ");
            }
            System.out.println();
            imprimi++;
            //espacio--;
           // altura--;
        }
        System.out.println("----------------------------------------------------");
        int cuadrado=altura;
            for (int i=0; i<cuadrado ;i++){
                for (int j=0; j<cuadrado ;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        System.out.println("----------------------------------------------------");
        int cuadrado2=altura;
        for (int i=0; i<cuadrado2 ;i++){
            for (int j=0; j<cuadrado2 ;j++){
                if (j==0 ||j==cuadrado2-1 || i==0 ||i==cuadrado2-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        System.out.println("altura del rectnagulo");
        int rectanAluta=teclado.nextInt();;
        System.out.println("anchura del rectnagulo");
        int ractanAnchura=teclado.nextInt();
        for (int i=0; i<rectanAluta ;i++){
            for (int j=0; j<ractanAnchura ;j++){
                System.out.print("* ");
                /*if (j==0 ||j==ractanAnchura-1 || i==0 ||i==rectanAluta-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }*/
            }
            System.out.println();
        }
    }
}
