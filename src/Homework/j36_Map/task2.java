package Homework.j36_Map;

import java.util.HashMap;

public class task2 {
    public static void main(String[] args) {
/*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */
        HashMap<String,String> sahıs1 = new HashMap<>();
        sahıs1.put("İsim","Ayşe BARIŞ");
        sahıs1.put("E-Mail","barıs@gmail.com");
        sahıs1.put("Adres","Kemalpaşa/İzmir");
        sahıs1.put("Telefon","0 555 555 55  55");
        System.out.println("KartvizitList"+sahıs1);

        HashMap<String,String> sahıs2 = new HashMap<>();
        sahıs1.put("İsim","Erol SAVAŞ");
        sahıs1.put("E-Mail","sava@gmail.com");
        sahıs1.put("Adres","Konak/İzmir");
        sahıs1.put("Telefon","0 535 000 55  15");
        System.out.println("KartvizitList"+sahıs1);

        HashMap<String,HashMap<String,String>>KARTVIZITLIST=new HashMap<>();
        KARTVIZITLIST.put("Ayşe BARIŞ",sahıs1);
        KARTVIZITLIST.put("Erol SAVAŞ",sahıs2);
        System.out.println(KARTVIZITLIST);


    }


}