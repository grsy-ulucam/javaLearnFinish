package j99_Lambda.CodeChallenge;

public class Q04_TestKeyword {
    /*

ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz

//ogrencilerin cevaplari

char[][] answers = {

{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},

{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},

{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},

{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

*

* // cevap anahtari

char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

output:

1 nolu ogrencinin 7 dogru cevabi var.

2 nolu ogrencinin 6 dogru cevabi var.

   "           "

   "           "

   "           "

8 nolu ogrencinin 7 dogru cevabi var.

*/
    public static void main(String[] args) {
        char[][] answers = {

                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},

                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},

                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},

                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},

                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        testSonucu(answers, keys);

    }

    public static void testSonucu(char[][] answer, char[] keys) {

        for (int i = 0; i < answer.length; i++) {
            int counter = 0;//ögrenci için dış for

            for (int j = 0; j < answer[i].length; j++) {// cevap anahtarı için iç for
                if (answer[i][j] == keys[j]) {//cevap anantari ve ogrenci cevabini karsilastirir

                    counter++;

                }

            }
            System.out.println((i + 1) + "nolu öğrencinin dğoru cevap sayısı :" + counter);
        }

        //counter her bir ogrenci icin dogru cevap sayisina baktigi icin her seferinde 0 dan baslamali..
    }


}
