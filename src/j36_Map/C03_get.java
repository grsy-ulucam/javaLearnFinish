package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map get(key) girilen key değerini valuesını return eder.
        //value map value değerlerini coll. eder return eder.
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediMarkt","183 Euro");

        System.out.println("hm = "+hm);
        System.out.println("hm.get(\"Ebay\") = " + hm.get("Ebay"));
        System.out.println("hm.get(\"haluk\") = " + hm.get("haluk"));
        System.out.println("hm.get(12) = " + hm.get(12));//key data type farketmeksizin null basar.








    }
}
