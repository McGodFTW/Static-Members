package Ex1;

import java.util.Scanner;

public class TestCheckup {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Checkup c1 = new Checkup();
		
		System.out.println("What's your patient number");
		c1.setPNum(input.nextInt());
		
		System.out.println("What is your LDL figure");
		c1.setLDL(input.nextDouble());
		
		System.out.println("What is your HDL figure");
		c1.setHDL(input.nextDouble());
		
		System.out.println("What is your systolic figure");
		c1.setSystolic(input.nextInt());
		
		System.out.println("What is your diastolic figure");
		c1.setDiastolic(input.nextInt());
		
		Checkup c2 = new Checkup(1234567, 130, 150, 9, 3.2);
		Checkup c3 = new Checkup(1243577, 150, 210, 21, 4);
		Checkup c4 = new Checkup(1254787, 134, 90, 12, 4);
		
		System.out.println(Checkup.NAME);
		Checkup.ExplainRatio();
		System.out.println();
		
		System.out.println("Patient: " + c1.getPNum());
		System.out.println("LDL: " + c1.getLDL());
		System.out.println("HDL: " + c1.getHDL());
		System.out.println("Ratio: "  + c1.computeRatio());
		System.out.println("Systolic: " + c1.getSystolic());
		System.out.println("Diastolic: " + c1.getDiastolic());
		System.out.println();
		
		System.out.println("Patient: " + c2.getPNum());
		System.out.println("LDL: " + c2.getLDL());
		System.out.println("HDL: " + c2.getHDL());
		System.out.println("Ratio: "  + c2.computeRatio());
		System.out.println("Systolic: " + c2.getSystolic());
		System.out.println("Diastolic: " + c2.getDiastolic());
		System.out.println();
		
		System.out.println("Patient: " + c3.getPNum());
		System.out.println("LDL: " + c3.getLDL());
		System.out.println("HDL: " + c3.getHDL());
		System.out.println("Ratio: "  + c3.computeRatio());
		System.out.println("Systolic: " + c3.getSystolic());
		System.out.println("Diastolic: " + c3.getDiastolic());
		System.out.println();
		
		System.out.println("Patient: " + c4.getPNum());
		System.out.println("LDL: " + c4.getLDL());
		System.out.println("HDL: " + c4.getHDL());
		System.out.println("Ratio: "  + c4.computeRatio());
		System.out.println("Systolic: " + c4.getSystolic());
		System.out.println("Diastolic: " + c4.getDiastolic());
		System.out.println();
	
		
	}

}
