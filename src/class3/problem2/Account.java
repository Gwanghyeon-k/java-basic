package class3.problem2;

public class Account {
    int balance = 0;

    //입금 메서드
    int deposit(int amount){
        return balance += amount;
    }

    //출금 메서드
    int withdraw(int amount) {
        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("잔액 부족");
        }
        return balance;
    }
}
