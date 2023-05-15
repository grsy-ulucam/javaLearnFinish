package javaTekrarMart;

import java.util.Scanner;

public class lesson06 {

    public static void main(String[] args) {

        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Bakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");

        int secim=scanner.nextInt();
        int bakiye=1000;
        switch (secim){

            case 1:
                System.out.println("bakiye: " + bakiye);
                break;
            case 2:
                System.out.println("yatıralacak miktar");
                int yatıralacakMıktar= scanner.nextInt();
                bakiye+=yatıralacakMıktar;

                System.out.println("güncel bakiye" + bakiye);
                break;
            case 3 :
                System.out.println("ne kadar para çekeceksin");

                int cekilenMiktar=scanner.nextInt();
                if (cekilenMiktar>bakiye) {
                    System.out.println("yeterli bakiyeniz yoktur :"+bakiye);

            }else {
                    bakiye-=cekilenMiktar;
                    System.out.println("güncel bakiye " +bakiye);
                }break;
            case 4:
                System.out.println("Çıkıs yapıldı");
                break;
            default:
                System.out.println("hatalı işlem yaptınız ");

        }





    }
}
