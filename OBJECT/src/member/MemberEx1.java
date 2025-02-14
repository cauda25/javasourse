package member;

import java.util.ArrayList;
import java.util.List;

public class MemberEx1 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        // list 에 Mender추가
        list.add(new Member("hong124", "홍길동", "서울", "hog@gmail.com"));
        list.add(new Member("hong154", "홍길동", "서울", "hog@gmail.com"));
        list.add(new Member("hong126", "홍길동", "서울", "hog@gmail.com"));
        list.add(new Member("hong654", "홍길동", "서울", "hog@gmail.com"));

        for (Member member : list) {
            System.out.print(member.getId() + "\t");
            System.out.print(member.getName() + "\t");
            System.out.print(member.getAddr() + "\t");
            System.out.println(member.getEmail());
        }
    }
}
