package Palantir;

import java.util.*;

public class DetectingFraud {
	
	static class Combination{
		int lineNumber;
		long invoice;
		Combination(int x, long y){
			this.lineNumber = x;
			this.invoice = y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int job = sc.nextInt();
		String[] jobs = new String[job];
		for(int i = 0; i< job; i++) {
			jobs[i] = sc.next();
		}
		
		findViolations(jobs);
	}
	
	static String[] findViolations(String[] datafeed) {

		List<String> violations = new LinkedList<String>();

		long min = Long.MIN_VALUE;

		Map<String, Combination> jobEvents = new HashMap<>();

		int lines = 1;

		for(String data : datafeed){

			String[] input = data.split(";");

			if(input[1].equals("START")){

				jobEvents.put(input[0], new Combination(lines, min));
			}else{

				String[] invoices = input[1].split(",");
				if(invoices.length == 1){
					Combination entry = jobEvents.get(input[0]);
					if(Long.parseLong(invoices[0]) < entry.invoice){
						String fraud = "" + entry.lineNumber + ";" + input[0] + ";" + "SHORTENED_JOB";
						violations.add(fraud);
					}else{
						min = Long.parseLong(invoices[0]);
					}
				}else{
					 Combination entry = jobEvents.get(input[0]);
	                    boolean fraud = false;
	                    long minFraud = Long.MIN_VALUE;
	                    for(String invoice : invoices){
	                        if(Long.parseLong(invoice) < entry.invoice){
	                            fraud = true;
	                            break;
	                        }
	                        if (Long.parseLong(invoice) > minFraud) {
	                            minFraud = Long.parseLong(invoice);
	                        }
	                    }
	                    if(fraud){
	                        String fraud1 = "" + lines + ";" + input[0] + ";" + "SUSPICIOUS_BATCH";
	                        violations.add(fraud1);
	                    }else{
	                        min = minFraud;
	                    }
				}
			}

			lines++;

		}

		return violations.toArray(new String[violations.size()]);
	}
}
