public class Loops {

	public static void main(String[] args) {
		int x= 0;
				while(x!=5)
				{
					System.out.println("Hello world!");
					x=x+1;
				
		} 
				x= 10; // initial counter’s value is 10
		while ( x>= -10) // check the conditional expression
	    {
			System.out.print( x + " ");
			   x=x-1; // update the counter’s value
			   }
		System.out.println();
				
	   for(int y=20; y>=1; y--) {
	
		   if (y%6 !=0)
			   System.out.print( y + " ");
		   
			}
	   
	   System.out.println();
//using for to computer factorial of natural numbres
	   int fac=1;
	   for(int n=7; n>=1; n--) {
		   
				   fac = fac * n;
	   }
	   
		System.out.print("factorial of 7 is:" + fac);
		
		////////////pattern
		
		for(int j = 0; j<=4 ; j++) {
			for(int i=1; i !=7; i++) {
				System.out.print(i + " ");
			}
		System.out.println();
			
		}
		   
	   

}
}
