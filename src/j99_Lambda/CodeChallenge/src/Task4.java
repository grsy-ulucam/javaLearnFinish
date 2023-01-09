package j99_Lambda.CodeChallenge.src;

import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
/* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
   2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
   3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
   4- Tüm kullanicilarin isimlerini ekrana yazdıralım
*/
        String secim="";
        HashMap<Integer,HashMap<String,String>>kisiListesi=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        do {

            HashMap<String,String>kisiBilgileri=new HashMap<>();
            System.out.println("ad ve soyad gir:");
            kisiBilgileri.put("isim",sc.nextLine());
            sc.next();
            System.out.println("adres gir :");
            kisiBilgileri.put("adres",sc.nextLine());
            sc.next();
            System.out.println("telefon num gir ");
            kisiBilgileri.put("tel",sc.nextLine());
            sc.next();
            System.out.println("4 haneli kimlik no giriniz:");
            kisiListesi.put(sc.nextInt(), kisiBilgileri);



            System.out.println("kisiBilgileri = " + kisiBilgileri);
            System.out.println("kisiListesi = " + kisiListesi);
            System.out.println( "devam etmek istiyor sunuz (E/H)");
            secim=sc.next();
        }while (secim.equalsIgnoreCase("E"));

        System.out.println("görüntülemek istediğiniz ");

        System.out.println(kisiListesi.get(sc.nextInt()));




    }
}
