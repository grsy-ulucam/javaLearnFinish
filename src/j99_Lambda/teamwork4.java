package j99_Lambda;

import java.util.stream.IntStream;

public class teamwork4 {
    public static void main(String[] args) {
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
    //iterator tekrar işlemi yapar...

        System.out.println("toplaYkadar(y) = " + toplaYkadar(100));
        System.out.println("\n******");
        System.out.println("toplaciftYkadar( y) = " + toplaciftYkadar(50));
        System.out.println("\n******");
        İlküçKuvvet( 5);
        System.out.println("\n******");


    }//mainsonu

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den y'e kadar tamsayilari toplayan bir program create ediniz.
    public static int toplaYkadar(int y) {

        return IntStream.
                range(1, y + 1).
                sum();
    }

    //task 02->1den y e kadar çift sayılar toplamı
    public static int toplaciftYkadar(int y) {

        return IntStream.
                range(1, y + 1).
                filter(C01_LambdaExpression::ciftMi).
                sum();
    }
    //task03__ 3 nin ilk y kuvvetini ekrana yazdıran code create ediniz.
    public static void İlküçKuvvet(int y){
        IntStream.
                iterate(2, t -> t * 2).//3 den başlayarak 3 ile çarpılırak tekrar işlemi tanımladı
                limit(y).//akıştaki ilk y elemman akışa alınır.
                forEach(C01_LambdaExpression::yazdir);

    }





}