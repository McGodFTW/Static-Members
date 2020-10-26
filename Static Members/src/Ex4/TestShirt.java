package Ex4;

import java.util.Scanner;

public class TestShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Shirt s1 = new Shirt();
		Shirt s2 = new Shirt();
		Shirt s3 = new Shirt();
		
		Shirt s4 = new Shirt(12, 14);
		Shirt s5 = new Shirt(13, 19);
		
		System.out.println("Enter Collar Size");
		s1.setCollarSize(input.nextDouble());
		System.out.println("Enter Sleeve Size");
		s1.setSleeveLength(input.nextDouble());
		
		System.out.println("Enter Collar Size");
		s2.setCollarSize(input.nextDouble());
		System.out.println("Enter Sleeve Size");
		s2.setSleeveLength(input.nextDouble());
		
		System.out.println("Enter Collar Size");
		s3.setCollarSize(input.nextDouble());
		System.out.println("Enter Sleeve Size");
		s3.setSleeveLength(input.nextDouble());
		
		System.out.println("Shirt #1");
		System.out.println("Collar Size: " + s1.getCollarSize());
		System.out.println("Sleeve Size: " + s1.getSleeveLength());
		System.out.println();
		
		System.out.println("Shirt #2");
		System.out.println("Collar Size: " + s2.getCollarSize());
		System.out.println("Sleeve Size: " + s2.getSleeveLength());
		System.out.println();
		
		System.out.println("Shirt #3");
		System.out.println("Collar Size: " + s3.getCollarSize());
		System.out.println("Sleeve Size: " + s3.getSleeveLength());
		System.out.println();
		
		System.out.println("Shirt #4");
		System.out.println("Collar Size: " + s4.getCollarSize());
		System.out.println("Sleeve Size: " + s4.getSleeveLength());
		System.out.println();
		
		System.out.println("Shirt #5");
		System.out.println("Collar Size: " + s5.getCollarSize());
		System.out.println("Sleeve Size: " + s5.getSleeveLength());
		System.out.println();
		
	}

}
