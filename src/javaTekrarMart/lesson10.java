package javaTekrarMart;

import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args) {

        // Task 2 basamaklı tek sayıları   print eden code create ediniz -> 11,13,15...99


         int sum=0;

        for (int i = 11; i <=99 ; i++) {

            sum+=i;

        }
        System.out.println("sum = " + sum);


        System.out.println("******************************");



        // task -> girilen sayıdan 100 e kadar 4+un katı tamsayıları print eden code create ediniz

        Scanner sc= new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayı=sc.nextInt();


        if (sayı>100){
            System.out.println("agam hani 100 den kuçuk girecktin :( ");
        }else {
            for (int i = sayı; i <100 ; i++) {//100 değeri forU çaşıştırmaz 98 foru çalıştırı ama for içindeki if çalışmaz
                if (i%4==0){
                    System.out.print(i+" ");
                }

            }
        }


        System.out.println("******************************");

  /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.


         */

        for (int i = 0; i <100 ; i++) {
            if(i%5==0 &&i % 4==0){
                System.out.println(" sayılar "+i );
            }

        }

        System.out.println("******************************");


/*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        System.out.println( "1  den büyük bir sayı giriniz :");

        int num= sc.nextInt();

        int karetoplam=0;

        for (int i = 1; i <=sayı ; i++) {

            karetoplam=(i*i)+karetoplam;
            System.out.println(i+ "karetoplam = " + karetoplam);

        }


    }
}
