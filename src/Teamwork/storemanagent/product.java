package Teamwork.storemanagent;

public class product {
    private String urunismi;
    private String uretici;
    private int miktar;
    private String raf;
    private String birim;

    public product() {
    }

    public product(String urunismi, String uretici, int miktar, String raf, String birim) {
        this.urunismi = urunismi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.raf = raf;
        this.birim = birim;
    }

    public String getUrunismi() {
        return urunismi;
    }

    public void setUrunismi(String urunismi) {
        this.urunismi = urunismi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = String.valueOf(raf);
    }

    public String getBirimi() {
        return birim;
    }

    public void setBirimi(String birimi) {
        this.birim = birimi;
    }



    @Override
    public String toString() {
        return "product{" +
                "urunismi='" + urunismi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", raf=" + raf +
                ", birimi='" + birim ;
    }

    protected boolean hashCode(int id) {
        return false;
    }
}
