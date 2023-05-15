package team02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class myHomework {
    public static void main(String[] args) {


        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String>list=new ArrayList<>(List.of("Ali","Veli","Ayse","Fatma","Omer"));
        List<String>aolmayanlist=new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {
            if (!list.get(i).toLowerCase().contains("a")){
                aolmayanlist.add(list.get(i));
            }

        }
        System.out.println("aolmayanlist = " + aolmayanlist);

        list.clear();
        System.out.println("list = " + list);


        list.addAll(aolmayanlist);
        System.out.println("list = " + list);


    }

}
/*
ArrayList<String> listIsim = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> aOlmayanlistIsim = new ArrayList<>();//boş list
        for (int i = 0; i < listIsim.size(); i++) {

            if (!listIsim.get(i).toLowerCase().contains("a")) {//listin her bir elelmanı a bulundurmuyorsa
                aOlmayanlistIsim.add(listIsim.get(i));//yeni list' a olmayan eleman eklendi
            }
        }
        System.out.println("aOlmayanlistIsim = " + aOlmayanlistIsim);

        listIsim.clear();//list ısım boşlatılıdı

        listIsim.addAll(aOlmayanlistIsim);
        System.out.println("listIsim = " + listIsim);//listIsim = [Veli, Omer]
 */