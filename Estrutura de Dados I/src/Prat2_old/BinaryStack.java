
package Prat2_old;

import Prat2.ArrayStack;

public class BinaryStack{
    
    public static void convert(int num){
    
    ArrayStack<Integer> stack = new ArrayStack<Integer>(num);
    int resto;
    
    while(num!=0){
        resto = num%2;
        stack.push(resto);
        num = num/2;
    }
    while(!stack.empty()){
        System.out.println(stack.pop());
    }
    
    public static void main(String[] args){
        convert(5);
    }
}