/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

/**
 *
 * @author PC
 */
public class BankBranches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch("Dora");
        bank.addBranch("Dora");
        bank.addCustomer("Pepa", "Manuel",20);
        bank.addCustomer("Dora", "Manuel",20);
        bank.addCustomer("Dora", "Lin",20);
        bank.addCustomer("Dora", "Manuel",20);
        bank.addCustomer("Pepa", "Manuel",20);
        bank.addCustomer("Dora", "Samuel",20);
        System.out.println(bank.addTransaction("Dora", "Haha", 10));
        System.out.println(bank.customersList("Dora"));
    }
    
    
}
