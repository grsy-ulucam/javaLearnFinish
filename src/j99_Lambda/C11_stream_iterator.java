package j99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {

    public static void main(String[] args) {
//TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

        System.out.println("TASK01->Structured Programming = " + toplamAmele(10));
        System.out.println(" TASK01->Functional Programming = " + toplaCıncık(10));
        System.out.println("toplaCiftToplam( x) = " + toplaCiftToplam(101));
        System.out.println("toplaCiftToplam2( 100) = " + toplaCiftToplam2(100));
        System.out.println("toplaİlkXsayı( x) = " + toplaİlkXsayı(10));
        System.out.println("toplaİlkTeksayı( x) = " + toplaİlkTeksayı(10));
        İlkİkiKuvvet(7);
        System.out.println("istenenSayıKuvvet(3,5) = " + istenenSayıKuvvet(3, 5));


    }//mainsonu

    //Structured Programming

    public static int toplamAmele(int x) {

        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }
    //Functional Programming

    public static int toplaCıncık(int x) {

        return IntStream.
                range(1, x + 1).//1 dahil x+1 hariç
                        sum();
    }

    //task 02->1den x e kadar çift sayılar toplamı
    public static int toplaCiftToplam(int x) {

        return IntStream.
                range(1, x + 1).
                filter(C01_LambdaExpression::ciftMi).
                sum();

    }

    public static int toplaCiftToplam2(int x) {

        return IntStream.
                rangeClosed(1, x).
                filter(C01_LambdaExpression::ciftMi).
                sum();

    }

    //task03->ilk x pozitif çift tam sayıyı toplayan code

    public static int toplaİlkXsayı(int x) {

        return IntStream.
                iterate(2, t -> t + 2).// 2 deb başlayıp 2 arttırılan tekrar işlemi tanımlandı..
                        limit(x).//akıştaki ilk x elemman akışa alınır.
                        sum();//akıştaki ilk eleman toplanır.
    }
//iterator tekrar işlemi yapar...

    //ilk x pozitif tek tamsayıyı toplayan code
    public static int toplaİlkTeksayı(int x) {

        return IntStream.
                iterate(1, t -> t + 2).// 1 den başlayıp 2 arttırılan tekrar işlemi tanımlandı..
                        limit(x).//akıştaki ilk x elemman akışa alınır.
                        sum();//akıştaki ilk eleman toplanır.
    }

    //task05 2 nin ilk x kuvvetini ekrana yazdıran code create ediniz.
    public static void İlkİkiKuvvet(int x) {

        IntStream.
                iterate(2, t -> t * 2).//2 den başlayarak 2 ile çarpılırak tekrar işlemi tanımladı
                limit(x).//akıştaki ilk x elemman akışa alınır.
                forEach(C01_LambdaExpression::yazdir)
        ;//akıştaki ilk eleman toplanır.
    }
//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

//TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.

//TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.


    public static OptionalInt istenenSayıKuvvet(int istenenSayı, int x) {
      return   IntStream.
                iterate(istenenSayı, t -> t *istenenSayı).// 1 den başlayıp 2 arttırılan tekrar işlemi tanımlandı..
                limit(x).//akıştaki ilk x elemman akışa alınır.
                skip(x-1).
               findFirst();

    }
}