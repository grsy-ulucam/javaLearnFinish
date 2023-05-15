package team02;

import java.util.HashMap;

public class map1 {
    public static void main(String[] args) {

        HashMap<String,String>tt=new HashMap<>();

        tt.put("a011","un");

        tt.put("bim","şeker");
        tt.put("migros","çay");
        tt.put("migros","süt");
        tt.put("a101","süt");

        System.out.println("tt = " + tt);

        System.out.println("tt.values() = " + tt.values());

        System.out.println("tt.keySet() = " + tt.keySet());

        for (String s:tt.keySet()) {
            System.out.println(s + " ");

        }

        for (String w:tt.values()) {
            System.out.println(w + " ");

        }
        System.out.println("tt.get(\"a101\") = " + tt.get("a101"));

        System.out.println("**********************");

        System.out.println("tt.entrySet() = " + tt.entrySet());

        System.out.println("tt.size() = " + tt.size());
        System.out.println("tt.isEmpty() = " + tt.isEmpty());

        HashMap<String,String>tt1=new HashMap<>();
        tt1.put("yemek","yağlamqa");
        tt1.put("içecek","ayran");

        tt.putAll(tt1);
        System.out.println("tt = " + tt);

        System.out.println("tt.containsKey(\"yemek\") = " + tt.containsKey("yemek"));
        System.out.println("tt1.containsValue(\"ayran\") = " + tt1.containsValue("ayran"));

        tt.replace("yemek", "çorba");
        System.out.println("tt = " + tt);

        tt.remove("içecek","ayran");
        System.out.println("tt = " + tt);

        tt.clear();
        System.out.println("tt = " + tt);

    }
}
