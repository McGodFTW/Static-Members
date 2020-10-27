package Ex2;

import java.util.Scanner;

public class TestRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		
		Room m1 = new Room();
		Room m2 = new Room();
		Room m3 = new Room("Thursday", "1:00 pm", "9:45 pm");
		Room m4 = new Room("Wednesday", "6:15 pm", "11:00 pm");

		System.out.println("Meeting 1:");
		System.out.println("Please enter a weekday: ");
		m1.setDay(input.next());

		System.out.println("Please enter a start time (Ie. 6:00 pm): ");
		m1.setStart(input.next());

		System.out.println("Please enter an end time (Ie. 10:00 pm): ");
		m1.setEnd(input.next());

		System.out.println("Meeting 2");
		System.out.println("Please enter a weekday: ");
		m2.setDay(input.next());

		System.out.println("Please enter a start time (Ie. 6:00 pm): ");
		m2.setStart(input.next());

		System.out.println("Please enter an end time (Ie. 10:00 pm): ");
		m2.setEnd(input.next());

		System.out.println("Rates");
		Room.displayRate();

		System.out.println("Meeting #1");
		System.out.println("Day: " + m1.getDay());
		System.out.println("Start: " + m1.getStart());
		System.out.println("Finish: " + m1.getEnd());
		System.out.println("Cost: $" + m1.calculateRate());
		System.out.println();

		System.out.println("Meeting #2");
		System.out.println("Day: " + m2.getDay());
		System.out.println("Start: " + m2.getStart());
		System.out.println("Finish: " + m2.getEnd());
		System.out.println("Cost: $" + m2.calculateRate());
		System.out.println();

		System.out.println("Meeting #3");
		System.out.println("Day: " + m3.getDay());
		System.out.println("Start: " + m3.getStart());
		System.out.println("Finish: " + m3.getEnd());
		System.out.println("Cost: $" + m3.calculateRate());
		System.out.println();


		System.out.println("Meeting #4");
		System.out.println("Day: " + m4.getDay());
		System.out.println("Start: " + m4.getStart());
		System.out.println("Finish: " + m4.getEnd());
		System.out.println("Cost: $" + m4.calculateRate());
		System.out.println();

	}

}
