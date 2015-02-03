/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.conc.account;

import java.util.Random;

/**
 *
 * @author hcadavid
 */
public class BankClientThread extends Thread{

    private SharedBankAccount acc;
    
    public BankClientThread(String name, SharedBankAccount ba) {
        super(name);
        acc=ba;
    }
    
    public void run(){        
        Random r=new Random(System.currentTimeMillis());
        int amount=r.nextInt()%1000000;
        for (int i=0;i<20;i++){
            acc.deposit(amount);
        }
        for (int i=0;i<20;i++){
            acc.withdraw(amount);
        }
    }
    
}
