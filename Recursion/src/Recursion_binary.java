
public class Recursion_binary{

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
		
		int [] a= {3,7,9,15,0,2};
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
		System.out.println();
		arrayReverseRec(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		int [] b= { 1,4,5,7,9,15};
		int index_x = binary_search_rec(b,9); 
		System.out.println(index_x);
		
	}

	public static int binary_search_rec(int[] b, int i) {
		return binary_search_rec(b,i,0,b.length-1);
	}

	private static int binary_search_rec(int[] a, int x, int start, int end) {
		int mid= (start+end)/2;
		if (a[mid]==x)
			return mid;
		else if (a[mid]>x && start < end)
			return binary_search_rec(a, x, start, mid-1);
		else if (a[mid]<x && start <end)
		   	 return binary_search_rec(a, x, mid+1, end);
		else
			return -1;

	}

	public static void arrayReverseRec(int[] a) {
		reverse_rec(a,0,a.length-1);

		
	}

	private static void reverse_rec(int[] a, int start, int end) {
		if (start<end)
		{
			int temp = a[start];
			a[start]= a[end];
			a[end]= temp;
			reverse_rec(a,++start,--end);
		}
		
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
