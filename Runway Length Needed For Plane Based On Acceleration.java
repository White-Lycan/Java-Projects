import java.util.Scanner;

public class Part_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the speed and acceleration: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		double v = Math.pow(number1, 2);
		double a = 2 * number2;
		double l = v / a;
		
		System.out.println("The minimum runway length for this airplane is " + l);

	}

}
