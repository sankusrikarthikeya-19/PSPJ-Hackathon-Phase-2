```java
import java.util.Scanner;

class Bankaccountsystem {

    static Scanner sc = new Scanner(System.in);
    static int accountNumber = 12345;
    static String accountHolderName = "Karthi";
    static int balance = 9999;

    public static void checkBalance() {
        System.out.println("Balance of the account = " + balance);
    }

    public static void displayAccount() {
        System.out.println("Account Holder Name = " + accountHolderName);
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Balance = " + balance);
    }

    public static void main(String[] args) {

        System.out.println("=============== Bank Account Management System ===============");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();

        if (number == accountNumber) {
            System.out.println("Access granted");

            boolean running = true;

            while (running) {
                System.out.println("\n=== YOU HAVE ENTERED ===");
                System.out.println("1. DEPOSIT");
                System.out.println("2. WITHDRAW");
                System.out.println("3. CHECK BALANCE");
                System.out.println("4. DISPLAY ACCOUNT");
                System.out.println("5. EXIT");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter the money to deposit: ");
                        int deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("New Balance = " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdraw = sc.nextInt();

                        if (withdraw <= balance) {
                            balance = balance - withdraw;
                            System.out.println("New Balance = " + balance);
                        } else {
                            System.out.println("Insufficient balance");
                        }
                        break;

                    case 3:
                        checkBalance();
                        break;

                    case 4:
                        displayAccount();
                        break;

                    case 5:
                        running = false;
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }

        } else {
            System.out.println("Please check the account information.");
        }

        sc.close();
    }
}
```
