
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AList<Integer> al = new AList<Integer>();
		AList<Integer> al1 = new AList<Integer>(5);
		
		al.insert(20);
		al.insert(30);
		al.append(100);
		al.insert(40);
		al.insert(50);
		System.out.println(al.length());
		System.out.println(al.currPos());
		al.next();
		al.next();		
		System.out.println(al.currPos());
		al.insert(70);
		al.prev();
		al.remove();
		al.print();
        System.out.println(is_sorted(al));
	}
}
