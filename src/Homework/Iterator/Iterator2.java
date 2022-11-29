package Homework.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator2 {
    public static void main(String[] args) {
       /* task 2->
  Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
 */

        List<Integer>list=new ArrayList<>(List.of(2,13,56,23,45,14,40));
        ListIterator<Integer>it1=list.listIterator();
        while (it1.hasNext()){
            int sayı= it1.next();
            if (sayı<20||sayı>40 ){
                it1.remove();
            }else System.out.println(sayı +"");
        }

    }
}
