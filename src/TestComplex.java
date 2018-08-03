import java.util.*;

/*class to test the complex class*/
public class TestComplex {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
//		instantiating the objects of complex class
		Complex complexNumber = new Complex();
		Complex complexNumber2 = new Complex();
		Complex resultantComplexNumber = new Complex();
		
		System.out.println("Enter the complex number I: \n\nEnter the real part of the complex number: ");
		int C_real = scanner.nextInt();
		System.out.println("Enter the imaginary part of complex number: ");
		int C_imaginary = scanner.nextInt();
		
		System.out.println("Enter the complex number II: \n\nEnter the real part of the complex number: ");
		int C_real2 = scanner.nextInt();
		System.out.println("Enter the imaginary part of complex number: ");
		int C_imaginary2 = scanner.nextInt();
		
		complexNumber.set(C_real, C_imaginary);
		complexNumber2.set(C_real2, C_imaginary2);
		
		resultantComplexNumber = resultantComplexNumber.sum(complexNumber, complexNumber2);
		
		System.out.println("Summation of " + complexNumber.getReal() + "+ i" + complexNumber.getImaginary() + " and " + complexNumber2.getReal() + "+ i" + complexNumber2.getImaginary() + " is " + resultantComplexNumber.getReal() + "+ i" + resultantComplexNumber.getImaginary());
		
		}
}
