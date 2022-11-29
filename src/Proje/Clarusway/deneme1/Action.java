package Proje.Clarusway.deneme1;

import java.util.ArrayList;
import java.util.Scanner;

public class Action extends Person {

    static Scanner sc = new Scanner(System.in);
    static String tercih;

    static ArrayList<Person> Teacher = new ArrayList<>();
    static ArrayList<Person> Student = new ArrayList<>();

    public static void panelMenu() {

        System.out.println("**********************************    " + " \nÖĞRENCi VE ÖĞRETMEN YöNETIM PANELI\n" + "**********************************");
        System.out.println("1-ÖĞRENCİ İŞLEMLERİ\n2-ÖĞRETMEN İŞLEMLERİ\nQ- ÇIKIŞ");
        System.out.println("Lütfen girmek istediğiniz işlem numarısını giriniz: ");

        String tercih = sc.next().toUpperCase();

        switch (tercih) {
            case "1":
                tercih = "student";
                islemMenusu();
                break;
            case "2":
                tercih = "teacher";
                islemMenusu();
                break;
            case "Q":
                cikiş();
                break;
            default:
                System.out.println("yanlış tuşlama yaptınız.");
                panelMenu();
                break;
        }
    }

    public Action(String nameSurname, String personID, int age) {
        super(nameSurname, personID, age);
    }

    private static void cikiş() {
        System.out.println("Sistemden çıkış yaptınız gelecek sezon yine bekleriz");
    }

    private static void islemMenusu() {

        System.out.println("Seciminiz:  " + tercih + " Lutfen asagidaki islemlerden tercih yapiniz.\n"

                + "*********** " + " ISLEMLER ************\n" + " 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU");


        System.out.println("Aşağıdaki işlemlerden birini tercih yapınız");

        String islem = sc.next();

        switch (islem) {
            case "1":
                ekle();
                islemMenusu();
                break;
            case "2":
                arama();
                islemMenusu();
                break;
            case "3":
                listele();
                islemMenusu();
                break;
            case "4":
                sil();
                islemMenusu();
                break;
            case "Q":
                System.out.println("Sistemden çıkış işlemi yaptınız.");
                break;
            default:
                System.out.println("yanlış tuşlama yaptınız !!!!");
                islemMenusu();
                break;
        }
    }
    private static void sil(){
        System.out.println("******"+tercih+"******");
        boolean flag =true;
        if (tercih.equalsIgnoreCase("ogrenci")){
            sc.nextLine();
            System.out.println();
            System.out.println();
            System.out.println("silinicek studentNo giriniz.");

            String clearStudentNo=sc.next();

            for (Person p:Student){
                if (p.getPersonID().equalsIgnoreCase(clearStudentNo)){
                    System.out.println("Silinecek Ögrenci :" + p.getNameSurname());
                    Student.remove(p);
                    flag=false;
                    break;
                }
                if (flag){
                    System.out.println("silinecek ögrenci mevcut değil");
                }
            }

        }else {
            System.out.println("Silinecek öğretmen kimlik no giriniz:");
            String clearTecherID=sc.next();

            for (Person t:Teacher) {
                if (t.getPersonID().equalsIgnoreCase(clearTecherID)) {

                    System.out.println("Silinen öğretmen :" + t.getNameSurname());
                    Teacher.remove(t);
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Silinecek ögretmen mevcut değil");
            }
        }
    }
              private static  void listele(){
                  System.out.println("*****"+tercih+"listeleme sayfası *****");
                  if (tercih.equalsIgnoreCase("Student")){
                      System.out.println(Student);

                  }else {
                      for (Person p:Student) {
                          System.out.println(p.toString()+"adı soyadı :"+p.getNameSurname()+"yaş"+p.getAge());
                      }
                  }
              }
    private static void arama (){
        System.out.println("   ***   " + tercih + " arama sayfası   ***");
        boolean flag =true;
        if (tercih.equalsIgnoreCase("student")){
            sc.nextLine();
            System.out.println();
            System.out.println("aradığınız öğrencinin kimlik numarasını giriniz:");

            String arananKimlikNo= sc.next();


        for (Person p:Student){
            if (p.getPersonID().equals(arananKimlikNo)){
                System.out.println("aradığınız öğrenci :"+p.getNameSurname());
                flag=false;

            }
        }

        if (flag) {
            System.out.println("aradığınız ögrenci mevcut değil ");
        }else {
            System.out.println("aradığınız öğretmenin kimlik num giriniz:");
            String arananSicilNo=sc.next();
              for (Person t:Teacher){
                  if (t.getPersonID().equalsIgnoreCase(arananSicilNo)){
                      System.out.println("aradığınız öğretmen :"+t.getNameSurname());
                       flag=false;                 }
              }
        }
        if (flag){
            System.out.println("aradıoğınız öğretmen mevcut değil");
        }}
    }
    private static void ekle () {
        System.out.println("   ***   " + tercih + "ekleme sayfası   ***");
        System.out.print("ad soyad giriniz : ");
        sc.nextLine();
        String adSoyad = sc.next();
        System.out.println("kimlik no giriniz:");
        String kimlikNo = sc.nextLine();
        System.out.println("yas giriniz :");
        int yas = sc.nextInt();
        if (tercih.equalsIgnoreCase("Student")) {
            System.out.print("ogrenci No giriniz : ");
            String ogrcNo = sc.next();

            sc.nextLine();
            System.out.print("sınıf giriniz : ");
            String sınıf = "";
            Proje.Clarusway.deneme1.Student crazyStudent = new Student(adSoyad, kimlikNo, yas, ogrcNo, sınıf);
            Student.add(crazyStudent);

        } else {

            System.out.print("sicil No giriniz : ");

            String sicilNo = sc.nextLine();

            sc.nextLine();//dummy

            System.out.print("bolum giriniz : ");

            String bolum = sc.nextLine();

            Proje.Clarusway.deneme1.Teacher crazyTeacher = new Teacher(adSoyad, kimlikNo, yas, sicilNo, bolum);//p'li cons ogrtm obj create edildi

            Teacher.add(crazyTeacher);
        }
    }
}




