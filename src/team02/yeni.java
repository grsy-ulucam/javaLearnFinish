package team02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class yeni {

    public static void main(String[] args) {



        //for ile arrayi yazdırınız

        String team2[] = {"ercan", "çağla", "taha", "nurcan", "simten"};

        System.out.println("Arrays.toString(team2) = " + Arrays.toString(team2));





        // Array elamanları print etme..for ile

        for (int i = 0; i < team2.length ; i++) {
            System.out.print(team2[i]+ " ");
        }

        System.out.println();
        
         //tek olan sayıları yazdırınız .

        int sayıArr[] = {12, 18, 23, 45, 67};

        for (int i = 0; i < sayıArr.length ; i++) {
            if (sayıArr[i]%2==1){
                System.out.print(sayıArr[i]+ " ");
            }

        }
        System.out.println();
        //çift leri for each olsun 



        for (int w:sayıArr) {
            if (w%2==0){
                System.out.print(w+ " ");
            
        }
            
        }
         System.out.println();

        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını toplayan  print eden code create ediniz.

        int number[] = {12, 18, 23, 45, 67,56,89};

        int toplam=0;

        for (int i = 0; i < number.length ; i++) {
            if (number[i]%2==1){
                toplam+=number[i];
            }

        }

        System.out.println("toplam = " + toplam);


        // 34 sayısının varlığını kontrol ediniz :

        int arr[] = {67, 97, 20, 63, 43, 34, 54, 24, 16, 7, 55, 17};

        boolean flag=false;
        int sayı=34;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==sayı){
                flag=true;
                break;
            }

        }
         if (flag==true){
             System.out.println("sayı vardır");
         }else {
             System.out.println(" sayı yoktur");
         }

        System.out.println();

        // task ->arr tum elemanlarını toplayan code create ediniz->137

        int apt[][] = {
                {1, 2, 3},//->0. kat       1->0.katın 0 dairesi
                {10, 20},
                {101, 102, 103}
        };

        int toplam2=0;


        for (int kat = 0; kat<apt.length ; kat++) {
            for (int daire = 0; daire < apt[kat].length ; daire++) {
                toplam2+=apt[kat][daire];
            }

        }

        System.out.println("toplam2= " + toplam2);






/*







        int sayı = 34;

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayı) {
                flag = true;
                break;

            }

        }

        if (flag = true) {
            System.out.println("aradığınız sayı array de VAR :) ");
        } else {
            System.out.println("aradığınız sayı array de YOK :( ");
        }




*/

    }


}
