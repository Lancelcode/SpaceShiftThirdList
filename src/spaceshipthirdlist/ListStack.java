package spaceshipthirdlist;

public class ListStack<AnyType> implements Stack<AnyType> {
    private ListNode<AnyType> topOfStack;
    private int size;

    /**
     * Construct the stack.
     */
    public ListStack() {
        topOfStack = null;
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return size;
    }

    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean empty() {
        return topOfStack == null;
    }

    /**
     * Make the stack logically empty.
     */
    public void makeEmpty() {
        topOfStack = null;
        size = 0; // Reset the size to zero when the stack is emptied
    }

    /**
     * Insert a new item into the stack.
     * @param x the item to insert.
     */
    public void push(AnyType x) {
        topOfStack = new ListNode<>(x, topOfStack);
        size++;
    }

    /**
     * Insert a new item into the stack.
     * @param x the item to insert.
     */
    public void add(AnyType x) {
        topOfStack = new ListNode<>(x, topOfStack);
        size++;
    }

    /**
     * Return the most recently inserted item without removing it.
     * @throws UnderflowException if the stack is empty.
     */
    public AnyType peek() {
        if (empty())
            throw new UnderflowException("Stack is empty");
        return topOfStack.element;
    }

    @Override
    public void topAndPop() {

    }

    /**
     * Return and remove the most recently inserted item from the stack.
     * @return the most recently inserted item in the stack.
     * @throws UnderflowException if the stack is empty.
     */
    public AnyType pop() {
        if (empty())
            throw new UnderflowException("Stack is empty");

        AnyType topItem = topOfStack.element;
        topOfStack = topOfStack.next;
        size--;
        return topItem;
    }

    /**
     * Return and remove the most recently inserted item from the stack.
     * @return the most recently inserted item in the stack.
     * @throws UnderflowException if the stack is empty.
     */
    public AnyType remove() {
        if (empty())
            throw new UnderflowException("Stack is empty");

        AnyType topItem = topOfStack.element;
        topOfStack = topOfStack.next;
        size--;
        return topItem;
    }
}

