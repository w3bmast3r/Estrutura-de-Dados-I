
public class Binary {

    public static void convert(int num) {

        ArrayStack<Integer> newarray = new ArrayStack<Integer>(num);
        int resto;

        while (num != 0) {
            resto = num % 2;
            newarray.push(resto);
            num = num / 2;
        }
        while (!newarray.empty()) {
            System.out.print(newarray.pop());
        }
    }

    public static void main(String[] args) {
        convert(154);
    }
}
