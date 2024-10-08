package io;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File f = new File("c:\\temp\\test.txt");

        String fileNeme = f.getName();
        int pos = fileNeme.lastIndexOf(".");

        System.out.println("경로를 제외한 파일명 : " + f.getName());
        System.out.println("확장자를 제외한 파일명 : " + fileNeme.substring(0, pos));
        System.out.println("확장자 : " + fileNeme.substring(pos + 1));
        System.out.println("경로를 포함한 파일명 : " + f.getPath());
        System.out.println("파일 절대 경로 : " + f.getAbsolutePath());
        System.out.println("파일이 속해 있는 디렉토리 : " + f.getParent());
        System.out.println();
        // 리눅스(., /), 원도우즈(;, \) 상태에 따라
        System.out.println("File.pathSeparator(경로 구분자) : " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
        System.out.println("File.separator(이름 구분자) : " + File.separator);
        System.out.println("File.separatorChar : " + File.separatorChar);

    }
}
