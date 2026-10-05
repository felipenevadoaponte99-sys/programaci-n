import java.util.Scanner;

public class Ejercicio1 {
    static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        System.out.print("El numero es ");

        if (numero % 2 ==0){
            System.out.println("par");
        }
        else {
            System.out.println("impar");
        }
    }
}
