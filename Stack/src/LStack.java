// Linked stack implementation
class LStack implements Stack {
  private Link top;               // Pointer to first element
  private int size;               // Number of elements

  // Constructors
  LStack() { top = null; size = 0; }
  LStack(int size) { top = null; size = 0; }

  // Reinitialize stack
  public void clear() { top = null; size = 0; }

// Put "it" on stack
  public boolean push(Object it) {  
    top = new Link(it, top);
    size++;
    return true;
  }

// Remove "it" from stack
  public Object pop() {           
    if (top == null) return null;
    Object it = top.element();
    top = top.next();
    size--;
    return it;
  }

  public Object topValue() {      // Return top value
    if (top == null) return null;
    return top.element();
  }

  // Return stack length
  public int length() { return size; }
}
