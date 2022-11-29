package CodeChallenge.src;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        // PART 1
// create a map with groupName as key and groupMembers as value
// "Group1" = ["Member1", "Member2"]
// "Group2" = ["Member3", "Member4", "Member5"]


// BÖLÜM 1
// anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
// "Grup1" = ["Üye1", "Üye2"]
// "Grup2" = ["Üye3", "Üye4", "Üye5"]

// PART 2
// find how many members each group has

// BÖLÜM 2
// her grubun kaç üyesi olduğunu bul


        HashMap<String,ArrayList<String>>grupVeUyeler=new HashMap<>();
        ArrayList<String>team1=new ArrayList<>(Arrays.asList("Gamze","Merve Nil","Sümeyra","Ramazan"));
        ArrayList<String>team2=new ArrayList<>(Arrays.asList("Hakan","Yunus Emre","Gürsoy","Yakup"));

        grupVeUyeler.put("teamA",team1);
        grupVeUyeler.put("teamB",team2);
        System.out.println("grupVeUyeler = " + grupVeUyeler);

        Collection<ArrayList<String>>values=grupVeUyeler.values();
        for (ArrayList<String> each:values){//eachler teamleri temsil eder .
            System.out.println(each.size());
        }

        Set<String>keys=grupVeUyeler.keySet();
        for (String each:keys){
            ArrayList<String>uyeListesi=grupVeUyeler.get(each);
            System.out.println("grup üyelernin sayısı :" +each +" "+uyeListesi.size());

        }

/*
grup üyelernin sayısı :teamA 4
grup üyelernin sayısı :teamB 4
 */
    }
}
