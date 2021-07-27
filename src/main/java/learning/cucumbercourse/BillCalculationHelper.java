package learning.cucumbercourse;

import java.util.Locale;

public class BillCalculationHelper {
		
	public static double CalculateBillForCustomer(double billAmount, double taxRate) {
		
		double finalBillAmount = billAmount + (billAmount * taxRate/100);
		
		String result = String.format(Locale.US, "%.2f", finalBillAmount);
		
		return Double.parseDouble(result);
	}

}
