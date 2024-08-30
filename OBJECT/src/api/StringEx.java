package api;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        // java.lang.String
        // - 변경이 불가능한(inmutable) 클래스
        // 한번 생성된 인스턴스는 읽기만 가능한 상태

        String str = "a";
        str = str + "bcd"; // 기존의 str 을 파과하고 다시 인스턴스 생성 후 연결함
        String str5 = "fg";
        str = str + str5; // 기존의 str 을 파과하고 다시 인스턴스 생성 후 연결함

        // 문자열 변경이 가능
        // java.lang.StringBuilder
        // java.lang.StringBuffer

        // 문자열 리터럴 지정 : 저장이 된 후 동일한 문자열의 경우 한번만 저장
        String str1 = "abc";
        String str4 = "abc";
        // 생성자 사용 . 같은 단어라도 서로 다른 주소값으로 인스턴스 저장
        String str2 = new String("abc");
        char ch[] = { 'a', 'b', 'c' };
        String str3 = new String(ch);

        System.out.println(str1 == str4); // true
        System.out.println(str1 == str2); // false

        // 1. equals() : 문자열 비교 / equalsIgnoreCase() : 대소문자 구분 없이 비교
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

        // 2. charAt(int index) : 문자열을 문자로 바꾸는 작업
        System.out.println("chatAt(1) : " + str1.charAt(1));

        str1 = new String("Hello!! Java");

        // 3. length() : 문자열의 길이 파악
        System.out.println("str1 길이 " + str1.length());

        // str1 ==> char 배열로 변환
        // ['H','e','l']
        char ch1[] = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }
        System.out.println(Arrays.toString(ch1));

        // 4. toCharArray() : 문자열을 char 배열로 변환
        char ch2[] = str1.toCharArray();
        System.out.println(Arrays.toString(ch2));

        // 5.indexof(찾을 문자,시작위치) : 주어진 문제의 시작 위치 리턴 / 못찾으면 -1 => index는 0부터 시작
        System.out.println("index(e) : " + str1.indexOf("e"));
        System.out.println("index(Java) : " + str1.indexOf("Java"));
        System.out.println("index(b) : " + str1.indexOf("b"));
        System.out.println("index(e) : " + str1.indexOf('e'));
        System.out.println("index(e) : " + str1.indexOf('e', 4));

        // 6. lastIndexOf() : 문자열 끝에서 부터 찾기
        System.out.println("lastIndex(e) : " + str1.lastIndexOf("e"));
        System.out.println("lastIndex(Java) : " + str1.lastIndexOf("Java"));

        // 7.contains(문자열) : 문자열이 포함되어 있는지 확인 후 true/false
        System.out.println("contains(Java) : " + str1.contains("Java"));
        System.out.println("contains(b) : " + str1.contains("b"));

        // 8. startsWith() / endsWith() : 지정된 문자열로 시작하는지/끝나는지 확인후 true/false
        str2 = "java.lang.String";
        System.out.println("startsWith : " + str2.startsWith("java"));
        System.out.println("startsWith : " + str2.startsWith("lang"));
        str3 = "file.txt";
        System.out.println("endsWith : " + str3.endsWith("txt"));

        // 9. concat(문자열) : 문자열 뒤로 연결
        System.out.println("concat(str2) : " + str1.concat(str2));

        // 10. replace(old 문자,new 문자) : 원래의 문자를 새로운 문자롤 변경 후 새로운 문자열로 리턴
        str1 = "Hellollo";
        System.out.println(str1.replace("ll", "LL")); // HeLLoLLo
        System.out.println(str1.replaceAll("ll", "LL")); // HeLLoLLo
        System.out.println(str1.replaceFirst("ll", "LL")); // HeLLollo
        System.out.println(str1); // Hellollo

        // 11. split("패턴 or 분리기호") : 문자열을 분리자로 나누어 문자 배열로 리턴
        String animals = "cat,dog,bear,tiger";
        String[] arr = animals.split(","); // "," 기준으로 나누어 출력
        for (String s : arr) {
            System.out.println(s);
        }
        arr = animals.split(",", 2); // ","을 기준으로 숫자를 걸어 출력에 제한을 걸어 나눠 출력
        for (String s : arr) {
            System.out.println(s); // cat / dog,bear,tiger
        }

        // 12. subString(시작위치) : 시작위치부터 끝까지 잘라내기
        // (시작위치 , 끝위치) : 시작위치 포함, 끝위치의 문자는 포함되지 않음
        str1 = "java.lang.Objact";
        System.out.println("subString(시작위치) : " + str1.substring(10));
        System.out.println("subString(시작위치,끝위치) : " + str1.substring(5, 9));

        // 13. toUpperCasa() / toLowerCaes() : 대문자 / 소문자롤 변환
        System.out.println("toUpperCase() : " + str1.toUpperCase());
        System.out.println("toLowerCase() : " + str1.toLowerCase());

        // 14. trim() :양쪽 공백 제거
        // .1 " Hello world".equals("Hell World")
        // .2 "Hello world ".equals("Hell World")
        // .1 과 .2 는 서로 다름
        str1 = "         Hello    world";
        System.out.println(str1);
        System.out.println(str1.trim());

        // 15. valueOf() : 기본형(char,int,float,boolean) 값을 String으로 변환
        System.out.println("String.valueOf(0) : " + String.valueOf(0)); // 0 => "0"
        System.out.println("String.valueOf(true) : " + String.valueOf(true)); // true => "true"
        System.out.println("String.valueOf(1.5) : " + String.valueOf(1.5)); // 1.5 => "1.5"

        //
        int i = 100;
        String newStr = String.valueOf(i); // 성능이 더 좋음
        newStr = i + ""; // 편리함으로 주로 이 방법 사용

        // Integer.perseInt("33")
        // String 을 기본형 값으로 변환 "100" => 100
        int j = Integer.parseInt(newStr);
        System.out.println("j = " + j);

        // NumberFormatException 타입이 다름으로 변경 불가
        // j = Integer.parseInt("33.5");
        double d = Double.parseDouble("33.5");
        System.out.println("d = " + d);

        // "true" => true
        boolean b = Boolean.parseBoolean("true");
        System.out.println("b = " + b);

        // int(기본타입) => Integer(참조타입) / float => Float / boolean => Boolean / double =>
        // Double / char => Character
        float f1 = 3.14f;
        Float f2 = 3.14f;

        str1 = "Hello World";
        // 거꾸로 출력
        for (int k = str1.length() - 1; k >= 0; k--) {
            System.out.print(str1.charAt(k));
        }
        System.out.println();

        // StringBuffer의 reverse() 이용
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.reverse());
    }
}
