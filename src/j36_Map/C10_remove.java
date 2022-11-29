package j36_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.remove()-girilen key map te varsa true yoksa false döner.
        //parametre olarak entry değil sadece key değer girilirse key varsa siler ve key valuesunu return eder.
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediMarkt", "183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.remove(\"amazon\", \"296 Euro\") = " + hm.remove("amazon", "296 Euro"));
        System.out.println("hm.remove(\"Amazon\", \"ebik\") = " + hm.remove("Amazon", "296 Euro"));
        System.out.println("hm.remove(\"gabık\", \"296 Euro\") = " + hm.remove("gabık", "296 Euro"));
        System.out.println("hm.remove(\"Ebay\") = " + hm.remove("Ebay"));
        System.out.println("hm.remove(\"111 Euro\") = " + hm.remove("111 Euro"));
        System.out.println("hm = " + hm);

    }
}
