package ClassTest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        // System.out.println("제조사 : " + car.company); // null
        // System.out.println("모델 : " + car.model); // null
        // System.out.println("색상 : " + car.color); // null
        // System.out.println("최대속력 : " + car.maxSpeed); // 0
        printCar(car);

        // 속성 변경 가능
        car.company = "현대";
        car.color = "white";
        car.maxSpeed = 200;
        car.model = "소나타";

        printCar(car);

        car.forward(); // 전진한다.
        car.backward(); // 후진한다.

        Car cars[] = new Car[2];
        System.out.println(cars[0]);
        // NullPointerException : 객체 ==> new 아직 안한 상황 (객체의 값이 할당되지 않았을 때 (기본 상태일땐 안뜸))
        // System.out.println(cars[0].color);

        // String 초기화
        // Sting str = "" / String str = null
        String srt = ""; // 빈 문자열 할당
        // NullPointerException
        // String str = null;
        // System.out.println(srt.length());
    }

    static void printCar(Car car) {
        System.out.println("제조사 : " + car.company); // 현대
        System.out.println("모델 : " + car.model); // 소나타
        System.out.println("색상 : " + car.color); // white
        System.out.println("최대속력 : " + car.maxSpeed); // 200
    }
}
