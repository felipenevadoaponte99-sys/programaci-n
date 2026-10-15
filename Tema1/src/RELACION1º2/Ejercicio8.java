package RELACION1º2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int miNumero = 0;
        String seguir = "";
        int menor = 0;
        boolean primero = false;
        do {
            System.out.println("escrive el numero");
            miNumero = Integer.parseInt(teclado.nextLine());

            if (menor == 0 && !primero) {
                menor = miNumero;
                primero = true;
            }

            if (miNumero < menor) {
                menor = miNumero;
            }
            System.out.println("¿Desea introducir más números (S/N)?");
            //seguir = teclado.nextLine().toUpperCase(Locale.ROOT);
            seguir = teclado.nextLine().toUpperCase();

            while (!seguir.equals("S") && !seguir.equals("N")){
                    System.out.println("No es una respuesta correcta, (S/N):");
                    //seguir = teclado.nextLine().toUpperCase(Locale.ROOT);
                    seguir = teclado.nextLine().toUpperCase();
                }

        } while (seguir.equals("S"));
        System.out.print("el numero mas pequeño es " + menor);
    }
}
