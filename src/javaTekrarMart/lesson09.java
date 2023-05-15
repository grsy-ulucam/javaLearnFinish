package javaTekrarMart;

import java.util.Scanner;



public class lesson09 {
    public static void main(String[] args) {

        /*
           Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
            a)Ilk karakteri buyuk harf olmalı
            b)Son karakteri RAKAM olamlı
            c)en az 6 karakter uzunlugunda olmalı

       */
        Scanner sc = new Scanner(System.in);
        System.out.println("password girişi yapınız : ");
        String password = sc.nextLine();

        if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&
                (password.charAt(password.length()-1)>='0'&&password.charAt(password.length()-1)<='9')&&
                        (password.length()>=6)){
            System.out.println("geçerli pasaport");
        }else {
            System.out.println("geşersiz pasaport");
        }







    }
}







