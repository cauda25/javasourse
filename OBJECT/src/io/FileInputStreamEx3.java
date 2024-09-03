package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 복사 프로그램
// 자바 패키지 안에있는 클래스와 동일하게 만들지 않게 주의
public class FileInputStreamEx3 {
    public static void main(String[] args) {

        // try-with-resources
        // try(닫아야 하느 자원 생성) : finally 안에 닫기 명시하지 않아도 자동으로 닫아 줌
        try (FileInputStream fis = new FileInputStream("c:\\temp\\image3.jpg");
                FileOutputStream fos = new FileOutputStream("c:\\temp\\output_image2.jpg")) {

            int data = 0;

            // 1024 바이트로 읽고, 1024 바이트로 씀
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
