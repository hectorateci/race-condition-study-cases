/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.conc.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class PojoSingleton {
    
    private PojoSingleton(){
        /*try {
            //simulation of the time required by the constructor
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(PojoSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
    private static PojoSingleton instance=null;
    
    public static PojoSingleton getInstance(){
        
        if (instance==null){
            instance=new PojoSingleton();
        }
        return instance;
        
    }
    
    public void sayHello(String name){
        System.out.println("Hello "+name+". By "+this.toString());
    }
    
    
    
}
