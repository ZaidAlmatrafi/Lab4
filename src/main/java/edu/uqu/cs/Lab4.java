package edu.uqu.cs;
/*
* Lab 4 - Collections
* CS 1312
*/
 
/*
* Make sure to complete and submit your lab
*/
 
/* Remember to import corresponding classes */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
 
public class Lab4 {
 
    /************ Part 1 **************/
    // TODO: Define a static variable of type ArrayList to store objects of  called myTriangles
    static ArrayList<Triangle> triangles = new ArrayList<Triangle>();
   
    /************ Part 2 **************/
    // TODO: Define a static method to read two double values from the user, creates a Triangle object and adds it to the arraylist defined above.  
    // The method should add Triangle objects to the ArrayList triangles until a negative value is intered by the user.
    // For example, if the input is:
    // 1.0 2.0
    // 2.0 3.0
    //
    // The method should create two Triangle objects with base and height values of 1.0, 2.0 and 2.0, 3.0 respectively.
    // The method should not print anything to the console.
    // Hint: Use Scanner class to read from the console.
    static void addTriangles() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                if (base < 0 || height < 0)
                    break;
                triangles.add(new Triangle(base, height));
            } catch (NoSuchElementException e) {
                break;
            }
        }
    }
 
    /************ Part 3 **************/
    // TODO: Define a static method that prints the count of stored triangles and then iterate over all stored triangles and print their areas
    // Example output when there are two triangles are stored with areas 5.1 and 9.4:
    // 2 triangles are stored.
    // 5.1
    // 9.4
    static void printTriangles() {
        System.out.println(triangles.size() + " triangles are stored.");
        for (Triangle triangle : triangles) {
            System.out.println(triangle.getArea());
        }
    }
  
    
    /************ Part 4 **************/
    // TODO: Define a static variable called `accounts` of type HashMap to store names (Strings) and corresponding account balance of type Double
    // This HashMap object serves as a mechanism to emulate a very simple banking application.
    static HashMap<String, Double> accounts = new HashMap<>();
    /************ Part 5 **************/
    // TODO: Define a static method thad adds an entry to accounts defined above
    static void addAccount(String name, double balance) {
        accounts.put(name, balance);
    }
  
    /************ Part 6 **************/
    // TODO: Define a static method called `getAverageAccountBalance` that returns the average of all balances in accounts
    static double getAverageAccountBalance() {
        double sum = 0;
        for (double balance : accounts.values()) {
            sum += balance;
        }
        return sum / accounts.size();
    }
   
 
    /************ Part 7 **************/
    // TODO: Define a static method called `getAccountWithHighestBalance` that returns the name of the account with the highest balance
    static String getAccountWithHighestBalance() {
        double maxBalance = Double.MIN_VALUE;
        String maxBalanceName = "";
        for (String name : accounts.keySet()) {
            double balance = accounts.get(name);
            if (balance > maxBalance) {
                maxBalance = balance;
                maxBalanceName = name;
            }
        }
        return maxBalanceName;
    }
  
    /************ Part 8 **************/
    // TODO: Define a static method called `getAccountWithLowestBalance` that returns the name of the account with the lowest balance
    static String getAccountWithLowestBalance() {
        double minBalance = Double.MAX_VALUE;
        String minBalanceName = "";
        for (String name : accounts.keySet()) {
            double balance = accounts.get(name);
            if (balance < minBalance) {
                minBalance = balance;
                minBalanceName = name;
            }
        }
        return minBalanceName;
    }
    /************ Part 9 **************/
    // TODO: Define a static method called `getLastAccountByName` that returns the balance value of the last account ordered by name
    static double getLastAccountBalanceByName() {
        ArrayList<String> keys = new ArrayList(accounts.keySet());
        keys.sort(null);
        return accounts.get(keys.get(keys.size() - 1));
    }
  
    public static void main(String[] args) {
  
        /* You are not required to write any code here */

    }

}
