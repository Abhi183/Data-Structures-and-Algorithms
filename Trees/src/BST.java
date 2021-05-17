// Binary Search Tree implementation
class BST {
   private BSTNode root; // Root of the BST
   private int nodecount; // Number of nodes in the BST

  // constructor
   BST() { root = null; nodecount = 0; }

  // Reinitialize tree
   public void clear() { root = null; nodecount = 0; }

  // Insert a record into the tree.
  // Records can be anything, but they must be Comparable
  // e: The record to insert.
   public boolean insert (Comparable e) {
	   BSTNode rt = root; 
	   if (nodecount == 0) {root = new BSTNode(e); nodecount = 1; return true;}
	   else if (nodecount == 1) {
		   if (e.compareTo(rt.value()) <= 0) {
			   rt.setLeft(new BSTNode(e));
			   nodecount++;
			   return true;
		   }
		   else if (e.compareTo(rt.value()) > 0) {
			   rt.setRight(new BSTNode(e));
			   nodecount++;
			   return true;
		   }
	   }
	   else {
		   while (rt != null) {
			   if (e.compareTo(rt.value()) <= 0) {
				   if (rt.left() == null) {
					   rt.setLeft(new BSTNode(e));
					   nodecount++;
					   return true;
				   }
				   else {rt = rt.left();}
			   }
			   else if (e.compareTo(rt.value()) > 0) {
				   if (rt.right() == null) {
					   rt.setRight(new BSTNode(e));
					   nodecount++;
					   return true;
				   }
				   else {rt = rt.right();}
				   
			   }
		   }
	   }
	   return false;
   }

// Remove a record from the tree
  // key: The key value of record to remove
  // Returns the record removed, null if there is none.
   public Comparable remove (Comparable e) {
	   Comparable s = -1;
	   BSTNode rt = root;
	   BSTNode parent = root;
	   if (nodecount == 0) {return s;}
	   else if (nodecount == 1 && e.compareTo(rt.value()) == 0) {
		   clear(); 
		   return e;
		   }
	   while (rt != null) {		   
		   if (e.compareTo(rt.value()) < 0) {
			   parent = rt;
			   rt = rt.left();
		   }
		   else if (e.compareTo(rt.value()) > 0) {
			   parent = rt;
			   rt = rt.right();
		   }
		   else if (e.compareTo(rt.value()) == 0) {
			   BSTNode temp = rt;
			   BSTNode tempPt = rt;
			   Comparable isGone = rt.value();
			   if (rt.right() == null) {
				   parent.setLeft(rt.left());
				   rt.setLeft(null);
				   return isGone;
			   }
			   else {temp = temp.right();}
			   if (temp.left() == null) {
				   rt.setValue(temp.value());
				   tempPt.setRight(temp.right());
				   nodecount--;
				   return isGone;
			   }
			   while (temp.left()  != null) {
				   tempPt = temp;
				   temp = temp.left();
			   }
			   rt.setValue(temp.value());
			   tempPt.setLeft(temp.right());
			   nodecount--;
			   return isGone;
		   }
	   }
	   return s;
	
}

// Return the record with key value k, null if none exists
  // key: The key value to find
   public BSTNode find(Comparable key) { 
      return findhelp(root, key); }
  
// Return the number of records in the dictionary
   public int size() { 
      return nodecount;} 
   
   
   private BSTNode findhelp(BSTNode rt, Comparable key) {
      if (rt==null) 
         return null;
      if (rt.value().compareTo(key) >0) 
         return findhelp(rt.left(),key);
      else if (rt.value().compareTo(key) == 0) 
         return rt;
      else 
         return findhelp(rt.right(),key);
   	  
   }
   
   public BSTNode getmin() {
	   BSTNode rt= root;
	   while(rt.left()!=null)
		   rt=rt.left();
	   return rt;
   }
   
   public BSTNode getmin_rec() {
	   return getmin_rec(root);
   }

private BSTNode getmin_rec(BSTNode rt) {
	if(rt.left()==null)
		return rt;
	else
		return getmin_rec(rt.left());
}
public BSTNode getsuc() {
	return getsuc(root);
}

public BSTNode getsuc(BSTNode rt) {
	if (rt.right()==null)
		return null;	
	return getmin_rec(rt.right());
}
public BSTNode getpred() {
	return getpred(root);
}

public BSTNode getpred(BSTNode rt) {
	if (rt.left()==null)
		return null;	
	return getmax_rec(rt.left());
}


public BSTNode getmax() {
	   BSTNode rt= root;
	   while(rt.right()!=null)
		   rt=rt.right();
	   return rt;
}

public BSTNode getmax_rec() {
	   return getmax_rec(root);
}

private BSTNode getmax_rec(BSTNode rt) {
	if(rt.right()==null)
		return rt;
	else
		return getmin_rec(rt.right());
}

public void inorder() {
     inorder(root);
}

private void inorder(BSTNode rt) {
	if (rt!=null) {
	  inorder(rt.left());
	  System.out.print(rt.value()+ "  ");
	  inorder(rt.right());
	}
}
public void preorder() {
    preorder(root);
}

private void preorder(BSTNode rt) {
	if (rt!=null) {
		System.out.print(rt.value()+ "  ");
		preorder(rt.left());
		preorder(rt.right());
	}
}
public void postorder() {
    postorder(root);
}

private void postorder(BSTNode rt) {
	if (rt!=null) {
		postorder(rt.left());
		postorder(rt.right());
		System.out.print(rt.value()+ "  ");	
		}
}

   
  
  
}
  
  
  
  