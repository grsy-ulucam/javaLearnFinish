package CodeChallenge.src.day11.printf;

public class _BmiWithPrintf {

	public static void main(String[] args) {
		/* % Format Specifier
		 * %s , %S  formats strings
		 * %f formats the floating-point numbers
		 * %d formats decimal integers
		 * 
		 * %[flags][width][.precision]S
		 * https://www.baeldung.com/java-printstream-printf
		 */
		
		/* Write a Java program that accepts name,surname, age, weight, height 
		 * than calculates BMI and prints the users status like that;
		 * Anakin SKYWALKER is 25 years old, his height is 180 cm and his weight is 85 kg. He is HEALTHY because his BMI=26,2
		 * 
		 */
		String name="Anakin";
		String surname="SKYWALKER";
		int age=25;
		double weight=85.00;
		double height=180.0;
		double bmi=weight/(height*height/10000);

		String status;

		if (bmi<=20) {
			status="weak";
		} else if (bmi<=25) {
			status= "healthy";
		} else if (bmi<=30) {
			status= "fat";
		} else  status= "obese";

	//Anakin SKYWALKER is 25 years old, his height is 180.0 cm and his weight is 85.00 kg. He is HEALTHY because his BMI=26,2

		System.out.println(name+" "+  surname+ " is " + age + " years old , his height is "+height+" and his weight is "+weight+" He is " + status
				+" because his BMI="+bmi);

		System.out.printf("%s %S is %d years old, his height is %.1f cm and his weight is %.2f kg. He is %S because his BMI=%.1f", name,surname
				,age,height,weight,status,bmi);

	}

}
