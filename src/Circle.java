import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle {
		private double radius;
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		public Circle (double radiusInput) {

			radius = radiusInput;

		}

		public double getCircumference() {
			return 2 * Math.PI * radius;
		}
		
		public String getFormattedCircumgerence() {
			 
			return "Circumference: " + formatter.format(getCircumference());
			
		}

		public double getArea() {
			return Math.PI * radius;
			
		}
		
		public String getFormattedArea() {
			return "Area: " + formatter.format(getArea());
			
		}

}
