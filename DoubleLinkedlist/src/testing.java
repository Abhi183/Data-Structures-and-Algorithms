public class testing {

	public static void main(String[] args) {
		 DLList <Integer> al = new DLList <Integer> ();
		 DDLList2 <Integer> al1 = new DDLList2 <Integer> ();
		 al.insert(100);
	     al.insert(90);
	     al.insert(80);
	     
	     System.out.println(al.currPos());
	     al.moveToEnd();
	     System.out.println(al.getValue());
	     System.out.println(al.currPos());
	     //al.append(110);
	   	 //al.append(120);
	     
	     al.insert(70);
	     al.insert(60);
	   	
	     
	     //al.insert(50);
	     
	     al.print();
       
    System.out.println();
  	 al1.insert(100);
     al1.insert(90);
     al1.insert(80);
     System.out.println(al.currPos());
     al1.moveToEnd();
     System.out.println(al.currPos());
     //al1.append(110);
   	 //al1.append(120);
     
     al1.insert(70);
     al1.insert(60);
   	
     
     //al1.insert(50);
     
     al1.printDList();
    
       
       
	
	}

}



