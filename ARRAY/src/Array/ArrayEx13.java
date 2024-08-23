package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx13 {
    public static void main(String[] args) {
        // 5 명의 학생들의 점수를 입력받아서 최고 점수, 평균 출력

        // 5 라는 숫자는 변경 될수 있으므로 동적으로 생성
        // 입력 받은 숫자를 기반으로 동적 배열 생성

        int scores[];

        Scanner sc = new Scanner(System.in);
        System.out.print(" 학생 수 입력 >> ");
        int num = sc.nextInt();

        scores = new int[num];
        // 최고점수 구하기
        int max = 0;
        // 평균
        int sum = 0;

        // 점수 입력
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d 번 점수 입력>>", (i + 1));
            scores[i] = sc.nextInt();

            if (scores[i] > max) {
                max = scores[i];
            }
            sum += scores[i];

        }

        System.out.println("최고 점수 : " + max);
        System.out.println("평균 : " + sum / scores.length);

        sc.close();
        // System.out.println(Arrays.toString(scores));

    }

}
