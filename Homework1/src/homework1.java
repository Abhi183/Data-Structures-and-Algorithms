// written by: Abhishek Shekhar

public class homework1 {
	public static int search(int [] arr, int i, int x) //Problem 1(linear search)
	{
		if (i >= arr.length)
			return -1;
		
        if (arr[i]== x)
        	return i;
		         
		 
		return search(arr,i+1,x);
		         
		         
		      
		   
		   
		
	}
	
	public static int find_min(int [] d, int i) //Problem 2
	{
		if (i == d.length-1)
	        return d[i];
		
		int min = find_min(d, i+1);
		if (d[i]< min)
			return d[i];
		else
			return min;
	       
		
	}
	public static boolean is_symm(int[] nums) //Problem 3a
	{
	    int length = nums.length;
	    for(int i = 0; i < length/2; i++) {
	        if(nums[i] != nums[length - i - 1])
	        	return false;
	    }
	    return true;
	}
	
	public static boolean is_symmetry(int[] nums, int i, int n) //Problem 3b using recursion
	{
		
	   if ( i > n/2)
			return true;
	   else if (nums[i] != nums[n-i-1] && i<n/2)
		   return false;
	   
	   else
		   return is_symmetry(nums,i+1,n);
	   
	      
	}
	
	public static int f(int n) //problem 4 using recursion 
	{
		if (n == 0 )
			return 3;
		else if(n == 1)
			return 1;
		
		else
			return f(n-1)*f(n-2)+1;
			
	}
	

	public static void main(String[] args)  //Driver test
    {
       int a[] = {1,4,4,43,1};
        
      
       int z = 3;
       int index = search(a, 0, z); //linear search
       
       int b = find_min(a,0); //for problem 2
       System.out.println("The minimum element in the array is " + b);
       
       boolean c = is_symm(a); // problem 3a
       System.out.println("The array is Symmetry:" + c);
       
       boolean e = is_symmetry(a,0,a.length); // problem 3b
       System.out.println("The array is Symmetry:" + e);
       
       if (index != -1)
         System.out.println("Element " + z + " is present at index " +
                                                index);
      else
          System.out.println("Element " + z + " is not present");
       
       
          int k =f(7); //problem 4
    	   System.out.println("f(7)=" + k);
       }
       
	

}
