package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 자바 패키지 안에있는 클래스와 동일하게 만들지 않게 주의
public class FileInputStreamEx1 {
    public static void main(String[] args) {
        // 입력스트림 : file에서 읽어오기
        FileInputStream fis = null;
        try {
            // fis = new FileInputStream(new File("c:\\temp\\file1.txt"));
            fis = new FileInputStream("c:\\temp\\file1.txt");

            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
