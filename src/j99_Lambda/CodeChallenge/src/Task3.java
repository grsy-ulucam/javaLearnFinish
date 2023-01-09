package j99_Lambda.CodeChallenge.src;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

//5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
//5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
//5 tane ulke ismi yazdırıyoruz. (keyset())
//5 tane ulke nufusunu yazdırıyoruz. (values())
//nüfusların toplamını yazdırın.
//kaç tane 50 milyondan fazla nüfuslu ülke var?
// ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?


        HashMap<String,Integer>ulke=new HashMap<>();
        ulke.put("Almanya",80);
        ulke.put("Türkiye",83);
        ulke.put("Amerika",250);
        ulke.put("Fransa",70);
        ulke.put("Kanada",40);
        System.out.println("ülke isimleri ve nufusları : \n"+ulke+" milyondur.");

        System.out.println("ülke isimleri"+ulke.keySet());

        System.out.println("ülke nufusları"+ulke.values());


       int ellidenBüyük=0;
        for (Integer BuyukMu:ulke.values()){
            if (BuyukMu>50){
                ellidenBüyük++;
            }

        }
        System.out.println("ellidenBüyük = " + ellidenBüyük);
        int toplam=0;
       for (Integer topla: ulke.values()){
           toplam+=topla;
       }

        System.out.println("toplam = " + toplam);

        for (Map.Entry<String, Integer>siralama :ulke.entrySet() // key +value

        ) {

            System.out.println(siralama);

        }

        for (String ulkeSira: ulke.keySet() // sadece key

        ) {

            System.out.println(ulkeSira);

        }

        for (Integer ulkeNufus: ulke.values() // sadece values

        ) {

            System.out.println(ulkeNufus);

        }









    }
}
