package ClassTest;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 메소드 호출 => 메소드 실행
        calculator.powerOn();

        // return 존재 시 1) 변수에 담기 2) 사용
        int result = calculator.plus(8, 6);
        System.out.println("연산 결과 :  " + result);

        System.out.println("연산 결과 :  " + calculator.plus(9, 8));

        double divResult = calculator.divide(9, 2);
        System.out.println("나눗셈 결과 : " + divResult);
        // return이 존재 하지 않기 떄문에 실행불가
        // System.out.println(calculator.powarOff());
        // void 라면 호출만 가능
        calculator.powarOff();

        Calculator2 calculator2 = new Calculator2();
        calculator2.execute();
    }

}
