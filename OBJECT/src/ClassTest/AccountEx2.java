package ClassTest;

import java.util.Scanner;

public class AccountEx2 {

    // 멤버 변수
    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("=====================================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("=====================================================");
            System.out.print("메뉴 선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 계좌 생성 메소드 호출
                    createAccount();
                    break;
                case 2:
                    // 계좌 목록 메소드 호출
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("메뉴 번호를 확인해 주세요");
                    break;
            }
        }

    }

    static void createAccount() {
        // 계좌생성 담당 메소드
        // 계좌와 관련된 정보 입력 받기 (계좌번호, 이름, 금액)
        System.out.print("계좌번호 >> ");
        String acc = sc.nextLine();
        System.out.print("이름 >> ");
        String name = sc.nextLine();
        System.out.print("금액 >> ");
        int num = Integer.parseInt(sc.nextLine());

        // accounts[특정인덱스] = new Account("111-12-222", "성춘향", 10000)

        // 배열 요소에서 빈 공간 찾아서 채우기
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(acc, name, num);
                System.out.println("계좌생성이 완료되었습니다\n");
                break;
            }
        }

    }

    static void accountList() {
        // 현재 생상된 계좌 리스트 출력
        // accnuts 배열 출력
        System.out.println("=============================");
        System.out.println("계좌      이름      잔액");
        System.out.println("=============================");

        for (Account account : accounts) {
            if (account != null) {
                System.out.printf("%s\t%s\t%d\n", account.getAccount(), account.getOwner(), account.getBalance());

            }
        }

        // for (int i = 0; i < accounts.length; i++) {
        // if (accounts[i] != null) {
        // System.out.println(accounts[i].getAccount());
        // System.out.println(accounts[i].getOwner());
        // System.out.println(accounts[i].getBalance());
        // }
        // }
    }

    static void deposit() {
        // 예금하기
        // 계좌번호와 예금액 입력받기
        System.out.println("계좌 번호를 입력하세요");
        String acc = sc.nextLine();
        System.out.println("예금액을 입력하세요");
        int num = Integer.parseInt(sc.nextLine());

        // 배열 요소에서 일치하는 계좌번호를 찾기
        // 찾은 account의 deposit() 호출
        Account account = findAccount(acc);
        if (account != null) {
            account.deposit(num);
        }
    }

    static void withdraw() {
        // 츨금하기
        // 계좌번호와 출금액 입력하기
        System.out.println("계좌 번호를 입력하세요");
        String acc = sc.nextLine();
        System.out.println("출금액을 입력하세요");
        int num = Integer.parseInt(sc.nextLine());

        // 배열요소에서 일치하는 계좌번호 찾기
        Account account = findAccount(acc);
        if (account != null) {
            account.withdraw(num);
        }
    }

    static Account findAccount(String acc) {
        // 일치하는 account 리턴
        for (Account account : accounts) {
            if (accounts != null) {
                if (acc.equals(account.getAccount())) {

                    return account;
                }
            }
        }
        return null;
    }
}
