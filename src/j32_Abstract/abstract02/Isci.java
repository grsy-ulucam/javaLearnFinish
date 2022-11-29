package j32_Abstract.abstract02;

public class Isci extends Personel {
    @Override
    public void maasHesapla() {
        //Personel parent class'dan override abs meth.

        System.out.println("agam marabalara en çok yeymiye 499 gayme verilir..");
    }

    @Override
    public void maasBilgisi() {
        //Personel parent class'dan override abs meth.

        System.out.println("Agam marabalar cay-cüğara hariç günde 8 saat kürek mahkumu :(");
    }//abs Personel parent Clas'a extends->concrete child Isci class




}
