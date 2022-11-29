package Homework.map;

import j99_Lambda.Universite;

import java.util.*;

public class TASK2 {
    public static void main(String[] args) {


        Universite u01 = new Universite("Bogazici", "Matematik", 571, 73);

        Universite u02 = new Universite("Istanbul", "Matematik", 622, 77);

        Universite u03 = new Universite("Marmara", "Hukuk", 1453, 52);

        Universite u04 = new Universite("Itu", "uçak muh.", 333, 63);

        Universite u05 = new Universite("Yıldız Teknik", "Gemi ", 216, 55);
        List<Universite> unv=new ArrayList<>(Arrays.asList(u01,u02,u03, u04,u05));

        System.out.println("matBlmSayısı ( unv) = " + matBlmSayısı(unv));
        System.out.println("fazlaBeşyuzYB (unv) = " + fazlaBeşyuzYB(unv));
        System.out.println("ogrSaysıByb(unv) = " + ogrSaysıByb(unv));
    }//main sonu


    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.

    public static int matBlmSayısı (List<Universite> unv){

        return (int) unv.stream().filter(t->t.getBolum().toLowerCase().contains("matematik")).count();
    }

   //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

    public  static OptionalDouble fazlaBeşyuzYB (List<Universite> unv){

        return unv.stream().filter(t->t.getOgrcSayisi()>571).sorted(Comparator.comparing(Universite::getOgrcSayisi)).mapToDouble(t->t.getNotOrt()).max();
    }

    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.

   public static OptionalDouble ogrSaysıByb(List<Universite> unv){
        return unv.stream().filter(t->t.getOgrcSayisi()<1071).sorted(Comparator.comparing(Universite::getOgrcSayisi)).mapToDouble(t->t.getNotOrt()).min();
   }


}
