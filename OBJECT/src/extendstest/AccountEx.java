package extendstest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111-11", "홍길동", 1000000, "222-22");

        // 입금
        checkingAccount.deposit(100000);
        System.out.println("현재 잔액 : " + checkingAccount.getBalance());

        //
        int balance = checkingAccount.pay("222-22", 20000);
        System.out.println("현재 잔액 : " + balance);

        System.out.println("==========================");

        CreditLineAccount creditLineAccount = new CreditLineAccount("333-33", "현빈", 100000, 5000000);
        System.out.println("마이너스 통장 계좌 잔액 확인 : " + creditLineAccount.getBalance());

        balance = creditLineAccount.withdraw(4000000);
        System.out.println("현재 잔액 : " + balance);

        System.out.println("==========================");

        BonusPointAcconunt bonusPointAcconunt = new BonusPointAcconunt("444-55", "김지수", 0);
        System.out.println("현재 보너스 점수 : " + bonusPointAcconunt.getBalance());

        bonusPointAcconunt.deposit(2000000);
        System.out.println("현재 잔액 : " + bonusPointAcconunt.getBalance());
        System.out.println("현재 보너스 점수 : " + bonusPointAcconunt.getBounsPoint());

        System.out.println("==========================");

        CheckingTrafficCardAccount cardAccount = new CheckingTrafficCardAccount("555-66", "김수용", 1000000, "333-12");
        System.out.println(cardAccount.isHasTraffic() ? "교통카드 기능 있음" : " 교통카드 기능 없음");

        // 교통카드 기능 추가
        cardAccount.setHasTraffic(true);

        // 교통비 지불
        balance = cardAccount.patTraffic("333-12", 2400);
        if (balance == -1) {
            System.out.println("교통카드 기능이 없습니다");
        } else {
            System.out.println("교통비 지불 후 : " + balance);
        }
    }

}
