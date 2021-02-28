import java.util.*;

public class BankAccountManager {

        static Scanner console = new Scanner(System.in);

        public static void main (String[] args) {
                
                BankAccount account = new BankAccount();
                int option;
                double amount;
                String s;

                System.out.println("Enter name: ");
                s = console.next();
                account.setName (s);

                System.out.println("Enter ID number: ");
                s = console.next();
                account.setID (s);

                do {
                        System.out.println("Balance(0), Deposit(1), Withdrawal(2), Exit (9): ");
                        option = console.nextInt();
                        switch(option) {
                                case 0: checkBalance(account);
                                        break;
                                case 1: System.out.println("Amount: ");
                                        amount = console.nextDouble();
                                        makeDeposit(account,amount);
                                        break;
                                case 2: System.out.println("Amount: ");
                                        amount = console.nextDouble();
                                        makeWithdrawal(account,amount);
                                        break;
                                case 9: break;
                                default: System.out.println("invalid option");
                        }
                }
                while(option!=9);
        }

        private static void checkBalance(BankAccount account) {
                System.out.println("Balance for "+account.getName()+" Account ID: "+account.getID());
                System.out.println("Balance = "+account.getBalance());
        }

        private static void makeDeposit(BankAccount account, double amount) {
                String result = account.deposit(amount);
                System.out.println(result);
        }

        private static void makeWithdrawal(BankAccount account, double amount) {
                String result = account.withdraw(amount);
                System.out.println(result);
        }

}
