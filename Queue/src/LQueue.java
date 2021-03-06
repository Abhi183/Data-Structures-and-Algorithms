// Linked queue implementation
class LQueue implements Queue {
   private Link front; // Pointer to front queue node
   private Link rear;  // Pointer to rear queuenode
   private int size;   // Number of elements in queue

   // Constructors
   LQueue() { init(); }
   LQueue(int size) { init(); } // Ignore size

   // Initialize queue
   void init() {
      front = rear = new Link(null);
      size = 0;
   }

   // Reinitialize stack
   public void clear() { front=rear = null; size = 0; }
   
   // Put element on rear
   public boolean enqueue(Object it) {
      rear.setNext(new Link(it, null));
      rear = rear.next();
      size++;
      return true;
   }

   // Remove and return element from front
   public Object dequeue() {
      if (size == 0) 
         return null;
      Object it = front.next().element(); // Store the value
      front.setNext(front.next().next()); // Advance front
      if (front.next() == null) rear = front; // Last element
      size--;
      return it; // Return element
   }

   // Return front element
   public Object frontValue() {
      if (size == 0) 
         return null;
      return front.next().element();
   }

   // Return queue size
   public int length() { 
      return size; }
}