package class3.problem2;

public class Account {

    //인스턴스 변수는 생성자나 초기화 블록에서 명시적으로 초기화하지 않아도 자동으로 0으로 설정된다.
    //지역변수는 초기화해야됨!
    int balance;

    // deposit과 withdraw는 잔액이라는 상태를 변경하는 것이 목적이지 변경된 값을 직접 반환하는 것이 주목적이 아니기 때문에
    // 객체지향적인 관점에 어긋난다. 그래서 int로 반환값을 주는 것보다 void를 사용하는 것이 낫다

    //입금 메서드
    void deposit(int amount){
        balance += amount;
    }

    //출금 메서드
    void withdraw(int amount) {
        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("잔액 부족");
        }
    }
}
