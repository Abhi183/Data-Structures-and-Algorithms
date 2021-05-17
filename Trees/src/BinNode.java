interface BinNode {// Binary tree node ADT
	// Get and set the element value 
	public Object value(); 
    public void setValue(Object v); 
    // return the children 
    public BinNode left(); 
    public BinNode right();
    // return true if a leaf node,false otherwise 
    public boolean isLeaf(); } 

