
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		//System.out.println(a[2]);
		//System.out.println(a);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
		
		for(int i =0; i<a.length;i++)
			a[i]=2*i+1;
		
		System.out.println();
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		
		int[] b = new int[3];
		for(int i=0;i<b.length;i++)
			System.out.print(b[i] + " ");
		System.out.println("The length of b is "+ b.length);
		
		b[1]= 20;
		for(int i=0;i<b.length;i++)
			System.out.print(b[i] + " ");
	    System.out.println("The length of b is "+ b.length);
	    
	    b=a;
	    for(int i=0;i<b.length;i++)
			System.out.print(b[i] + " ");
	    System.out.println("The length of b is "+ b.length);
	    
	    int a_sum= array_sum(a);
        System.out.println("The summation of array elments of a is "+ a_sum);
        
        int min = find_min(a);
        System.out.println("The minimum element in the array is  "+ min);
        
        int max = find_max(a);
        System.out.println("The maximum element in the array is " + max);
        
        double average = find_av(b);
        System.out.println("The average of the elements in the array is " + average);
        
        int[]c = {3,6,1,7,10,8,12,2};
        int index = linear_search(c,4);
        System.out.println("The element you are looking has index " + index);
  
        
	}
	public static int linear_search(int[] a, int x) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<a.length; i++) 
			if (x == a[i])
				return i;
		return -1;
	}
	public static double find_av(int[] b) {
		// TODO Auto-generated method stub
		
		return array_sum(b)/b.length;
	}
	public static int find_max(int[] a) {
		// TODO Auto-generated method stub
		int max = a[0];
		for (int i=1; i<a.length; i++)
			if (a[i]>max)
				max = a[i];
		return max;
	}
	public static int array_sum( int [] c)
	{
	 int sum=0;
	 for(int i=0; i<c.length;i++)
		 sum= sum+c[i];
	 return sum;
	}
	public static int find_min(int [] d)
	{
		int min = d[0];
		for (int i=1; i<d.length; i++)
			if (d[i]<min)
				min = d[i];
		return min;
	}
	
	

}  
