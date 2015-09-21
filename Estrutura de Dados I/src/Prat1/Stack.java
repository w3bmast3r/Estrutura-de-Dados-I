/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prat1;

/**
 *
 * @author bruno
 */
public interface Stack <E>{
    public void push(E o);
    public E top();
    public E pop();
    public int size();
    public boolean empty();
}