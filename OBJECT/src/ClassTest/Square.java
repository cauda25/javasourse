package ClassTest;

public class Square {
    // 직사각형(가로,세로) 넓이, 정사작형(가로)의 넓이
    // 메소드 오버로딩
    double areRectangle(double x, double y) {
        return x + y;
    }

    double areRectangle(double x) {
        return x + x;
    }
}
