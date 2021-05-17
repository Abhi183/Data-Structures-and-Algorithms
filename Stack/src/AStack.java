class AStack implements Stack {
  private Object stackArray[];    // Array holding stack
  private static final int defaultSize = 10;
  private int maxSize;            // Maximum size of stack
  private int top;                // First free position at top

  // Constructors
  AStack(int size) {
    maxSize = size;
    top = 0; 
    stackArray = new Object[size]; // Create stackArray
  }
  AStack() { this(defaultSize); }

  public void clear() { top = 0; }    // Reinitialize stack

// Push "it" onto stack
  public boolean push(Object it) {
    if (top >= maxSize) return false;
    stackArray[top++] = it;
    return true;
  }

// Remove and return top element
  public Object pop() {               
    if (top == 0) return null;
    return stackArray[--top];
  }

  public Object topValue() {          // Return top element
    if (top == 0) return null;
    return stackArray[top-1];
  }
  
  public boolean find_x(Object val) {
	  int temp = top;
	  for (int i =0; i<stackArray.length; i++) {
	  if (stackArray[i] == val) {
		  return true;
	  }
	 
	  }
	return false; 
	  
	  
  }

  public int length() { return top; } // Return stack size
}