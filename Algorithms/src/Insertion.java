import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Insertion {
	public static void Sort(long array[]) {
	    for (int j = 1; j < array.length; j++) {
	        long temp = array[j];
	        int i = j-1;
	        while ((i > -1) && (array[i] > temp)) {
	            array[i+1] = array[i];
	            i--;
	        }
	        array[i+1] = temp;
	    }
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//int []a= {5,2,9,4,7,11};
		//Sort(a);
		//for (int k = 0; k < a.length; k++){
			
			//System.out.print(a[k] + " " );
	//}
	
	    FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object
        System.out.println("Opening file");
        fileByteStream = new FileInputStream("Random_array.txt");
        inFS = new Scanner(fileByteStream);
        long[] a= new long[10];
        for (int i = 0 ; i<a.length; i++){
            a[i] = inFS.nextLong();
        }
        double startTime = System.currentTimeMillis();
        
        
        Sort(a);
      for (int k = 0; k < a.length; k++){
       System.out.print(a[k] + " " );
        
        
      }
        double estimated_time = System.currentTimeMillis() - startTime ;
        System.out.println(estimated_time);
        
        
        fileByteStream.close();
    
        
        
         
         
	
	
	
}
}

