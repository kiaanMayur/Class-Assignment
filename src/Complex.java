/*class which has instance members as real and complex
behaviours: display the complex number, sum of two complex number*/
public class Complex {
	
	private float real;
	private float imaginary;
	
	public void set(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	//method to display the complex number ( a + ib) 
	public void disp() {
		
		System.out.println("The complex number is: " + real + "i" + imaginary);
	}
	
	//method to add two complex number
	public Complex sum(Complex number, Complex number_2) {
		
		Complex sum = new Complex();
		
		sum.real = number.real + number_2.real;
		sum.imaginary = number.imaginary + number_2.imaginary;
		
		return sum;	
	}

	public float getReal() {
		return real;
	}

	public float getImaginary() {
		return imaginary;
	}

}
