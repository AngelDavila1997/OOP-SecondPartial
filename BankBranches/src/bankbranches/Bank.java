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
            if(branches.get(i).getName().equals(name)){//Si el nombre de la sucursal en la posicion es igual al nombre
                return i;//Estoy regresando un apuntador a una posicion original del Array
            }
        }
         return -1;//Regresa -1 (no hay posicion -1)
    }
    public boolean addBranch(String name){//Añade una sucrusal
        if(findBranch(name) == -1){//Si regresa -1 se añadela sucursal ya que no existe
            branches.add(new Branch(name));
            System.out.println("Branch *" + name + "* created.");
            return true;
        }
        System.out.println("Branch already exists.");
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double transaction){//Añade un cliente dentro de la sucursal
        int pos = findBranch(branchName);//Busca la sucursal
        if(pos == -1){// Si no existe
            System.out.println("Branch *" + branchName + "* does not exist.");
            return false;
        }//Si es que existe en la posicion de esa sucursal se añade un nuevo cliente
        branches.get(pos).addCustomer(customerName, transaction);
        return true;
    }
    public boolean addTransaction(String branchName, String customerName, double transaction){//Añade una transaccion a un cliente
                                                //existente dentro de una sucursal
        int pos = findBranch(branchName);//Busca la sucursal
            if(pos == -1){//Si no existe la sucursal
                System.out.println("Branch *" + branchName + "* does not exist.");
               return false;
        } else {//Si existe la sucursal en la posicion de la sucursal se añade la transaccion a un cliente
                 branches.get(pos).addTransaction(customerName , transaction);
                return true;
        }
    }
    public String customersList(String branchName) { //Regresa una lista de contactos sin transacciones
        int pos = findBranch(branchName);//Busca la sucursal
        String result = "";
        if(pos != -1){//Si en la sucursal existe
           result += branches.get(pos).getName() + ":\n";//En result se añade el nombre de la sucursal en esa posicion
            ArrayList<Customer> branchCustomers = branches.get(pos).getCustomers(); //Crea un arraylist en donde se guardan los customers
            for(int i = 0; i < branchCustomers.size(); i++){ //Un for para recorrerlo
                Customer customer = branchCustomers.get(i); //Se obtiene el customer en cierta posicion
               result += "Name:" + customer.getName() + "\n"; //y se añade el nombre a result
            }
            return result;
        }//Sino
        return "";
    }
    public String customersTransactionList(String branchName) {
        int pos = findBranch(branchName);
        String result = "";
        if(pos != -1){
           result += branches.get(pos).getName() + ":\n";
            ArrayList<Customer> branchCustomers = branches.get(pos).getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++){
                Customer customer = branchCustomers.get(i);
                result += "Name:" + customer.getName() + "\n";
                    ArrayList<Double> transactions = customer.getTransaction(); //Se crea un arraylist para guardar las transacciones de cada customer
                        for(int j = 0; j < transactions.size(); j++){ //Un for para recorrerlas
                            result += "No." + (j+1) + ":" + transactions.get(j) + "\n"; //Se obtiene la transaccion y se añade a resultado
                        }
            }
            return result;
        }
        return "";
    }
}
