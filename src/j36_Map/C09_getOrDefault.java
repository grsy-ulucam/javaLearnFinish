package j36_Map;

import java.util.HashMap;

public class C09_getOrDefault {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.getordafult girilen key map te varsa keye ait value yoksa default değer retrun eder.
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediMarkt","183 Euro");

        System.out.println("hm = "+hm);
        System.out.println("hm.getOrDefault(\"Ebay\",\"ebikkabık\") = " + hm.getOrDefault("Ebay", "ebikkabık"));
        // ebay key mapte değeri olduğu için onu verir.
        System.out.println("hm.getOrDefault(\"ebik\",\"kabık\") = " + hm.getOrDefault("ebik", "kabık"));//gabık key mapte olmadığı için bu keye default değer kabık atanır return edildi.


    }
}
