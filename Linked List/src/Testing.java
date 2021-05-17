public class Testing {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		LList al = new LList();
		LList al1 = new LList();
		
		
		 al.insert(100);
	     al.insert(90);
	     al.insert(80);
	     al.moveToEnd();
	     al.append(110);
	   	 al.append(120);
	     
	     al.insert(70);
	     //al.insert(60);
	   	
	     
	     //al.insert(50);
	     
	     al.printLList();

	}

}