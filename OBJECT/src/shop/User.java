package shop;

public class User {
    // 이름, 지불방법(CARD, CASH)
    private String name;
    // 입력 값 제한
    private PayType payType;

    public User(String name, PayType payType) {
        this.name = name;
        this.payType = payType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

}
