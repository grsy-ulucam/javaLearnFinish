package Homework.Lambda;

import j99_Lambda.C01_LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class task1 {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));

        // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

        menu.
                stream().

                filter(t->t.length()%2==0).

                map(String::length).

                map(t->t*t).

                sorted(Comparator.reverseOrder()).

                distinct().

                forEach(C01_LambdaExpression::yazdir);


    }
}
