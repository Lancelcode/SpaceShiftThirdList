package spaceshipthirdlist;


// ListQueue class
//
// CONSTRUCTION: with no initializer
/// ******************PUBLIC OPERATIONS*********************
// void add( x )      --> Insert x
// void push( x )     --> Insert x
// AnyType peek( )    --> Return least recently inserted item
// AnyType remove( )  --> Return and remove least recent item
// AnyType pop( )     --> Return and remove least recent item
// boolean empty( )   --> Return true if empty; else false
// void makeEmpty( )  --> Remove all items
// int size()         --> returns size of queue zero if empty
// ******************ERRORS********************************
// peek or remove on empty queue
/**
 * List-based implementation of the queue.
 * @author Mark Allen Weiss Updated Sept 2021
 */
public class ListQueue<AnyType> implements Queue<AnyType>
{
    private ListNode<AnyType> front;
    private ListNode<AnyType> back;
    private int size;
    /**
     * Construct the queue.
     */
    public ListQueue( )
    {
        front = back = null;
        size=0;
    }

    /**
     * Test if the queue is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean empty( )
    {
        return front == null;
    }

    /**
     * Insert a new item into the queue.
     * @param x the item to insert.
     */
    public void add( AnyType x )
    {
        if( empty( ) ) // Make queue of one element
            back = front = new ListNode<AnyType>( x );
        else    // Regular case
            back = back.next = new ListNode<AnyType>( x );
        size++;
    }

    /**
     * Insert a new item into the queue.
     * @param x the item to insert.
     */
    public void push( AnyType x )
    {
        if( empty( ) ) // Make queue of one element
            back = front = new ListNode<AnyType>( x );
        else    // Regular case
            back = back.next = new ListNode<AnyType>( x );
        size++;
    }

    /**
     * Return and remove the least recently inserted item
     * from the queue.
     * @return the least recently inserted item in the queue.
     * @throws UnderflowException if the queue is empty.
     */
    public AnyType remove( )
    {
        if( empty( ) )
            throw new UnderflowException( "ListQueue dequeue" );

        AnyType returnValue = front.element;
        front = front.next;
        size--;
        return returnValue;
    }

    /**
     * Return and remove the least recently inserted item
     * from the queue.
     * @return the least recently inserted item in the queue.
     * @throws UnderflowException if the queue is empty.
     */
    public AnyType pop( )
    {
        if( empty( ) )
            throw new UnderflowException( "ListQueue dequeue" );

        AnyType returnValue = front.element;
        front = front.next;
        size--;
        return returnValue;
    }

    /**
     * Get the least recently inserted item in the queue.
     * Does not alter the queue.
     * @return the least recently inserted item in the queue.
     * @throws UnderflowException if the queue is empty.
     */
    public AnyType peek( )
    {
        if( empty( ) )
            throw new UnderflowException( "Queue is empty" );
        return front.element;
    }

    /**
     * Make the queue logically empty.
     */
    public void makeEmpty( )
    {
        front = null;
        back = null;
    }


    /**
     * returns the size of the Queue.
     */

    public int size( )
    {
        return size;
    }

    @Override
    public String toString() {
        if (empty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        ListNode<AnyType> current = front;
        while (current != null) {
            sb.append(current.element);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }


}