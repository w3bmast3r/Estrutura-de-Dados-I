
package Testes;

public class Parque {
    
    int size = 10, parquePrincipalContador = 0, parqueSecundarioContador = 0;
    
    ArrayStack<String> parquePrincipal;
    ArrayStack<String> parqueSecundario;
    
    Parque(){
        parquePrincipal = new ArrayStack(10);
        parqueSecundario = new ArrayStack(10);
    }
    
    public void estacionar(String matricula){
        if(!full()){
            parquePrincipal.push(matricula);
            parquePrincipalContador++;
        }
        else{
            System.out.println("Estacionamento cheio.");
        }
    }
    
    public void tirar(String matricula){
        
        boolean condicao = true;
        
        while(condicao = true){
            if(parquePrincipal.top() != matricula){
                parqueSecundario.push(parquePrincipal.pop());
                parquePrincipalContador--;
                parqueSecundarioContador++;
            }
            else{
                parquePrincipal.pop();
                parquePrincipalContador--;
                condicao = false;
            }
                    
        }
        
    }
    
    public boolean full(){
        return parquePrincipalContador == size;
    }
    
    
    /*
    *Classe Main
    */
    
    public static void main (String[] args){
        
        Parque p1 = new Parque();
        p1.estacionar("Mercedes 1");
        p1.estacionar("Mercedes 2");
        p1.estacionar("Mercedes 3");
        p1.estacionar("Mercedes 4");
        p1.estacionar("Mercedes 5");
        
        p1.tirar("Mercedes 3");
    }
    
}
