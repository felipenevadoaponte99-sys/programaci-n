import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args){
        System.out.println("inserta hora, minuto y segundo;");
        Scanner teclado =new Scanner(System.in);
        int Hora1 = teclado.nextInt();
        int Minuto1 = teclado.nextInt();
        int Segundo1 = teclado.nextInt();
        System.out.println("inserta la segunda hora, minuto y segundo;");
        int Hora2 = teclado.nextInt();
        int Minuto2 = teclado.nextInt();
        int Segundo2 = teclado.nextInt();


        if ((Hora1<0 || Hora1>23) && (Hora2<0 || Hora2>23)
        &&(Minuto1<0 || Minuto1>59) && (Minuto2<0 || Minuto2>59)
        &&(Segundo1<0 || Segundo1>59) && (Segundo2<0 || Segundo2>59)){
            System.out.println("Datos mal insertados");
        }
        else {
            System.out.println("Datos bien insertados");
            System.out.printf("Hora 1: %d:%d:%d\n", Hora1,Minuto1,Segundo1);
            System.out.printf("Hora 2: %d:%d:%d\n", Hora2,Minuto2,Segundo2);

            if ((Hora1==Hora2) &&(Minuto1==Minuto2) && (Segundo1==Segundo2)){
                System.out.println("son iguales");
            } else if (Hora1<Hora2) {
                System.out.println("Hora 2 es mayo");
            } else if((Hora1==Hora2) && (Minuto1<Minuto2)){
                System.out.println("Hora 2 es mayo");
            } else if ((Hora1==Hora2) &&(Minuto1==Minuto2) && (Segundo1<Segundo2)) {
                System.out.println("Hora 2 es mayo");
            }else {
                System.out.println("Hora 1 es mayo");
            }
        }

    }
}
