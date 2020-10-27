package Ex3;

public class Pay {

	double hours;
	double taxRate;
	double grossPay;
	double netPay;

	static final double hourly = 18.20;


	public Pay() {

	}

	public Pay(double h, double t, double g, double n) {
		
		hours = h;
		taxRate = t;
		grossPay = g;
		netPay = n;
		
	}


	public void setHours(double h) {
		
		hours = h;
		
	}

	public void setTaxRate(double t) {
		
		taxRate = t;
		
	}

	public void setGrossPay(double g) {
		
		grossPay = g;
		
	}

	public void setNetPay(double n) {
		
		netPay = n;
		
	}

	public double getHours() {
		
		return hours;
		
	}

	public double getTaxRate() {
		
		return taxRate;
		
	}

	public double getGrossPay() {
		
		return grossPay;
		
	}

	public double getNetpay() {
		
		return netPay;
		
	}

	public double computeNetPay(double hours, double hourly, double taxRate) {
		taxRate = (1 - taxRate);
		netPay = (hours * hourly); 
		netPay *= taxRate;

		return netPay;
		
	}

	public double computeNetPay(double hours, double hourly) {
		
		netPay = (hours * hourly) * 0.87;

		return netPay;
		
	}

	public static void displayInfo() {
		
		System.out.println("Summerhill's No Frills");
		System.out.println("Bi-Weekly:");
		System.out.println();

	}

}
