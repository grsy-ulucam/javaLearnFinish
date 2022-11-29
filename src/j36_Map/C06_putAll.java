package j36_Map;

import java.util.HashMap;

public class C06_putAll
{
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //entry set map key value datalarını Sete atayıp retunr eder. .

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediMarkt","183 Euro");

        System.out.println("hm = "+hm);

        HashMap<String, String> hm1 = new HashMap<>();
        //entry set map key value datalarını Sete atayıp retunr eder. .

        hm1.put("köfteci yusuf","kaburga ızgara");
        hm1.put("starBucks","flat White");
        hm1.put("güllüoğlu","cennet çamuru");
        hm1.put("nusret","dana spagetti");
        hm1.put("clarusway","bol offer");
        hm1.put("javacan","javanaz");

        System.out.println("hm1 = " + hm1);

        hm.putAll(hm1);
        System.out.println("hm = " + hm);
        System.out.println("hm1 = " + hm1);


        HashMap<String,String>hm2=new HashMap<>(hm1);
        System.out.println("hm2 = " + hm2);

    }
}
