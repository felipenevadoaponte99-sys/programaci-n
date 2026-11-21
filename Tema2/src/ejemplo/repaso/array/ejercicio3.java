package ejemplo.repaso;

import java.util.Scanner;

public class ejercicio3 {
/*Escribe un programa que lea 10 números por teclado y que luego los muestre
en ordeninverso,es decir,el primero quese introduce es el último en mostrarse
y viceversa.*/
static Scanner teclado = new Scanner(System.in);
    static int [] almacen(int[] num){
        int [] matriz = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            matriz[i]=teclado.nextInt();
        }
        return matriz;
    }

    static void main(){
        int[] num = new int[10];
        int[] matriz = almacen(num);
        for (int i = matriz.length-1; i >=0 ; i--) {
            System.out.print(matriz[i]+" ");
        }
    }

}
