package RELACION1º4;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        /*
        Realiza un programa que convierta números romanos a números en base decimal.
        Las equivalencias son las siguientes:
        M 1000
        D 500
        C 100
        L 50
        X 10
        V 5
        I 1
        Los enteros romanos se escriben de acuerdo a las siguientes reglas:
        Si una letra está seguida inmediatamente por una de igual o menor valor, su valor se
        suma al total acumulado. Así, XX = 20, XV = 15 y VI = 6.
        Si una letra está seguida inmediatamente por una de mayor valor, su valor se
        sustrae del total acumulado. Así, IV = 4, XL = 40 y CM = 900
        Por tanto, la entrada MMXIX debe devolver 2019.
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("escrivi numero romano");
        String romano = teclado.nextLine();
        char con;
        int calcu=0;
        for (int i=0; i<romano.length();i++){
            char letra=(romano.charAt(i));
            if (calcu==0){
                con=letra;

            }
            switch (letra) {
                case 'M':
                    System.out.println("Es la primera vocal (A)");
                    break;
                case 'D':
                    System.out.println("Es la primera vocal (E)");
                    break;
                case 'C':
                    System.out.println("Es la primera vocal (I)");
                    break;
                case 'L':
                    System.out.println("Es la primera vocal (O)");
                    break;
                case 'X':
                    System.out.println("Es la primera vocal (U)");
                    break;
                case 'V':
                    System.out.println("Es la primera vocal (U)");
                    break;
                case 'I':
                    System.out.println("Es la primera vocal (U)");
                    break;
                default:
                    System.out.println("No es una vocal");

            }
        }
/*        int contar = 0;
        while (romano.charAt(contar)) {

        }*/
    }
}
