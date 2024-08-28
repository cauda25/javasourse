package extendstest;

// 은행계좌 + 마이너스 가능한 계좌
public class CreditLineAccount extends Account {

    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String account, String owner, int balance, int creditLine) {
        // Constructor call must be the first statement
        super(account, owner, balance); // 부모의 생성자 호출
        this.creditLine = creditLine; // 순서 중요 부모의 생성자가 먼저 올라와 있어야 됨
    }

    @Override
    int withdraw(int amount) {
        if (getBalance() + creditLine < amount) {
            return -1;
        }
        // 잔액 = 잔액 + 마이너스 한도 - 사용금액
        setBalance(getBalance() - amount);
        return getBalance();
    }

    public int getCreditLine() {
        return creditLine;
    }
}
