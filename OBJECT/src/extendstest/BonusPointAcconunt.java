package extendstest;

// 은행 계좌 + 보너스 포인트 지급
public class BonusPointAcconunt extends Account {

    // 멤버변수
    // 초기화를 해줌
    // 기본 타입(소문자) - 정수형 : 0 / 실수형 : 0.0 / 논리형 : false / 문자형 : ''
    // 참조 타입(배열, 클래스) - int[] arr = new int[3] : null
    // String str; null
    private int bounsPoint;

    public BonusPointAcconunt(String account, String owner, int balance) {
        super(account, owner, balance);
    }

    // 예금 시 보너스 포인트 추가
    // 예금액 1% 보너스 포인트 적립
    // 예금 + 보너스 포인트 적립
    @Override
    void deposit(int amount) {
        // 예금하다
        super.deposit(amount);
        // 보너스 포인트 적립
        // 보너스 포인트 = 보너스 포인트 +(예금액 * 0.01)
        bounsPoint = bounsPoint + (int) (amount * 0.01);
    }

    // 보너스 포인트 조회
    public int getBounsPoint() {
        return bounsPoint;
    }

}
