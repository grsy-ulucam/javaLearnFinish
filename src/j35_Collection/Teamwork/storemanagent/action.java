package j35_Collection.Teamwork.storemanagent;

import java.util.HashMap;
import java.util.Scanner;

public class action extends product {

    static Scanner scan=new Scanner(System.in);
    static  int id=1000;
    static HashMap<Integer,product>urunler=new HashMap<>();

    public static void girişPanel(){

        System.out.println("**********İŞLEMLER**********\n"
                +"1->URUN TANIMLAMA   2->MİKTAR GÜNCELLEME\n"
                +"3->RAF GÜNCELLEME   4->URUN CIKIŞI       \n"
                +"5->URUN LİSTELEME   6->CIKIŞ\n"
                );
        System.out.println("iŞLEM SEÇİNİZ :");

        int secim= scan.nextInt();

        switch (secim){
            case 1:urunTanımlama();
            girişPanel();
            break;
            case 2:urunlisteleme();
               girişPanel();
                break;
            case 3:miktarGüncelleme();
            girişPanel();
            break;
            case  4:urunuRafaKoy();
            girişPanel();
            break;
            case 5:urunCikisi();
            break;
            default:
                System.out.println("hatalı değer girdiniz:)");
                break;

        }

    }

    private static void urunCikisi() {
        System.out.println("yine bekleriz by by by");
    }

    private static void urunuRafaKoy() {
    }

    private static void miktarGüncelleme() {
        System.out.println("miktar güncelleyeceğiniz urun id giriniz :");
        int arananid= scan.nextInt();
        if (urunler.keySet().contains(arananid)){
            System.out.println("güncel miktarını giriniz");
            int güncelMiktar= scan.nextInt();
            urunler.get(arananid).setMiktar(güncelMiktar+urunler.get(arananid).getMiktar());
            System.out.println("ürün miktarınız güncel hale getirildi");
        }else System.out.println("aradığınız ürün yok");

    }

    private static void urunlisteleme() {
        System.out.println("*****ÜRÜN LİSTESİ*****");
        System.out.println(urunler.get(urunler.get(urunler)));
    }


    private static void urunTanımlama() {
        System.out.println("ÜRÜN İSMİNİ GİRİNİZ:");
        String urunismi=scan.nextLine();
        scan.nextLine();
        System.out.println("ÜRETİCİ İSMİNİ GİRİNİZ:");
        String uretici=scan.nextLine();
        System.out.println("BİRİMİ GİRİNİZ :");
        String birim=scan.nextLine();
        System.out.println("ÜRÜN MİKTARINI GİRİNİZ:");
        int miktar= scan.nextInt();
        scan.nextLine();
        System.out.println("ÜRÜN İÇİN RAF GİRİNİZ:");
        String raf=scan.nextLine();
        product urunler=new product(urunismi,uretici,miktar,birim,raf);


        while (true) {
            if (urunler.hashCode(id)) {
                id++;

            } else break;
        }



    }

}
