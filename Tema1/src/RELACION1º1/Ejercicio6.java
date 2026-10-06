package RELACION1º1;

import java.util.Scanner;

public class Ejercicio6 {
    static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        String letra =teclado.nextLine();

        switch(letra) {
            case "A":
                System.out.println("Es la primera vocal (A)");
                break;
            case "E":
                System.out.println("Es la primera vocal (E)");
                break;
            case "I":
                System.out.println("Es la primera vocal (I)");
                break;
            case "O":
                System.out.println("Es la primera vocal (O)");
                break;
            case "U":
                System.out.println("Es la primera vocal (U)");
                break;
            default:
                System.out.println("No es una vocal");
        }
//        System.out.println(letra);
    }
}
