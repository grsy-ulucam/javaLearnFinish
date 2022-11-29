package j36_Map;

import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //entry set map key value datalarını Sete atayıp retunr eder. .

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediMarkt","183 Euro");

        System.out.println("hm = "+hm);

        System.out.println("hm.entrySet() = " + hm.entrySet());
        for (Map.Entry<String,String> e:hm.entrySet()) {//entry set ile gelen key value loop için Entry<key,value>data verir.
            System.out.println("e.getValue() = " + e.getValue());

        }

    }
}
