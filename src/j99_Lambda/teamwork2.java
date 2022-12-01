package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class teamwork2 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("menemmen","cacık","pide","çorba","künefe","pide","çorba"));

        charTersTekrarsızPrint(menu);
        System.out.println("\n*****");
        sonHrfTrsPrint( menu);
        System.out.println("\n*****");
        wİleBaslayanKontrol( menu);
        System.out.println("\n*****");
        charSayisiEnBykElPrint( menu);
        System.out.println("\n*****");
        ilkIkiHrcSonHrfSıralıElPrint( menu);
        System.out.println("\n*****");

    }//mainsonu
   // 1- Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void charTersTekrarsızPrint(List<String> menu){
        menu.stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(t-> System.out.print(t+" "));
    }
    // Task 2 : list elemanlarinin son harfine gore ters  olarak tekrarsız print ediniz.

    public static void sonHrfTrsPrint(List<String> menu){
        menu.
                stream().
                sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
                distinct().
                forEach(t-> System.out.print(t+" "));
    }
    // Task 3 : List elemanlarinin "W" ile baslamasını kontrol ediniz
    public static void wİleBaslayanKontrol(List<String> menu){
        System.out.println(menu.
                stream().
                noneMatch(t -> t.toLowerCase().startsWith("w")) ? " hayır" : "evet");
    }
    // Task 4 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static  void charSayisiEnBykElPrint(List<String> menu){

        Stream<String> enbüyükkarakter1=menu.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1);
        System.out.println(Arrays.toString(enbüyükkarakter1.toArray()));
    }
// Task 5 : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print ediniz.
public static void ilkIkiHrcSonHrfSıralıElPrint(List<String> menu) {

    menu.
            stream().
            sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
            skip(2).
            forEach(t -> System.out.println(t + " "));

}

}
