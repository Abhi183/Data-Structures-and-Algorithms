import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//import java.io.FileInputStream;
//import java.util.*;
public class Selection {

	public static void main(String[] args) throws IOException {
		FileInputStream fileByteStream = null; 
        Scanner inFS = null;    
        System.out.println("Working...");
        fileByteStream = new FileInputStream("Sorted_Decreasing_array.txt");
        inFS = new Scanner(fileByteStream);
        long[] a= new long[1000000];
        for (int i = 0 ; i<a.length; i++){
            a[i] = inFS.nextLong();
        }
	    double startTime = System.currentTimeMillis();
	    selection_sort(a);
	    double estimated_time = System.currentTimeMillis() - startTime ;
	    System.out.println("Complete");
	    System.out.println(estimated_time);
	    fileByteStream.close();
	    inFS.close();
	    
	}
	
	private static void selection_sort(long[] a) {
		for (int i=0; i<a.length-1;i++) {
			int min_index = i;
			for (int j=i+1; j<a.length;j++) {
				if (a[j] < a[min_index])
					min_index=j;}
			long temp = a[i];
			a[i] = a[min_index];
			a[min_index] = temp;}
		
	}

}
