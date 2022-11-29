package j35_Collection.C02_Set;

import java.util.*;

public class C02_Task {
    /*

 Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz

 main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.

 */
    public static void main(String[] args) {

        String[] arr = {"Muharrem", "Umit", "Sinan", "Nihan"};
        arrayListeCevir(arr);
        HashSet<String> hs = new HashSet<>(arrayListeCevir(arr));

        LinkedHashSet<String> lhs = new LinkedHashSet<>(arrayListeCevir(arr));


        TreeSet<String> ts = new TreeSet<>(arrayListeCevir(arr));

        System.out.println("hs = " + hs);//[Muharrem, Sinan, Nihan, Umit]

        System.out.println("lhs = " + lhs);//[Muharrem, Umit, Sinan, Nihan]

        System.out.println("ts = " + ts);//[Muharrem, Nihan, Sinan, Umit]


    }

    private static ArrayList<String> arrayListeCevir(String[] arr) {


        ArrayList<String> arList = new ArrayList<>(List.of(arr));

        return arList;
    }
}
