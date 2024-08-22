package ch4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {

        boolean run = true;
        int balance = 0; // 잔액

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("==============================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("==============================================");
            System.out.println("번호 입력 >> ");
            int meun = sc.nextInt();

            switch (meun) {
                case 1:
                    // 잔액 = 잔액 + 입금액
                    System.out.print("입금 금액을 입력해 주세요 >>");
                    // int num1 = sc.nextInt();
                    // balance = balance + num1;
                    balance += sc.nextInt(); //balance = sc.nextInt();
                    System.out.printf("잔고 입니다 : %d\n", balance);
                    break;
                case 2:
                    // 잔액 = 잔액 - 출금액
                    System.out.print("출금 금액을 입력해 주세요 >>");
                    // int num2 = sc.nextInt();
                    // balance = balance - num2;
                    balance = sc.nextInt();
                    System.out.printf("잔고 입니다 : %d\n", balance);
                    break;
                case 3:
                    // 잔액 출력
                    System.out.printf("잔고 입니다 : %d\n", balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }

        sc.close();
    }

}
