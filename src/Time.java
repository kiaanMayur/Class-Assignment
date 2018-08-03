/*
 * Time class contains two integers, hours and minutes and it has a service i.e. sum which takes 
 * two time objects and return the result 
 */
public class Time {
	
	private int hours;
	private int minutes;
	
	//setTime() assigns the the value to hours and minutes
	public void setTime(int hours, int minutes) {
		
		this.hours = hours;
		this.minutes = minutes;
	}
	
	//showTime() will display the time 
	public void showTime() {
		System.out.println("Time:\n" + hours + ":" + minutes);
	}
	
	//sum() will calculate the total time 
	public Time sum(Time firstTime, Time secondTime) {
		
		Time temporaryTime = new Time();
		
		if((firstTime.minutes + secondTime.minutes) > 60) {
			temporaryTime.hours = firstTime.hours + secondTime.hours + 1;
			temporaryTime.minutes = firstTime.minutes + secondTime.minutes - 60;
		}
		
		else {
			temporaryTime.hours = firstTime.hours + secondTime.hours;
			temporaryTime.minutes = firstTime.minutes + secondTime.minutes;
		}
		
		return temporaryTime;
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + "]";
	}
}
