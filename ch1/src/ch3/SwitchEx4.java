package ch3;

import java.util.*;

public class SwitchEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 피연산자 2개와 연산자 1개를 입력받기
        // 3,5,*
        // 입력받은 숫자와 연산자를 이용해서 연산 후 결과 출력
        // 3 * 5 =15

        System.out.println("연산자(+,-,*,/,%) 입력 >> ");
        String op = sc.nextLine();

        // 두 개의 숫자 입력받기
        System.out.println("첫번째 입력 숫자 : ");
        int num1 = sc.nextInt();

        System.out.println("두번쨰 입력 숫자 : ");
        int num2 = sc.nextInt();

        int result = 0;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
        }

        System.out.printf("%d %s %d = %d\n", num1, op, num2, result);

        sc.close();
    }

}
