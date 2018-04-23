/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

import Observer.Observer;
import java.util.ArrayList;

/**
 *
 * @author Win-7
 */
public class IClient {
    private ArrayList<Observer> observers = new ArrayList<>();
    
    public void add(Observer o){
        observers.add(o);
    }
    public void delete(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer o : observers){
            o.update();
        }
    }
    
}
