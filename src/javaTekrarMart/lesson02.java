package javaTekrarMart;

import java.util.Scanner;

public class lesson02 {
    public static void main(String[] args) {

           /*
        girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam yilini   gir : ");
        int year = sc.nextInt();

        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("artık yıldır"+year);
        }else {
            System.out.println("artık yıl değildir");
        }

        System.out.println("**********************");
/*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("bir karakter  giriniz : ");

        char krt=scanner.next().charAt(0);

        if ((krt>='A'&&krt<='Z')||(krt>='a'&& krt<='z')){
            System.out.println( "karakterdir "+krt);

        }else{
            System.out.println("krt harf değildir  ");
        }


    }

}
