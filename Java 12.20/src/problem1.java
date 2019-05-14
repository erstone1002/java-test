import java.text.DecimalFormat;
import java.util.Scanner;

public class problem1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a number");
		int firstNumber = input.nextInt();
		System.out.println("Give me another number");
		int secondNumber = input.nextInt ();

		System.out.println("The sum is " + (firstNumber + secondNumber));
		System.out.println("The difference is " + (firstNumber - secondNumber));
		System.out.println("The product is " + (firstNumber * secondNumber));
		System.out.println("The quotient is " + (firstNumber / secondNumber));
		
		System.out.println("How much was your dinner");
		int dinner = input.nextInt();
		DecimalFormat format = new DecimalFormat("0.00");
		System.out.println("The tip is " + format.format(dinner * .18));
}
	}
