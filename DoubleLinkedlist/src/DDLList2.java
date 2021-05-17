class DDLList2<E> implements List<E> {
   private Link<E> head;      // Pointer to list header
  
   private Link<E> curr;      // Access to current element
   private int listSize;      // Size of list

  // Constructors
   DDLList2(int size) { this(); }    
   DDLList2() { clear(); }

  // Remove all elements
   public void clear() {     
    
      head = new Link<E>(null,null);
      curr = head;        
      listSize = 0;
   }
  
  // Insert "it" a current position
   public boolean insert(E it) {
    
	  //curr.setNext(new Link<E>(it, curr.next()));
      addAt(it,curr);
      if ((head == curr) && (curr.prev() != null))
    	  head = curr.prev();
      if(curr.prev() != null)
    	  curr = curr.prev();
      return true;
   }
  
  // Append "it" to list
   public boolean append(E it) {
      //if(head == null) {
	   if(listSize==0) {
    	  curr.setElement(it);
    	  listSize++;
      }
      else {
    	  Link<E> node = head;
    	  while(node.next() != null)
    		  node = node.next();
    	  Link<E> last = new Link<E>(it,node,null);
    	  node.setNext(last);
      }
      listSize++;
      return true;
   }
  // Remove and return current element
   public E remove () {
      if (listSize==0)
         return null;         // Nothing to remove
      E it = curr.element();// Remember value
      if (curr.prev() == null && curr.next() == null) {
    	  clear();
    	  listSize++;
      }
      else if(curr.prev() == null) {
    	  head = curr.next();
    	  curr.setNext(null);
    	  head.setPrev(null);
    	  curr = head;
      }
      else if(curr.next() == null) {
    	  curr = curr.prev();
    	  curr.next().setPrev(null);
    	  curr.setNext(null);
      }
      else {
    	  curr.next().setPrev(curr.prev());
    	  curr.prev().setNext(curr.next());
    	  curr = curr.prev();
      }
      listSize--;
      return it;
   }

   public void moveToStart() { curr = head; } // Set curr at list start
   public void moveToEnd() {
      while (curr.next()!=null)
         curr= curr.next(); }     // Set curr at list end

  // Move curr one step left; no change if now at front
   public void prev() {
      if (head == curr) 
         return; // No previous element
      Link<E> temp = head;
    // March down list until we find the previous element
      while (temp.next() != curr) temp = temp.next();
      curr = temp;
   }

  // Move curr one step right; no change if now at end
   public void next() { 
      if (curr.next() != null) curr = curr.next(); }

   public int length() { 
      return listSize; } // Return list length


  // Return the position of the current element
   public int currPos() {
      Link<E> temp = head;
      int i;
      for (i=0; curr != temp; i++)
         temp = temp.next();
      return i;
   }
  
  // Move down list to "pos" position
   public boolean moveToPos(int pos) {
      if ((pos < 0) || (pos >= listSize)) 
         return false;
      curr = head;
      for(int i=0; i<pos; i++) curr = curr.next();
      return true;
   }

  // Return true if current position is at end of the list
   public boolean isAtEnd() { 
      return curr.next() == null; }

  // Return current element value. Note that null gets returned if curr is at the tail
   public E getValue() {
      return curr.element();
   }
   
   public boolean addAt(E it, Link<E> node) {
	   if(listSize == 0) {
		   node.setElement(it);
	   }
	   else {
		   Link<E> previous = node.prev();
		   Link<E> node1 = new Link<E>(it, previous,node);
		   if(previous == null) {
			   node.setPrev(node1);
			   node1.setNext(node);
		   }
		   else {
			   node.setPrev(node1);
			   previous.setNext(node1);
			   node1.setNext(node);
			   node1.setPrev(previous);
		   }
		   
	   }
	   listSize++;
	   return true;
   }
   public void printDList(){
	      Link <E> temp = head;
	      for (int i=0; i<length(); i++){
	         System.out.print(temp.element() + " ");
	         temp=temp.next();
} 

   }
}




