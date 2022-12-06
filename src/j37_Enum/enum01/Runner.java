package j37_Enum.enum01;

public class Runner {
    public static void main(String[] args) {
        //task->ay numarısna kaç gün çektiğini çektiğini print ediniz
       // int ay=3;



        Aylar ay=Aylar.MART;//AYLAR enumdan ay field value MART olarak tanımlandı
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());




        switch (ay){
            case OCAK:
                System.out.println("ocak 31 gündür");
                break;
            case ŞUBAT:
                System.out.println("şubat 28 gündür");
                break;

            case MART:
                System.out.println("mart 31 gündür");
                break;

            case NİSAN:
                System.out.println("nisan 30 gündür");
                break;
            case MAYIS:
                System.out.println("mayıs 31 gündür");
                break;

            case HAZİRAN:
                System.out.println("haziran 30 gündür");
                break;
            case TEMMUZ:
                System.out.println("temmuz 31 gündür");
                break;
            case AGUSTOS:
                System.out.println("ağustos 31 gündür");
                break;
            default:
                System.out.println("hatalı değer girdiniz");




        }

    }
}
