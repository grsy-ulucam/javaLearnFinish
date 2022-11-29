package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

;

public class Task {
    /*
Task->

Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bir linkedList create ediniz.

Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"

yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */
    public static void main(String[] args) {

        LinkedList<String>ll1=new LinkedList<>(Arrays.asList("yakup","javaCAN","javaTAR","Teykinay"));

        Scanner sc=new Scanner(System.in);
        System.out.println("Ağam kime bakmıştınız ");
        String aganınAdamı=sc.next();
        System.out.println("ll1 = " + ll1);

        if (ll1.remove(aganınAdamı)){
            System.out.println("Aganın adamı hal edildi");

        }else System.out.println("ağam kimseye ulaşılamadı");







    }
}
