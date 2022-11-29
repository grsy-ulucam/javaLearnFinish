package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    // task -> urun fiyatları toplamını hesaplayan code create ediniz..
    // for (Map.Entry<String, Integer> a : map.entrySet()){//["Amazon"=296,"Ebay"=301,..]

    //     fiyatToplam+=a.getValue();

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);

        map.put("Ebay", 301);

        map.put("Saturn", 326);

        map.put("MediaMarkt", 340);

        map.put("Apple Store", 320);


        int toplam=0;
        /*for (Map.Entry<String,Integer> s:map.entrySet()) {
            toplam+=s.getValue();

        } */
        for (Integer w:map.values()) {
            toplam+=w;

        }





        System.out.println("ağam toplam fiyat :"+toplam);
        System.out.println("ağam ortalama fiyat:"+toplam/map.size());

    }
}
