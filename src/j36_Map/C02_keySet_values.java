package j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //key set map key değerlerini ste atayıp return eder.
        //value map value değerlerini coll. eder return eder.
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediMarkt","183 Euro");

        System.out.println("hm = "+hm);
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        //task->hm key value değerlerini satır satır print ediniz.
        for (String s:hm.keySet()) {
            System.out.print("s = " + s+ "");

        }
        System.out.println();
        for (String w: hm.values()) {
            System.out.print("w = " + w+ " ");

        }
    }
}
