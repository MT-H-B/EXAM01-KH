package ex01.code.No6;

public class BankTest {
    public static void main(String[] args) {
        System.out.println("========== 계좌 개설 ==========");
        Bank woori = new Bank("우리은행", 100000);
        Bank kb = new Bank("국민은행", 200000);

        System.out.println(woori.getName() + " : " + woori.getBalance());
        System.out.println(kb.getName() + " : " + kb.getBalance());

        System.out.println("========== 송금 ==========");
        long amount = woori.withdraw(50000);
        kb.deposit(amount);
        System.out.println(woori.getName() + " : " + woori.getBalance());
        System.out.println(kb.getName() + " : " + kb.getBalance());

        System.out.println("========== 출금 ==========");
        long wooriAmount = woori.withdraw(200000);
        kb.deposit(wooriAmount);
        System.out.println(woori.getName() + "에서 출금한 금액 : " + wooriAmount);
        System.out.println(woori.getName() + " : " + woori.getBalance());
    }
}
