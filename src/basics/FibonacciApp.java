package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonacci number is defined as the sum of two previous fibonacci numbers
		
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0)
		int num = 3;
		
		System.out.println(fib(num));
	}
	
	public static int fib(int n){
		if(n==0){
			return 0;
		}
		
		if(n==1){
			return 1;
		}
		
		return (fib(n-1) + fib(n-2));
	}

}
