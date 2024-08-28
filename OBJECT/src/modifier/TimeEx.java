package modifier;

// java.lang 패키지 기본 import 되어 있음 => import 구문 필요없음
import static java.lang.Math.*; // Math 클래스에 있는 모든 구성요소 static으로 import

public class TimeEx {
    public static void main(String[] args) {
        // The constructor Time() is not visible
        // Time time = new Time();

        // new : 매 번 새로운 인스턴스 생성
        Time time1 = new Time();
        Time time2 = new Time();
        System.out.println(time1 == time2); // false

        // 싱글톤 패턴
        // SingleTon singleTon = new SingleTon();
        // 인스턴스를 하나만 생성
        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println(singleTon1 == singleTon2); // true

        // 0 <= 임의의 수 < 1
        // java.lang.Math
        // Math : 생성자는 private / 멤버변수와 메소드가 static 상태
        System.out.println(Math.random());
        System.out.println(Math.PI);

        // static import 한 후
        System.out.println(PI); // Math.PI
        System.out.println(random()); // Math.random()
        System.out.println(round(1.5)); // Math.round()

        Card card = new Card("HAERT", 10);

        System.out.println("number " + card.NUMBER);
        // NUMBER OR KIND 변경
        // final field Card.NUMBER cannot be assigned 값 대입 불가
        // card.NUMBER =15;
    }
}
