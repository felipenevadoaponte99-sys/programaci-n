import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args){
        System.out.println("inserta hora, minuto y segundo;");
        Scanner tecladoH1 =new Scanner(System.in);
        Scanner tecladoM1 =new Scanner(System.in);
        Scanner tecladoS1 =new Scanner(System.in);
        int Hora1 = tecladoH1.nextInt();
        int Minuto1 = tecladoM1.nextInt();
        int Segundo1 = tecladoS1.nextInt();
        System.out.println("inserta la segunda hora, minuto y segundo;");
        Scanner tecladoH2 =new Scanner(System.in);
        Scanner tecladoM2 =new Scanner(System.in);
        Scanner tecladoS2 =new Scanner(System.in);
        int Hora2 = tecladoH2.nextInt();
        int Minuto2 = tecladoM2.nextInt();
        int Segundo2 = tecladoS2.nextInt();

        if ((Hora1<0 || Hora1>23) && (Hora2<0 || Hora2>23)
        &&(Minuto1<0 || Minuto1>59) && (Minuto2<0 || Minuto2>59)
        &&(Segundo1<0 || Segundo1>59) && (Segundo2<0 || Segundo2>59)){
            System.out.println("Datos mal insertados");
        }
        else {
            System.out.println("Datos mal insertados");
            if (Hora1<Hora2){
                System.out.println("");
            }
        }

    }
}
