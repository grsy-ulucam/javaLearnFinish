package javaTekrarMart;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
                /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
       		- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
       		- Sayi 5’in kati ise sayi yerine “CAN'dır” yazdirin.
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/

        Scanner scanner =new Scanner(System.in);

        System.out.println("100 den küçü tam sayı girin:");

        int sayı=scanner.nextInt();


        if (sayı>=100){
            System.out.println("geçerli sayı girin");
        }else {
            for (int i = 1; i <sayı ; i++) {

                if (sayı%3==0 && sayı%5==0){
                    System.out.println("JavaCAN");
                } else if (sayı%3==0) {
                    System.out.println("Java");
                } else if (sayı%5==0) {
                    System.out.println("CAN");

                }else System.out.println("hem 3 ün hem 5 katı değildir ." + i);

            }
        }




    } }