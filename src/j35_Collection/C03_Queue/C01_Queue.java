package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {

    public static void main(String[] args) {
          /*
        Queue coll oldğ için child class olan LinkedList ve PriorQueue ile obje üretilir.
        eczanaler ve yemekhanler vs belirli şartları aksiyon eder
        coms seçimine göre queue belirlenir .FİFO UYGULANIR
         */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("Cebrail", "Sümeyra", "Yakup", "Muharrem"));
        System.out.println("q1 = " + q1);
        q1.add("erol");
        System.out.println("q1 = " + q1);

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("javacan", "javasu", "javanaz", "javiye"));

        System.out.println("q2 = " + q2);
        q2.add("javaCA");
        System.out.println("q2 = " + q2);

        System.out.println("q1.element() = " + q1.element());
        System.out.println("q1.peek() = " + q1.peek());
        System.out.println("q1.remove() = " + q1.remove());
        System.out.println("q1.poll() = " + q1.poll());
        //PEEK metodu ilk elemanı return eder ama silmez POLL ilk elemanı siler ve return eder.
        //elementtte ilk elemanı silmeden return eder .REMOVE ilk elemanı siler ve return eder.
        //poll ve remove farkı şudur eğer qeue collection boş ise remove exception fırlatır .poll ise null return eder.
        System.out.println();
        q1.clear();
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.poll() = " + q1.poll());
        System.out.println("q1.remove() = " + q1.remove());
        // offer queue collectin metod eklemel için kullanılır .
        q1.offer("ali");
        System.out.println("q1 = " + q1);

        // offerda eleman sınırlaması yapılmış ise  exception fırlatır . poll da ise true-false döner..


    }

}



