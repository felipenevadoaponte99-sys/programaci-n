package RELACION1º1;

import java.util.Scanner;

public class Ejercicio10 {
    static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el tipo de operacion y despues los numeros:");
        String operacion =teclado.nextLine();
        int nu1 = teclado.nextInt();
        int nu2 = teclado.nextInt();

        switch(operacion) {
            case "+":
                System.out.println(nu1+"+"+nu2+"="+(nu1+nu2));
                break;
            case "-":
                System.out.println(nu1+"-"+nu2+"="+(nu1-nu2));
                break;
            case "*":
                System.out.println(nu1+"*"+nu2+"="+(nu1*nu2));
                break;
            case "/":
                System.out.println(nu1+"/"+nu2+"="+(nu1/nu2));
                break;
            default:
                System.out.println("carácter mal escrito");
        }

    }
}
