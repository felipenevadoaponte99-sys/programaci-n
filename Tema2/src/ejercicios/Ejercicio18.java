package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    static void main(String[] args) {
        /*System.out.println("escribe letra: ");
        Scanner teclado = new Scanner(System.in);
        String[][] matriz = new String[2][2];*/
        char[][] matriz = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}

        };

///////// E usado la ia para preguntar

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //matriz[i][j]= teclado.nextLine();
                System.out.print("["+matriz[i][j]+ "] ");
            }
            System.out.println();
        }
        System.out.println();

        int numeroUno =matriz.length;
        int numeroDos =matriz[0].length;

        for (int i = numeroUno-1; i >= 0; i--) {
            for (int j = numeroDos-1; j >=0; j--) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println();
        }
    }

    }
