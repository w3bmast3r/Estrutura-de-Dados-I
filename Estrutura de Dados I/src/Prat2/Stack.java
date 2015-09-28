package Prat2;


public interface Stack<E> {

	public void push(E o);
	public E top();
	public E pop();
	public int size();
	public boolean empty();
	public boolean full();
	public int ocupação();
}
