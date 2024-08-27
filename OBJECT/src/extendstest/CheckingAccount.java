package extendstest;

// 은행 계좌 + 직불 카드
public class CheckingAccount extends Account {

    private String cardNo;

    public CheckingAccount(String account, String owner, int balance, String cardNo) {
        super(account, owner, balance);
        this.cardNo = cardNo;
    }

    // 사용 금액을 지불한다.
    // int pay() : 사용금액, 카드 번호
    // 카드번호 일치 시 금액 일치
    int pay(String cardNo, int amount) {
        if (!cardNo.equals(this.cardNo)) {
            return -1;
        }
        // 일치 시 금액 인출
        // 잔액 = 잔액 - 사용액;

        // balance = super.getBalance() - amount;
        return withdraw(amount);
    }
}
