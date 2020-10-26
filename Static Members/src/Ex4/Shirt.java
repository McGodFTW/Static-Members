package Ex4;

public class Shirt {
	
	public static final String MATERIAL = "cotton";
	
	double collarSize, sleeveLength;
	
	public Shirt() {
		
	}
	
	public Shirt(double c, double s) {
		
		collarSize = c;
		sleeveLength = s;
		
	}
	
	public void setCollarSize(double c) {
		
		collarSize = c;
		
	}
	
	public void setSleeveLength(double s) {
		
		sleeveLength = s;
		
	}
	
	public double getCollarSize() {
		
		return collarSize;
		
	}
	
	public double getSleeveLength() {
		
		return sleeveLength;
		
	}
	
}
