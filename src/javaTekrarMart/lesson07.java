package javaTekrarMart;

import java.util.Scanner;

public class lesson07 {
    public static void main(String[] args) {

        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri print eden code create ediniz...

        Scanner scanner=new Scanner(System.in);
        System.out.println("kelime giriniz :");
        String kelıme=scanner.nextLine();

        if (kelıme.length()%2!=0){
            System.out.println(kelıme.charAt(kelıme.length()/2));
        }else {
            System.out.println("ortak karakter yoktur");
        }




    }
}
