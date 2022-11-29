package Homework.map;

import java.util.Arrays;
import java.util.HashSet;

public class task {
    /*
  Task
  Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
 olan  changeSet() isminde bir method oluşturun.
  Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
  ÖRNEK:
  hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
  String 1= banana
  String 2 = peach
  CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"


    public static void main(String[] args) {

        HashSet<String>hs=new HashSet<>(Arrays.asList("banana" , "strawberry" , "kiwi" , "pineapple"));
        String str1="banana" ;
        String str2 = "peach";

        System.out.println("changeSet(hs,str1,str2) = " + changeSet(hs, str1, str2));

    }

    private static HashSet<String> changeSet(HashSet<String> hs, String str1, String str2) {
        if (hs.contains(str1)){
            hs.remove(str1);
            hs.add(str2);
        }
        return hs;
    }
    public static void main(String[] args) {

    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.
    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2= USA
     Germany ve USA 'i sil.
    Set'i return et.

        LinkedHashSet <String> ll48=new LinkedHashSet<>(List.of("Germany" , "France" , "USA" , "Canada ", "Mexico" , "Brazil"));
        String k1= "Germany";
        String k2="USA";
        System.out.println("ilk hali: "+ll48);
        System.out.println("son hali: "+removing(ll48, k1, k2));
    }
    private static LinkedHashSet<String> removing(LinkedHashSet <String>ll48,String k1,String k2) {

        if (ll48.contains(k1)||ll48.contains(k2))  ll48.remove(k1); ll48.remove(k2);
        return ll48;
                  }   */
    public static void main(String[] args) {
    /*

    Task
    totalCount() isminde bir method oluşturun.
    Paremetresi  'Integer Hashset' olmalı
    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
        HashSet<Integer> sayı = new HashSet<>(Arrays.asList(4, 2, 3, 1, 7));
        System.out.println("totalCount(sayı) = " + totalCount(sayı));
    }
    private static int totalCount(HashSet<Integer> sayı) {
        return sayı.size();
    }

}
