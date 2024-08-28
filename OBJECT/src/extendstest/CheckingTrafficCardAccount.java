package extendstest;

// 은행계좌 + 직불 카드 + 교통카드
public class CheckingTrafficCardAccount extends CheckingAccount {

    // 교통카드 기능 여부(true 인 겨우만 교통카드 기능 탑재)
    private boolean hasTraffic;

    public CheckingTrafficCardAccount(String account, String owner, int balance, String cardNo) {
        super(account, owner, balance, cardNo);
    }

    public CheckingTrafficCardAccount(String account, String owner, int balance, String cardNo, boolean hasTraffic) {
        super(account, owner, balance, cardNo);
        this.hasTraffic = hasTraffic;
    }

    public boolean isHasTraffic() {
        return hasTraffic;
    }

    // hasTraffic 값 변경 메소드 변경
    // set~~ 메소드명을 작성하거나 change~~~~
    public void setHasTraffic(boolean hasTraffic) {
        this.hasTraffic = hasTraffic;
    }

    // 교통비 지급
    int patTraffic(String cardNo, int amount) {
        // 교통카드 기능이 있느냐
        if (!hasTraffic) {
            return -1;
        }
        // 교통비 카드 기능이 있다면 카드 번호 확인, 잔액이 있는지 확인한 후 교통비 지불
        return pay(cardNo, amount);

    }
}
