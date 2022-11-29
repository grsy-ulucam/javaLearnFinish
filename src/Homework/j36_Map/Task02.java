package Homework.j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */
        Map<String, String> nazımKrtvzt = new HashMap<>();
        nazımKrtvzt.put("isim", "nazım");
        nazımKrtvzt.put("email", "ebik");
        nazımKrtvzt.put("adres", "dut ağacı");
        nazımKrtvzt.put("telefon", "1223343456345");

        Map<String, String> mehmetKrtvzt = new HashMap<>();
        mehmetKrtvzt.put("isim", "mehmet");
        nazımKrtvzt.put("email", "ebikkabık");
        nazımKrtvzt.put("adres", "elma ağacı");
        nazımKrtvzt.put("telefon", "45654634");
        Map<String,Map<String,String>>kartvizit=new HashMap<>();

        kartvizit.put("QA nazım",nazımKrtvzt);
        kartvizit.put("Dev MEHMET ",mehmetKrtvzt);
        System.out.println("kartvizit = " + kartvizit);
       // System.out.println("kartvizit.get(\"Dev MEHMET\").get(\"telefon\") = " + kartvizit.get("Dev MEHMET").get("telefon"));

        Map<Integer,Kartvizit>krtvzt=new HashMap<>();
        Kartvizit k1=new Kartvizit("enise","enise@tseter.com","google compaany","7324523");
        krtvzt.put(k1.id,k1);
        System.out.println("krtvzt = " + krtvzt);
        System.out.println("krtvzt.get(k1.id) = " + krtvzt.get(101));


    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
