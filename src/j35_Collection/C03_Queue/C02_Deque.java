package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque double ended Queue -> Quelerde FİFO LERDE HEN FİFO HEM LİFO geçerlidir.
                 */

        Deque<String>dq=new LinkedList<>(Arrays.asList("Küşleleme","önkol","börek yatağı","ezme","haydar"));
        dq.add("humus");
        System.out.println("dq = " + dq);
        System.out.println("dq.getFirst() = " + dq.getFirst());
        System.out.println("dq = " + dq);
        System.out.println("dq.getLast() = " + dq.getLast());
        System.out.println("dq = " + dq);
        System.out.println("dq.peek() = " + dq.peek());
        System.out.println("dq = " + dq);
        System.out.println("dq.getLast() = " + dq.getLast());
        System.out.println("dq.getFirst() = " + dq.getFirst());
        System.out.println("dq.peekFirst() = " + dq.peekFirst());
        System.out.println("dq.peekLast() = " + dq.peekLast());
        /*
        ahanda trick getfirst metdod coll boş ise exception fırlatır.peekfirst boş ise null return eder.

         */
        dq.clear();
        System.out.println("dq = " + dq);
        System.out.println("dq.peekFirst() = " + dq.peekFirst());

        //System.out.println("dq.peekLast() = " + dq.peekFirst());
        System.out.println("agam devam j-keeee");

        Deque<String>dq2=new LinkedList<>(Arrays.asList("havuçdilimi","güllaç","muhallebi","triliçe","kazandibi"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
        System.out.println("dq2.removeLast() = " + dq2.removeLast());
        dq2.clear();
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
        System.out.println("dq2.removeLast() = " + dq2.removeLast());


    }
}
