package Homework.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Predicate;

public class Collection1 {

    public static void main(String[] args) {


/*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    öRNEK:

    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"

    String 1 = banana

    String 2 = peach

    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
*/
        HashSet<String>meyve=new HashSet<>(Arrays.asList("banana" , "strawberry" , "kiwi" , "pineapple"));

        String meyve1 ="banana";
        String meyve2 = "peach";

        System.out.println("changeSet(meyve1,meyve2) = " + changeSet(meyve,meyve1, meyve2));
    }
    private static HashSet<String>  changeSet(HashSet<String> meyve, String meyve1, String meyve2 ) {

        if (meyve.removeIf(Predicate.isEqual(meyve1))){
           meyve.add(meyve2);
       }
       
        return meyve;
    }



}
