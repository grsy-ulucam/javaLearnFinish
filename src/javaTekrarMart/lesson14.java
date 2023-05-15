package javaTekrarMart;

import java.util.Scanner;

public class lesson14 {
    public static void main(String[] args) {
  /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */
        Scanner sc= new Scanner(System.in);
        System.out.println(" sayı1 giriniz : ");
        int sayı1=sc.nextInt();

        System.out.println(" sayı2 giriniz : ");
        int sayı2=sc.nextInt();

        if (sayı1<sayı2){

            for (int i = sayı1; i <sayı2 ; i++) {
                if (i%2==0){
                    System.out.println(i + " ");
                }

            }
        }else System.out.println("hatalı giriş yağtınız");


        for (int i = (sayı1<sayı2?sayı1:sayı2); i <=(sayı1>sayı2?sayı1:sayı2) ; i++) {
            System.out.print(i%2==0?i:" ");
        }





    }
}
