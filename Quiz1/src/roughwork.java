public class roughwork {
	public static int f(int n) //problem 4 using recursion 
	{
		if (n == 0 )
			return 2;
		else if(n == 1)
			return 3;
		
		else
			return f(n-1)+f(n-2)+3;
			
	}
	public static void main(String[] args)  //Driver test
    {
	int k =f(7); //problem 4
  	   System.out.println("f(7)=" + k);
    }
	}