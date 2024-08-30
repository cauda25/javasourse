package api;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요.");
        // String str = sc.next(); // 안녕하세요 반갑습니다 ==> nextLine()
        // System.out.println(str);

        System.out.print("input num1 ");
        int num1 = sc.nextInt(); // 입력 숫자 > 엔터
        System.out.print("+-/* 중 하나를 입력하세요 ");
        // (String op = sc.next();) == (int num1 = Integer.patseInt(sc.nextLine());)
        String op = sc.nextLine(); // 입력 숫자 이후의 남은 엔터를 읽어들임(줄 단위로 읽기 때문에 엔터까지 읽음)
        System.out.print("input num2 ");
        int num2 = sc.nextInt();
    }
}
