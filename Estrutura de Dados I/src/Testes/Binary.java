
package Testes;

public class Binary {
    
    public static void converter(int num){
        
        ArrayStack<Integer> stack = new ArrayStack<Integer>(num);
        
        while( num != 0 ){
            int resto = num % 2;
            stack.push(resto);
            num = num/2;
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        converter(2012);
    }
    
}
