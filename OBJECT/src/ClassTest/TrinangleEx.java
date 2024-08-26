package ClassTest;

public class TrinangleEx {
    public static void main(String[] args) {
        Trinangle trinangle = new Trinangle(5, 7);

        System.out.println("삼각형 넓이 : " + trinangle.getArea());

        // 밑변, 높이 숫자 변경
        // trinangle.baseLin =15;
        trinangle.setBaseLine(15);
        System.out.println("삼각형의 넓이 : " + trinangle.getArea());

        trinangle.setHeight(10);
        trinangle.setBaseLine(8);
        System.out.println("삼각형의 넓이 : " + trinangle.getArea());

    }

}
