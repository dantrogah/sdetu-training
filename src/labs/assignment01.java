package labs;

public class assignment01 {

	public static void main(String[] args) {
		
		//System.out.println(getSum(1));
		
		int[] numbers = {2,4,6,8,10, 12};
		
		System.out.println(getMinimum(numbers));
		
		System.out.println(getMaximum(numbers));
		
		System.out.println(getAverage(numbers));
		
		
	}
	
	// A function that takes a value n returns the sum of numbers 1 to n
	public static int getSum(int n){
		if(n==1){
			return 1;
		}
		return (n + getSum(n-1));
	}
	
	// A function that computes the factorial value
	public static int factorial(int number){
		
		if(number == 1){
			return 1;
		}
		
		return (number * factorial(number-1));
		
	}
	
	// Write 3 functions that take an array as a parameter and
	// return the minimum, average, and maximum values of that array.
	
	// function that return the minimum value in an array
	public static int getMinimum(int[] myArray){
		
		int temp = myArray[0];
		
		for(int i=1; i< myArray.length; i++){
			if(myArray[i] < temp){
				temp = myArray[i];
			}
		}
		
		return temp;
	}

	// function that return the maximum value in an array
		public static int getMaximum(int[] myArray){
			
			int temp = myArray[0];
			
			for(int i=1; i< myArray.length; i++){
				if(myArray[i] > temp){
					temp = myArray[i];
				}
			}
			
			return temp;
		}

	// function that return the average of elements in an array
		public static double getAverage(int[] myArray){
			int sum=0;
			for(int i=0; i< myArray.length; i++){
				sum += myArray[i];
			}
			
			return (double)sum/(double)myArray.length;
		}
}
