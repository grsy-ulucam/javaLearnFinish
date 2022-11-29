package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
        TreeMap
        1-TreeMap keylerde null değer kabul etmez Fakat VALULERDE NULL DEĞER TANIMLABİLİR.
        2-TreeMap elemanlarını key natural ordere göre tanımlar .
        3-TreeMap tread-safe ve synchronized değildir. ve en yavaş map türüdür .Kullanırken çok dikkat edilmedlidir.app hızı açısından ..

         */

        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(104,"fatih");
        tm.put(105,"emine");
        tm.put(101,"uğur");
        tm.put(102,"enise");
        tm.put(103,"kevser");

        System.out.println("tm = " + tm);
        //tm.put(null,"Fatih");
        tm.put(104,"hüma");
        System.out.println("tm.put(106,null) = " + tm.put(106, null));
        System.out.println("tm.put(107,null) = " + tm.put(107, null));
       // tm.put(null,"Fatih");

        HashMap<String,String> hm=new HashMap<>();
        hm.put("Amazon","296 Euro");
        hm.put("null","200 Euro");//key nulldeğer kabul eder.
        hm.put("null","222 Euro");//tekrarlı key değerine value update eder.Aynı key kullanılırda üzerine yazılır.
        hm.put("Ebay","null");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("Apple store","500 Euro");//333 500 ile update eder .
        hm.put("MediMarkt","183 Euro");

        System.out.println("hm = " + hm);

        TreeMap<String,String>tm1=new TreeMap<>(hm);
        System.out.println("tm1 = " + tm1);
        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));//varsa true ,yoksa parametreden büyük en küçük key değerini retun eder.
        System.out.println("tm.ceilingKey(109) = " + tm.ceilingKey(109));
        System.out.println("tm.ceilingKey(100) = " + tm.ceilingKey(100));

        //parametre map te yok ve parameterden büyük enküçük key de yoksa null return eder.
        //en küçük abi -abla
        //asceding  orde->artan sıralama
        //desding  orde->azalan sıralam

        System.out.println("tm.descendingKey() = " + tm.descendingKeySet());
        System.out.println("tm.keySet() = " + tm.keySet());
        System.out.println("tm.firstKey() = " + tm.firstKey());
        System.out.println("tm.lastKey() = " + tm.lastKey());



    }
}


