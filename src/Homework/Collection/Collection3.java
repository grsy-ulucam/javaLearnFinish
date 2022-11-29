package Homework.Collection;

import java.util.Arrays;
import java.util.HashSet;

public class Collection3 {
    public static void main(String[] args) {


/*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı
    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
        HashSet<Integer> number = new HashSet<>(Arrays.asList(4, 2, 3, 1, 7));

        System.out.println("totalCount(number) = " + totalCount(number));

    }

    private static int totalCount(HashSet<Integer> number) {

        return number.size();
    }
}
