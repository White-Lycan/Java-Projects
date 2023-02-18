import java.util.Scanner;

public class Part_4 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		double a = x1 - x2;
		double b = y1 - y2;
		double c = x3 - x4;
		double d = y3 - y4;
		
		double e = (b * x1) - (a * y1);
		double f = (d * x3) - (c * y3);
		
		double V = (b * c) - (a * d);
		
		double X = (((c * e) - (a * f)) / V);
		double Y = (((b * f) - (e * d)) / V);
		
		System.out.println("The intersecting point is " + X + " , " + Y);
	}

}
