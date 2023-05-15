package javaTekrarMart;

import java.util.Scanner;

public class lesson12 {

    public static void main(String[] args) {
            /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();

       polindrome(str);

    }

    public static  void  polindrome(String str){
        String terssStr="";

        for (int i = str.length()-1; i >=0; i--) {
            terssStr+=str.charAt(i);

        }
        System.out.println("girilen ifadenin tersi "+terssStr);

        if (str.equalsIgnoreCase(terssStr)){

            System.out.println("girilen ifade polindromedir");
        }else System.out.println("girilen ifade polindrome değildir");


    }
}


