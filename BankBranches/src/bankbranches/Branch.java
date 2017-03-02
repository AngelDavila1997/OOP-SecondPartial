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
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }
    
    public int findCustomer(String name){
         for(int i = 0; i<customers.size(); i++){//Mientras que i sea menor al tamaño del arraylisto
            if(customers.get(i).getName().equals(name)){//Si el nombre del contacto en la posicion es igual al nombre
                return i;//Estoy regresando un apuntador a una posicion original del Array
            }
        }
         return -1;//Regresa -1 (no hay posicion -1)//
    }
    public boolean addCustomer(String name, double transaction){//Añade un contacto
        if(findCustomer(name) == -1){//Si regresa -1 se añade el contacto ya que no existe
            customers.add(new Customer(name , transaction));
            return true;
        }
        return false;
    }
    public boolean addTransaction(String name, double transaction){
        int pos = findCustomer(name);
        if(pos == -1){
            return false;
        }
        customers.get(pos).addTransaction(transaction);
        return true;
    }

    @Override
    public String toString() {
        return name + " (" + customers.toString() + ')';
    }
    
}
