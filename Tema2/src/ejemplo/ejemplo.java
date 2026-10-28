package ejemplo;

public class ejemplo {
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int mcm(int miNumero) {
        int miNumeroplus = 1, i = 2;
        do {
            if (miNumero % i == 0) {
                miNumero = miNumero / i;
                //System.out.println(miNumero);
                miNumeroplus *= i;
            } else {
                i++;
                //     miNumeroplus*=i;
            }
        } while (miNumero > 1);
        return miNumeroplus;
    }
    static void main (String[] args){
        System.out.println(suma(3,5));
        int c= ejemplo.suma(3,4);

        System.out.println(mcm(12));


    }
}
