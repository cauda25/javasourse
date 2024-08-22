package Array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열(array) : 같은 타입의

        // 10명의 수학 점수 관리
        int[] jumsu = new int[3];

        jumsu[0] = 88;
        jumsu[1] = 78;
        jumsu[2] = 66;

        System.out.println("학생 1번의 수학 점수 " + jumsu[0]);
        System.out.println("학생 2번의 수학 점수 " + jumsu[1]);
        System.out.println("학생 3번의 수학 점수 " + jumsu[2]);
    }

}