
package Prat1;

import Prat1.ArrayStack;

public class Main {

    public static void main(String[] args) {
        
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        for(int i=0; i<6;i++){
            System.out.println(stack.pop());
        }
        
    }
    
}
