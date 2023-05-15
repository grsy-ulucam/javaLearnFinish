package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter height :");

        float myHeight=scanner.nextFloat();

        System.out.println("Enter weight :");

        float myWeight=scanner.nextFloat();

        float Vki01=myWeight/(myWeight*myWeight);

        System.out.println("Vki01 = " + Vki01);

        int Vki02= (int) (myWeight/(myWeight*myWeight));

        System.out.println("Vki02 = " + Vki02);


    }
}
