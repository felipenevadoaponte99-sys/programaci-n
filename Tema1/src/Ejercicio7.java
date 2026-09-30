import java.util.Scanner;

public class Ejercicio7 {
    static void main (String[] args){
        Scanner teclado1 =new Scanner(System.in);
        String estado =teclado1.nextLine();
        Scanner teclado2 =new Scanner(System.in);
        int edad = teclado2.nextInt();

        if (edad<50){
            if (edad<35){
                if (estado.equals("S")|| estado.equals("D")){
                    System.out.println("12%");
                }
                if (estado.equals("v")||estado.equals("C")){
                    System.out.println("11.3%");
                }
            }
            else {
                System.out.println("10.5%");
            }
        }
        else {
            System.out.println("8.5%");
        }
    }

}
