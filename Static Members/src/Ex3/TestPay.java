package Ex3;

import java.util.Scanner;

public class TestPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		double hours;
		
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay(90, 0.13, (Pay.hourly * 90), 791.7);
		Pay p4 = new Pay(47.5, 0.12, (Pay.hourly * 47.5), 168.16);
		
		System.out.println("Employee 1:");
		System.out.println("Please enter the hours worked: ");
		hours = input.nextDouble();
		p1.setHours(hours);
		System.out.println("Please enter the tax rate as a decimal:");
		
		p1.setTaxRate(input.nextDouble());
		//System.out.println("Please enter the gross pay:");
		//p1.setGrossPay((input.nextDouble()));
		p1.setGrossPay(Pay.hourly * hours);
		
		System.out.println("Employee 2:");
		System.out.println("Please enter the hours worked:");
		hours = input.nextDouble();
		p2.setHours(hours);
		p2.setGrossPay(Pay.hourly * hours);
		
		Pay.displayInfo();
		
		System.out.println("Meeting #1:");
		System.out.println("Hours: " + p1.getHours());
		System.out.println("Tax Rate: " + (1  - p1.getTaxRate()));
		System.out.println("Gross Pay: $" + p1.getGrossPay());
		System.out.println("Net Pay: $" + p1.computeNetPay(p1.hours, Pay.hourly,p1.taxRate));
		System.out.println();
		
		System.out.println("Meeting #2");
		System.out.println("Hours: " + p2.getHours());
		System.out.println("Tax Rate: 0.13");
		System.out.println("Gross Pay: $" + p2.getGrossPay());
		System.out.println("Net Pay: $" + p2.computeNetPay(p2.hours, Pay.hourly));
		System.out.println();

		System.out.println("Meeting #3");
		System.out.println("Hours: " + p3.getHours());
		System.out.println("Tax Rate: " + p3.getTaxRate());
		System.out.println("Gross Pay: $" + p3.getGrossPay());
		System.out.println("Net Pay: $" + p3.computeNetPay(p3.hours, Pay.hourly,p3.taxRate));
		System.out.println();

		System.out.println("Meeting #4");
		System.out.println("Hours: " + p4.getHours());
		System.out.println("Tax Rate: " + p4.getTaxRate());
		System.out.println("Gross Pay: $" + p4.getGrossPay());
		System.out.println("Net Pay: $" + p4.computeNetPay(p4.hours, Pay.hourly,p4.taxRate));
		System.out.println();


	}

}
