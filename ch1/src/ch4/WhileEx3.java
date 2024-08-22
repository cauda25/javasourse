package ch4;

public class WhileEx3 {
    public static void main(String[] args) {
        while (true) {
            // 주사위 2개를 굴려 두 개의 합이 5와 같으면 반목문 종료

            // random 1~6
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;

            System.out.printf("(%d ,%d)\t", dice1, dice2);

            if (dice1 + dice2 == 5)
                break;

        }
    }

}
