package spaceshipthirdlist;

public class ListStack<AnyType> implements Stack<AnyType> {
    private ListNode<AnyType> topOfStack;
    private int size;

    /**
     * Construct the stack.
     */
    public ListStack() {
        topOfStack = null;
        size = 0; // Initialize size to 0
    }

    /**
     * Returns the size of the stack.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     */
    @Override
    public boolean empty() {
        return topOfStack == null;
    }

    /**
     * Make the stack logically empty.
     */
    @Override
    public void makeEmpty() {
        topOfStack = null;
        size = 0; // Reset the size to zero when the stack is emptied
    }

    /**
     * Insert a new item into the stack.
     * @param x the item to insert.
     */
    @Override
    public void push(AnyType x) {
        topOfStack = new ListNode<>(x, topOfStack);
        size++;
    }

    /**
     * Return the most recently inserted item without removing it.
     * @throws UnderflowException if the stack is empty.
     */
    @Override
    public AnyType peek() {
        if (empty())
            throw new UnderflowException("Stack is empty");
        return topOfStack.element;
    }

    @Override
    public AnyType topAndPop() {
        if (empty()) {
            throw new UnderflowException("Stack is empty");
        }

        AnyType topItem = topOfStack.element; // Get the top item
        topOfStack = topOfStack.next; // Remove the top item from the stack
        size--; // Decrease the size of the stack
        return topItem; // Return the top item
    }


    /**
     * Return and remove the most recently inserted item from the stack.
     * @return the most recently inserted item in the stack.
     * @throws UnderflowException if the stack is empty.
     */
    @Override
    public AnyType pop() {
        if (empty())
            throw new UnderflowException("Stack is empty");

        AnyType topItem = topOfStack.element;
        topOfStack = topOfStack.next;
        size--;
        return topItem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        ListNode<AnyType> current = topOfStack; // Corrected variable name
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
