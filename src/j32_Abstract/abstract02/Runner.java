package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {


        Isci mrb1=new Isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="EbuBekir Güzel insan :-) ";
        System.out.println("mrb1.name = " + mrb1.name);

        IdariPersonel cnCdr=new IdariPersonel();
        cnCdr.name="Dilek orjiklerin efendisi :) ";
        System.out.println("cnCdr.name = " + cnCdr.name);
        cnCdr.maasBilgisi();
        cnCdr.maasHesapla();

    }
}
