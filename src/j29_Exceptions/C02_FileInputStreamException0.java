package j29_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException0 {
    /*
         Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.

         bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir

         Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.

        Bir kod yazilirken olasi exception'lar ongorulup

        exception olustugunda Java'nin ne yapmasini istedigimiz

        belirtilmelidir.

             1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde

             kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.
                 2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,

             FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda

             FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException

             Class'inin parent class Hz.Adem

     */
    public static void main(String[] args) throws IOException {
         //Hz.Nuh IO işlemleri en parent class exception

        // public static void main(String[] args) throws FileNotFoundException { //read() method import öncesi child exception
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\java Learn\\src");

            //ilgili dosyaya ulaşmak için fis obj tanımlandı parametre olarak ulaşılacak dosya yolu(path) girildi

            //FileNotFoundException-> adres yanlışşsa controlu

            int k;

            try {
                while ((k = fis.read()) != -1) {//IOException -> evde yoksa controlu

                    System.out.println((char) k);//k int  ascci olan file değeri char ici casting-> type dönüşü
                }

                System.out.println("agam içteki  try block'tan selamlar :) ");
            } catch (IOException e) {//dosyaya ulaşılır fakat okunamzsa bu catch çalışır
                System.out.println("ağam dosya okunamıyor");
                System.out.println("ağam içteki catch bloktan selamlar");

            }
            System.out.println("ağam dışardaki try bloktan selamlar ");

        } catch (FileNotFoundException e) {//dosyaya ulaşılmazza bu catch çalışır
            System.out.println("agam  dosya ulaşılamıyor  ....");

            System.out.println("agam dışdaki  catch  block'tan selamlar :) ");

        }

        System.out.println("agam sorun handle edildi DEWAMKEEE :)");
    }


}