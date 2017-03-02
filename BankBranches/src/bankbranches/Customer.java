/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(transaction);
    }
    public String getName() {
        return name;
    }
    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
    public ArrayList<Double> getTransaction(){
        return transactions;
    }
    
}
