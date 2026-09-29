// THIS IS A BASIC BANKINING PROJECT

import java.util.Scanner;

public class Main{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // DECLARE VARIABLES

        double balance = 0.00;
        boolean isRunning = true;
        int choice;

        // while loop
        while(isRunning == true){
            // DISPLAY MENU

        System.out.println("Welcome to the Banking Program!");
        System.out.println("*********************************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("*********************************");

        // GET AND PROCESS USERS CHOICE
        System.out.print("Enter your choice [1-4]: ");
        choice = scanner.nextInt();

        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();    
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid choice. Please try again.");
            }

        }

        

        // withdraw()

        // EXIT 

        scanner.close();
    }

    // showBalance()
    static void showBalance(double balance){
        System.out.println("Your current balance is: £" + balance);
    }
    static double deposit(){

        double amount;
        System.out.print("Enter the amount you want to deposit: £");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Invalid amount. Please enter a positive value.");
            return 0;
        } else {
            System.out.println("You have deposited: £" + amount);
            return amount;
        }
    }

    // deposit()
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount you want to withdraw: £");
        amount = scanner.nextDouble();  

        if (balance < amount){
            System.out.println("Insufficient funds. Your current balance is: £" + balance);
            return 0;
        } else if (amount < 0){
            System.out.println("Invalid amount. Please enter a positive value.");
            return 0;
        } else {
            System.out.println("You have withdrawn: £" + amount);
            return amount;
        }
    }
}