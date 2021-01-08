

class AQueue<E> implements Queue<E> {

  // Keep this non-private for testing purposes!
  E queueArray[]; // Array holding queue elements

  private static final int defaultSize = 10;
  private int front; // Index of front element
  private int size; // Number of elements stored.

  // Constructors
  @SuppressWarnings("unchecked") // Generic array allocation
  AQueue(int capacity) {
    //COMPLETE THIS
    //Initialize front and size variable to 0
    // Create queueArray with capacity as the size of the array
    front = 0; 
    size = 0;
    capacity = size;
    E queueArray [capacity];

  }


  AQueue() {
    this(defaultSize);
  }

  // Reinitialize
  public void clear() {
    //COMPLETE THIS
    for(int i = 0; i < size; i++) {
      queueArray[i] = null;
    size = 0;
  }
  }

  // Put "it" in queue
  public boolean enqueue(E it) {
    queueArray.addLast(it);
    return false;
    //COMPLETE THIS
     
  }

  // Remove and return front value
  public E dequeue() {
    if (size == 0) {
      return null; }
    else {
      queueArray.pop();
      queueArray.peek();
    }
    
   //COMPLETE THIS
  }

  // Return front value
  public E frontValue() {
    if (size == 0) {
      return null; }
    else {
      queueArray.peek(); }
    //COMPLETE THIS
  }

  // Return queue size
  public int length() {
    if (size = 0) {
      return 0; }
    else {
      queueArray.length(); }
  }
}
    //COMPLETE THIS
  
