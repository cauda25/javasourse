package ClassTest;

public class Account2 {
    // 계좌번호(account) : 101-11-12345
    // 계좌주(owner) : 홍길동
    // 잔액(balance) : 10000000
    private String account;
    private String owner;
    private int balance;

    public Account2(String account, String owner, int balance) {
        this.account = account;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능
    // 예금하다(deposit)
    // 잔액 = 잔액 + 예금액
    // 리턴 없음
    void deposit(int amount) {
        balance += amount;
    }

    // 출금하다(withdraw)
    // 잔액 = 잔액 - 출금액
    // 잔액 return
    int withdraw(int amount) {
        if (amount > balance) {
            return 0;
        }
        balance -= amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccount() {
        return account;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account2 [account=" + account + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
