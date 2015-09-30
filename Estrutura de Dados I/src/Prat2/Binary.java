package Prat2;

public class Binary {

    public static void convert(int num) {

        ArrayStack<Integer> newarray = new ArrayStack<Integer>(num);
        int resto;

        /*
        / VAI DIVIDINDO NUMERO POR 2
        / FAZ PUSH DO RESTO (0 ou 1) PARA STACK
        */
        
        while (num != 0) {
            resto = num % 2;
            newarray.push(resto);
            num = num / 2;
        }
        
        /*
        / POP DOS ELEMENTOS DA STACK
        */
        while (!newarray.empty()) {
            System.out.print(newarray.pop());
        }
    }

    public static void main(String[] args) {
        convert(154);
    }
}
