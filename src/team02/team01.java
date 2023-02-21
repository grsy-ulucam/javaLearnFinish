package team02;

import team2.length;

import java.util.*;

public class team01 {

    public static void main(String[] args) {

        // Array, aynı tipten çok sayıda değişken tanımlamak için kullanılır.

        /* Kullanım şekli Arrayin kullanım tipi girilir, sonrasında array olduğu belli olması için [] kullanılır

           Daha sonra arrayin ismi verilir ve karşısına değerler {} içinde girilir..

        */


        int[] arr1 = {2, 4, 1, 5, 3};


        System.out.println(arr1); // Arrayin referansını verir!!

        System.out.println(arr1[1]); // Birinci index olan 4'ü alırız..


        arr1[3] = 20; //Arrayin 3. indexdeki elemanı 20 olarak update edildi

        System.out.println(arr1[3]);


        //----------------------------------------------------------------------------------------------------------------//

        // Arrayi oluşturup değerleri sonradanda girebiliriz


        int[] arr2 = new int[5];

        arr2[0] = 1;

        arr2[1] = 1; //Arrayin değerleri unique olmak zorunda değil aynı değerlerde olabilir...

        arr2[2] = 2;

        arr2[3] = 3;

        arr2[4] = 4;


        //----------------------------------------------------------------------------------------------------------------//

        String isimArr[] = {"muharrem", "enise", "cebrail", "nazım", "özge"};

        System.out.println(isimArr[1]); // Arrayin 1. indexteki elemanını yazdırır

        System.out.println(Arrays.toString(isimArr)); //Stringe çevirmek için


        //----------------------------------------------------------------------------------------------------------------//

        /* "Sort" Array içindeki değerleri Asc(Küçükten büyüğe) veya Alfabetik olarak sıralamak

         için kullanılır */


        System.out.println("Sort öncesi sıralama " + Arrays.toString(arr1));

        Arrays.sort(arr1);

        System.out.println("Sort öncesi sıralama " + Arrays.toString(arr1));


        //----------------------------------------------------------------------------------------------------------------//

        /* Binarysearch methodu array içinde girilen sayıyı arar ve kaçıncı indexteyse bize verir

           trick-> binarySearch() methodu arrayde olmayan elemanı çalışırsa sonuç olarak: eğer bu eleman arrayde olsaydı kacıncı SIRA'da olurdu cevabını verir

         */


        //int[] arr1 = {2,4,1,5,3};

        System.out.println(Arrays.binarySearch(arr1, 2));


        System.out.println(Arrays.binarySearch(arr1, 34));

        //----------------------------------------------------------------------------------------------------------------//

        /*

            Stringi Arraye çevirme... split()-> girilen parametre değere göre String ifade parçalanır.

         */


        String str = "Bu stringi arraye çevirmek için yazıyorum";

        String[] strarr = str.split(" "); // -> str her " " göre bölünür...

        System.out.println(Arrays.toString(strarr));


        //küççük bir task -> Str deki harf sayısını print eden bir kod yazınız


        String[] harfarr = str.split(""); // -> "" hiçliğe göre parçalandı.

        System.out.println(harfarr.length);


        //Array'i String'e cevirme... toString(arr);-> verilen arr'i string data type cevirir.


        //int[] arr1 = {2,4,1,5,3};

        String strr = Arrays.toString(arr1);

        System.out.println("str = " + strr);


        //----------------------------------------------------------------------------------------------------------------//

    /*

        Array eşitilk kontrolu... equals()-> methodu index ve value kontrolu yapar ve true/false return eder

     */


        int sayi1[] = {39, 3, 72, 63, 84};

        int sayi2[] = {84, 72, 63, 3, 39};


        System.out.println(Arrays.equals(sayi1, sayi2));// false döndürür sıralarının bile aynı olması lazım!!!!

        Arrays.sort(sayi1);

        Arrays.sort(sayi2);

        System.out.println("sayı1 ve sayı2 eşit mi : " + Arrays.equals(sayi1, sayi2));// Şindik oldu


        //----------------------------------------------------------------------------------------------------------------//

       /*

       Array copy... copyOf(arr,newLength);-> girilen arr'yin newLength kadar ilk elemanını copyalar

        */

        int sayi[] = {63, 21, 47, 27, 35, 12, 36, 31, 46, 24};


        int yeniArr[] = Arrays.copyOf(sayi, 5);//[63, 21, 47, 27, 35]

        System.out.println("sayı dan 5 eleman kopyalana yeni arr : " + Arrays.toString(yeniArr));//[63, 21, 47, 27, 35]


        int baskaArr[] = Arrays.copyOfRange(sayi, 3, 8);//3 dahil 8 hariç index elemanlar kopyalanır->3.4.5.6.7. index

        System.out.println("sayı arr'den özel kopyalanan baska Arr : " + Arrays.toString(baskaArr));//[27, 35, 12, 36, 31]


        // Array'ı belirli bir eleman ile update(set) etme... fill(arr,value);


        Arrays.fill(sayi, 99);//

        System.out.println("sayı arr'i 99 ile full'lenmiş hali : " + Arrays.toString(sayi));//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]


        Arrays.fill(sayi, 3, 7, 33);//3.4.5.6. index elemanlar 33 ile update edildi

        System.out.println("sayı arr'i 3 ile 7 index arası  33 ile full'lenmiş hali : " + Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]


        //----------------------------------------------------------------------------------------------------------------//

        /*                                       Multi Dimensional Arraysss                                        */



        /*

        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.

        Matrisler satır ve sütun şeklinde tablo verisi formatındaki verileri tutmak için kullanılır.Oluşturulan

        tabloda bir değere ulaşmak istersek satır ve sütun sayısını girmemiz yeterli olacaktır.

                                                                                                                      */


        //MdArray tanımlama...

        int mdarr1[][] = new int[3][5];//3 katlı her katta 5 dairesi olan boş apt.->3 satır 5 sutun bir tablo.

        //MdArray eleman ekleme...

        mdarr1[2][4] = 35;//2.kat 4. daire değeri 35 atandı


        //elemanları girilerek MdArray tanımlama

        int mdarr2[][] = {

                {1, 2, 3}, //0. kat

                {10, 20}, //1. kat

                {101}//2. kat       101 nolu eleman index->arr[2][0]

        };//3 katlı apt


        //MdArray elemaları print etme

        System.out.println(mdarr2[1]);//[I@1cd072a9-> arr[1] bir array oldg için dpğrudan sout komutu arr[1]'im referansını verir

        System.out.println(Arrays.toString(mdarr2[1]));//[10, 20]

        System.out.println(mdarr2[1][0]);//10

        System.out.println(mdarr2[0][2]);//3

        // Multidimensional array'leri yazdirmak icin toString methodu kullanilamaz

        //  toString methodu outer methodu Stringe cevirir

        // outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin

        // referans degerlerini yazdirilir


        //MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.

        System.out.println(Arrays.toString(mdarr2));//[[I@7c75222b, [I@1cd072a9, [I@4c203ea1]

        System.out.println(Arrays.deepToString(mdarr2));//[[1, 2, 3], [10, 20], [101]]


        //----------------------------------------------------------------------------------------------------------------//

       /* int sayi=33;//tek bir data saklayabilen variable

        int sayi1[]=new int[5];// 5 int deger saklayabilen yapı

        int sayi2[][]=new int[5][6];// 5*6 30 int deger saklayabilen yapı

        ArrayList<Integer> sayiList=new ArrayList<>();// istenilidği kadar int değer saklayan yapı

        */
        /*

     Array List genel Tanimi:



            ArrayList<Type> arrayListName = new ArrayList<Type>();

                 List<Type> arrayListName = new ArrayList<>();



             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir

                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper class dedigimiz object türünden olmalidir

                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir

                - int'n wrapper class'i        --> Integer'dir

                - double'un wrapper class'i    --> Double'dir. vs...


            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez

                - ArrayList'ler tanimlamada .size(); belirleme zorunlulugu yoktur degistirilebilir.

            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.



    List declarations(tanımlama) :

    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.

     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.





    key word: List<Wrapper Class> name=



    List'e assaign etme(atama) :

    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.

    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)

    List<wrapper Class> name = new ArrayList<>() *****doğru

    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice

    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru



    List'e ilk değer atama (initialize):....

    1.yol : asList();

    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.

    2.yol : Listof();

    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );



    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);

    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.





    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.




 */
        System.out.println("*******");

        ArrayList<String> team3 = new ArrayList<>(List.of("ERCAN", "CAĞLA"));
        ArrayList<String> team5 = new ArrayList<>(Arrays.asList("NURCAN", "SİMTEN"));
        List<String> team4 = new ArrayList<>();
        team3.add("taha");
        System.out.println("team3 = " + team3);
        System.out.println("team5.size() = " + team5.size());
        team3.set(2,"gursoy");
        System.out.println("team3 = " + team3);

        System.out.println("team3.addAll(5) = " + team3.addAll(team5));

        System.out.println("team3.indexOf(2) = " + team3.indexOf("ERCAN"));


        System.out.println( "************");

        //list create etme ve değer atama

        ArrayList<Integer> listSayi = new ArrayList<>();


        // 1. yol->add(); method

        listSayi.add(10);//list ilk eleman olarak 10 değeri eklendi

        System.out.println("listSayi = " + listSayi);// [10]


        listSayi.add(39);

        listSayi.add(72);

        listSayi.add(61);

        listSayi.add(41);

        listSayi.add(41);//list eleman tekrarını kabul eder

        listSayi.add(2, 14);//listde index 2 'ye 14 değerini eklendi 2. idexdeki eski eleman bir index ileri kaydırıldı

        System.out.println("listSayi = " + listSayi);// [10, 39, 14, 72, 61, 41, 41]


        //----------------------------------------------------------------------------------------------------------------//


        // 2.yol -> Arrays.asList(); method

        ArrayList<String> listIsim = new ArrayList<>(Arrays.asList("Muharrem", "Nur", "Enise", "Fatih"));

        System.out.println("listIsim = " + listIsim);// [Muharrem, Nur, Enise, Fatih]


        //----------------------------------------------------------------------------------------------------------------//


        //3. yol -> List.of(); method

        ArrayList<String> listUlke1 = new ArrayList<>(List.of("Alamanya", "Amerigonya", "ingiltere", "isvec"));


        //----------------------------------------------------------------------------------------------------------------//

        /* nCopies(int, Obj);-> int elamanlı bir obj den oluşan list ataması yapıyor */

        ArrayList<String> yenilist = new ArrayList<>(Collections.nCopies(15, "Hellooo"));

        System.out.println(yenilist);


        //----------------------------------------------------------------------------------------------------------------//


        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "ingiltere", "isvec"));

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));



        /* addAll();->bir liste diğer listi oldugu gibi ekler */
        System.out.println("*******************************");
           listUlke.addAll(listSehir);//ülke list sonuna sehir list tamamane eklendi

           listSehir.addAll(3, listUlke);//3. index den itibaren ulke listi sehir liste tamamen eklendi


        //----------------------------------------------------------------------------------------------------------------//

        /* indexOf();-> list içinde istenen elemanın index değerin return eder */

        System.out.println(listSehir.indexOf("Londra"));//2

        //Listte olmayan bir elemanı isterseniz -1 verir !!!


        listUlke.add("Amerigonya");

        System.out.println(listUlke.indexOf("Amerigonya"));//tekrarlı elemanlarda soldan(baştan) ilk bulunan eleman index'i return eder

        System.out.println(listUlke.lastIndexOf("Amerigonya"));//sağdan(sondan) ilk bulunan elemanın index'i return eder


        //----------------------------------------------------------------------------------------------------------------//



        /*get();-> listte istenen index elemanı return eder...  */


        System.out.println(listSehir.get(1));//losAngeles

        //Olmayan eleman için RTE verir!!!


        //----------------------------------------------------------------------------------------------------------------//

        /* size();-> listin eleman saysısını return eder */

        System.out.println(listSehir.size()); //4


        //----------------------------------------------------------------------------------------------------------------//

        /*set();-> listin istenen indexe istenen elemanı update eder. */


        System.out.println(listSehir.set(3, "Angara"));//stockholm->set edilen değer print edilir

        System.out.println(listSehir);//[Münih, losAngeles, Londra, Angara]-> list set edilmiş hali print edildi


        //Olmayan index set edilirse RET veririr!!!

        //listSehir.set(1,"bursa",2,"izmir"); //-> list te çoklu set metodu çalışmaz.buz gibi İNTERVİEW sorusu...CTE


        //----------------------------------------------------------------------------------------------------------------//



        /* subList() -> listenen istenen list parcasını return eder..

        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5));//3.4. index elemalnrı listi veririr [stockholm, Angara]


        ArrayList<String> city = new ArrayList<>(listSehir.subList(2, 5));//listSehir'den 2.3.4. index eelamnalrı city liste atandı.

        System.out.println("city = " + city);//city = [Londra, stockholm, Angara]*/


        //----------------------------------------------------------------------------------------------------------------//



        /* isEmpty();-> listin boş olmasını kontrol eder true/false return eder.

        clear(); -> listin tum elelmalrını siler     */


        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());

        //listSehir.clear();


        //----------------------------------------------------------------------------------------------------------------//

        /*equals(); -> iki listin index ve elelman eşitliğini kontrol edip true/false return eder */


        ArrayList<String> lis1 = new ArrayList<>(Arrays.asList("a", "b"));

        ArrayList<String> lis2 = new ArrayList<>(Arrays.asList("A", "b"));

        ArrayList<String> lis3 = new ArrayList<>(Arrays.asList("a", "b"));

        ArrayList<String> lis4 = new ArrayList<>(Arrays.asList("b", "a"));


        System.out.println("lis1.equals(lis3) = " + lis1.equals(lis3));//true

        System.out.println("lis2.equals(lis3) = " + lis2.equals(lis3));//false

        System.out.println("lis1.equals(lis2) = " + lis1.equals(lis2));//false

        System.out.println("lis1.equals(lis4) = " + lis1.equals(lis4));//false


        //----------------------------------------------------------------------------------------------------------------//



        /*  Collections.sort(list);-> verilen list'i naturel sıralama return eder..

            Collections.reverse(list);-> verilen listin ters sıralamasını return eder */


        //ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","losAngeles","Londra","stockholm"));


        Collections.sort(listSehir); //Bu method sout içinde çalışmaz!!!

        //****ÇOOOK ÖNEMLİ....Collections.reverse()--> methodu listteki elemanları index sırasına göre tersten sıralar.

        Collections.reverse(listSehir);


        //----------------------------------------------------------------------------------------------------------------//


        //contains(); -> method list'te istenen elelmanın varlıgını  kontrol eder true/false return

        System.out.println("listSehir.contains(\"angara\") = " + listSehir.contains("angara"));//false


        //----------------------------------------------------------------------------------------------------------------//

        /*remove();-> list'ten istenen eleman siler */


        System.out.println(listSehir.remove("angara"));//false

        System.out.println(listSehir.remove("Londra"));//true

        System.out.println(listSehir.remove(1));//LosAngeles

        // System.out.println(listSehir.remove(11));//olmayan index elelman silinmesi istenirse RTE.


        //----------------------------------------------------------------------------------------------------------------//

        /*list'i Array'a cevirme->toArray(); */


        // 1. yöntem-> toArray();parametre olarak String[0] alarak yapılır.


        ArrayList<String> listUlke01 = new ArrayList<>(List.of("Alamanya", "Amerigonya", "ingiltere", "isvec"));

        String arrUlke[] = listUlke.toArray(new String[0]);//ulkeList'i elemanları arrUlke olarak atandı


        System.out.println("Array dönüşümü sonrası" + Arrays.toString(arrUlke));//[Alamanya, Amerigonya, ingiltere, isvec]


        // 2. Yontem -> oluşturulan Array'in data type  Object olarak atanır.

        // Trıck-> Object class java'da tüm class'ların parent(atası:HZ ADEM)

        // Object Class java'da parent'ii olmayan tek Class'dir(tum vgonları çeken ama çekilemez lokomotif)

        //String Integer Class'lar Object Class child'i oldugu için istene durumlarda data type olarak object class kullanılabilir

        Object arrUlkeler[] = listUlke.toArray();//Object-> Hz.Adem Class'ına atandı

        System.out.println("Array dönüşümü sonrası" + Arrays.toString(arrUlkeler));


        //----------------------------------------------------------------------------------------------------------------//


        // King of TRICK -> Array'dan çevirilen List aray kaynaklı oduğu için array davraınışı

        // gösterir boyut sabittir dolayısıyle remove add method çalışmaz.

        String arrJavaCan[] = {"Akif", "Gamze", "Musty", "SevdeNur"};

        List<String> listJavaTar = Arrays.asList(arrJavaCan);//arrJavaCan değerleri list elelman olarak atandı

        System.out.println("listJavaTar = " + listJavaTar);//[Akif, Gamze, Musty, SevdeNur]

        System.out.println("listJavaTar.size() = " + listJavaTar.size());// 4


        //  listJavaTar.add("sefilCan Haluk");//arraya'a elelman eklenmeeezzzz  :(

        //RTE-> UnsupportedOperationException

        // ahan da kral Trickyyy -> list data type ArrayList tanımlanırsa Rte vermez

        // kaynagı array de olsa list davranır boyut esnekliği yapar.


        ArrayList<String> listJavaTar1 = new ArrayList<>(Arrays.asList(arrJavaCan));

        listJavaTar1.add("sefil haluk");

        System.out.println("listJavaTar1 = " + listJavaTar1);//[Akif, Gamze, Musty, SevdeNur, sefil haluk]


        System.out.println("*********");

        //for ile arrayi yazdırınız

        String team2[] = {"ercan", "çağla", "taha", "nurcan", "simten"};

        System.out.println("Arrays.toString(team2) = " + Arrays.toString(team2));

        System.out.println("team2.length = " + team2.length);

        // Array elamanları print etme..for ile

        for (int i = 0; i < team2.length; i++) {

            System.out.println(team2[i] + " ");

        }

        //tek olan sayıları yazdırınız .

        int sayıArr[] = {12, 18, 23, 45, 67};

        // task-> sayıArr elemanlarından değeri tek olanları print eden code create ediniz

        for (int i = 0; i < sayıArr.length; i++) {
            if (sayıArr[i] % 2 == 1) {
                System.out.println(sayıArr[i] + " ");
            }
        }


        // 34 sayısının varlığını kontrol ediniz :

        int arr[] = {67, 97, 20, 63, 43, 34, 54, 24, 16, 7, 55, 17};

        int sayı = 34;

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayı) {
                flag = true;
                break;

            }

        }

        if (flag = true) {
            System.out.println("aradığınız sayı array de VAR :) ");
        } else {
            System.out.println("aradığınız sayı array de YOK :( ");
        }

        // task ->arr tum elemanlarını toplayan code create ediniz->137

        int apt[][] = {
                {1, 2, 3},
                {10, 20},
                {101, 102, 103}
        };

        int toplam = 0;
        for (int kat = 0; kat < apt.length; kat++) {
            for (int daire = 0; daire < apt[kat].length; daire++) {
                toplam += apt[kat][daire];

            }

        }

        System.out.println("toplam = " + toplam);

        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.


    }

}
