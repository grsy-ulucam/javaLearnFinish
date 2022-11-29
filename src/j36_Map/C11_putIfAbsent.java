package j36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.putIfAbsent girilen key map te varsa keye ait value yoksa default değer retrun eder.
        //map.key girilen key ait value değer return eder.
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediMarkt","183 Euro");

        System.out.println("hm = "+hm);
        System.out.println("hm.putIfAbsent(\"ebik\",\"kabık\") = " + hm.putIfAbsent("ebik", "kabık"));
        System.out.println("hm.putIfAbsent(\"Ebay\",\"javaNaz\") = " + hm.putIfAbsent("Ebay", "javaNaz"));//Ebay key oldğ keye ait olan değeri döner.
        System.out.println("hm = " + hm);


    }
}
