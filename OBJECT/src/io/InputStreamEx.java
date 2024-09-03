package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
    public static void main(String[] args) {
        // 입력 스크림 열기
        InputStream in = System.in;
        int input = 0;

        try {
            // int input = in.read(); // abcd
            // System.out.println((char) input); // 97 "a" 하나 읽어옴

            // read() : 읽어올게 없다면 -1 리턴
            while ((input = in.read()) != -1) {
                System.out.println((char) input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
