package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_filter {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        printCiftElStructured(sayi);
        System.out.println("*****");
        printCiftElFunction(sayi);
        System.out.println("*****");
        printCiftElFunction1(sayi);
        System.out.println("*****");
        printCiftElFunctional2(sayi);

    }//main sonu

    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElStructured(List<Integer> sayi) {//amele method

        for (Integer w : sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }
//Task : "Functional Programming":cincix code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElFunction(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0).forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call) edildi

    }

    public static void printCiftElFunction1(List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::ciftMi).forEach(C01_LambdaExpression::yazdir);
    }

    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 35 den küçük  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElFunctional2(List<Integer> sayi) {//amele method
        sayi.stream().filter(t -> t < 35).filter(C01_LambdaExpression::ciftMi).forEach(C01_LambdaExpression::yazdir);

    }
}
