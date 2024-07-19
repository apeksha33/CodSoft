import java.util.*;
public class ATMinterface{

    static int current_balance = 10000;
    static int withdrawl_amount;
    static int deposite_amount;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to ATM");
        System.out.println("Press button to perform following action:");
        System.out.println("Press 1 for Withdraw");
        System.out.println("Press 2 for Deposit");
        System.out.println("Press 3 for Check Balance");

        while (true) {

            System.out.print("Operation want to perform:");

            int choosen = sc.nextInt();

            if (choosen == 1) {
                withdraw();
            } else if (choosen == 2) {
                deposit();
            } else if (choosen == 3) {
                checkBalance();
            } else {
                System.out.println("enter number between 1 and 3");
            }
        }
    }
        private static void deposit() {

            System.out.print("Enter the amount you want to deposit:");
            deposite_amount = sc.nextInt();
            current_balance=current_balance+deposite_amount ;
            System.out.println("Your money is successfully deposited");

        }
        private static void withdraw () {

            System.out.print("Enter the amount you want to withdraw:");
            withdrawl_amount = sc.nextInt();
            if (withdrawl_amount <= current_balance) {
                System.out.println("Collect your money and card");
                current_balance=current_balance-withdrawl_amount;
            } else {
                System.out.println("Sorry! insufficient balance");
            }
        }
        private static void checkBalance () {

                System.out.println(" Your current balance is: " + current_balance);

        }
    }


