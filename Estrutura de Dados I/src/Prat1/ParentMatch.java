
package Prat1;
  
import java.io.*;
import java.util.StringTokenizer;
public class ParentMatch{

    String atributo;
  
  public static boolean isOpenParen(String s){
    if(s=="("){
        return true;
    }
      return false;
  
  }
  public static boolean isCloseParen(String s){
    if(s==")"){
        return true;
    }
    return false;
  }
  
  public static boolean marrie(String s, String u){
    // retirn true se s casa com u 
    return false;
    
  }
  
  public static void main(String[] args){
   
    System.out.println("Digite a expressao:");
    
    try {
      BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer(bf.readLine(),"(){}[]",true);
     // implementar o algoritmo
      while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
      }
    }
    catch(IOException e) {}
  }
}
