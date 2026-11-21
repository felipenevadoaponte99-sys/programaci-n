package ejemplo.repaso;

import java.util.Scanner;

public class ejercicio12 {
    static Scanner teclado = new Scanner(System.in);
    static void muestra(int[] num) {
        int incio = teclado.nextInt();
        int finales= teclado.nextInt();
        int caja=0;
        if (incio<finales){
            if(incio>=0 && incio<=9 && finales>=0 && finales<=9){

                for (int i = num.length-1; i > 0; i--) {
                    if (i==incio){
                        caja=num[incio];
                        int almacen = num[finales];
                        num[finales]=num[incio];
                    }
                    int preuba = num[i-1];
                    num[i-1]=num[i];
                    num[i]=preuba;
                }
                System.out.println("----------------------------------------------");

                for (int i = 0; i < num.length; i++) {
                    System.out.println("indice " + i + " valor " + num[i]);
                }
            }else {
                System.out.print("los numeros superaron los valores maximos o minimos");
            }
        }else {
            System.out.print("el inicio es mayor que el final");
        }

    }

    static void main() {
        int[] num = /*new int[10];
        int[] escrito =*/ {20, 5, 7, 4, 32, 9, 2, 14, 11, 6};
        for (int i = 0; i < num.length; i++) {
            System.out.println("indice " + i + " valor " + num[i]);
        }
        muestra(num);
    }
}
