import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Quicksort {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		
	    FileInputStream fileByteStream = null; 
        Scanner inFS = null;                   
        System.out.println("Working...");
        fileByteStream = new FileInputStream("Random_array.txt");
        inFS = new Scanner(fileByteStream);
        long[] a= new long[1000000];
        for (int i = 0 ; i<a.length; i++){
            a[i] = inFS.nextLong();
        }
		double startTime = System.currentTimeMillis();
		quicksort(a, 0, (a.length-1));
		for(int k=0; k<100; k++) {
			System.out.print(a[k] + " ");
		}
		
		
	    double estimated_time = System.currentTimeMillis() - startTime ;
	    System.out.println(estimated_time);
	    System.out.println("Complete");
	    fileByteStream.close();
	    
	}
	public static void quicksort(long[] a, int low, int high) {

		int middle = low + (high - low) / 2;
		int pivot = (int) a[middle];
 
		int i = low, j = high;
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
 
			while (a[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				long temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quicksort(a, low, j);
 
		if (high > i)
			quicksort(a, i, high);
	}
}
		
	/* private static void quicksort(long []a, int start, int end) {
		int x = partition(a,start,end);
		if (start<x-1) {
			
			quicksort(a, start, x-1);
		}
		if (end > x+1) {
			quicksort (a, x+1, end);
			}
	}

	private static int partition(long[] a, int start, int end) {
		int pivot = (int)a[end];
		int j = start;
		for (int i=start; i<=end; i++) {
			if (a[i] < pivot) {
				int temp = (int)a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;}
		}
		int temp = (int)a[j];
		a[j] = pivot;
		a[end] = temp;		
		return j;
	}
	 public static void print(int[] a) {
		   for (int i=0; i<a.length; i++)
			   System.out.print(a[i] + " ");
		   System.out.println();
	 } */

