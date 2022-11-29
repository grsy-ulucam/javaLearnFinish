package j36_Map;

import java.util.HashMap;

public class C01_HasMap {
/*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
             dublicate kabul etnez
             Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */
public static void main(String[] args) {
    HashMap<String,String>hm=new HashMap<>();
    hm.put("Amazon","296 Euro");
    hm.put("null","200 Euro");//key nulldeğer kabul eder.
    hm.put("null","222 Euro");//tekrarlı key değerine value update eder.Aynı key kullanılırda üzerine yazılır.
    hm.put("Ebay","null");
    hm.put("Saturn","300 Euro");
    hm.put("Vatan","111 Euro");
    hm.put("Apple store","333 Euro");
    hm.put("Apple store","500 Euro");//333 500 ile update eder .
    hm.put("MediMarkt","183 Euro");

    System.out.println("hm = " + hm);









}

}
