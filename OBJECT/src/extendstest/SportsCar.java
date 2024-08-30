package extendstest;

public class SportsCar extends Car {

    public SportsCar(String name) {
        super(name);
    }

    @Override
    void dirve() {
        System.out.println("스포츠카가 달립니다.");
    }

}
