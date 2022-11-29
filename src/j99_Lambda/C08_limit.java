package j99_Lambda;

import java.util.*;
import java.util.stream.Stream;

import static java.awt.SystemColor.menu;

public class C08_limit {
    public static void main(String[] args) {
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.



        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("\n   ***   ");
        charSayisiEnBykElPrint( menu);






    }//main sonu
    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static  void charSayisiEnBykElPrint(List<String> menu){

  Stream<String>enBykKarktr1 =menu.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1);//akısdaki ilk 1 elelman alındı
        // System.out.println(enBykKarktr);//java.util.stream.SliceOps$1@6e8dacdf->limit meth bir stream yaı akıs(birden çok eleman) return eder
        //dolaysıyle limit cıktısı doprudan sout ile print edilemez.limit çıktısı list veya array gibi bir coll. atanmalı

        System.out.println(Arrays.toString(enBykKarktr1.toArray()));//java.util.stream.SliceOps$1@6e8dacdf

        Object [] enbyKrktrarr= menu.
                stream().
                sorted(Comparator.comparing(String::length).
                        reversed()).
                limit(1).
                toArray();
        System.out.println(Arrays.toString(enbyKrktrarr));

        Optional<String>enBykKarktr2=menu.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst();//akısdaki ilk 1 eleman alındı



    }






}
