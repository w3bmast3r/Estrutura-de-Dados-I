package Prat2;


public class Parque{

    int contador;
    boolean d = true;
    
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

        /*
        /Se o elemento do topo for igual ao da matricula
        /Faz POP
        /Caso contrario faz o push para a stack2
        */
        while (d = true) {
            if (est.top() == matricula) {
                est.pop();
                d = false;

            } else {
                est2.push(est.pop());
            }
        }
    }

    public boolean isFull() {
        //if (est.size() == 10) {
        if(contador == 10) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args){
        Parque p1 = new Parque();
        p1.estacionar("Mercedes 1");
        p1.estacionar("Mercedes 2");
        p1.estacionar("Mercedes 3");
        p1.estacionar("Mercedes 4");
        p1.estacionar("Mercedes 5");
        
        p1.saida("Mercedes 3");
    }
}
