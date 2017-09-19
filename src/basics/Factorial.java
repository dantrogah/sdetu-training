package basics;

public class Factorial {

	public static void main(String[] args) {
		
		// 1! = 1
		// 2! = 2 x 1
		// 3! = 3 x 2 x 1
		// 4! = 4 x 3 x 2 x 1
		
		System.out.println(fac(4));
	}
	
	public static int fac(int number){
		
		if(number == 1){
			return 1;
		}
		
		return (number * fac(number-1));
		
	}

}
