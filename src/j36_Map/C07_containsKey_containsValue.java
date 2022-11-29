package j36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //containsKey girilen key değerini  mapte varlığını kontrol eder.boolean return eder.
        //containsValue girilen value değerini  mapte varlığını kontrol eder.boolean return eder.

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediMarkt","183 Euro");

        System.out.println("hm = "+hm);
        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon"));
        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));
        System.out.println("hm.containsValue(\"296 Euro\") = " + hm.containsValue("296 Euro"));
        System.out.println("hm.containsValue(\"ebikkabuk\") = " + hm.containsValue("ebikkabuk"));
    }
}
