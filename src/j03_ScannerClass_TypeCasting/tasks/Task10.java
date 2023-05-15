package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

    // c = (f-32)*5/9

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter FahrenheitN :");

        int Fahrenheit=input.nextInt();

        double Celsius=(Fahrenheit-32)*5/9;

        System.out.println("Celsius = " + Celsius);


    }

}
