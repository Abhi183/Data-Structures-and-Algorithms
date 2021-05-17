
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AStack as= new AStack();
		LStack ls= new LStack();
/*
		as.push(20);
		as.push(30);
		as.push(50);
		as.push(70);
		as.push(80);
		as.pop();
		int x= (int) as.topValue();
		int length = as.length();

		ls.push(20);
		ls.push(30);
		ls.push(50);
		ls.push(70);
		ls.push(80);
		ls.pop();
		@SuppressWarnings("unused")
		int xl= (int) as.topValue();
		@SuppressWarnings("unused")
		int lengthl = as.length();
		System.out.print(as.find_x(10)); */
		
		as.push(3);

		as.push(7);

		as.push(1);

		as.push(15);

		as.pop();

		as.pop();

		as.push(15);
		System.out.print(as.length());

	}

}
