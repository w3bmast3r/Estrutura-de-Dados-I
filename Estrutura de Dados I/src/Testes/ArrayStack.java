package Testes;

public class ArrayStack<E> implements Stack<E> {

    int contador, size;
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
            System.out.println("A pilha encontra-se cheia.");
        }

    }

    public E top() {
        if (!empty()) {
            return stack[contador];
        }
        return null;
    }

    public E pop() {
        if (!empty()) {
            E poped = stack[contador -1];
            stack[contador - 1] = null;
            contador--;
            return poped;
        } 
        else{
            return null;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean empty() {
        return this.contador == 0;
    }

    public boolean full() {
        return contador == size;
    }

}
