package modifier;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {
        Week today = null;

        // 날짜와 관련된 클래스 : LocalDate
        LocalDate now = LocalDate.now();
        System.out.println(now); // 현재 날짜 출력

        System.out.println(now.getDayOfWeek()); // 현재 요일 출력
        DayOfWeek week = now.getDayOfWeek();
        switch (week.getValue()) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNESDAY;
                break;
            case 4:
                today = Week.THURDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            default:
                today = Week.SATURDAY;
                break;
        }

        System.out.println("오늘 요일 : " + today);
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("공부합니다.");
        }
    }
}
