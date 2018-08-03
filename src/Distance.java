/*instance members -> feet, inches
behaviours -> display the distance, addind two distance*/
public class Distance {
	
	private int feet;
	private float inches;
	
	public void setValue(int feet, float inches) {
		
		this.feet = feet;
		this.inches = inches;
	}
	
	//displaying the distance
	public void display() {
		
		System.out.println("Tht total distance is; " + feet + " and " + inches);
	}
	
	//adding two distances
	public Distance add(Distance initial, Distance finall) {
		
		Distance temporaryDistance = new Distance();
		
		if((initial.inches + finall.inches) > 12.0f) {
			
			temporaryDistance.feet = initial.feet + finall.feet + 1;
			temporaryDistance.inches = initial.inches + finall.inches - 12.0f;
		}
		
		else {
			
			temporaryDistance.feet = initial.feet + finall.feet;
			temporaryDistance.inches = initial.inches + finall.inches;
		}
		
		return temporaryDistance;
	}

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}

}
