package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {


        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("\n ******");
        hrfSys7DenAzKontrol( menu);
        System.out.println("\n ******");
        wİleBaslayanKontrol( menu);
        System.out.println("\n ******");
        xİleBitenKontrol( menu);

    }//mainsonu
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder

    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.

    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.



    // Task : List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.->

    public static void hrfSys7DenAzKontrol(List<String> menu){
        boolean kontrol=menu.stream().allMatch(t->t.length()<=7);
        if (kontrol){
            System.out.println("ağam mkarakterler 7 ve daha az elemanlardan oluşuyor :)");
        }else System.out.println("agam menudekiler 7 karakterden fazla :( ");

        System.out.println(menu.stream().allMatch(t -> t.length() < 07) ? "ağam menudekiler 7 ve daha az karakterden oluşuyor" : "ağam menudekiler 7 karakterden fazkla");
    }
    // Task : List elemanlarinin "W" ile baslamasını kontrol ediniz.->noneMatch
    public static void wİleBaslayanKontrol(List<String> menu){

        System.out.println(menu.stream().noneMatch(t -> t.toLowerCase().startsWith("w"))  //akısdaki hiç bir eleman w ile başlamaz kontrolu yapıldı->sart
                ? "agam w ile başlayan yemahh olur mu :(" : "agam wenemen ne menem bişey");
    }
    // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

    public static void xİleBitenKontrol(List<String> menu){

        System.out.println(menu.stream().anyMatch(t -> t.toLowerCase().endsWith("x"))//akısdaki enaz bir eleman x ile biter kontrolu yapıldı->sart
                ? "agam senden bir cacix olmaz o-la-mazzz :(" : "agam senin yemahhh bu torpaklarda yoğğğ :) ");

    }

}
