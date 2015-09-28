package Prat2;


public class ArrayStack<E> implements Stack<E> {

    int size, contador;
    E[] stack;

    public ArrayStack(int size) {
        this.size = size;
        stack = (E[]) new Object[size];
        contador = 0;
    }

    public void push(E o) {
        if (!full()) {
            stack[contador] = o;
            contador++;
        } else {
            System.out.println("Não pode adicionar");
        }
    }

    public E top() {
			// if(...)

        return stack[contador - 1];
    }

    public E pop() {

        if (!empty()) {
            E a = stack[contador - 1];
            stack[contador - 1] = null;
            contador--;
            return a;
        } else {
            return null;
        }
    }

    public int size() {

        return size;

    }

    public boolean empty() {
        return contador == 0;
    }

    public boolean full() {
        return contador == size;

    }

    public int ocupação() {
        return contador;
    }
}
