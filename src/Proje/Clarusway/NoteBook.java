package Proje.Clarusway;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBook extends Product {
    Scanner scanner = new Scanner(System.in);
    static int nid = 1;
    static List<NoteBook> noteBooks = new ArrayList<>();

    public NoteBook(Scanner scanner, int id, String name, double price, double discountRate, int amount, Brand brand, double screenSize, int ram, int memory) {
        super(scanner, id, name, price, discountRate, amount, brand, screenSize, ram, memory);
    }

    @Override
    public void memu() {

        System.out.println("1) yeni notebook ekleme \n" + "2) notebook listesini  görünteleme\n" + "3) notebook silme");
        System.out.println("lütfen yapmak istediğiniz işlemi giriniz");
        int options = scanner.nextInt();
        if (options == 1) addItem();
        if (options == 2) getProduct();
        if (options == 3) deleteItem();

    }

    @Override
    public void addItem() {

    }

    @Override
    public void getProduct() {

    }

    @Override
    public void deleteItem() {

    }
}
