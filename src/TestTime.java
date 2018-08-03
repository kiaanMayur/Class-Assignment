//Class TestTime is used to test the class Time
import java.util.*;
/*class to test the Rectangle class*/
public class TestTime {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// instantiating the objects of Time class
		Time firstTime = new Time();
		Time secondTime = new Time();
		Time resultTime = new Time();
		
		System.out.println("Enter the time:\nEnter the hours: ");
		int firstHours = scanner.nextInt();
		
		System.out.println("Enter the minutes: ");
		int firstMinutes = scanner.nextInt();
		
		System.out.println("Enter the time:\nEnter the hours: ");
		int secondHours = scanner.nextInt();
		
		System.out.println("Enter the minutes: ");
		int secondMinutes = scanner.nextInt();
		
		firstTime.setTime(firstHours, firstMinutes);
		secondTime.setTime(secondHours, secondMinutes);
		
		resultTime = resultTime.sum(firstTime, secondTime);
		System.out.println("Initial time was: " + firstTime);
		System.out.println("\nFinal time was: " + secondTime);
		System.out.println("\nTotal time will be: ");
		resultTime.showTime();

	}

}
