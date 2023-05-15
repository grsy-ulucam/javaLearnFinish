package team02;

import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {

/*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
             dublicate kabul etnez
             Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */

        HashMap<String, String> hm = new HashMap<>();
        //map.put();->girilen key, value datayı  map'e eleman olarak ekler.

        hm.put("Amazon", "300 Euro");
        hm.put(null, "155 Euro"); //Kabul etmezzz
        hm.put(null, "243 Euro");
        hm.put("Ebay", null);
        hm.put("MeadiMarkt", "296 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro"); //Kabul Etmezzz
        hm.put("Apple Store", "250/*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir\n" +
                "\u200B\n" +
                "1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı\n" +
                "             dublicate kabul etnez\n" +
                "             Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan\n" +
                "            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.\n" +
                "            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir\n" +
                "            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.\n" +
                "            HashMap'ler \"thread safe\" degildir.\n" +
                " */\n" +
                "\u200B\n" +
                "        HashMap<String, String> hm = new HashMap<>();\n" +
                "        //map.put();->girilen key, value datayı  map'e eleman olarak ekler.\n" +
                "\u200B\n" +
                "        hm.put(\"Amazon\", \"300 Euro\");\n" +
                "        hm.put(null, \"155 Euro\"); //Kabul etmezzz\n" +
                "        hm.put(null, \"243 Euro\");\n" +
                "        hm.put(\"Ebay\", null);\n" +
                "        hm.put(\"MeadiMarkt\", \"296 Euro\");\n" +
                "        hm.put(\"Vatan\", \"111 Euro\");\n" +
                "        hm.put(\"Apple Store\", \"333 Euro\"); //Kabul Etmezzz\n" +
                "        hm.put(\"Apple Store\", \"250 Euro\");\n" +
                "        hm.put(\"Saturn\", \"250 Euro\");\n" +
                "\u200B\n" +
                "        //Girilen key UNIQUE olmalı!!!\n" +
                "        //Eğer key birden fazla yazılırsa java son girilen keyi kabul eder\n" +
                "\u200B\n" +
                "\u200B\n" +
                "        //map sout komutuna parametre olarak print edilir\n" +
                "        System.out.println(\"hm = \" + hm);\n" +
                "\u200B\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-Values-Keyset-------------------------------------\");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "        /*\n" +
                "        map.values();->map value değerlerini coll. atayıp return eder.\n" +
                "        map.keySet();->map key değerlerini Set'e atayıp return eder.\n" +
                "                                                                                            */\n" +
                "\u200B\n" +
                "        System.out.println(\"hm.keySet() = \" + hm.keySet());\n" +
                "        System.out.println(\"hm.values() = \" + hm.values());\n" +
                "\u200B\n" +
                "        //for döngüsü ile yazdırılabilir\n" +
                "        System.out.println(\"**** MAĞAZALAR ****\");\n" +
                "        for (String s : hm.keySet()) {\n" +
                "            System.out.println(s + \" \");\n" +
                "        }\n" +
                "\u200B\n" +
                "        System.out.println();\n" +
                "\u200B\n" +
                "        System.out.println(\"**** Fiyatlar ****\");\n" +
                "        for (String w : hm.values()) {\n" +
                "            System.out.println(w + \" \");\n" +
                "        }\n" +
                "        System.out.println();\n" +
                "\u200B\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "        System.out.println(\"-----------------------------------------Map-Get--------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "        //map.get(key);->Girilen  key değerinin value'sini  return eder.\n" +
                "\u200B\n" +
                "        System.out.println(hm.get(\"Ebay\"));\n" +
                "        System.out.println(\"hm.get(\\\"Saturn\\\") = \" + hm.get(\"Saturn\"));//\"250 Euro\n" +
                "        System.out.println(\"hm.get(\\\"sefil haluk\\\") = \" + hm.get(\"sefil haluk\"));//olmayan key için null return eder\n" +
                "        System.out.println(\"hm.get(12) = \" + hm.get(12));//key data type farketmeksizin olmayan key null return eder\n" +
                "        System.out.println();\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-EntrySet--------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "        //map.entrySet();->Girilen  map'in tum key value  datalarını Set'e atayıp return eder.\n" +
                "        System.out.println(hm);\n" +
                "        System.out.println(hm.entrySet());\n" +
                "        System.out.println();\n" +
                "        for (Map.Entry<String, String> e : hm.entrySet()) {\n" +
                "            System.out.println(\"e.getValue() = \" + e.getValue());\n" +
                "        } //entrySet ile gelen key value loop için Entry<key,value> data type tanımlanır\n" +
                "        System.out.println();\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-Clear-Size-IsEmpty------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "        //map.size();->Girilen  map'in entry(giris: eleman) sayısını return eder.\n" +
                "        //map.clear();->Girilen  map'in  tum entry(giris: eleman)siler .\n" +
                "        //map.isEmpty();->Girilen  map'in entry(giris: eleman) varlığını kontrol eder boolean return eder.\n" +
                "\u200B\n" +
                "        System.out.println(\"hm = \" + hm);//\n" +
                "        System.out.println(\"hm.size() = \" + hm.size());//6\n" +
                "        System.out.println(\"hm.isEmpty() = \" + hm.isEmpty());// false\n" +
                "        //hm.clear();\n" +
                "        System.out.println(\"hm.isEmpty() = \" + hm.isEmpty());// true\n" +
                "        System.out.println(\"hm.size() = \" + hm.size());// 0\n" +
                "        System.out.println();\n" +
                "\u200B\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-PutAll--------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "        //map.putAll(map1);->Girilen mapi istenen map'e ekler.\n" +
                "\u200B\n" +
                "        HashMap<String, String> hm5 = new HashMap<>();\n" +
                "        hm5.put(\"Amazon\", \"296 Euro\");\n" +
                "        hm5.put(\"Ebay\", \"234 Euro\");\n" +
                "        hm5.put(\"Saturn\", \"300 Euro\");\n" +
                "        hm5.put(\"Vatan\", \"111 Euro\");\n" +
                "        hm5.put(\"Apple store\", \"333 Euro\");\n" +
                "        hm5.put(\"MediaMarkt\", \"183 Euro\");\n" +
                "\u200B\n" +
                "        System.out.println(\"hm = \" + hm5);//\n" +
                "\u200B\n" +
                "        HashMap<String, String> hm1 = new HashMap<>();\n" +
                "\u200B\n" +
                "\u200B\n" +
                "        hm1.put(\"köfteci yusuf\", \"kaburga ızgara\");\n" +
                "        hm1.put(\"starBucks\", \"flat White\");\n" +
                "        hm1.put(\"güllüoğlu\", \"cennet çamuru\");\n" +
                "        hm1.put(\"nusret\", \"dana spagetti\");\n" +
                "        hm1.put(\"clarusway\", \"bolcana offer\");\n" +
                "        hm1.put(\"javaCAN\", \"javaNAZ\");\n" +
                "\u200B\n" +
                "        System.out.println(\"hm1 = \" + hm1);//\n" +
                "\u200B\n" +
                "        hm5.putAll(hm1);\n" +
                "        System.out.println(\"hm = \" + hm5);\n" +
                "        System.out.println(\"hm1 = \" + hm1);\n" +
                "\u200B\n" +
                "        //cincix code...\n" +
                "        HashMap<String, String> hm2 = new HashMap<>(hm1);//hm2 map hem tanımlandı hemde entry olarak hm1 parametre olarak entry atandı\n" +
                "        System.out.println(\"hm2 = \" + hm2);\n" +
                "        System.out.println();\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-ContainKey-ContainsValue-------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "        //map.containsKey();->Girilen Key değerinin  map'de varlığını  kontrol eder boolean  return eder.\n" +
                "        //map.containsValue();->Girilen  value değerinin  map'de varlığını  kontrol eder boolean  return eder.\n" +
                "\u200B\n" +
                "        System.out.println(\"hm.containsKey(\\\"amazon\\\") = \" + hm.containsKey(\"amazon\"));//false\n" +
                "        System.out.println(\"hm.containsKey(\\\"Amazon\\\") = \" + hm.containsKey(\"Amazon\"));// true\n" +
                "        System.out.println(\"hm.containsValue(\\\"296 Euro\\\") = \" + hm.containsValue(\"296 Euro\"));// true\n" +
                "        System.out.println(\"hm.containsValue(\\\"ebıkGabık Euro\\\") = \" + hm.containsValue(\"ebıkGabık Euro\"));// false\n" +
                "        System.out.println();\n" +
                "\u200B\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-Replace--------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "        //map.replace();->Girilen value  değeri  ilgili Key'de update edilir eski value  return eder.\n" +
                "\u200B\n" +
                "        System.out.println(\"hm = \" + hm);\n" +
                "        System.out.println(\"hm.replace(\\\"Amazon\\\",\\\"314 Euro\\\") = \" + hm.replace(\"Amazon\", \"314 Euro\"));//296 Euro-> oldValue return edildi\n" +
                "        System.out.println(\"hm = \" + hm);\n" +
                "        System.out.println(\"hm.replace(\\\"sefil\\\",\\\"haluk\\\") = \" + hm.replace(\"sefil\", \"haluk\"));// olmayan key için null return eder\n" +
                "        System.out.println();\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-GetorDefault--------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "        //map.getordefault();->Girilen key mapte varsa key'e ait value yoksa default değer return eder.\n" +
                "\u200B\n" +
                "\u200B\n" +
                "        System.out.println(hm.getOrDefault(\"Ebay\", \"Ebikgabık\"));\n" +
                "        //Ebay key mapte var olduğu için Ebay keye ait value(234 Euro) return oldu\n" +
                "\u200B\n" +
                "        System.out.println(hm.getOrDefault(\"Ebik\", \"Gabık\"));\n" +
                "        //Ebik key mapte var olmadığı için default olarak atadığımız Value(Gabık) return edildi\n" +
                "        System.out.println();\n" +
                "\u200B\n" +
                "\u200B\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-Remove--------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "//map.remove();->Girilen entry map'de var ise   siler ve true return eder yoksa false return eder.\n" +
                "//parametre olarak entry değil sadece key değer girilirse key varsa siler ve key value'si return eder.yoksa null return eder\n" +
                "\u200B\n" +
                "      //System.out.println(\"hm.remove(\\\"Amazon\\\",\\\"314 Euro\\\") = \" + hm.remove(\"Amazon\", \"314 Euro\"));//true\n" +
                "        System.out.println(\"hm.remove(\\\"Amazon\\\",\\\"ebik\\\") = \" + hm.remove(\"Amazon\", \"ebik\"));//  false\n" +
                "        System.out.println(\"hm.remove(\\\"Gabık\\\",\\\"314 Euro\\\") = \" + hm.remove(\"Gabık\", \"314 Euro\"));// false\n" +
                "      //System.out.println(\"hm.remove(\\\"Ebay\\\") = \" + hm.remove(\"Ebay\"));// 234 Euro\n" +
                "        System.out.println(\"hm.remove(\\\"111 Euro\\\") = \" + hm.remove(\"111 Euro\"));//  null\n" +
                "\u200B\n" +
                "        System.out.println();\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "    System.out.println(\"-----------------------------------------Map-Remove--------------------------------------- \");\n" +
                "    //----------------------------------------------------------------------------------------------------------------//\n" +
                "\u200B\n" +
                "        //map.putIfAbsent();->Girilen key... Euro");
        hm.put("Saturn", "250 Euro");

        //Girilen key UNIQUE olmalı!!!
        //Eğer key birden fazla yazılırsa java son girilen keyi kabul eder


        //map sout komutuna parametre olarak print edilir
        System.out.println("hm = " + hm);

        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-Values-Keyset-------------------------------------");
        //----------------------------------------------------------------------------------------------------------------//
        /*
        map.values();->map value değerlerini coll. atayıp return eder.
        map.keySet();->map key değerlerini Set'e atayıp return eder.
                                                                                            */

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        //for döngüsü ile yazdırılabilir
        System.out.println("**** MAĞAZALAR ****");
        for (String s : hm.keySet()) {
            System.out.println(s + " ");
        }

        System.out.println();

        System.out.println("**** Fiyatlar ****");
        for (String w : hm.values()) {
            System.out.println(w + " ");
        }
        System.out.println();

        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-Get--------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

        //map.get(key);->Girilen  key değerinin value'sini  return eder.

        System.out.println(hm.get("Ebay"));
        System.out.println("hm.get(\"Saturn\") = " + hm.get("Saturn"));//"250 Euro
        System.out.println("hm.get(\"sefil haluk\") = " + hm.get("sefil haluk"));//olmayan key için null return eder
        System.out.println("hm.get(12) = " + hm.get(12));//key data type farketmeksizin olmayan key null return eder
        System.out.println();
        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-EntrySet--------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

        //map.entrySet();->Girilen  map'in tum key value  datalarını Set'e atayıp return eder.
        System.out.println(hm);
        System.out.println(hm.entrySet());
        System.out.println();
        for (Map.Entry<String, String> e : hm.entrySet()) {
            System.out.println("e.getValue() = " + e.getValue());
        } //entrySet ile gelen key value loop için Entry<key,value> data type tanımlanır
        System.out.println();
        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-Clear-Size-IsEmpty------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

        //map.size();->Girilen  map'in entry(giris: eleman) sayısını return eder.
        //map.clear();->Girilen  map'in  tum entry(giris: eleman)siler .
        //map.isEmpty();->Girilen  map'in entry(giris: eleman) varlığını kontrol eder boolean return eder.

        System.out.println("hm = " + hm);//
        System.out.println("hm.size() = " + hm.size());//6
        System.out.println("hm.isEmpty() = " + hm.isEmpty());// false
        //hm.clear();
        System.out.println("hm.isEmpty() = " + hm.isEmpty());// true
        System.out.println("hm.size() = " + hm.size());// 0
        System.out.println();

        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-PutAll--------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

        //map.putAll(map1);->Girilen mapi istenen map'e ekler.

        HashMap<String, String> hm5 = new HashMap<>();
        hm5.put("Amazon", "296 Euro");
        hm5.put("Ebay", "234 Euro");
        hm5.put("Saturn", "300 Euro");
        hm5.put("Vatan", "111 Euro");
        hm5.put("Apple store", "333 Euro");
        hm5.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm5);//

        HashMap<String, String> hm1 = new HashMap<>();


        hm1.put("köfteci yusuf", "kaburga ızgara");
        hm1.put("starBucks", "flat White");
        hm1.put("güllüoğlu", "cennet çamuru");
        hm1.put("nusret", "dana spagetti");
        hm1.put("clarusway", "bolcana offer");
        hm1.put("javaCAN", "javaNAZ");

        System.out.println("hm1 = " + hm1);//

        hm5.putAll(hm1);
        System.out.println("hm = " + hm5);
        System.out.println("hm1 = " + hm1);

        //cincix code...
        HashMap<String, String> hm2 = new HashMap<>(hm1);//hm2 map hem tanımlandı hemde entry olarak hm1 parametre olarak entry atandı
        System.out.println("hm2 = " + hm2);
        System.out.println();
        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-ContainKey-ContainsValue-------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

        //map.containsKey();->Girilen Key değerinin  map'de varlığını  kontrol eder boolean  return eder.
        //map.containsValue();->Girilen  value değerinin  map'de varlığını  kontrol eder boolean  return eder.

        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon"));//false
        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));// true
        System.out.println("hm.containsValue(\"296 Euro\") = " + hm.containsValue("296 Euro"));// true
        System.out.println("hm.containsValue(\"ebıkGabık Euro\") = " + hm.containsValue("ebıkGabık Euro"));// false
        System.out.println();

        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-Replace--------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

        //map.replace();->Girilen value  değeri  ilgili Key'de update edilir eski value  return eder.

        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"Amazon\",\"314 Euro\") = " + hm.replace("Amazon", "314 Euro"));//296 Euro-> oldValue return edildi
        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"sefil\",\"haluk\") = " + hm.replace("sefil", "haluk"));// olmayan key için null return eder
        System.out.println();
        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-GetorDefault--------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

        //map.getordefault();->Girilen key mapte varsa key'e ait value yoksa default değer return eder.


        System.out.println(hm.getOrDefault("Ebay", "Ebikgabık"));
        //Ebay key mapte var olduğu için Ebay keye ait value(234 Euro) return oldu

        System.out.println(hm.getOrDefault("Ebik", "Gabık"));
        //Ebik key mapte var olmadığı için default olarak atadığımız Value(Gabık) return edildi
        System.out.println();


        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-Remove--------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

//map.remove();->Girilen entry map'de var ise   siler ve true return eder yoksa false return eder.
//parametre olarak entry değil sadece key değer girilirse key varsa siler ve key value'si return eder.yoksa null return eder

        //System.out.println("hm.remove(\"Amazon\",\"314 Euro\") = " + hm.remove("Amazon", "314 Euro"));//true
        System.out.println("hm.remove(\"Amazon\",\"ebik\") = " + hm.remove("Amazon", "ebik"));//  false
        System.out.println("hm.remove(\"Gabık\",\"314 Euro\") = " + hm.remove("Gabık", "314 Euro"));// false
        //System.out.println("hm.remove(\"Ebay\") = " + hm.remove("Ebay"));// 234 Euro
        System.out.println("hm.remove(\"111 Euro\") = " + hm.remove("111 Euro"));//  null

        System.out.println();
        //----------------------------------------------------------------------------------------------------------------//
        System.out.println("-----------------------------------------Map-Remove--------------------------------------- ");
        //----------------------------------------------------------------------------------------------------------------//

        //map.putIfAbsent();->Girilen key...





    }
}
