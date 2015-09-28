
package Prat2_old;

import Prat1.*;

public interface Stack <Object>{
    public void push(Object o);
    public Object top();
    public Object pop();
    public int size();
    public boolean empty();
    public String toString();
}