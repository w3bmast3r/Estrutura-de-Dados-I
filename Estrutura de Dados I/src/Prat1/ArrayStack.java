
package Prat1;

public class ArrayStack implements Stack{
    
    Object[] stack;
    int top;
    
    public ArrayStack(){
        stack = new Object[100];
        this.top = 0;
    }
    
    public ArrayStack(int e){
      this.top= -1;
      stack = new Object[e];
    }

    public void push(Object o) {
        stack[top] = o;
        top++;
    }

    public Object top() {
            if(this.empty()){
                return null;
            }
            return this.top;
        }
    
    public Object pop() {
        if(this.empty()){
            return null;
        }
        return this.stack[this.top--];
    }

    public int size() {
        return this.top;
    }

    public boolean empty(){
        if(this.top == 0){
            return true;
        }
        return false;
    }
    
    public boolean full(){
        if(this.top > stack.length){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return "O numero que esta no topo da stack e: " + this.top;
    }
    
}
