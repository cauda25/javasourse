package api;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // System.in : 키보드 입력
        Scanner sc = new Scanner(System.in);

        String[] argArr = null;
        while (true) {
            String prompt = ">>";
            System.out.print(prompt);

            // hello
            // hello 123
            String input = sc.nextLine();

            // 양쪽 공백 제거
            input = input.trim();

            // 문자열 분리 : 공백기준
            // "공백+" : 공백이 최소 1 ~ 무한대까지 의미 포함
            argArr = input.split(" +");
            // System.out.println(Arrays.toString(argArr));

            // 소문자로 변경
            String ch = argArr[0].toLowerCase();

            // q or Q 이면 while 종료
            if (ch.equals("q")) {
                System.exit(0);
            } else {
                // q가 아니면 배열 출력
                for (String s : argArr) {
                    System.out.println(s);
                }
            }
            System.out.println();
        }
    }
}
