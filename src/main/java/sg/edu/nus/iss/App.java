package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

public final class App {
//private App() {

    public static void main(String[] args) {
        System.out.println("Welcome to Banking");

        int n = 3;
        BankAccount bankAccount[] = new BankAccount[n];

        for (int i = 0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();

            double max = 10000.00;
            double min = 1000.00;

            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble(max);

            bankAccount[i] = new FixedDepositAccount(uuid, initialBalance);

        }

        bankAccount[0].setFullName("Tan Meng Chwang");
        bankAccount[1].setFullName("Ng Swee Kiat");
        bankAccount[3].setFullName("Charles Wang");

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].deposit(2000);
        bankAccount[0].deposit(4000);
        bankAccount[0].deposit(5000);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].withdraw(2000);
        bankAccount[0].withdraw(4000);
        bankAccount[0].withdraw(5000);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

    }
}
