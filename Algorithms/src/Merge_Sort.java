import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Merge_Sort{
	
	public static void merge(long[] a, int start, int mid, int end) {
	int temp[] = new int[end - start + 1];
	int i = start;
	int j = mid+1;
	int k = 0;
	while(i <= mid && j <= end) {
		if(a[i] <= a[j]) {
			temp[k] = (int) a[i];
			k++;
			i++;
		}
		else {
			temp[k] = (int) a[j];
			k++;
			j++;
		}
	}

	while(i <= mid) {
		temp[k] = (int) a[i];
		k++; 
		i++;
	}
	while(j <= end) {
		temp[k] = (int) a[j];
		k++;
		j++ ;
	}

	for(i = start; i <= end; i += 1) {
		a[i] = temp[i - start];
	}
}

    public static void mergeSort(long[] a, int start, int end) {
    	
    	if(start < end) {
    		int mid = (start + end) / 2;
		    mergeSort(a, start, mid);
		    mergeSort(a, mid+1, end);
		    merge(a, start, mid, end);
	}
}

	
	public static void main(String[] args) throws IOException {

	
	    FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object
        System.out.println("Opening file........");
        fileByteStream = new FileInputStream("Random_array.txt");
        inFS = new Scanner(fileByteStream);
        long[] a= new long[1000];
        for (int i = 0 ; i<a.length; i++){
            a[i] = inFS.nextLong();
        }
        double startTime = System.currentTimeMillis();
        
        
        mergeSort(a, 0, a.length-1);
        
        double estimated_time = System.currentTimeMillis() - startTime ;
        System.out.println(estimated_time);

        
        fileByteStream.close();
        inFS.close();
    
    	
       }       
    }


