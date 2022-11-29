package j32_Abstract.abstract02;

public class IdariPersonel extends Personel {
    @Override
    public void maasHesapla() {
        //Personel parent class'dan override abs meth.

        System.out.println("Agam frapan idarecimize saatine $120 gayme verilir :)");
    }

    @Override
    public void sigorta() {//Personel parent class'dan override conc. meth.
        super.sigorta();
    }

    @Override
    public void maasBilgisi() {
//Personel parent class'dan override abs meth.

        System.out.println("Agam cıncık code yaan idari personele ekistiradan biy ikramiye :)");


    }

}
