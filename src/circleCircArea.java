import java.util.Scanner;

public class circleCircArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double radiusInput = 0;
		boolean error = true;
		
		do {
			try {
				System.out.println("Please enter a radius: ");
				radiusInput = scan.nextDouble();
			} catch (Exception e) {
				System.out.println("This is not a valid input.");
				error = false;
			} 
		} while (!error);
		
		Circle radius = new Circle(radiusInput);
		
		System.out.println(radius.getFormattedCircumgerence());
		System.out.println(radius.getFormattedArea());
		
		
		scan.close();
	}
	
	
	
}
