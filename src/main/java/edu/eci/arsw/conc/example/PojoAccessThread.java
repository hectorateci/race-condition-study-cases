/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.conc.example;

/**
 *
 * @author hcadavid
 */
public class PojoAccessThread extends Thread {

    public PojoAccessThread(String name) {
        super(name);
    }
    
    
    
    public void run(){
        PojoSingleton.getInstance().sayHello(this.getName());        
        
    }
    
}
