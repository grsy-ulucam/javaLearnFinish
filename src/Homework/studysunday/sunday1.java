package Homework.studysunday;

import java.util.Scanner;

public class sunday1 {

    public static void main(String[] args) {
        // Soru 1:Klavyeden rastgelen girilen 2 tane sayının karelerinin toplamını ekrana yazan programı Java dilinde yazınız.
        Scanner scanner = new Scanner(System.in);
        /*
         System.out.println("1.sayıyı giriniz:");
        int a=scanner.nextInt();
        System.out.println("2.sayıyı giriniz:");
        int b=scanner.nextInt();
        int sum =a*a+b*b;
        System.out.println("sum1 = " + sum);
        //Soru 2:Klavyeden girilen 6 tane sayının toplamını ekrana yazan programı Java dilinde yazınız.
        int toplam=0;
        int sayı;
        for (int i = 1; i <=6; i++) {
            System.out.println("sayı "+i+" giriniz:");
            sayı=scanner.nextInt();
             toplam+=sayı;
        }
        System.out.println("Toplam = " + toplam);

       // 1 ile 100 arasındaki sayıları toplamını ekrana yazan programı Java dilinde yazınız

        int toplam1=0;

        for (int i = 1; i <=100 ; i++) {
            toplam1+=i;
        }
        System.out.println("toplam1 = " + toplam1);
       // 1 ile 100 arasındaki 3 ve 5 ‘in katlarını ekrana yazan programı Java dilinde yazınız.
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 &&i %5==0){
                System.out.print(i+" ");
            }
        }


       //   Soru 5:Klavyeden girilen bir sayının asal sayı olup olmadığını ekrana yazan programı Java dilinde yazınız.
        System.out.println("bir sayı giriniz:");
        int sayı=scanner.nextInt();
        boolean asalMI=true;
        for (int i = 2; i < sayı; i++) {
            if (sayı%i==0){
                 asalMI=false;
                 break;
        }
        }
        if (asalMI){
            System.out.println("sayı asaldır.");
        }else System.out.println("sayı asal değildir.");
        //Soru 6:Klavyeden girilen bir sayının tek mi çift mi olduğunu ekrana yazan programı Java dilinde yazınız.

        System.out.println("sayı giriniz:");
        int sayı=scanner.nextInt();
         if (sayı%2==0){
             System.out.println("sayı çiftir");
         }else System.out.println("sayı tektir");

       // Soru Girilen n tane sayının ortalamasını ekrana yazan programı Java dilinde yazınız.

        int toplam=0;
        int sayı;
        System.out.println("kaç tane sayı gireceksiniz:");
        int n=scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("sayı"+i+".giriniz:");
            sayı=scanner.nextInt();
            toplam+=sayı;

        }
        int ortalama=toplam/n;
        System.out.println("ortalama = " + ortalama);
     //   Soru 8:1’den 1000’e kadar (1 ve 1000 dahil) olan sayıların toplamını ve ortalamasını ekrana yazan programı Java dilinde yazınız.
        int i;
        int toplam=0;
        for ( i = 1; i <=1000 ; i++) {
            toplam+=i;
        }
        int ortalama=toplam/1000;
        System.out.println("toplam = " + toplam);
        System.out.println("ortalama = " + ortalama);

       // Soru 9:Girilen vize ve final notuna göre öğrencinin kalıp kalmadığını ekrana yazan programı Java dilinde yazınız.

        System.out.println("vize notunu giriniz:");
        double v=scanner.nextDouble();
        System.out.println("final notunu giriniz:");
        double f=scanner.nextDouble();

        if (v*0.3+f*0.7>=70){
            System.out.println("geçtiniz");
        }else System.out.println("kaldınız");


        //Soru 10:Girilen bir sayının faktöriyelini ekrana yazan programı Java dilinde yazınız.

        System.out.println("bir sayı giriniz:");
        int sayı = scanner.nextInt();
        int faktör ;

ı
        if (sayı<=0){
            System.out.println("negatif faktöriyel olmaz");
        }else {
            for (faktör = 1; sayı>0 ; faktör*=sayı,sayı--) ;

            System.out.println("faktör = " + faktör);


        }

        //Soru 11:ax²+bx+c=0 verilen denklemin köklerini bulan ve ekrana yazan programı Java dilinde yazınız.

        System.out.println("a girin:");
        float a=scanner.nextInt();
        System.out.println("b girin:");
        float b=scanner.nextInt();
        System.out.println("c girin:");
        float c=scanner.nextInt();

        float delta= (float) (Math.pow(b,2)-4*a*c);
        if (delta>0){
            float x1= (float) (-b+Math.sqrt(delta))/2*a;
            float x2= (float) (-b-Math.sqrt(delta))/2*a;
            System.out.println("x2 = " + x2);
            System.out.println("x1 = " + x1);
        } else if (delta==0) {
            float x1=-b/2*a;
            System.out.println("x1 = " + x1);

        }else System.out.println("reel kök yoktur .");

 //Soru 12:Girilen sayının kaç basamak olduğunu ekrana yazan programı Java dilinde yazınız.

        System.out.println("bir sayı giriniz:");
        int sayı =scanner.nextInt();
        int basamak=0;
        while (sayı>0){
           sayı=sayı/10;
            basamak++;
        }
        System.out.println("basamak sayısı = " + basamak);

       // Soru 13:Girilen sayıya kadar olan 7 ve 3’ün katı olan sayıları ekrana yazan programı Java dilinde yazınız.

        System.out.println("sayı giriniz:");
        int sayı =scanner.nextInt();
        for (int i = 0; i <sayı ; i++) {
            if (i%3==0 && i%7==0){
                System.out.print(i +" ");
            }

        }
 //Soru 14:Girilen sayının mutlak değerini ekrana yazan programı Java dilinde yazınız.

        System.out.println("sayı giriniz:");
        int sayı =scanner.nextInt();
        System.out.print("Math.abs(sayı) = " + Math.abs(sayı)+" ");

        //Soru 15:n tane girilen sayı içerisinden pozitif, negatif sayının ve 0 sayısının adedini ekrana yazan programı Java dilinde yazınız.

        int neg=0;
        int poz=0;
        int sıfr=0;
        int sayı;
        System.out.println("kaç tane sayı gireceksiniz:");
        int n =scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("Sayı"+i+"giriniz:" );
            sayı=scanner.nextInt();
            if (sayı == 0)
                sıfr++;
            else if (sayı > 0)
                poz++;
            else
                neg++;
        }
        System.out.println("Pozitif Sayi Adedi: " + poz);
        System.out.println("Negatif Sayi Adedi: " + neg);
        System.out.println("Sifir Sayi Adedi: " + sıfr);  */

       // Soru 16:Rastgele girilen n tane sayı içerisinde tek sayıları 1 arttırıp karelerini alıp toplayan, çift sayıların kareköklerini alıp toplayan ve tek ve çift sayıların adetlerini ekrana yazan programı Java dilinde yazınız.
        int tekadet=0;
        int çiftadet=0;
        float ttop=0, ctop=0;
        int sayı;
        System.out.println("kaç tane sayı gireceksiniz:");
        int n =scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("Sayı" + i + "giriniz:");
            sayı = scanner.nextInt();
            if (sayı%2==0){
               ctop = (float) Math.sqrt(sayı);
                çiftadet++;

            }else  ttop= (float) Math.pow((sayı + 1), 2);
                  tekadet++;
        }

        System.out.println("çiftadet = " + çiftadet);
        System.out.println("tekadet = " + tekadet);
        System.out.println("ctop = " + ctop);
        System.out.println("ttop = " + ttop);

    }


    }
