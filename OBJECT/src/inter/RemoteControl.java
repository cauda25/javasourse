package inter;

public interface RemoteControl {
    // public static final 있는 상태임
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("묵음처리");
        } else {
            System.out.println("무음 해제");
        }
    }

    static void changeBAttery() {
        System.out.println("건전지 교체");
    }
}
