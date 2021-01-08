import java.util.NoSuchElementException;

/**
 * A simple linked list of strings with limited functionality. Items may only be
 * added and removed at the beginning of the list.
 * 
 * @author Janet Lee
 * 
 */
public class SimpleLinkedList
{
    private int size;
    private Node head;

    /**
     * Create an empty linked list.
     */
    public SimpleLinkedList()
    {
        size = 0;
        head = null;
    }

    /**
     * @return The number of elements stored in the list
     */
    public int size()
    {
        return size;
    }

    /**
     * Add an item at position 0 in the list.
     * 
     * @param item The item to add
     */
    public void addAtStart(String item)
    {
        head = new Node(head, item);
        size++;
    }

    /**
     * Return true if this list contains the indicated item.
     * 
     * @param item The item to search for
     * @return true if the item is in the list, false otherwise
     */
    public boolean contains(String item)
    {
        // COMPLETE THIS
        // UNFINISHED. Look at the get method if you need a reminder on how to
        // loop through a linked structure. For this method, a while loop will
        // be more appropriate than a for loop.
        //
        // Note: This method should NOT CALL get. The resulting implementation
        // would be very inefficient since get must loop through the list from
        // the beginning on each call.
      
      while  (head != null) {
        if (head.equals(item)) {
          return true;
        }
        else {
          return false;
        }
      }

        throw new UnsupportedOperationException();
    }

    /**
     * Add an item to the end of the list.
     * 
     * @param item The item to add
     */
    public void addAtEnd(String item)
    {
        // COMPLETE THIS
        // UNFINISHED. There are two cases: if the list is currently empty then
        // the new node will be the head. Otherwise the new node needs to go
        // after the current last node.
        if (head == null) {
          head = new Node(head, item);
        } 
        else {
          Node current = head;
          while (current.getNext() != null) {
            current = current.getNext();
          }
          current.setNext(Node(item)); 
        throw new UnsupportedOperationException();
    }
    }

    /**
     * Remove and return the item stored at position 0 in the list.
     * 
     * @return The item at position 0
     * @throws NoSuchElementException if the list is empty
     */
    public String removeAtStart()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }

        String result;
        result = head.getValue();
        head = head.getNext();
        size--;
        return result;

    }

    /**
     * Return the item stored at the indicated index.
     * 
     * @param index The index
     * @return The element stored at the indicated index
     */
    public String get(int index)
    {

        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        Node curNode = head;

        for (int i = 0; i < index; i++)
        {
            curNode = curNode.getNext();
        }

        return curNode.getValue();
    }

}