package j32_Abstract.Ornek2;

public abstract class Sekil {

    private  String name;


    public Sekil(){

    }
    public Sekil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla();
    public abstract double cevreHesapla();
    public void ciz(){
        System.out.println(this.name+ "çizildi");
    }

    @Override
    public String toString() {
        return                "sekil isim ='" + this.name + '\'' +

                "\n sekil alanı : "+this.alanHesapla()+

                "\n sekil cevre : "+this.cevreHesapla();
    }
}
