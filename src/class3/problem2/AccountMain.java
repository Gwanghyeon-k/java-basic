package class3.problem2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        //int로 주지 말고 그냥 넣어버려
        //애초에 함수를 호출하면 balance값의 상태가 변경되므로 굳이 다시 = 으로 넣어주지 않아도 됨
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);

    }
}
