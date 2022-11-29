package Homework.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class Iterator1 {
    public static void main(String[] args) {
/*
        TASK 1- Verilen bir integer listin tek elemanlarının karesini tersten print eden code create ediniz
         */

        List<Integer>n1=new ArrayList<>(Arrays.asList(4,25,16,3,9,11));

        ListIterator<Integer>t1=n1.listIterator();
        while (t1.hasNext()){
            int sayı=t1.next();
            if (sayı%2==1){

                t1.set((int) (Math.pow(sayı,2)));

            }else t1.remove();
        }
        while (t1.hasPrevious()){
            System.out.println("it1.previous()+\"\" = " + t1.previous() + "");
        }







    }
}
