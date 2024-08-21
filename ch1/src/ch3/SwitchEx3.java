package ch3;

import java.util.*;;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1),바위(2),보(3) 게임

        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자 생성
        int computer = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 : 입력 받기

        Scanner sc = new Scanner(System.in);
        System.out.println("가위(1),바위(2),보(3) 게임 하나 숫자 입력 >> ");
        int user = sc.nextInt();

        switch (user - computer) {
            case 2:
            case -1:
                System.out.println("패배");
                break;
            case 1:
            case -2:
                System.out.println("승리");
                break;
            case 0:
                System.err.println("비김");
        }

        sc.close();

    }

}
