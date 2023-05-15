package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);

        System.out.println("Kaç saniye üzerinden işlem yapalım?");
        int saniye = girdi.nextInt();
        /* islemlerimizi gerceklestiriyoruz */
       int dakika = saniye / 60; //dakikamizin ilk degerini hesapladik
        saniye = saniye % 60; //son olarak saniyemizi mod alarak hesapliyoruz
        int saat = dakika / 60 ;  //saat degerimizi hesapladik
        dakika = dakika % 60; //son olarak mod alarak dakikamizi hesapliyoruz

        System.out.println(saat+ " saat "+dakika+" dakika "+saniye+" saniye ");



    }
}
