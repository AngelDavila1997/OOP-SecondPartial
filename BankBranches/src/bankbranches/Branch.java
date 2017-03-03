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
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    
    public int findCustomer(String name){ //Busca el cliente dentro del arraylist
         for(int i = 0; i<customers.size(); i++){//Mientras que i sea menor al tamaño del arraylist
            if(customers.get(i).getName().equals(name)){//Si el nombre del cliente en la posicion es igual al nombre
                return i;//Estoy regresando un apuntador a una posicion original del Array
            }
        }
         return -1;//Regresa -1 (no hay posicion -1)
    }
    public boolean addCustomer(String name, double transaction){//Añade un cliente
        if(findCustomer(name) == -1){//Si regresa -1 se añade el cliente ya que no existe
            customers.add(new Customer(name , transaction));
            System.out.println("Customer *" + name + "* registered. Initial amount = " + transaction);
            return true;
        }
        System.out.println("Customer *" + name + "* already exists.");
        return false;
    }
    public boolean addTransaction(String name, double transaction){//Añade una transaccion a un cliente
        int pos = findCustomer(name);//Busca al cliente
        if(pos == -1){//Si no existe
            System.out.println("Customer *" + name + "* does not exist.");
            return false;
        }//Si existe añade la transaccion en la posicion del cliente correspondiente
        customers.get(pos).addTransaction(transaction);
        return true;
    }
    
}
