package P622;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String currentTime = s.next();
		int a = s.nextInt();
		/*int h = Integer.parseInt(currentTime.split(":")[0]);
		int m = Integer.parseInt(currentTime.split(":")[0]);*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Calendar c = Calendar.getInstance();
		try { 
			c.setTime(sdf.parse(currentTime));
		} catch(ParseException pe) {
			pe.printStackTrace();
		}
		c.add(Calendar.MINUTE, a);
		String newTime = sdf.format(c.getTime());
		System.out.println(newTime);
	}
}
