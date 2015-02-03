/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.conc.account;

/**
 *
 * @author hcadavid
 */
public class SharedBankAccount {
    
    private int balance;

    public SharedBankAccount(int initialBalance) {
        balance=initialBalance;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void deposit(int amount){
        balance+=amount;
    }
    
    
    public void withdraw(int amount){
        balance-=amount;
    }
    
}
