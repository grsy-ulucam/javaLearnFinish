package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class teamwork3 {
    public static void main(String[] args) {

Universite U1=new Universite("MUĞLA","MATEMATİK","400","72");
Universite U2=new Universite("EGE","FİZİK","300","82");
Universite U3=new Universite("PAMUKKALE","İKTİSAD","500","92");
Universite U4=new Universite("CELAL BAYAR ","TÜRK DİLİ VE EDEBİYATI","600","62");
Universite U5=new Universite("9  EYLUL ","KİMYA","200","52");

        List<Universite> unv=new ArrayList<>(Arrays.asList(U1,U2,U3,U4,U5));

        System.out.println("notOrt74Byk(  unv) = " + notOrt74Byk(unv));
        System.out.println("\n*****");
        System.out.println("enAzBirFzkVarMi( unv) = " + enAzBirFzkVarMi(unv));
        System.out.println("\n*****");
        System.out.println("notOrtTersSıra(unv) = " + notOrtTersSıra(unv));
        System.out.println("\n*****");


    }//MAİNSONU
    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static  boolean notOrt74Byk(  List<Universite> unv){

        return unv.
                stream().
                allMatch(t->t.getNotOrt()>74);
    }
    //task 02-->universite'lerde herhangi birinde "fizik" olup olmadigini  kontrol eden pr create ediniz.

    public  static  boolean  enAzBirFzkVarMi( List<Universite>unv){

        return unv.stream().
                anyMatch(t->t.getBolum().toLowerCase().contains("fizik"));
    }
    //task 03-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.

    public static List<Universite> notOrtTersSıra(List<Universite>unv){
        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getNotOrt).reversed()).
                limit(2).
                collect(Collectors.toList());
    }
    //task 04--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.

    public static  int notOrt63BykOgrcSysToplam(List<Universite>unv){

        return unv.
                stream().
                filter(t->t.getNotOrt()>63).
                mapToInt(t->t.getOgrcSayisi()).
                sum();
    }



}
