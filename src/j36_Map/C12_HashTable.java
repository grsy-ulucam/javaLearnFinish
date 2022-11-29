package j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
 /*
 HashTable -HashMapte kullanılan tüm metodlar hashtable  da call edilir .
 1-HashMap ve TreeMap thread-safe ve synchronized olmadığı için synchronized olan bir mape ihtiyaç olduğundan Hashtable tanımlanmıştır .
 2-HashTable hasMapa göre daha yavaştır .
 3-Hashtable key ve value larda null değere izin vermez.
 4-Hashtable eleman ataması yapılırken HasMap random yapar
  */
        Hashtable<String,String>ht=new Hashtable<>();
        ht.put("kebab","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdağ");
        ht.put("çorba","beyran");
        ht.put("söğüş","");
        System.out.println("ht = " + ht);//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, kebab=adana}
        ht.put("dönerse","dönerse senindir");//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, dönerse=dönerse senindir, kebab=adana}
        System.out.println("ht = " + ht);
        //ht.put(null,"triliçe");//RTE
       // ht.put("kahve",null);//RTE
        System.out.println("ağam selametle devam ke ");

        Hashtable<String,String>ht1=new Hashtable<>();
        ht.put("SALATA","PATLICAN GÖZLEME");
        ht.put("ARA SICAK","İÇLİ KÖFTE");
        ht.putAll(ht1);
        System.out.println("ht = " + ht);
        System.out.println("ht1 = " + ht1);

    }
}
