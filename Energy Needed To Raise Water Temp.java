
public class Part_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms: ");
		double amount = input.nextDouble();
		System.out.println("Enter the initial temperature: ");
		double initial = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		double finalTemp = input.nextDouble();
		
		double energy = amount * (finalTemp - initial) * 4184;
		
		System.out.println("The energy needed is " + energy);
	}
}
