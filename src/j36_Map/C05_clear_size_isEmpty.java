package j36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //size girilen mapin eleman syısını return eder.
        //clear girilen mapin elemanlarını siler.
        //is empty girilen mapin eleman varlığını kontrol eder.

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediMarkt","183ık Euro");

        System.out.println("hm = "+hm);
        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        hm.clear();
        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());

    }
}
