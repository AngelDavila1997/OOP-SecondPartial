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
public class BankBranches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank();
        while(true){
        options(menu(), bank);
        }
    }
public static int menu(){ //Muestra un menu para darle al usuario opciones
        int option;
        Scanner keyboard = new Scanner(System.in); //Entrada de teclado para selección de opciones
       do{
        System.out.println("***Bank Branches***");
        System.out.println("Select an option:");
        System.out.println("Menu:");
        System.out.println("0. Quit");
        System.out.println("1. Add branch");
        System.out.println("2. Add customer");
        System.out.println("3. Add transaction");
        System.out.println("4. Print customer list");
        option=keyboard.nextInt();
         }while (option < 0 || option >= 5); //Mientras que la opcion ingresada sea menor que 0 O mayor igual a 7
                                           // seguira mostrando el menu
        return option;
    }   
public static void options(int option, Bank bank){  //Un switch que permite realizar diversas acciones
      String branchName, customerName;
      double transaction;
         switch(option){ //Seleccion multiple
            case 1://Añade sucursal
                System.out.println("***Add brancht***");
                    branchName = getString("Branch name:");
                    bank.addBranch(branchName);
                break;
            case 2://Añade clientes
                System.out.println("***Add customer***");
                    branchName = getString("Branch name:");
                    customerName = getString("Customer name:");
                    transaction = getDouble("Amount:"); 
                    bank.addCustomer(branchName, customerName, transaction);
                break;
            case 3://Añade transacciones
                System.out.println("***Add transactions***");
                    branchName = getString("Branch name:");
                    customerName = getString("Customer name:");
                    transaction = getDouble("Amount:");
                    bank.addTransaction(branchName, customerName, transaction);
                break;
            case 4://Imprime la lista de clientes
                System.out.println("***Customer list***");
                int op;
                Scanner keyboard = new Scanner(System.in); //Entrada de teclado para selección de opciones
                    do{
                    System.out.println("Select an option:");
                    System.out.println("0. Exit");
                    System.out.println("1. Print customer list only");
                    System.out.println("2. Print customer list with transactions");
                    op=keyboard.nextInt();
                    }while (op < 0 || op >= 3);
                    branchName = getString("Branch name");
                            switch (op) {
                                case 1:
                                    bank.customersList(branchName);
                                    break;
                                case 2:
                                    bank.customersTransactionList(branchName);
                                    break;
                                default:
                                    exit();
                                    break;
                            }
                break;
            default:
                exit();
                break;
        }
    }
public static double getDouble(String d){
    double data;
    Scanner keyboard = new Scanner (System.in);
    System.out.println(d);
    data = keyboard.nextDouble();
    return data;
}
public static String getString(String d){
    String data;
    Scanner keyboard = new Scanner (System.in);
    System.out.println(d);
    data = keyboard.nextLine();
    return data;
}
public static void exit(){
        System.out.print("***Goodbye***");
        System.exit(0);
    }
}
