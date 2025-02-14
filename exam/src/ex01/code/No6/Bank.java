package ex01.code.No6;

public class Bank {
    public String name;
    public long balance;

    public Bank (String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public long withdraw(long amount) {
        if (balance < amount) {
            System.out.println("잔액부족으로 출금할 수 없습니다.");
            return 0;
        }
        balance -= amount;
        return balance;
    }
}
