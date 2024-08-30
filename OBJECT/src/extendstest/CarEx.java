package extendstest;

public class CarEx {
    public static void main(String[] args) {
        // Car 인스턴스 직접 생성 불가
        // Car car = new Car();

        // 다형성을 활용한 인스턴스 생성 가능
        Car car = new SportsCar("포르쉐");
        car.dirve();
        car.stop();
    }
}
