/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;
import java.util.*;
/**
 *
 * @author PC
 */
public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }
    public int findBranch(String name){
         for(int i = 0; i<branches.size(); i++){//Mientras que i sea menor al tamaño del arraylist
            if(branches.get(i).getName().equals(name)){//Si el nombre del contacto en la posicion es igual al nombre
                return i;//Estoy regresando un apuntador a una posicion original del Array
            }
        }
         return -1;//Regresa -1 (no hay posicion -1)of
    }
    public boolean addBranch(String name){//Añade un contacto
        if(findBranch(name) == -1){//Si regresa -1 se añade el contacto ya que no existe
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double transaction){
        int pos = findBranch(branchName);
        if(pos == -1){
            return false;
        }
        branches.get(pos).addCustomer(customerName, transaction);
        return true;
    }
    public boolean addTransaction(String branchName, Customer customer, double transaction){
        int pos = findBranch(branchName);
        if(pos == -1){
            return false;
        }
        branches.get(pos).addTransaction(customer.getName(), transaction);
        return true;
    }

    public String toString(Branch branch) {
        return branch.toString();
    }//
    
}
