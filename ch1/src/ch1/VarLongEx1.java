package ch1;

public class VarLongEx1 {
    public static void main(String[] args) {
        // L.l : 대소문자 둘 다 가능(생략가능)
        long value = 123456789L;

        // 기본값은 int이기 때문에 표현하여 사용
        value = 10000000000L;

        System.out.println(value);
        // print() 메소드 안의 + 의 의미는 연결 : 문자열("")이랑 같이 있을 때
        System.out.println("value = " + value);
        // 산술연산
        System.out.println(value + value);

    }
}
