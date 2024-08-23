package Array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");
            System.out.println();

            char[] chArr = names[i].toCharArray();

            // System.out.println(Arrays.toString(chArr)); //확인용 출력

            for (int j = 0; j < chArr.length; j++) {
                int pos = (int) (Math.random() * chArr.length);

                char temp = chArr[j];
                chArr[j] = chArr[pos];
                chArr[pos] = temp;
            }

            // new String : 쪼개진 문자를 다시 합쳐서 출력
            System.out.println(new String(chArr));
        }

    }

}
