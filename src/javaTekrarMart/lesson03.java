package javaTekrarMart;

import java.util.Scanner;

public class lesson03 {

    public static void main(String[] args) {

  /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */


        Scanner scanner =new Scanner(System.in);

        System.out.println("KADIN İÇİN 'K',ERKEK İÇİN 'E' GİRİNİZ :");

        char cinsiyet=scanner.next().charAt(0);


        if(cinsiyet=='K'){
            System.out.println("kadının yaşını giriniz :");
            int age=scanner.nextInt();
            if (age>60){
                System.out.println("prim gününü giriniz :");
              int day=scanner.nextInt();
              if (day>6000){
                  System.out.println("emekli oldunuz");
              }else{
                  System.out.println("yeterli prime sahip değilsiniz"+(6000-day)+"gününüz var");
              }
            }else {
                System.out.println("60 yaşından küçüksünüz" +(60-age) + "yıl var");

            }
        } else if (cinsiyet=='E') {
            System.out.println("erkeğin yaşını giriniz :");
            int age=scanner.nextInt();
            if (age>65){
                System.out.println("prim gününü giriniz");
                int day=scanner.nextInt();
                if (day>7000){
                    System.out.println("emekli olabilirsiniz");
                }else {
                    System.out.println("emekli olmanıza"+(7000-day)+"gün var");
                }
            }else {
                System.out.println("emekli olmanıza"+(65-age)+"yıl var");
            }
        }else{
            System.out.println("ne olduğuna karar ver");
        }


    }

}
