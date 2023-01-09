package j99_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class teamwork {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(48, 38, 19, 33, 7, 3, 32, 66));
        ciftYazdır(numbers);
        System.out.println("\n*****");
        ciftElemanKareYazdır(numbers);
        System.out.println("\n*****");
        tekElemanKareYazdır(numbers);
        System.out.println("\n*****");
        ElemanToplamYazdır(numbers);
        System.out.println("\n*****");
        tekKareBkPrint(numbers);
    }

    //Task1 : "Functional Programming"  kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz
    public static void ciftYazdır(List<Integer> numbers) {
        numbers.
                stream().
                filter(t -> t % 2 == 0).//ŞART ÇİFT Mİ?
                forEach(t -> System.out.print(t + " "));
    }

    // Task2 : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
    public static void ciftElemanKareYazdır(List<Integer> numbers) {

        numbers.
                stream().
                filter(t -> t % 2 == 0).//ŞART ÇİFT Mİ?
                map(t -> t * t).//YENİ DEĞER ATAMASI
                forEach(C01_LambdaExpression::yazdir);
    }
    // Task 3: Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void tekElemanKareYazdır(List<Integer> numbers) {
        numbers.
                stream().
                filter(t -> t % 2 == 1).
                map(t -> Math.pow(t, 3) + 1).
                forEach(t -> System.out.print(t + " "));
    }
    // Task 4: List'teki tum elemanlarin toplamini print ediniz.

    public static void ElemanToplamYazdır(List<Integer> numbers) {

        Optional<Integer> toplam=numbers.
                stream().
                reduce(Integer::sum);//NULL DEĞER OLMASINA KARŞI OPTİNAL ATAMASI YAPILDI!!!REDUCE->AZALTMA İŞLEMİ YAPIDI...

    }
    // Task 5 : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.

    public static void tekKareBkPrint(List<Integer> numbers) {

        numbers.
                stream().
                filter(t -> t % 2 == 1).//tek mi veya çift öi kontrol edildi
                map(t -> t * t).//karesi alındı
                sorted(Comparator.reverseOrder()).//REVERSEORDER ->TERS SIRALAMA
                forEach(t -> System.out.print(t + " "));


    }
}
