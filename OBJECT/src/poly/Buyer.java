package poly;

public class Buyer {
    int money = 1000; // 고객이 가지고 있는 돈
    int bounsPoint = 0;

    void buy(Computer computer) {
        // money 보다 물건 가격이 적은지 확인
        if (money < computer.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }
        // money = money - 물건 가격
        money -= computer.price;
        // 보너스 포인트 = 포너스 포인트 + 구입가격에 따른 포인트
        bounsPoint += computer.bounsPoint;
        System.out.println(computer + " 을/를 구입하셨습니다.");
    }

    void buy(Air air) {
        // money 보다 물건 가격이 적은지 확인
        if (money < air.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }
        // money = money - 물건 가격
        money -= air.price;
        // 보너스 포인트 = 포너스 포인트 + 구입가격에 따른 포인트
        bounsPoint += air.bounsPoint;
        System.out.println(air + " 을/를 구입하셨습니다.");
    }
}
