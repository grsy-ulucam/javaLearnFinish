package javaTekrarMart;

import java.util.Scanner;

public class lesson01 {

    public static void main(String[] args) {

//Example 2: Iki sayidan kucuk olani secen kodu yaziniz
        int b = 23;
        int c = 21;

        if (b < c) {
            System.out.println("b=" + b);
        } else if (c < b) {
            System.out.println("c=" + c);
        } else {

            System.out.println("sayılar eşittir.");
        }

        System.out.println("****************");

        int min = b<c? b:c;

        System.out.println("min = " + min);

        System.out.println("****************");

    // TASK-> girilen  bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.


        Scanner scanner=new Scanner(System.in);

        System.out.println("bir sayı giriniz:");

        int sayı=scanner.nextInt();

        if(sayı>9){
            System.out.println("sayı iki basamaklıdır");
        } else if (sayı<-9) {
            System.out.println("sayı iki basamaklıdır");
        }else {
            System.out.println("sayı tek basanaklıdır ");
        }

        System.out.println("****************");

  /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("agam bi tamsayı gir bakam : ");
        int numeric = sc.nextInt();

        if (numeric >0 & numeric <10){
            System.out.println("numeric rakamdır = " + numeric);
        } else if (numeric >10) {
            System.out.println("numeri iki ve daha fazla  basamaklı sayıdır = " + numeric);
        }else {
            System.out.println("negatif sayıdır ");
        }

        System.out.println("****************");

         /*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
         %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
		 */


        Scanner input = new Scanner(System.in);

        System.out.println("agam urun miktarı gir bakam : ");
        int urunMiktarı = input.nextInt();

        System.out.println("agam urun fiyatı gir bakam : ");
        int urunFiyati = input.nextInt();


        int toplam= urunMiktarı>100 ? (int) (urunMiktarı * (urunFiyati * 0.67)) :urunMiktarı*urunFiyati;









        int totalPrice= urunMiktarı >100 ? (int) (urunMiktarı * urunFiyati * 0.67) :(urunFiyati*urunMiktarı);

        System.out.println("totalPrice = " + totalPrice);


    }

}
