package Teamwork.yenidepoteam2.depoYonetimi06;

import Teamwork.P11_depoYonetimi.depoYonetimi04.TryCatch;
import Teamwork.P11_depoYonetimi.depoYonetimi07.TryCatches;
import Teamwork.P11_depoYonetimi.depoYonetimi07.Urunler;

import java.util.*;



public class Method implements GirisCikisInterface {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static int id=1000;
    static HashMap<Integer,UrunTanimlama> urunler=new HashMap<>();
    static int count=0;
    public void girisPaneli(){

        System.out.println(Y+ "========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-ÜRÜN TANIMLAMA |              |  2-ÜRÜN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-ÜRÜN GÜNCELLE    |              |  4-ÜRÜN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-ÜRÜN ÇIKIŞI    |              |  6-BİTİRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  "+R);

        System.out.print("Yapmak istediğiniz işlem : ");

        try {
            int secim= scan.nextInt();

            switch (secim){
                case 1:
                    urunTanimlama();
                    girisPaneli();
                    break;
                case 2:
                    urunListele();
                    girisPaneli();
                    break;
                case 3:
                    miktarGuncelle();
                    urunListele();
                    girisPaneli();
                    break;
                case 4:
                    rafaKoy();
                    urunListele();
                    girisPaneli();
                    break;
                case 5:
                    urunCikis();
                    urunListele();
                    girisPaneli();
                    break;
                case 6:
                    cikisYap();
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız");
                    girisPaneli();
                    break;

            }
        }catch (InputMismatchException e) {
            System.out.println("Sayı dışında karakter girilemez!!!");
            scan.nextLine();
            girisPaneli();
        }}

    public void cikisYap() {
        System.out.println("Çıkış yapıldı");
    }

    private static void urunTanimlama() {

        System.out.println("Lütfen ürün bilgilerini giriniz");
        System.out.println("Ürün ismi:");
        scan.nextLine();
        String urunIsmi=scan.nextLine();
        System.out.println("Üretici firma:");
        String uretici=scan.nextLine();
        System.out.println("Birim:");
        String birim=scan.nextLine();
        System.out.print("Ürün icin raf bilgisi giriniz : ");
        String raf = scan.next();
        System.out.println("Ürün miktarını giriniz:");
        int miktar= scan.nextInt();

        UrunTanimlama urun=new UrunTanimlama(id,urunIsmi,uretici,miktar,birim,raf);
        urunler.put(id,urun);
        id++;

    }

    public static void urunListele() {
        Set<Map.Entry<Integer,UrunTanimlama>> urunlerSeti = urunler.entrySet(); // duplicate olmasın diye set?

        System.out.println("ID       İSMİ         ÜRETİCİSİ       MİKTARI       BİRİMİ         RAF" +
                "\n----------------------------------------------------------------------");
        if(!urunler.isEmpty()){//şart açtım boş değilse şunu yap
            for (Map.Entry<Integer, UrunTanimlama> w: urunlerSeti) {//listede kaç eleman olduğunu bilmiyoruz that's why for.e
                // Integer urunlerKey= w.getKey(); gereksiz geldi atama yapmak,variable başka yerde kullanılıyor mu kontrol et!!
                System.out.printf( "%d    %-8s       %-14s %3d          %-14s %s"
                        ,w.getKey(),w.getValue().getUrunIsmi(), w.getValue().getUretici(),w.getValue().getMiktar(),w.getValue().getBirim(), w.getValue().getRaf());//getvalue indexin valuesu
                System.out.println("");
            }}else {System.out.println("Listelenecek herhangi bir ürün mevcut değil.\nEn az bir adet ürün girişi yapılması gerekli.\n Aşağıdaki adımları takip ediniz"); urunTanimlama();}//ürün yoksa 1 nolu metoda yolluyor.ürün girdisi alıyor.

    }
    public static void miktarGuncelle() {

        System.out.println("Ürün girişi için Id bilgisi giriniz:");

        int arananId = scan.nextInt();


        if (urunler.keySet().contains(arananId)) {


            try {
                System.out.println("Güncel miktarınızı giriniz");
                int guncelMik = scan.nextInt();
                urunler.get(arananId).setMiktar(guncelMik);

            } catch (Exception e) {
                System.out.println("Miktari bir sayı olarak girmelisiniz");
                miktarGuncelle();
            }

        } else {
            System.out.println("Aradığınız ürün yoktur!!!");
        }
    }
    private static void rafaKoy() {
        int arananId;
        while (true) {
           try {
                System.out.println("\nLütfen rafını güncellemek istediğiniz ürünün Id'sini giriniz");
                arananId = Integer.parseInt(scan.next());
                break;


            } catch (Exception e) {

                System.out.println("Bir sayı olmalı");
            }
        }
        scan.nextLine();
        if (urunler.keySet().contains(arananId)) {
            System.out.print("Güncel raf değerini giriniz : ");
            String guncelRaf = scan.nextLine();

            urunler.get(arananId).setRaf(guncelRaf);

            System.out.println("Ürünün rafı güncellendi : " + urunler.get(arananId).getRaf());

        } else {
            System.out.println("Aradığınız ürün sistemde yoktur.Sistemdeki ürünler aşağıda gösterilmiştir:");
        }



    }


    private static void urunCikis() {
        System.out.println("Ürün çıkışı için bir ıd giriniz:");
        int arananId= scan.nextInt();

        if(urunler.keySet().contains(arananId)) {

            System.out.println("Çıkarmak istediğiniz miktarınızı giriniz");
            int guncelMik = scan.nextInt();
            urunler.get(arananId).setMiktar(urunler.get(arananId).getMiktar()-guncelMik);

        }else{
            System.out.println("Aradığınız ürün bulunamadı.");
        }

    }
}
