package api;

public class StringEX3 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Jerry", "choi", "Kim", "Park" };

        String result = findKim(names);
        System.out.println(result);
    }

    static String findKim(String[] names) {
        // Kim 찾기
        int pos = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                pos = i;
                break;
            }
        }

        return "Kim 은 " + (pos + 1) + "번 째 위치에 있다";
    }
}
