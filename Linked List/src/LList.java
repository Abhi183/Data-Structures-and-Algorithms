

// Linked list implementation
class LList implements List {
   private Link head;         // Pointer to list header
   private Link tail;         // Pointer to last element
   private Link curr;         // Access to current element
   private int listSize;      // Size of list

   // Constructors
   LList(int size) { this(); }     // Constructor -- Ignore size
   LList() { clear(); }

   // Remove all elements
   public void clear() {
      curr = tail = new Link(null); // Create trailer
      head = new Link(tail);        // Create header
      listSize = 0;
   }
   
   // Insert "it" at current position
   public boolean insert(Object it) {
      curr.setNext(new Link(curr.element(), curr.next()));
      curr.setElement(it);
      if (tail == curr) tail = curr.next();  // New tail
      listSize++;
      return true;
   }
   
   // Append "it" to list
   public boolean append(Object it) {
      tail.setNext(new Link(null));
      tail.setElement(it);
      tail = tail.next();
      listSize++;
      return true;
   }

   // Remove and return current element
   public Object remove () {
      if (curr == tail) 
         return null;          // Nothing to remove
      Object it = curr.element();             // Remember value
      curr.setElement(curr.next().element()); // Pull forward the next element
      if (curr.next() == tail) tail = curr;   // Removed last, move tail
      curr.setNext(curr.next().next());       // Point around unneeded link
      listSize--;                             // Decrement element count
      return it;                              // Return value
   }

   public void moveToStart() { curr = head.next(); } // Set curr at list start
   public void moveToEnd() { curr = tail; }          // Set curr at list end

   // Move curr one step left; no change if now at front
   public void prev() {
      if (head.next() == curr) 
         return; // No previous element
      Link temp = head;
      // March down list until we find the previous element
      while (temp.next() != curr) temp = temp.next();
      curr = temp;
   }

   // Move curr one step right; no change if now at end
   public void next() { 
      if (curr != tail) curr = curr.next(); }

   public int length() { 
      return listSize; } // Return list length


   // Return the position of the current element
   public int currPos() {
      Link temp = head.next();
      int i;
      for (i=0; curr != temp; i++)
         temp = temp.next();
      return i;
   }
   
   // Move down list to "pos" position
   public boolean moveToPos(int pos) {
      if ((pos < 0) || (pos > listSize)) 
         return false;
      curr = head.next();
      for(int i=0; i<pos; i++) curr = curr.next();
      return true;
   }

   // Return true if current position is at end of the list
   public boolean isAtEnd() { 
      return curr == tail; }

   // Return current element value. Note that null gets returned if curr is at the tail
   public Object getValue() {
      return curr.element();
   } // reverse the list elements 
 /*  public void  reverse() {
      
       
      Link cur3,cur1= head.next();
       //new_head= tail, new_tail=head;
      Link cur2= cur1.next();
      cur1.setNext(head);
     
      while (cur2.next() != null)
      {
         cur3=cur2.next();
         cur2.setNext(cur1);
         cur1= cur2;
         cur2=cur3;
      }
      tail =head;
      tail.setNext(null);
      head= cur2;
      head.setNext(cur1);
     
   }*/
   
// Return the position of the element
   public int find_element(Object it){
      Link temp = head.next();
   // March down list until we find the previous element
      for(int i = 0; i<listSize; i++){
         if(temp.element()== it)
            return i;
         temp = temp.next();
       
      }
    // if element is not found
      return -1;
   }
   
   public  boolean is_sorted(LList list){

	   for (int i =0; i< list.listSize-1; i++){
		   list.moveToPos(i);
       int a = (int) list.getValue();
       list.moveToPos(i+1);
       int b = (int) list.getValue();
	   if (a > b) {

	   return false;

	   }}

	   return true;

	   }
   
   public boolean repeated_twice(Object it){
		int counter = 0;
		Link temp= head.next();
		while ( temp != tail)
		{
			if (temp.element().equals(it))
				counter++;
			temp=temp.next();
		}
		if (counter >= 1)
			return true;
		else
			return false;		
	}

    

   public void printLList(){
      Link temp = head.next();
      for (int i=0; i<length(); i++){
         System.out.print(temp.element() + " ");
         temp=temp.next();
      }
   }
   
   // Return the position of the element
   /*public int find(Object it) {
	   return find(it, head.next(), 0);
	   
   }
   private int find(Object it, Link cur_pos, int i) {
	   if(cur_pos.element()==it)
		   return i;
	   else if (cur_pos.next() != null)
	   {
		   i++;
		   return find(it, cur_pos.next(), i);
	   }
	   else 
		   return -1;
  
   }*/
 public  boolean lists_are_equal(LList list1,LList list2) {
 

   Link temp1 = list1.head;
   Link temp2 = list2.head;

   while (temp1!=null&&temp2!=null){

   	if (temp1.element()==temp2.element()){
   	    temp1= temp1.next();
   	    temp2= temp2.next();   		
   		
   	}
   	else
   		return false;
 
   }

return true;

 }

   	
   
   public void reverse(){
		Link cur3,cur1 = head.next();
		Link cur2 = cur1.next();
		cur1.setNext(head);
		
		while(cur2.next() != null){
			cur3 = cur2.next();
			cur2.setNext(cur1);
			cur1 = cur2;
			cur2 = cur3;
		}
		tail = head;
		tail.setNext(null);
		head = cur2;
		head.setNext(cur1);
	     }
	  public int find_rec(Object it){
		return find_rec(it,head.next(),0);	
	}

	private int find_rec(Object it,Link a, int i){
		if(a.element() == it){
			return i;
		}
		else if(a.element() != it && i < listSize){
			return find_rec(it, a.next(), i + 1);
		}
		else{
			return -1; 
	 	  
   }


	}


}
