package Homework.Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class task2 {
    public static void main(String[] args) throws IOException {

        Path grsy= Path.of("src\\j99_Lambda\\grsy");//erişilecek dosyanın path tanımlanacak

        Stream<String> akıs= Files.lines(grsy);




//TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..



        Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(t-> t.split(" ")).flatMap(Arrays::stream)

                .sorted().forEach(t->System.out.print(t+" "));

        System.out.println();



        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.



        System.out.println(Files.lines(Paths.get("src\\J99_Lambda\\haluk")).map(String::toLowerCase)

                .map(t-> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("basarı")).count());

        System.out.println();



        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.



        System.out.println(Files.lines(Paths.get("src\\J99_Lambda\\haluk")).map(String::toLowerCase)

                .map(t-> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("a")).count());

        System.out.println();



        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.



        Files.lines(Paths.get("src\\J99_Lambda\\haluk")).map(String::toLowerCase)

                .map(t-> t.split(" ")).flatMap(Arrays::stream)

                .filter(t -> t.contains("a")).forEach(t->System.out.print(t+" "));

        System.out.println();



        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.



        System.out.println(Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(t -> t.split("")).flatMap(Arrays::stream)

                .distinct().count());



        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.



        System.out.println(Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(t -> t.split(" ")).flatMap(Arrays::stream)

                .distinct().count());

        System.out.println();



        //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz



        Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(t -> t.split(" ")).flatMap(Arrays::stream)

                .distinct().forEach(t->System.out.print(t+" "));



    }
}
