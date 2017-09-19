package basics;

public class NumberCals {
	
	public static void main(String[] args){
		
		int numA = 10, numB = 20;
		
		addNumbers(numA , numB);
		double product = multipleNumbers(numA , numB);
		System.out.println("The product is " + product);
		
	}
	
	static void addNumbers(int numA, int numB){
		int total = numA + numB;
		System.out.println("The sum of " + numA + " and " + numB + " is " + total);
	}
	
	static double multipleNumbers(double numA, double numB){
		System.out.println("Number to be multiplied are " + numA + " and " + numB);
		return numA * numB;
	}
}
