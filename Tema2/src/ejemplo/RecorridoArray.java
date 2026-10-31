package ejemplo;

public class RecorridoArray {
    static void main(){
        /*
        int miArray1[] = new int[6];
        int miArray2[] ={1,2,3};
        */

        int[] miArray1 = new int[6];
        miArray1[0]=3;
        miArray1[1]=43;
        miArray1[2]=30;

        System.out.println("metodo---------------------------------------------------------------");
        recorreArray(miArray1);
        System.out.println("version1---------------------------------------------------------------");

        for (int i =0; i < miArray1.length; i++){
            System.out.println(miArray1[i]);
        }
        System.out.println("version2---------------------------------------------------------------");
        int[] miArray2 ={1,2,3};
        for (int i =0; i < miArray2.length; i++){
            System.out.println(miArray2[i]);
        }
        }

    static void recorreArray(int[] unArray) {
        for (int i = 0; i < unArray.length; i++) {
            System.out.println(unArray[i]);
        }
    }
}
