package ClassTest;

public class AccountEx3 {
    public static void main(String[] args) {
        Account2 account2 = new Account2("111", "홍길동", 1000000);
        System.out.println(account2); // ClassTest.Account2@5ca881b5

        // toString 오버라이딩 후 = Account2 [account=111, owner=홍길동, balance=1000000

        Account2 accounts[] = new Account2[2];
        accounts[0] = new Account2("111", "홍길동", 1000000);
        accounts[1] = new Account2("222", "성춘향", 1000000);

        for (Account2 account22 : accounts) {
            System.out.println(account22);
        }
    }
}
