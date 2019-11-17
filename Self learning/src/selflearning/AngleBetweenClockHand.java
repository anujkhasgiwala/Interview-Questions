package selflearning;

public class AngleBetweenClockHand {
	void calculateAngle(int h, int m) {
		if(h < 0 || m < 0 || h > 12 || m > 60)
			System.out.println("Wrong input");
		
		if(h == 12)
			h = 0;
		if (m == 60)
			m = 0;
		
		int hourAngle = (int) ((h*60 + m)*0.5);
		int minuteAngle = m * 6;
		
		int difference = Math.abs(hourAngle - minuteAngle);
		difference = Math.min(360-difference, difference);
	}
}
