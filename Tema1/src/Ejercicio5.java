import java.util.Scanner;

public class Ejercicio5 {
    static void main (String[] args){
        Scanner teclado1 = new Scanner(System.in);
        int numero1= teclado1.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        int numero2= teclado2.nextInt();

        Scanner teclado3 = new Scanner(System.in);
        int numero3= teclado3.nextInt();

        Scanner teclado4 = new Scanner(System.in);
        int numero4= teclado4.nextInt();

        int sumar = numero1+numero2+numero3+numero4;

        int total=sumar/4;

        System.out.println("la media es "+total);

        if (total<numero1){
            System.out.println("El numero "+numero1+" es superior que la media");
        }
        if (total<numero2){
            System.out.println("El numero "+numero2+" es superior que la media");
        }
        if (total<numero3){
            System.out.println("El numero "+numero3+" es superior que la media");
        }
        if (total<numero4){
            System.out.println("El numero "+numero4+" es superior que la media");
        }
//ejercicio con bucle
/*
        int con=0;
        int total=0;
        while (con<4){
            Scanner teclado = new Scanner(System.in);
            int numero= teclado.nextInt();
            total=total+numero;
            con++;
        }

        System.out.println("la media es "+total/con);
*/
    }
}
