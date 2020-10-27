package Ex2;


public class Room {

	String day;
	String start;
	String end;
	double rate;

	public Room() {

	}

	public Room(String d, String s, String e) {
		
		day = d;
		start = s;
		end = e;
		
	}

	public void setDay(String d) {
		
		day = d;
		
	}

	public void setStart(String s) {
		
		start = s;
		
	}

	public void setEnd(String e) {
		
		end = e;
		
	}


	public String getDay() {
		
		return day;
		
	}

	public String getStart() {
		
		return start;
		
	}

	public String getEnd() {
		
		return end;
		
	}

	public static void displayRate() {
		
		System.out.println("Day\tAmount");
		System.out.println("Monday: $100");
		System.out.println("Tuesday: $150");
		System.out.println("Wednesday: $75");
		System.out.println("Thursday: $190");
		System.out.println("Friday: $250\n");
		
	}

	public double calculateRate() {

		if (day.equalsIgnoreCase("Monday")) {
			
			rate = 100.00;
			
		} else if (day.equalsIgnoreCase("Tuesday")) {
			
			rate = 150.00;
			
		} else if (day.equalsIgnoreCase("Wednesday")) {
			
			rate = 75.00;
			
		} else if (day.equalsIgnoreCase("Thursday")) {
			
			rate = 190.00;
			
		}
		if (day.equalsIgnoreCase("Friday")) {
			
			rate = 250.00;
			
		}
		
		return rate;
	}

	
}