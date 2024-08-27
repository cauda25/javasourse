package ClassTest;

public class Time {
    // 속성 : 시,분(int) ,초(float)
    private int h;
    private int m;
    private float s;

    // 생성자
    // public Time(int h, int m, float s) {
    // this.h = h;
    // this.m = m;
    // this.s = s;
    // }

    // gerter 메소드 작성
    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public float getS() {
        return s;
    }

    public void setH(int h) {
        if (h < 0 || h > 23) {
            return;
        }
        this.h = h;
    }

    public void setM(int m) {
        if (m < 0 || m > 59) {
            return;
        }
        this.m = m;
    }

    public void setS(float s) {
        if (s < 0 || s > 59) {
            return;
        }
        this.s = s;
    }

    @Override
    public String toString() {
        return "Time [h=" + h + ", m=" + m + ", s=" + s + "]";
    }

}
