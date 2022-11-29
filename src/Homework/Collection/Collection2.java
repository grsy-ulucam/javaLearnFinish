package Homework.Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

public class Collection2 {
    public static void main(String[] args) {


/*

    Task->
    return tipi linkedhashset olan removing() isminde bir method oluşturun.

     Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.

     Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli

    Örneğin,

    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil

    String 1= Germany

    String 2 = USA

     Germany ve USA 'i sil.

    Set'i return etsin.

     */
        LinkedHashSet<String>country=new LinkedHashSet<>(Arrays.asList("Germany" , "France ", "USA" , "Canada" ," Mexico","Brazil" ));
        String c1= "Germany";

        String c2 = "USA";

        System.out.println("countrysil(country,c1,c2) = " + countrysil(country, c1, c2));
    }

    private static LinkedHashSet<String> countrysil(LinkedHashSet<String>country,String c1,String c2) {
        if (country.removeIf(Predicate.isEqual(c1)))
        if (country.removeIf(Predicate.isEqual(c2))) {
        }

        return country;
    }
    /*
        public static void main(String[] args) {

    LinkedHashSet<String>lnkdhashset = new LinkedHashSet<>(Arrays.asList("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));



        String str1= "Germany";

        String str2 = "USA";

        System.out.println("ilk liste = " + lnkdhashset);



        System.out.println("son liste = " + removing(lnkdhashset, str1, str2));

    }



    private static LinkedHashSet<String> removing(LinkedHashSet<String>lnkdhashset,String str1,String str2) {

        if (lnkdhashset.contains(str1)&& lnkdhashset.contains(str2))

        lnkdhashset.remove(str1);

        lnkdhashset.remove(str2);



        return lnkdhashset;

    }
     */




}
