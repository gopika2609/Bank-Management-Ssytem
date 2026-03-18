import java.util.Scanner;

class BankAccount {
    String name;
    int accNumber;
    double balance;

    BankAccount(String name, int accNumber, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount user = new BankAccount(name, acc, bal);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display\n4. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    user.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    user.withdraw(sc.nextDouble());
                    break;
                case 3:
                    user.display();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}