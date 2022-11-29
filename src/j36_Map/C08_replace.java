package j36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.replace()-girilen deger iligili keye update edilir.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediMarkt", "183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"Amazon\",\"314 Euro\") = " + hm.replace("Amazon", "314 Euro"));
        System.out.println("hm.replace(\"sefil\",\"haluk\") = " + hm.replace("sefil", "haluk"));//olmayan key için null return eder
    }
}
