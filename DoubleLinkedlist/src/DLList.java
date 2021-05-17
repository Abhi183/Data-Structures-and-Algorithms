
public class DLList<E> implements List<E> {
	private Link<E> head;      // Pointer to list header
	private Link<E> tail;
	private Link<E> curr;      // Access to current element
	private int listSize;      // Size of list
	
	DLList(int size) { this(); }     // Constructor -- Ignore size
	DLList() { clear(); }

	@Override
	public void clear() {
		curr = tail = new Link<E>(null,null);
		head = new Link<E>(null,tail);
      tail.setPrev(head);
	    listSize = 0;
	}

	@Override
	public boolean insert(E it) {
		if(listSize == 0) {
			Link<E> node = new Link<E>(it,head,tail);
			head.setNext(node);
			tail.setPrev(node);
		}
		
		else if(curr == tail) {
			Link<E> node = new Link<E>(it,curr.prev(),tail);
			curr.prev().setNext(node);
			curr.setPrev(node);
		}
		else {
			{
				Link<E> node = new Link<E>(it,curr.prev(),curr);
				curr.prev().setNext(node);
				curr.setPrev(node);
			}
		}
		curr = curr.prev();
		listSize++;
		return true;
	}

	@Override
	public boolean append(E it) {
		if (listSize == 0) {
			Link<E> node = new Link<E>(it,head,tail);
			head.setNext(node);
			tail.setPrev(node);
			curr = curr.prev();
		}
		else {
			Link<E> node = new Link<E>(it,tail.prev(),tail);
			tail.prev().setNext(node);
			tail.setPrev(node);
		}
		listSize++;
		return true;
	}

	@Override
	public E remove() {
		if (listSize==0)
	         return null;
		else if(curr.prev() == head) {
			head.setNext(curr.next());
			curr.next().setPrev(head);
		}
		else if(curr.next() == tail) {
			curr.prev().setNext(tail);
			tail.setPrev(curr.prev());
		}
		else {
			curr.prev().setNext(curr.next());
			curr.next().setPrev(curr.prev());
		}
		curr = curr.next();
		listSize--;
		return null;
	}

	@Override
	public void moveToStart() {
		curr = head;
		
	}

	@Override
	public void moveToEnd() {
		curr = tail; }

	@Override
	public void prev() {
	      if (head == curr) 
	         return; // No previous element
	      Link<E> temp = head;
	    // March down list until we find the previous element
	      while (temp.next() != curr) temp = temp.next();
	      curr = temp;
	   }

	@Override
	public void next() {
		      if (curr.next() != tail) curr = curr.next(); 
	}

	@Override
	public int length() {
		return listSize;
	}

	@Override
	public int currPos() {
	      Link<E> temp = head;
	      int i;
	      for (i=0; curr != temp; i++)
	         temp = temp.next();
	      return i;
	   }

	@Override
	public boolean moveToPos(int pos) {
	      if ((pos < 0) || (pos >= listSize)) 
	         return false;
	      curr = head.next();
	      for(int i=0; i<pos; i++) curr = curr.next();
	      return true;
	   }

	@Override
	public boolean isAtEnd() {
		return curr.next() == null;
	}

	@Override
	public E getValue() {
		return curr.element();
	}
	public void print() {
		Link <E> temp = head;
		while (temp != null) {
			System.out.print(temp.element() + " ");
			temp = temp.next();
		}
		
		}
	}


