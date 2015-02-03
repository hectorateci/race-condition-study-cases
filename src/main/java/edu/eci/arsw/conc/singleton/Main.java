/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.conc.singleton;

/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String a[]){
        PojoAccessThread pat[]=new PojoAccessThread[20];
        for (int i=0;i<pat.length;i++){
            pat[i]=new PojoAccessThread("Thread #"+i);
        }
        
        for (int i=0;i<pat.length;i++){
            pat[i].start();
        }
        
        
        
    }
    
}
