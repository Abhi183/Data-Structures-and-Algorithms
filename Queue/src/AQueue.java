
class AQueue implements Queue {
  private Object queueArray[]; // Array holding queue elements
  private static final int defaultSize = 10;
  private int maxSize;         // Maximum size of queue
  private int front;           // Index of front element
  private int rear;            // Index of rear element

  // Constructors
  AQueue(int size) {
    maxSize = size+1;          // One extra space is allocated
    rear = 0; front = 1;
    queueArray = new Object[maxSize];  // Create queueArray
  }
  AQueue() { this(defaultSize); }

  // Reinitialize
  public void clear() { rear = 0; front = 1; }

  // Put "it" in queue
  public boolean enqueue(Object it) {
    if (((rear+2) % maxSize) == front) return false;  // Full
    rear = (rear+1) % maxSize; // Circular increment
    queueArray[rear] = it;
    return true;
  }

  // Remove and return front value
  public Object dequeue() {
    if(length() == 0) return null;
    Object it = queueArray[front];
    front = (front+1) % maxSize; // Circular increment
    return it;
  }
  
  public int get_front() {
	     return front;
	  }
  
  public int get_rear() {
	     return rear;
	  }

  // Return front value
  public Object frontValue() {
    if (length() == 0) return null;
    return queueArray[front];
  }

  // Return queue size
  public int length() { return ((rear+maxSize) - front + 1) % maxSize; }
}
