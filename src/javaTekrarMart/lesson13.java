package javaTekrarMart;

import java.util.Scanner;

public class lesson13 {

    public static void main(String[] args) {


  /*
       Task -> girilen sayının faktoriyelini hesaplayan method create ediniz
       sayi!= 1*2*3* ...*sayi
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayı = sc.nextInt();

        System.out.println("faktöriyel(sayı) = " + faktöriyel(sayı));
    }

    private  static  int faktöriyel(int sayı){

        int faktöriyel=1;

        for (int i = 1; i <=sayı ; i++) {
            faktöriyel*=i;

        }
        return faktöriyel;
    }





}
