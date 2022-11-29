package j32_Abstract.Ornek2;

public  class Cember extends Sekil{
    private  double yarıCap;
    private final  double pi=3.14;

    public double getPi() {
        return pi;
    }

    public double getYarıCap() {
        return yarıCap;
    }

    public void setYarıCap(double yarıCap) {
        this.yarıCap = yarıCap;
    }

    public Cember(double yarıCap) {
        this.yarıCap = yarıCap;

    }

    @Override
    public double alanHesapla() {
        return pi*this.yarıCap*this.yarıCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*pi*yarıCap;
    }
}
