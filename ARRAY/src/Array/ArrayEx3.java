package Array;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char 배열 선언, 생성
        // char[] 배열명 = {'a','b','c'}
        // char 배열명[]

        char[] ahArr = { 'a', 'b', 'c' };

        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };

        // String 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };
        // ArrayIndexOutOfBoundsException
        System.out.println(strArr[4]);
    }

}
