
public class Recursion {

	public static void main(String[] args) {

      // find the factorial of 5 using the concept of Recursion
		int fact= factorial(5);
		System.out.println("The factorial of 5 is " + fact);
		
	 // f(0)=3; f(n)= 4f(n-1)+1;
	// using recursion, find f(9); 
		int f = function(9);
		System.out.println("F(9)= " + f);
       
		// fib(0) =0, fib(1)=1, and fib(n)= fib(n-1)+fib(n-2)
		// Fibonacci series 
		// find Fibonacci(8)
		int fib=fibonacci(8);
		System.out.println("fibonacci(8)= " + fib);
		
		int g= gcd(12,30);
		System.out.println(g);
	}

	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

	private static int fibonacci(int n ) {
		if(n==0)
		  return 0;
		if(n==1)
		  return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static int function(int n) {
		if(n==0)
			return 3;
		return 4*function(n-1)+1;
	}

	public static int factorial(int n) {
		if(n==0 || n==1)
		   return 1;
		return factorial(n-1)*n;
	}

}
