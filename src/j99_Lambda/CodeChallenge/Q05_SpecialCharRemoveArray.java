package j99_Lambda.CodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05_SpecialCharRemoveArray {
    /*

Problem Tanımı :

getSum isminde bir method oluşturun.

Parametresi ArrayList'tir.

Dizideki tüm $ ları kaldır ve tüm sayıları topla

return yaptğımız veri tipi 'int' olmalıdır.

sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:

ArrayList = $13, $15, $20

Cevap = 48 olmalı

Örnek 2 :

ArrayList= $-13, $0, $0

Cevap = -1 olmalı.

*/
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));//sum>0  48 doner
        //  ArrayList <String>arrList = new ArrayList<String>(Arrays.asList("$-13", "$15", "$-20")); //sum -1 doner
        getSum(arrList);
        System.out.println("getSum(arrList) = " + getSum(arrList));

    }

    public static int getSum(ArrayList<String> arrList) {


        int sum = 0;
        for (String each : arrList) {
            String str = each.replace("$", "");
            sum += Integer.parseInt(str);//str deki Sring olan elemanlari integer a cevir, sum a ekle
        }

        if (sum < 0) {
            return -1;
        } else return sum;
        //parse int : primitive return eder

        //value Of : non primitive return eder


    }
}


