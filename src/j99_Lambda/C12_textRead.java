package j99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {

    public static void main(String[] args) throws IOException {
        //grsy dosyasını okuyunuz ..

       Path grsy= Path.of("src\\j99_Lambda\\grsy");//erişilecek dosyanın path tanımlanacak

        Stream<String>akıs= Files.lines(grsy);
        Stream<String>akıs1= Files.lines(Path.of("src\\j99_Lambda\\grsy"));
        akıs.//erişimi verilen dosyadaki satırlar akışa alındı.
                forEach(System.out::println);//akışdaki satırlar priny edildi .
        System.out.println("******");
        //task 02 -> gsry dosyasındaki büyük harfleri okuyunuz .Consola yazdırınız.

  Files.lines(Paths.get("src\\j99_Lambda\\grsy")).//akışa alınan path deki satırlar akışa alıondı

          map(String::toUpperCase).//akıştaki satırlarım strinler büyük harfe uplate edildi .
                forEach(System.out::println);
        System.out.println("******");
//task 3:grsy dosyasındaki ilk harfleri küçük harf yapınız .
        Files.lines(Paths.get("src\\j99_Lambda\\grsy")).//akışa alınan path deki satırlar akışa alıondı

                map(String::toLowerCase).//akıştaki satırlarım strinler büyük harfe uplate edildi .
              findFirst() ;//limit(1).
                //forEach(System.out::println);
        System.out.println("******");
        //task 3:grsy dosyasındaki "başarı" kelimesinin kaç satırda geçtiğini print ediniz.
        System.out.println(Files.lines(Paths.get("src\\j99_Lambda\\grsy")).//akışa alınan path deki satırlar akışa alıondı

                map(String::toLowerCase).//akıştaki satırlarım strinler büyük harfe uplate edildi .
                filter(t -> t.contains("basarı")).
                count());


    }
}
