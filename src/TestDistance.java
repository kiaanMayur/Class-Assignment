import java.util.Scanner;

/*class to test the Distance class*/
public class TestDistance {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// instantiating the objects of Distance class
		Distance initial = new Distance();
		Distance finall = new Distance();
		Distance totalDistance = new Distance();
		
		System.out.println("Enter the distance in feet and inches:\nFeet: ");
		int initialFeet = scanner.nextInt();
		
		System.out.println("Inches: ");
		float initialInches = scanner.nextFloat();
		
		System.out.println("Enter the distance in feet and inches:\nFeet: ");
		int finalFeet = scanner.nextInt();
		
		System.out.println("Inches: ");
		float finalInches = scanner.nextFloat();
		
		initial.setValue(initialFeet, initialInches);
		finall.setValue(finalFeet, finalInches);
		
		totalDistance = finall.add(initial, finall);
		
		System.out.println("The total distance from " + initial + " and " + finall + " is: " + totalDistance);
		
	}

}
