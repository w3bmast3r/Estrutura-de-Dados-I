
public class Parque {

    ArrayStack<String> est;
    ArrayStack<String> est2;

    Parque() {
        est = new ArrayStack<String>(10);
        est2 = new ArrayStack<String>(10);

    }

    public void estacionar(String matricula) {
        if (!isFull()) {
            est.push(matricula);
        }
    }

    public void saida(String matricula) {

        boolean d = true;

        while (d) {
            if (est.top() == matricula) {
                est.pop();
                d = false;

            } else {
                est2.push(est.pop());
            }
        }

    }

    public boolean isFull() {
        if (est.size() == 10) {
            return true;
        } else {
            return false;
        }
    }

}
