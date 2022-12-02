package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C10_object {
    /*

    TASK :

    fields --> Universite (String)

               bolum (String)

               ogrcSayisi (int)

               notOrt (int)

               olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.

     */

    public static void main(String[] args) {

        Universite u01 = new Universite("Bogazici", "Matematik", 571, 73);

        Universite u02 = new Universite("Istanbul", "Matematik", 622, 77);

        Universite u03 = new Universite("Marmara", "Hukuk", 1453, 52);

        Universite u04 = new Universite("Itu", "uçak muh.", 333, 63);

        Universite u05 = new Universite("Yıldız Teknik", "Gemi ", 216, 55);
        List<Universite>unv=new ArrayList<>(Arrays.asList(u01,u02,u03, u04,u05));

        System.out.println("Task1 = " + notOrt74Byk(unv));
        System.out.println("\n   ***   ");
        System.out.println("Task2 = " + ogrcSys110azMi(unv));
        System.out.println("\n   ***   ");
        System.out.println("Task3 = " + enAzBirMatVarMi(unv));
        System.out.println("\n   ***   ");
        System.out.println("Task4"+ogrcSysTersSıra(unv));
        System.out.println("\n   ***   ");
        System.out.println("Task5 " + enAzOgrcSays2Unv(unv));
        System.out.println("\n   ***   ");
        System.out.println("Task7 = " + notOrt63BykOgrcSysToplam(unv));
        System.out.println("\n   ***   ");
        System.out.println("Task8=  "+ogrcSys333BykNotOrtOrt(unv));

    }//mainsonu
//task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
public static  boolean notOrt74Byk(  List<Universite> unv){

   return unv.stream().allMatch(t->t.getNotOrt()>74);



}
//task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
public  static  boolean  ogrcSys110azMi( List<Universite>unv){


        return unv.stream().allMatch(t->t.getOgrcSayisi()>=110);
}
    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public  static  boolean  enAzBirMatVarMi( List<Universite>unv){


        return unv.stream().anyMatch(t->t.getBolum().toLowerCase().contains("mat"));
    }
//task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.

    public static List<Universite> ogrcSysTersSıra(List<Universite>unv){

        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).collect(Collectors.toList());//akısdaki elemanlar liste atandı

        // collect(Collectors.coll)-> Collector class'dan call edilen coll. meth ile akıs elemanları atanır
    }
    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.

    public static List<Universite> notOrtTersSıra(List<Universite>unv){

        return unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).collect(Collectors.toList());//akısdaki elemanlar liste atandı

        // collect(Collectors.coll)-> Collector class'dan call edilen coll. meth ile akıs elemanları atanır
    }
    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.

    public  static  List<Universite> enAzOgrcSays2Unv(List<Universite>unv){

        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1).collect(Collectors.toList());
    }
    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.



    public static  int notOrt63BykOgrcSysToplam(List<Universite>unv){

        return unv.stream().filter(t->t.getNotOrt()>63).
                mapToInt(t->t.getOgrcSayisi()).// collect(Collectors.coll)-> Collector class'dan call edilen coll. meth ile akıs elemanları atanır
                sum();
    }

    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static Double ogrcSys333BykNotOrtOrt(List<Universite>unv){


        return unv.stream().filter(t->t.getOgrcSayisi()>333).mapToDouble(t->t.getNotOrt()).//akısdaki elemanların data type'nı parametredeki değere göre update eder
                average().getAsDouble();
    }

}