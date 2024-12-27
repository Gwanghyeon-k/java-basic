package class3.problem2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        int amount = 10000;
        account.balance = account.deposit(amount);

        int amount2 = 9000;
        account.withdraw(amount2);

        int amount3 = 2000;
        account.withdraw(amount3);

        System.out.println("잔고: " + account.balance);

    }
}
