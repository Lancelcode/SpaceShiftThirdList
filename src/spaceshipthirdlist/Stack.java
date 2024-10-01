package spaceshipthirdlist;

public interface Stack<AnyType> {
    void push(AnyType var1);

    AnyType pop();

    AnyType peek();

    AnyType topAndPop();

    boolean empty();

    void makeEmpty();

    int size();
}
