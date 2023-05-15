package javaTekrarMart;

import java.util.Arrays;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {

// task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner scanner =new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz :");


        int arr []=new int[scanner.nextInt()];


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+"eleman gir");

            arr[i]=scanner.nextInt();
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        System.out.println("toplam = " + toplam);

     int ortalama=toplam/arr.length;

        System.out.println("ortalama = " + ortalama);


        int ortalamaelemansayısı=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>ortalama){
                ortalamaelemansayısı++;
            }
        }
        System.out.println("ortalamaelemansayısı = " + ortalamaelemansayısı);

    }
}
