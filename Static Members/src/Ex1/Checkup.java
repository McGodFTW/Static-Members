package Ex1;

public class Checkup {
	
	int pNum, systolic, diastolic;
	double LDL, HDL;
	
	public static final String NAME = "Health Clinic";
	
	public Checkup() {
		
		
		
	}
	
	public Checkup(int p, int s, int d, double l, double h) {
		
		pNum = p;
		systolic = s;
		diastolic = d;
		LDL = l;
		HDL = h;
		
	}
	
	public void setPNum(int p) {
		
		pNum = p;
		
	}
	
	public void setSystolic(int s) {
		
		systolic = s;
		
	}
	
	public void setDiastolic(int d) {
		
		diastolic = d;
		
	}
	
	public void setLDL(double l) {
		
		LDL = l;
		
	}
	
	public void setHDL(double d) {
		
		HDL = d;
		
	}
	
	public int getPNum() {
		
		return pNum;
		
	}
	
	public int getSystolic() {
		
		return systolic;
		
	}
	
	public int getDiastolic() {
		
		return diastolic;
		
	}
	
	public double getLDL() {
		
		return LDL;
		
	}	
	
	public double getHDL() {
		
		return HDL;
		
	}
	
	public double computeRatio() {
		
		double ratio = LDL/HDL;
		return ratio;
	}
	
	public static void ExplainRatio() {
		
		System.out.println("LDL is known as “good cholesterol”. A ratio of 3.5 or lower is considered optimum");
		
	}
	

}
