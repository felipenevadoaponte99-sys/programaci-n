import java.util.Scanner;

public class Ejercicio2 {
    static void main (String[] args){
        Scanner teclado1 = new Scanner(System.in);
        int numero1 = teclado1.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        int numero2 = teclado2.nextInt();

        if (numero1==numero2){
            System.out.println("son iguales");
        }
        else if (numero1<numero2) {
            System.out.println("el mayor es el segundo");
        }
        else {
            System.out.println("el mayor es el primero");
        }

    }

}
