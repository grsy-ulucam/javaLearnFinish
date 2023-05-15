package javaTekrarMart;

import java.util.Scanner;

public class lesson05 {
    public static void main(String[] args) {

        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Müşteri kartınız var mı?:Evet ise 'E',Hayır ise 'H' ");

        char kart = scanner.next().charAt(0);

        if (kart == 'E') {
            System.out.println("Alacağınız ürün miktarını giriniz:");
            int miktar = scanner.nextInt();
            if (miktar > 10) {
                System.out.println("Ürün fiyatını giriniz :");
                int fiyat = scanner.nextInt();

                int totalPrice;
                totalPrice = (int) ((miktar) * (fiyat * 0.8));
                System.out.println("totalPrice = " + totalPrice);
            } else {
                System.out.println("Ürün fiyatını giriniz :");
                int fiyat = scanner.nextInt();

                int totalPrice;
                totalPrice = (int) ((miktar) * (fiyat * 0.85));
                System.out.println("totalPrice = " + totalPrice);
            }

        } else {
            if (kart == 'H') {
                System.out.println("Alacağınız ürün miktarını giriniz:");
                int miktar = scanner.nextInt();
                if (miktar > 10) {
                    System.out.println("Ürün fiyatını giriniz :");
                    int fiyat = scanner.nextInt();

                    int totalPrice;
                    totalPrice = (int) ((miktar) * (fiyat * 0.85));
                    System.out.println("totalPrice = " + totalPrice);
                } else {
                    System.out.println("Ürün fiyatını giriniz :");
                    int fiyat = scanner.nextInt();

                    int totalPrice;
                    totalPrice = (int) ((miktar) * (fiyat * 0.90));
                    System.out.println("totalPrice = " + totalPrice);
                }

            }


        }





    }}
