package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

       */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please write mid-term grade :");

        double midTermGrade=scanner.nextDouble();

        System.out.println("Please write final grade :");

        double finalGrade=scanner.nextDouble();

        System.out.println("Please write project grade :");

        double projectGrade=scanner.nextDouble();


        int averageGrade= (int) ((midTermGrade+finalGrade+projectGrade)/3);

        System.out.println("averageGrade = " + averageGrade);





    }
}
