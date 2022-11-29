package CodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı

    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.

    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.

    // eğer çift sayı atarsa o elemanının yerine 111 yazsın

    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.
    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();
         randomekle(arrayList);

    }public static void randomekle(ArrayList<Integer> a){
        for (int i = 0; i <10 ; i++) {
            a.add((int) (Math.random() * 20));
            System.out.println(a); //random sayilardan olusan liste
        }

          int counter=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                counter++;
                a.set(i, 111);
            } else System.out.println("çift sayı yoktur.");


        }
    }
}
