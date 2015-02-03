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
public class Main {
   
    public static void main(String a[]){
        BankClientThread bct[]=new BankClientThread[10];
        SharedBankAccount account=new SharedBankAccount(1000);
        
        for (int i=0;i<bct.length;i++){
            bct[i]=new BankClientThread("Client "+i, account);
        }

        for (int i=0;i<bct.length;i++){
            bct[i].start();
        }

        System.out.println(account.getBalance());
        
    
    }
    
}
